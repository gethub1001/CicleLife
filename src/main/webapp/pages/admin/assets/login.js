function login() {
    var userName=$("#userName").val();
    var passWord=$("#passWord").val();
    if(""==userName){
        $("#resultMessage").html("用户名不能为空");
        return false;
    }
    if(""==passWord){
        $("#resultMessage").html("密码不能为空");
        return false;
    }
    $("#userLogin").attr('action','login');
    $("#userLogin").submit();
}