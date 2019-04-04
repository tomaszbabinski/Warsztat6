<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@	taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Twitter App Register Form</title>
    <style>

    </style>
</head>
<body>
    <form:form modelAttribute="userDto" method="post">
        <div>Register User</div>
        <div>First Name:<label for="firstName">
            <form:input path="firstName" id="firstName" type="text"/>
            <form:errors path="firstName"/>
        </label></div>
        <div>Last Name:<label for="lastName">
            <form:input path="lastName" id="lastName" type="text"/>
            <form:errors path="lastName"/>
        </label></div>
        <div>Email:<label for="email">
            <form:input path="email" id="email" type="email"/>
            <form:errors path="email"/>
        </label></div>
        <div>Password<label for="password">
            <form:input path="password" id="password" type="password"/>
            <form:errors path="password"/>
        </label></div>
        <div>Repeat password<label for="passwordRepeat">
            <form:input path="passwordRepeat" id="passwordRepeat" type="password"/>
            <form:errors path="passwordRepeat"/>
        </label></div>

        <input type="submit" value="Register">

    </form:form>
</body>
</html>
