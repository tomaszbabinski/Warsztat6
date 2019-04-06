<html>
<head>
    <%@ include file="../jspf/head_config.jspf" %>
    <title>Add Tweet</title>
</head>
<body>
<div class="check">Add Tweet</div>
<div>
    <form:form modelAttribute="tweet">
    <label for="title">title</label>
    <form:input path="title" id="title" type="text"></form:input>
    <form:errors path="title"></form:errors>
</div>
<div>
    <label for="content">Content</label>
    <form:input path="content" id="content" type="text"></form:input>
    <form:errors path="content"></form:errors>
</div>

<div>

    <form:hidden path="id" />
    <input type="submit" value="Add the Tweet">
</div>

    </form:form>

</body>
</html>