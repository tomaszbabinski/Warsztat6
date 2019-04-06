<html>
<head>
    <%@ include file="../jspf/head_config.jspf" %>
    <title>Twitter App - Register user</title>
</head>
<body>
<div class="check">Login user</div>
<div>
<form:form modelAttribute="user">

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
