<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<head>
    <style>
        a{
            text-decoration:none;
            font-size: 50px;
        }
    </style>
</head>
<body>
<div style="margin-left: 45%;margin-top: 10%">
    <a href="login.html">&emsp;登陆&emsp;</a><br><br>
    <a href="show.jsp">列表显示</a><br><br>
    <a href="insert.jsp">新增界面</a><br><br>
</div>
</body>
</html>
