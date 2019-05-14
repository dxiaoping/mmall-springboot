<%--
  Created by IntelliJ IDEA.
  User: xp
  Date: 2019/5/12
  Time: 16:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>界面测试页面</title>

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

<%--<form action="/user/login.do" method="post">--%>
    <%--id：<input type="text" name="id" id="id" /><br>--%>
    <%--用户名：<input type="text" name="username" id="username" /><br>--%>
    <%--密码：<input type="password" name="password" id="password" /><br>--%>
    <%--<input type="submit" name="提交" />--%>
    <%--<input type="reset" name="重置" />--%>
<%--</form>--%>
</body>
</html>
