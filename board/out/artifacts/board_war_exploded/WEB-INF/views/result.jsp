<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2023-05-30
  Time: 오전 9:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String inputName = (String) request.getAttribute("name");
%>
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
<%=inputName%>님 안녕하세요!
<button onclick="Location.href='/main.do'">홈으로</button>
</body>
</html>

<%--나이 입력 받아서 이 페이지에 00살 000님 안녕하세요 출력--%>
