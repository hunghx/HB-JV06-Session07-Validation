<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: AD
  Date: 10/2/2024
  Time: 7:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Dăng ki tai khoan Google</h1>
<%--<form action="/sign-up" method="post">--%>
<%--    <input type="text" name="firstName" placeholder="First Name">--%>
<%--    <input type="text" name="lastName" placeholder="Last Name"> <br>--%>
<%--    <input type="text" name="email" placeholder="username"><br>--%>
<%--    <input type="password" name="password" placeholder="password">--%>
<%--    <input type="password" name="confirmPassword" placeholder="confirmPassword"> <br>--%>
<%--    <button type="submit">Register</button>--%>
<%--</form>--%>
<form:form action="/sign-up" method="post" modelAttribute="formRegister">
    <form:input path="firstName" title="firstName"/>
    <form:errors path="firstName" cssStyle="color: red"/>
    <form:input path="lastName" title="lastName"/>
    <form:errors path="lastName" cssStyle="color: red"/><br>
    <form:input path="email" title="email"/>
    <form:errors path="email" cssStyle="color: red"/><br>
    <form:input path="password" type="password" title="password"/>
    <form:errors path="password" cssStyle="color: red"/>
    <form:input path="confirmPassword" type="password" title="confirmPassword"/>
    <form:errors path="confirmPassword" cssStyle="color: red"/><br>
    <button type="submit">Register</button>
</form:form>
</body>
</html>
