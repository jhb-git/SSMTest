<%--
  Created by IntelliJ IDEA.
  User: jhb
  Date: 2019/12/29
  Time: 0:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>用户管理系统</title>
</head>
<body>
    <form>
        <table border="1">
            <tr>
                <td>编号</td>
                <td>姓名</td>
                <td>性别</td>
                <td>年龄</td>
                <td>班级</td>
                <td>入学时间</td>
                <td>住址</td>
                <td>操作</td>
            </tr>

            <c:forEach items="${list}" var="list">
                <tr>
                    <td>${list.tid}</td>
                    <td>${list.tname}</td>
                    <td>${list.tsex}</td>
                    <td>${list.tage}</td>
                    <td>${list.tclass}</td>
                    <td>${list.tdate}</td>
                    <td>${list.tadd}</td>
                    <td><span class="del" id="${list.tid}">删除</span> </td>
                </tr>

            </c:forEach>
            <a href="${pageContext.request.contextPath}/TestAll"><input type="button" value="增加"> </a>

        </table>

    </form>
</body>
<script src="js/jquery-1.8.3.js"></script>


<c:if test="${not empty msg}">
    <script>
        alert("${msg}");
    </script>
    <c:remove var="msg"></c:remove>
</c:if>
</html>
