<%--
  Created by IntelliJ IDEA.
  User: xp
  Date: 2019/5/14
  Time: 12:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="common/tag.jsp" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>商品列表</title>
    <%@include file="common/head.jsp" %>

</head>
<body>

<!-- 页面显示部分 -->
<div class="container">
    <div class="panel panel-default">
        <div class="panel-heading text-center">
            <h2>商品列表</h2>
        </div>
        <div class="panel-body">
            <table class="table table-hover">
                <thead>
                <tr>
                    <th>id</th>
                    <th>分类</th>
                    <th>商品名称</th>
                    <th>商品副标题</th>
                    <th>主图</th>
                    <th>价格</th>
                    <th>上架状态</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="sk" items="${productList}">
                    <tr>
                        <td>${sk.id}</td>
                        <td>${sk.categoryId}</td>
                        <td>${sk.name}</td>
                        <td>${sk.subtitle}</td>
                        <td>${sk.mainImage}</td>
                        <td>${sk.price}</td>
                        <td>${sk.status}</td>
                        <td>
                            <a class="btn btn-info" href="${sk.id}/detail" target="_blank">link</a>
                        </td>

                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>
