<%@ page import="demo.HelloWorld" %>

<%--
  Created by IntelliJ IDEA.
  User: hieudh
  Date: 3/25/14
  Time: 8:14 AM
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
    <h1>Login Page</h1>
    <form action="Controller" method="post">
        UserName <input type="text" name="txtUsername" value="" /><br/>
        Password <input type="password" name="txtPass" value="" /><br/>
        <input type="submit" value="Login" name="btAction" />
        <input type="reset" value="reset" />
        <input type="" value="Login" name="btAction" />
    </form>
  </body>
</html>
