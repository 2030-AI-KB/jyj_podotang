<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>아래는 저의 인적사항입니다.</h2>
    <button id="introduce-btn" onclick="loadFile('introduce.txt')">인적사항</button>
	
	<h2><<<지금까지 수업했던 내용을 불러옵니다.>>></h2>
	
    <h2>Java</h2>
    <button id="java-btn" onclick="loadFile('java.txt')">Java 수업내용</button>

    <h2>HTML/CSS</h2>
    <button id="html-btn" onclick="loadFile('html.txt')">HTML/CSS 수업내용</button>

    <h2>JavaScript</h2>
    <button id="js-btn" onclick="loadFile('js.txt')">JavaScript 수업내용</button>

    <h2>Ajax</h2>
    <button id="ajax-btn" onclick="loadFile('ajax.txt')">Ajax 수업내용</button>

    <p id="text"></p>

    <script>
        function loadFile(filename) {
            let xhttp = new XMLHttpRequest();
            xhttp.onreadystatechange = function() {
                if (this.readyState == 4 && this.status == 200) {
                    document.getElementById("text").innerHTML = this.responseText;
                }
            };
            xhttp.onprogress = function() {
                alert("파일을 로딩 중입니다.");
            };
            xhttp.open("GET", filename, true);
            xhttp.send();
        }
    </script>
</body>
</html>
