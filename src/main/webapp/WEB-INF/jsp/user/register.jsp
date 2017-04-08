<%--
  Created by IntelliJ IDEA.
  User: daixin
  Date: 17-3-27
  Time: 下午4:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
    <form id="register-form" method="post" action="/user/register">
        <input type="text" id="uName" name="uName" class="login-text" placeholder="用户名" min="5" maxlength="12">
        <input type="password" id="uPassword" name="uPassword" class="login-text" placeholder="密码" min="6">
        <input id="register-submit" type="submit" class="login-button" value="注册">
    </form>
</body>
</html>
