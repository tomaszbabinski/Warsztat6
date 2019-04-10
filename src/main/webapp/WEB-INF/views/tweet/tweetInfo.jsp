<html>
<head>
    <%@ include file="../jspf/head_config.jspf" %>
    <link rel="stylesheet" href='../../resources/css/style.css' />
    <title>Tweet info</title>
</head>
<body>
    <div>
    <%@include file="../jspf/menu.jspf"%>
    <table align="center">
        <tr>
            <th>Created</th>
            <th>Title</th>
            <th>Content</th>
            <th>Comments</th>
        </tr>
        <tr>
                <td align="center">${tweet.fullDate}</td>
                <td align="center">${tweet.title}</td>
                <td align="center">${tweet.tweetText}</td>
                <c:forEach items="${tweet.comments}" var="comment">

                </c:forEach>
        </tr>
        <tr></tr>
        <th>Comments</th>

    </table>
    <form:form modelAttribute="commentDto" method="post" action="/comment/add">
        <form:input path="text" size="75"></form:input>
        <form:hidden path="id" ></form:hidden>
        <input type="submit" value="Add comment">
    </form:form>
        </div>
</body>
</html>
