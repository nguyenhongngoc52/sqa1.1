<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 8/5/2021
  Time: 3:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home Page</title>
</head>
<body>
<h1 align="center"> Love Calculator</h1>
<form action="process-homepage" method="get">
<div align="center">
    <p>
        <label for="yn">Your name :</label>
        <input type="text" id="yn" name="userName"/>
    </p>
    <p>
        <label for="cn">Crush name :</label>
        <input type="text" id="cn" name="crushName"/>
    </p>
    <input type="submit" value="calculate">
</div>
</form>
</body>
</html>
