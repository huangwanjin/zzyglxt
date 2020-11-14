(function() {
    define('bootstrapTableUtil', ['jquery','objectUtil','ajaxUtil','stringUtil','myBootstrapTable'], function(jquery,objectUtil,ajaxUtil,stringUtil) {

        $.extend($.fn.bootstrapTable.defaults, $.fn.bootstrapTable.locales['zh-CN']);

        function myBootStrapTableInit(aTableID, aReqUrl, aParam, aColumns,aLoadSuccessCall,aLoadErrorCall,aClickRowCall) {
            var fColumns = new  Array();
            $.extend(fColumns,aColumns);
            fColumns.splice(0,0,
                {
                    width:'60px', title: '序号', align: 'center', formatter: function (value, row, index) {
                        var pageSize = $("#"+aTableID).bootstrapTable('getOptions').pageSize;
                        var pageNumber = $("#"+aTableID).bootstrapTable('getOptions').pageNumber;
                        return pageSize * (pageNumber - 1) + index + 1;
                    }
                }
            );

            $("#"+aTableID).bootstrapTable({
                theadClasses: 'self-thead',
                // ajax : function (request) {},
                url: aReqUrl,                       //请求后台的URL（*）
                method: 'GET',                     //请求方式（*）
                contentType: "application/json; charset=UTF-8",
                striped: true,                      //是否显示行间隔色
                cache: true,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
                pagination: true,                   //是否显示分页（*）
                sortOrder: "asc",                   //排序方式
                sidePagination: "client",           //分页方式：client客户端分页，server服务端分页（*）
                page: 1,                      //初始化加载第一页，默认第一页,并记录
                pageSize: 5,                       //每页的记录行数（*）
                pageList: [5, 10, 20, 50],        //可供选择的每页的行数（*）
                paginationPreText: '上一页',
                paginationNextText: '下一页',
                // showColumns: true,               //是否显示所有的列（选择显示的列）
                // minimumCountColumns: 2,          //最少允许的列数
                search: false,                       //显示搜索框
                // searchOnEnterKey:true,              //回车后查询
                clickToSelect: true,                //是否启用点击选中行
                //search:true,                        //显示搜索框
                //height: 500,                      //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
                uniqueId: "ID",                     //每一行的唯一标识，一般为主键列
                queryParams: function (params) {
                    aParam.pageSize = params.limit;
                    aParam.page = (params.offset / params.limit) + 1;
                    aParam.sort = params.sort;       //排序列名
                    aParam.sortOrder = params.order; //排位命令（desc，asc）
                    return aParam;
                },
                showExport: false,      //是否显示导出按钮
                buttonsAlign: "right",   //按钮位置
                exportTypes: ['excel'],  //导出文件类型
                Icons: 'glyphicon-export',
                width: '100%',
                columns: fColumns,
                ajaxOptions: {
                    complete: function (XMLHttpRequest) {

                    }
                },
                responseHandler: function (data) {
                    if(ajaxUtil.notLoggedIn(data)){
                        window.location.href = "/userLogin";
                    }
                    if (data.code === 88888) {
                        for(var i=0; i<data.data.length; i++){
                            data.data[i].itemcreateat = stringUtil.formatDateTime(data.data[i].itemcreateat);
                        }
                        return {
                            total: data.data.length,
                            rows: data.data
                        }
                    } else {
                        return data = {total: 0, rows: []};
                    }
                },
                onLoadSuccess: function (res) {
                    if (!objectUtil.strIsBlank(aLoadSuccessCall)){
                        aLoadSuccessCall(res);
                    }
                },
                onLoadError: function () {
                    if(!objectUtil.strIsBlank(aLoadErrorCall)){
                        aLoadErrorCall()
                    }
                },
                onClickRow: function (row) {
                    if(!objectUtil.strIsBlank(aClickRowCall)){
                        aClickRowCall(row);
                    }
                },
            });

            var obj = new Object();
            obj.aTableID = aTableID;

            obj.free = function () {
                $("#"+obj.aTableID).bootstrapTable("destroy");
            };
            return obj;
        }


        function myBootStrapTableDestory(aTableID) {
            $("#"+aTableID).bootstrapTable("destroy");
        }

        //$(".float-right").attr("display",block);

        function globalSearch(tableID,url,needParam,aCol) {
            //
            var myTable = myBootStrapTableInit(tableID, url, needParam, aCol);
            var oTab=document.getElementById("table");
            var oBt=document.getElementById("taskNameSearch");
            var btnSearch=document.getElementById("btnSearch");
            var param = {};
            btnSearch.onclick=function(){
                console.log(oTab.tHead.rows[0].childNodes[5].innerText);
                for(var i=0;i<oTab.tBodies[0].rows.length;i++)
                {
                    var str1=oTab.tBodies[0].rows[i].innerText.toLowerCase();
                    var str2=oBt.value.toLowerCase();
                    console.log(typeof oTab.id);
                    if (str2==="请输入"){
                        myTable.free();
                        myTable = myBootStrapTableInit(tableID,url,param,aCol)
                    }
                    /***********************************JS实现表格的模糊搜索*************************************/
                    //表格的模糊搜索的就是通过JS中的一个search()方法，使用格式，string1.search(string2);如果
                    //用户输入的字符串是其一个子串，就会返回该子串在主串的位置，不匹配则会返回-1，故操作如下
                    if(str1.search(str2)!=-1){oTab.tBodies[0].rows[i].hidden= false;}
                    else{oTab.tBodies[0].rows[i].hidden= true;}
                    /***********************************JS实现表格的多关键字搜索********************************/
                        //表格的多关键字搜索，加入用户所输入的多个关键字之间用空格隔开，就用split方法把一个长字符串以空格为标准，分成一个字符串数组，
                        //然后以一个循环将切成的数组的子字符串与信息表中的字符串比较
                    var arr=str2.split(' ');
                    for(var j=0;j<arr.length;j++)
                    {
                        if(str1.search(arr[j])!=-1){oTab.tBodies[0].rows[i].hidden= false;}
                    }

                }

            }

            var aria=this.ariaExpanded; ;
            document.getElementById('closeAndOpen').onclick = function(){

                this.innerText="";
                if (aria==="true"){
                    this.innerText="展开";
                    aria = "false";
                } else {
                    this.innerText="收起";
                    aria = "true";
                }
            }
        }

        return {
            myBootStrapTableInit:myBootStrapTableInit,
            myBootStrapTableDestory:myBootStrapTableDestory,
            globalSearch:globalSearch,
        }



    })
})();