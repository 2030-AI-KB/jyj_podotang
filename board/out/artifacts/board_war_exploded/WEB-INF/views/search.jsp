<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2023-05-31
  Time: 오전 9:52
  To change this template use File | Settings | File Templates.
--%>
<%
    String name = (String) request.getAttribute("result");
%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!doctype html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initaial-scale=1.0, maximum-scale=1.0, minimum=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>결과 화면</title>
</head>
<body>
<%=name%>
</body>
</html>