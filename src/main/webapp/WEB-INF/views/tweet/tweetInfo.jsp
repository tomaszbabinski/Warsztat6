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
            <th>Replies</th>
        </tr>
        <tr>
                <td align="center">${tweet.fullDate}</td>
                <td align="center">${tweet.title}</td>
                <td align="center">${tweet.tweetText}</td>
                <td align="center">${tweet.listSize}</td>
        </tr>
        <tr></tr>
        <th>Comments</th>
         <c:forEach items="${tweet.comments}" var="comment">
            <tr>
                <td>${comment.text}</td>
            </tr>
        </c:forEach>
    </table>
    <form:form modelAttribute="commentDto" method="post" action="/comment/add">
        <form:input path="text" size="75"></form:input>
        <form:hidden path="user.id"></form:hidden>
        <form:hidden path="tweet.id"></form:hidden>
        <form:hidden path="id" ></form:hidden>
        <input type="submit" value="Add comment">
    </form:form>
        </div>
</body>
</html>
