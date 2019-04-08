<html>
<head>
    <title>User Tweets</title>
    <%@include file="../jspf/head_config.jspf"%>
</head>
<body>
    <div>
        <%@include file="../jspf/menu.jspf"%>
        <p>Witaj ${fullName} to Twoje wpisy:</p>

        <table align="center">
            <tr>
                <th>Created</th>
                <th>Title</th>
                <th>Content</th>
                </tr>
            <c:forEach items="${tweets}" var="tweet">
                <tr>
                    <td align="center">${tweet.fullDate}</td>
                    <td align="center">${tweet.title}</td>
                    <td align="center">${tweet.tweetText}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>
