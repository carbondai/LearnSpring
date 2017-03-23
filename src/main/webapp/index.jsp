<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<html>
    <head>
        <title>首页</title>
    </head>
    <body>
        <h2>Hello World!</h2>
        <%
            out.println("JSP页面");
            out.println("IP地址" + request.getRemoteAddr());

        %>
    </body>
</html>
