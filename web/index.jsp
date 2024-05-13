<%--
  Created by IntelliJ IDEA.
  User: 三太子
  Date: 2024/5/13
  Time: 上午12:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
<%--  <sql:setDataSource var="snapshot" driver="com.mysql.jdbc.Driver"
                     url="jdbc:mysql://localhost:3306/RUNOOB?useUnicode=true&characterEncoding=utf-8"
                     user="root"  password="1234"/>--%>
<h1>$END$</h1>
<p>Name retrieved from Servlet: <%= request.getAttribute("name") %></p>
  </body>
</html>
