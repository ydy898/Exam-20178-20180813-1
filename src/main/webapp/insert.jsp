<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="entity.Language" %>
<%@ page import="services.Service" %>
<%@ page import="services.ServiceImpl" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<title>插入</title>

	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="this is my page">
	<meta http-equiv="content-type" content="text/html; charset=UTF-8">

	<!--<link rel="stylesheet" type="text/css" href="./styles.css">-->

</head>

<body>
<%
	Service service = new ServiceImpl();
	List<Language>list = service.languageShow();
%>
<div align="center" style="border: 2px ; border-color: black;">
	<form action="./insert.do" method="post">
		电影名称:
		<input type="text" name="title" /><br />
		电影描述:
		<input type="text" name="description" /><br />
		使用语言:
		<select name="language">
			<%
			for(int i = 0;i<list.size();i++){
			%>
			<option value="<%=list.get(i).getLanguage()%>"><%=list.get(i).getLanguage()%></option>
			<%
			}
			%>
		</select><br />
		<input type="submit" value="确定" />
		<input type="reset" value="重置" />
	</form>
	<br/>
</div>
</body>
</html>

