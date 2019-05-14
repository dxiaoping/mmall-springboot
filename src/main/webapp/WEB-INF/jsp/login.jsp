<%--
  Created by IntelliJ IDEA.
  User: xp
  Date: 2019/5/11
  Time: 22:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆页面</title>
    <%@include file="common/head.jsp"%>
</head>
<body>
<!-- 登录表单 -->
<form style="margin-left:500px;margin-top:200px;" action="/user/login.do" method="post">
    <div class="form-group">
        <label for="usernam" stype="display:inline;">账户：</label>
        <input type="text" class="form-control" name="username" id="usernam" style="display:inline;width:200px;" />
    </div>
    <div class="form-group">
        <label for="passwor" style="display:inline;">密码：</label>
        <input type="text" class="form-control" name="password" id="passwor" style="display:inline;width:200px;" autocomplete="off"/>
    </div>
    <button type="submit" class="btn btn-primary">登录</button>
    <button type="submit" class="btn btn-primary">注册</button>
</form>
</body>
</html>
