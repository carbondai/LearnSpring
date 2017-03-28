<%--
  Created by IntelliJ IDEA.
  User: daixin
  Date: 17-3-27
  Time: 下午4:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
    <form id="login-submit-form" method="post">
        <input type="text" id="uName" min="6" maxlength="12">
        <input type="password" id="uPassword" min="6">
        <input type="button" id="login-submit" value="登录">
    </form>
</body>
</html>
