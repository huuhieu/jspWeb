<%--
  Created by IntelliJ IDEA.
  User: hieudh
  Date: 3/25/14
  Time: 11:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html" charset=UTF-8">
    <title></title>
</head>
<body>
    <font color="red">Welcome, ${sessionScope.USER}</font>
    <h1>Welcome to world</h1>
    <form action="Controller">
        Name <input type="text" name="txtSearch" value=""><br />
        <input type="submit" value="Search" name="btAction" />
    </form>
</body>
</html>
