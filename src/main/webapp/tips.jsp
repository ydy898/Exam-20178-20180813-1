
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>提示页面</title>
</head>
<body>
操作${flag}<br/>
<a href="./show.jsp">点击返回列表页</a>
</body>
</html>
