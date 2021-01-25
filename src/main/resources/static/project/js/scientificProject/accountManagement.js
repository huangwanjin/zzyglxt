(function () {
    require(['jquery', 'ajaxUtil','bootstrapTableUtil','objectUtil','alertUtil','modalUtil','selectUtil','stringUtil','dictUtil','uploadImg'],
        function (jquery,ajaxUtil,bootstrapTableUtil,objectUtil,alertUtil,modalUtil,selectUtil,stringUtil,dictUtil,uploadImg) {


            var url = "/user/alluser";
            var aParam = {
            };

            //操作
            function operation(value, row, index){
                return [
                    '<a class="view" style="margin:0 1em;text-decoration: none;color:#775637;" data-toggle="modal" data-target="" >查看</a>',
                    '<a class="submit"  style="margin:0 1em;text-decoration: none;color:#775637;" data-target="#staticBackdrop" >重置密码</a>',
                    '<a class="delete" style="margin:0 1em;text-decoration: none;color:#D60000;"  data-toggle="modal" data-target="#staticBackdrop" >删除</a>',
                ].join('');
            }

            //修改事件
            window.orgEvents = {

                'click .delete': function (e, value, row, index) {
                    var myDeleteModalData ={
                        modalBodyID : "myDeleteAccount",
                        modalTitle : "删除账号",
                        modalClass : "modal-lg",
                        confirmButtonClass : "btn-danger",
                        modalConfirmFun:function () {
                            var isSuccess = false;
                            var chineseMedicineKey = {
                                'username':row.username,
                                'orgName':sessionStorage.getItem('orgName')
                            };
                            ajaxUtil.myAjax(null,"/user/deletuser",chineseMedicineKey,function (data) {
                                if(ajaxUtil.success(data)){
                                    alertUtil.info("删除账号信息成功");
                                    isSuccess = true;
                                    refreshTable();
                                }
                            },false,'123',"post");
                            return isSuccess;
                        }
                    };
                    var myDeleteModal = modalUtil.init(myDeleteModalData);
                    myDeleteModal.show();
                },

                'click .view' : function (e, value, row, index) {
                    var myViewTravelModalData ={
                        modalBodyID : "myViewAccountMessageModal", //公用的在后面给span加不同的内容就行了，其他模块同理
                        modalTitle : "查看详情",
                        modalClass : "modal-lg",
                        confirmButtonStyle: "display:none",
                    };
                    var myTravelModal = modalUtil.init(myViewTravelModalData);
                    uploadImg.init();
                    uploadImg.disable();
                    uploadImg.setImgSrc(row.portrait);
                    $("#username").val(row.username);
                    $("#name").val(row.name);
                    $("#gender").val(row.gender);
                    $("#IDCardType").val(row.idcardType);
                    $("#IDCardNo").val(row.idcardNo);
                    $("#email").val(row.email);
                    $("#roleName").val(row.roleName);
                    $("#contacts").val(row.contacts);
                    $("#mobilephone").val(row.mobilephone);
                    $("#cityid").val(row.cityid);
                    $("#creater").val(row.creater);
                    $("#itemCreateAt").val(row.itemcreateat);
                    myTravelModal.show();
                },

                'click .submit' : function (e, value, row, index) {
                    var mySubmitTravelModalData ={
                        modalBodyID :"mySubmitModal",
                        modalTitle : "重置密码",
                        modalClass : "modal-lg",
                        modalConfirmFun:function () {
                            var isSuccess = false;
                            var submitStatus = {
                                "itemid": row.itemid,
                                "itemcode": row.itemcode,
                            };
                            ajaxUtil.myAjax(null,"/user/reset",submitStatus,function (data) {
                                if(ajaxUtil.success(data)){
                                    if(data.code == 88888){
                                        alertUtil.info("重置密码成功");
                                        isSuccess = true;
                                        // refreshTable();
                                    }else{
                                        alertUtil.error(data.msg);
                                    }

                                }
                            },false,true,"put");
                            return isSuccess;
                        }

                    };
                    var mySubmitModal = modalUtil.init(mySubmitTravelModalData);
                    mySubmitModal.show();
                }
            };

            /*新增用户账号*/
            $("#btn_addTask").unbind().on('click',function (e, value, row, index) {
                var myViewAccountModalData ={
                    modalBodyID : "myAddAccountModal", //公用的在后面给span加不同的内容就行了，其他模块同理
                    modalTitle : "新增用户账户",
                    modalClass : "modal-lg",
                    confirmButtonClass : "btn-danger",
                    modalConfirmFun:function () {
                        var isSuccess = false;

                        var username = $("#username").val();
                        var name = $("#name").val();
                        var roleName = dictUtil.getName(dictUtil.DICT_LIST.userRole,$("#roleName").val());
                        if ($("#roleName").val() == "主研人"){
                            roleName = $("#roleName").val();
                        }
                        var contacts = $("#contacts").val();
                        var mobilephone = $("#mobilephone").val();
                        var cityid = dictUtil.getName(dictUtil.DICT_LIST.areaAdmin,$("#cityid").val());
                        var orgName = sessionStorage.getItem("orgName");
                        var orgCode = sessionStorage.getItem("orgCode");

                        var submitStatus = {
                            "username": username,
                            "name": name,
                            "roleName": roleName,
                            "contacts": contacts,
                            "mobilephone": mobilephone,
                            "cityid": cityid,
                            "orgName": orgName,
                            "orgCode": orgCode
                        };
                        if ((/^1[3456789]\d{9}$/.test(mobilephone))){
                            ajaxUtil.myAjax(null,"/user/adduser",submitStatus,function (data) {
                                if(ajaxUtil.success(data)){
                                    if(data.code == 88888){
                                        alertUtil.info("新增用户账号成功");
                                        isSuccess = true;
                                        // refreshTable();
                                    }else{
                                        alertUtil.error(data.msg);
                                    }

                                } else {
                                    alertUtil.error(data.msg)
                                }
                            },false,true);
                        } else {
                            alertUtil.error("手机号码错误")
                        }

                        return isSuccess;
                    }
                };
                var myViewModal = modalUtil.init(myViewAccountModalData);
                let sel = dictUtil.getDictByCode(dictUtil.DICT_LIST.areaAdmin);
                $("#cityid").selectUtil(sel);
                let select = dictUtil.getDictByCode(dictUtil.DICT_LIST.userRole);

                if (sessionStorage.getItem('rolename') == '科研项目申报单位'){
                    var option=document.createElement("option");
                    $(option).val("主研人");
                    $(option).text("主研人");
                    $("#roleName").append(option);
                } else{
                    $("#roleName").selectUtil(select);
                }
                myViewModal.show();

            });



            var pl = dictUtil.getDictByCode(dictUtil.DICT_LIST.showStatus);
            $("#chargePersonSearch").selectUtil(pl);


            var aCol = [
                {field: 'username', title: '用户账号'},
                {field: 'name', title: '账号名称'},
                {field: 'cityid', title: '主管市区'},
                {field: 'roleName', title: '用户角色'},
                {field: 'contacts', title: '联系人'},
                {field: 'action',  title: '操作',width: "254px",formatter: operation,events:orgEvents}
            ];

            var myTable = bootstrapTableUtil.myBootStrapTableInit("table", url, aParam, aCol);

            function refreshTable() {
                var param = {};
                myTable.free();
                myTable = bootstrapTableUtil.myBootStrapTableInit("table", url, param, aCol);
            }

            $("#btnSearch").unbind().on('click',function() {
                var newArry = [];
                var str = document.getElementById("taskNameSearch").value.toLowerCase();
                var allTableData = JSON.parse(localStorage.getItem("2"));
                if(str.indexOf("请输入")!=-1){
                    str=""
                }
                for (var i in allTableData) {
                    for (var v in aCol){
                        var textP = allTableData[i][aCol[v].field];
                        if (textP == null || textP == undefined || textP == '') {
                            textP = "1";
                        }
                        if(textP.search(str) != -1){
                            newArry.push(allTableData[i])
                        }
                    }
                }
                var newArr=new Set(newArry)
                newArry=Array.from(newArr)
                $("#table").bootstrapTable("load", newArry);
                if(newArry.length == 0){
                    alertUtil.warning("搜索成功,但此搜索条件下没有数据");
                }else{
                    alertUtil.success("搜索成功");
                }
            })


        })
})();
