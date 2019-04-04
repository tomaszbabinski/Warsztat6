
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>Twitter App - Register user</title>
</head>
<body>

<form:form modelAttribute="user">
    <div>Login user</div>
    <div>
        <label for="email">Email</label>
        <form:input path="email" id="email" type="email"></form:input>
        <form:errors path="email"></form:errors>
    </div>
    <div>
        <label for="password">Password</label>
        <form:input path="password" id="password" type="password"></form:input>
        <form:errors path="password"></form:errors>
    </div>
    <div>
        <input type="submit">
    </div>
    <div>
        <c:out value="${msg}"></c:out>
    </div>
</form:form>

</body>
</html>
