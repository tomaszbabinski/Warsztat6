<html>
<head>
    <%@ include file="../jspf/head_config.jspf" %>
    <title>Home Page</title>
</head>
<body>

    <div class="check">
        <div class="menu-item"><a href="#">Home</a> </div>
        <div class="menu-item"><a href="#">User</a> </div>
        <div class="menu-item"><a href="#">Tweets</a> </div>
        <div class="menu-item"><a href="/user/logout">Logout</a> </div>
    </div>

    <div>
        <table align="center">
            <tr>
                <th>Created</th>
                <th>Content</th>
            </tr>
        <c:forEach items="${tweets}" var="tweet">
            <tr>
                <td align="center">${tweet.fullDate}</td>
                <td align="center">${tweet.text}</td>

            </tr>
        </c:forEach>
        </table>
    </div>

</body>
</html>
