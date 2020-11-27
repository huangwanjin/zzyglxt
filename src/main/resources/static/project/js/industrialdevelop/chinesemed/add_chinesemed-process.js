(function () {
    require(['jquery', 'ajaxUtil', 'stringUtil', 'uploadImg','urlUtil', 'objectUtil',"distpicker"],
        function ($, ajaxUtil, stringUtil, uploadImg,urlUtil, objectUtil,distpicker) {

            var url = "/industrialdevelop/chi-med";

            var pathUrl = "/userLogin";

            var orgType = "process";

            var itemcode = stringUtil.getUUID();

            uploadImg.init();

            var type = isUpdate() ? "put" : "post";

            const editor = objectUtil.wangEditorUtil();

            $("#cancelBtn").click(function () {
                window.history.back();
                // orange.redirect(pathUrl)
            });

            function generateParam() {
                var param = {};
                param.name = $("#name").val();
                param.areaCoverd = $("#areaCoverd").val();
                param.processingType = $("#processingType").val();
                param.contacts = $("#contacts").val();
                param.phone = $("#phone").val();
                param.addressPro = $("#addressPro").val();
                param.addressCity = $("#addressCity").val();
                param.addressCountry = $("#addressCountry").val();
                param.address = $("#address").val();
                param.intruduce = $(".w-e-text").html();
                param.type = orgType;
                param.itemcode = itemcode;
                return param;
            }

            $("#saveBtn").unbind('click').on('click', function () {
                var param = generateParam();
                param.status = "0";
                param.itemcode = itemcode;
                if (uploadImg.isUpdate()) {
                    ajaxUtil.fileAjax(itemcode, uploadImg.getFiles()[0], "undefined", "undefined")
                }

                ajaxUtil.myAjax(null, url, param, function (data) {
                    if (ajaxUtil.success(data)) {
                        orange.redirect("/process_add");
                    } else {
                        alert(data.msg);
                    }
                }, true, "123", type);
                return false;
            });

            $("#submitBtn").unbind('click').on('click', function () {
                var param = generateParam();
                param.status = "1";
                ajaxUtil.myAjax(null, url, param, function (data) {
                    if (ajaxUtil.success(data)) {
                        window.location.href = pathUrl;
                        //orange.redirect(pathUrl)
                    } else {
                        alert(data.msg)
                    }
                }, true, "123", type);
                return false;
            });

            var init = function () {
                if (isUpdate()) {
                    var tempdata = JSON.parse(localStorage.getItem("rowData"));
                    $("#name").val(tempdata.name);
                    $("#areaCoverd").val(tempdata.areaCoverd);
                    $("#processingType").val(tempdata.processingType);
                    $("#contacts").val(tempdata.contacts);
                    $("#distpicker").distpicker({
                        province: tempdata.addressPro,
                        city: tempdata.addressCity,
                        district: tempdata.addressCountry
                    });
                    $("#address").val(tempdata.address);
                    $("#phone").val(tempdata.phone);
                    editor.txt.html(tempdata.intruduce);
                    itemcode = tempdata.itemcode;
                    uploadImg.setImgSrc(tempdata.filePath)
                }else {
                    $("#distpicker").distpicker();
                }
                init = function () {

                }
            };
            init();








            function isUpdate() {
                return (urlUtil.getFullUrl().indexOf("/main#") != -1)
            }

        })
})();

