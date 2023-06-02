<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2023-05-30
  Time: 오전 9:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="ko">
<head>
    <meta charset="URF-8">
    <meta name="viewprot"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0,minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <script src="https://code.jquery.com/jquery-3.7.0.js" integrity="sha256-JlqSTELeR4TLqP0OG9dxM7yDPqX1ox/HfgiSLBj8+kM=" crossorigin="anonymous"></script>

<%--    <script>
        function searchSubmit() {
            var input = $('#keywordInput').val();
            if(input==''){
                alert('검색 키워드를 입력해 주세요');
                return;
            }
            // $('#searchForm').submit();
            $('#checkText').text(str);
        }
    </script>--%>
</head>

<body>
<%--<form action="/result.do" method="post"> &lt;%&ndash;요청하는 경로&ndash;%&gt;
    이름
    <input type="text" name="myName"> &lt;%&ndash;get값 받을때 키 값&ndash;%&gt;
    <input type="submit" value="확인">
</form>

<form action="/search.do" method="post" id="searchForm">
    검색
    <input type="text" name="myNameId" id="keywordInput">
    <button type="button" onclick="searchSubmit()">확인</button>
</form>--%>
<%--form태그 안에 버튼 넣을때 꼭 type="button" 지정해주기--%>


<a href ="/member/join/form.do">회원가입</a>


</body>
</html>


<%--<button>저장 </button>--%

<%--느낌표 + tab으로 빨리 작성 가능--%>