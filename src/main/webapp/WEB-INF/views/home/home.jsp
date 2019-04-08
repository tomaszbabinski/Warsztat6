<html>
<head>
    <%@ include file="../jspf/head_config.jspf" %>
    <title>Home Page</title>
</head>
<body>

    <div class="check">
        <div class="menu-item"><a href="#">Home</a> </div>
        <div class="menu-item"><a href="/user/showTweets">User</a> </div>
        <div class="menu-item"><a href="#">Tweets</a> </div>
        <div class="menu-item"><a href="/user/logout">Logout</a> </div>
    </div>

    <div class="check">Add Tweet</div>
    <div>
        <form:form modelAttribute="tweetDto" action="/tweet/add" method="post">
        <label for="title">title</label>
        <form:input path="title" id="title" type="text"></form:input>
        <form:errors path="title"></form:errors>
        <label for="content">Content</label>
        <form:input path="content" id="content" type="text"></form:input>
        <form:errors path="content"></form:errors>
          <form:hidden path="id" />
        <input type="submit" value="Add the Tweet">
    </div>

    </form:form>


    <div>
        <table align="center">
            <tr>
                <th>Created</th>
                <th>Title</th>
                <th>Content</th>
                <th>Twitted by</th>
            </tr>
        <c:forEach items="${tweets}" var="tweet">
            <tr>
                <td align="center">${tweet.fullDate}</td>
                <td align="center"><a href="/tweet/getTweet/${tweet.id}">${tweet.title}</a></td>
                <td align="center">${tweet.tweetText}</td>
                <td align="center">${tweet.user.fullName}</td>

            </tr>
        </c:forEach>
        </table>
    </div>

</body>
</html>
