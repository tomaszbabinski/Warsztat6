<html>
<head>
    <%@ include file="../jspf/head_config.jspf" %>
    <link rel="stylesheet" href='../../resources/css/style.css' />
    <title>Tweet info</title>
</head>
<body>
    <%@include file="../jspf/menu.jspf"%>
    <table align="center">
        <tr>
            <th>Created</th>
            <th>Title</th>
            <th>Content</th>
        </tr>
        <tr>
                <td align="center">${tweet.fullDate}</td>
                <td align="center">${tweet.title}</td>
                <td align="center">${tweet.tweetText}</td>
        </tr>
    </table>
</body>
</html>
