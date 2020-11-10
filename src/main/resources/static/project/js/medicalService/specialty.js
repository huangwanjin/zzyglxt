(function () {
    require(['jquery', 'ajaxUtil','bootstrapTableUtil','objectUtil','alertUtil','modalUtil','selectUtil','stringUtil','dictUtil'],
        function (jquery,ajaxUtil,bootstrapTableUtil,objectUtil,alertUtil,modalUtil,selectUtil,stringUtil,dictUtil) {


            var url = "/medicalService/specialty/selectAll";
            var aParam = {

            };

            //操作
            function operation(value, row, index){
                return [
                    '<button type="button" class="edit btn btn-primary btn-sm" style="margin-right: 5px" data-toggle="modal" data-target="" >编辑</button>',
                    '<button type="button" class="delete btn btn-danger btn-sm"  data-toggle="modal" data-target="#staticBackdrop" >删除</button>',
                ].join('');
            }


            function addUpdate(addOrUpdate,row){
                var myUpdateModalData ={
                    modalBodyID : "myAddUpdateModalProject",
                    modalTitle : addOrUpdate === "add" ? "新增项目" :"修改项目",
                    modalConfirmFun:function () {
                        var projectEntity = {
                            projectName: $("#projectName").val(),
                            projectNo: $("#projectNo").val(),
                        };

                        if(addOrUpdate === "add"){
                            ajaxUtil.myAjax(null,"api/project/addProject",projectEntity,function (data) {
                                if(ajaxUtil.success(data)){
                                    alertUtil.info("新增项目成功");
                                    refreshTable();
                                    myUpdateModal.hide();
                                }else {
                                    alertUtil.alert(data.msg)
                                }
                            },false);
                        }

                        if(addOrUpdate === "update"){
                            projectEntity.projectID = row.projectID;
                            ajaxUtil.myAjax(null,"api/project/updateProject",projectEntity,function (data) {
                                if(ajaxUtil.success(data)){
                                    alertUtil.info("更新项目成功");
                                    refreshTable();
                                    myUpdateModal.hide();
                                }else {
                                    alertUtil.alert(data.msg)
                                }
                            },false);
                        }


                    }

                };
                var myUpdateModal = modalUtil.init(myUpdateModalData);


                var pl = dictUtil.getDictByCode(dictUtil.DICT_LIST.PROJECT_LIST);
                $("#projectName").selectUtil(pl).on('change',function () {
                    var ml = dictUtil.getDictByCode(dictUtil.DICT_LIST.Module_LIST,$("#projectName").val(),true);
                    $("#moduleName").selectUtil(ml);
                });

                var ml = dictUtil.getDictByCode(dictUtil.DICT_LIST.Module_LIST,stringUtil.isBlank(row) ? $("#projectName").val() : row.projectID ,true);
                $("#moduleName").selectUtil(ml);

                if(addOrUpdate === "update"){
                    $("#projectName").val(row.projectName);
                    $("#projectNo").val(row.projectNo);
                    $("#createBy").val(row.createBy);
                    $("#createAt").val(stringUtil.formatDateTime(row.createAt));
                }
                myUpdateModal.show();
            }

            //修改事件
            window.orgEvents = {
                'click .edit' : function(e, value, row, index) {
                    addUpdate("update",row)
                },
                'click .delete': function (e, value, row, index) {
                    var myDeleteModalData ={
                        modalBodyID : "myDeleteModalProject",
                        modalTitle : "删除项目",
                        modalClass : "modal-lg",
                        confirmButtonClass : "btn-danger",
                        modalConfirmFun:function () {
                            var projectEntity = {
                                projectID: row.projectID
                            };
                            var isSuccess = false;
                            ajaxUtil.myAjax(null,"/api/project/deleteProject",projectEntity,function (data) {
                                if(ajaxUtil.success(data)){
                                    alertUtil.info("删除项目成功");
                                    isSuccess = true;
                                    refreshTable();
                                }
                            },false);
                            return isSuccess;
                        }

                    };
                    var myDeleteModal = modalUtil.init(myDeleteModalData);
                    myDeleteModal.show();
                }
            };


            // $("#search").unbind().on("click",function () {
            //     var param = {
            //
            //     };
            //     $('#table').bootstrapTable("destroy");
            //     bootstrapTableUtil.myBootStrapTableInit("table", url, param, aCol);
            // });

            $("#btn_addTask").unbind().on('click',function () {
                $("#main_body").html("");
                var url = "/medicalService/add/addHosp";
                orange.loadPage({url: url, target: 'main_body', selector: '#fir_body', success: function(data){

                        if(data == null||data == ""){
                            return alertUtil.error( url+'加载失败');
                        }

                        $("#main_body").html(data);
                    }})
            });


            var aCol = [
                {field: 'specialtyName', title: '科室名称'},
                {field: 'hospitalName', title: '所属医院'},
                {field: 'filePath', title: '图片'},
                {field: 'specialtyAddress', title: '地址'},
                {field: 'specialtyPhone', title: '联系电话'},
                {field: 'itemcreateat', title: '发布时间'},
                {field: 'action',  title: '操作',formatter: operation,events:orgEvents}
            ];

            var myTable = bootstrapTableUtil.myBootStrapTableInit("table", url, aParam, aCol);

            function refreshTable() {
                var param = {};
                myTable.free();
                myTable = bootstrapTableUtil.myBootStrapTableInit("table", url, param, aCol);
            }
        })
})();
