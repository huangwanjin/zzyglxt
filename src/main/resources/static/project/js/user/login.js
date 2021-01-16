(function() {
    require(['jquery','stringUtil','alertUtil','ajaxUtil'], function (jquery,stringUtil,alertUtil,ajaxUtil) {


        $("#btn_Login").unbind("click").bind("click",function () {
            //获取表单中的值
            var inputUsername = $("#inputUsername").val();
            var inputPassword = $("#inputPassword").val();

            if(stringUtil.isBlank(inputUsername)){
                alertUtil.error("用户账户不能为空");
                return
            }
            if(stringUtil.isBlank(inputPassword)){
                alertUtil.error("用户密码不能为空");
                return
            }


            var userEntity = {"username":inputUsername,"password":inputPassword};
            ajaxUtil.myAjax(null,"/userLogin",userEntity,function (data) {
                if(data && data.code === 88888) {
                    alertUtil.success('登录成功');
                    var userName = data.data.username;
                    var rolename = data.data.rolename;
                    var orgCode = data.data.orgCode;
                    var itemCode = data.data.itemcode;
                    sessionStorage.setItem('username',userName);
                    sessionStorage.setItem('rolename',rolename);
                    sessionStorage.setItem('orgCode',orgCode);
                    sessionStorage.setItem('itemcode',itemCode);
                    window.location.href = "/main"
                }else{
                    alertUtil.error(data.msg)
                }
            },false)
        })

        $("#btn_Register").unbind("click").bind("click",function () {
            window.location.href = "/register"
        })

        //回车事件绑定，密码框输完密码按回车课实现登录
        $('#inputPassword').bind('keyup', function(event) {
            if (event.keyCode === 13) {
                //回车执行登录
                $('#btn_Login').click();
            }
        });
    })
})();
