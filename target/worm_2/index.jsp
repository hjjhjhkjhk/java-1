<%@ page language="java" pageEncoding="utf-8" contentType="text/html;charset=UTF-8" %>
<html ><head><title>登录 </title></head>

<body >
<form action="index" method="POST">
    <h2> <% out.println("用户登录");%></h2><br/><br/>
    <% out.println("账号:");%><br/> <input type="text" name="user"></input><br/><br/>
    <% out.println("密码:");%> <br/><input type="password" name="pass"></input><br/><br/>
    <input type="submit" value="提交"></input> <br/><br/>
</form>
</body>
</html>