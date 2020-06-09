<%--
  Created by IntelliJ IDEA.
  User: jhb
  Date: 2019/12/29
  Time: 1:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form  action="${pageContext.request.contextPath}/TestAdd" method="post">
        <table>
            <tr>
                <td>姓名:<input type="text" name="tname"></td>
                <td>性别:
                    <input type="radio" name="tsex" value="男">男
                    <input type="radio" name="tsex" value="女">女
                </td>
                <td>年龄:<input type="text" name="tage"></td>
                <td>班级:
                    <select name="tclass">
                        <option>S1</option>
                        <option>S2</option>
                        <option>Y2</option>
                    </select>
                </td>
                <td>入学时间:<input type="date" name="tdate"></td>
                <td>住址:<input type="text" name="tadd"></td>
                <td><input type="submit" value="提交"></td>
            </tr>
        </table>
    </form>
</body>

<script src="${pageContext.request.contextPath}/js/jquery-1.8.3.js"></script>
<script>

</script>
<c:if test="${not empty msg}">
    <script>
        alert("${msg}");
    </script>
    <c:remove var="msg"></c:remove>
</c:if>
</html>
