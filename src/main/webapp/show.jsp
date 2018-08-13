<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="services.Service" %>
<%@ page import="services.ServiceImpl" %>
<%@ page import="entity.Film" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<!DOCTYPE html>
<head>
    <title>show.jsp</title>

    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="this is my page">
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">

    <style>
        *{
            text-align: center;
        }
    </style>

    <script type="text/javascript" src="jquery-3.3.1.min.js"></script>

    <script>

        function changeClick(obj) {
            var id=obj.parentElement.parentElement.childNodes[1].innerHTML.trim();
            var title=obj.parentElement.parentElement.childNodes[3].innerHTML.trim();
            var description=obj.parentElement.parentElement.childNodes[5].innerHTML.trim();
            var language=obj.parentElement.parentElement.childNodes[7].innerHTML.trim();
            $(location).attr("href","./update.html?id="+id+"&title="+title+"&description="+description+"&language="+language);
        }
        function deleteClick(obj) {
            var id=obj.parentElement.parentElement.childNodes[1].innerHTML.trim();
            var title=obj.parentElement.parentElement.childNodes[3].innerHTML.trim();
            var description=obj.parentElement.parentElement.childNodes[5].innerHTML.trim();
            var language=obj.parentElement.parentElement.childNodes[7].innerHTML.trim();
            $(location).attr("href", "./delete.html?id="+id+"&title="+title+"&description="+description+"&language="+language);
        }
    </script>
<!--<link rel="stylesheet" type="text/css" href="./styles.css">-->

</head>

<body>
<%
    Service service = new ServiceImpl();
    List<Film> list = service.show();

%>
<table align="center">
    <tr>
        <th>
            <%
                out.print("序号");
            %>
        </th>
        <th>
            <%
                out.print("电影名称");
            %>
        </th>
        <th>
            <%
                out.print("电影描述");
            %>
        </th>
        <th>
            <%
                out.print("使用语言");
            %>
        </th>
        <th>
            <%
                out.print("相关操作");
            %>
        </th>
    </tr>
    <%
        for(int i = 0;i<list.size();i++) {
    %>
    <tr>
        <td class="id">
            <%
                out.print(list.get(i).getFilm_id());
            %>
        </td>
        <td class="title">
            <%
                out.print(list.get(i).getTitle());
            %>
        </td>
        <td class="description">
            <%
                out.print(list.get(i).getDescription());
            %>
        </td>
        <td class="language">
            <%
                out.print(list.get(i).getLanguage());
            %>
        </td>
        <td>
            <button class="change" onclick="changeClick(this)">修改</button><br>
            <button class="delete" onclick="deleteClick(this)">删除</button>
        </td>
    </tr>
    <%
        }
    %>
</table>


</body>
</html>

