<%--
  Created by IntelliJ IDEA.
  User: hieudh
  Date: 3/25/14
  Time: 2:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="styles.css"/>
    <meta http-equiv="content-type" content="text/html" charset=UTF-8">
    <title></title>
</head>
<body>
    <h1>Register</h1>
    <form action="Controller" method="post">
        Userid <input type="text" name="txtUser" value="" /><br />
        Password <input type="password" name="txtPass" value="" /><br />
        Name <input type="text" name="txtName" value="" /><br />
        Email <input type="text" name="txtEmail" value="" /><br />
        Gender <input type="text" name="txtGender" value="" /><br />
        <input type="submit" value="Register" name="btAction" />
    </form>
</body>
</html>
