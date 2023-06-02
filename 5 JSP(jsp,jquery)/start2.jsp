<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>�Ʒ��� ���� ���������Դϴ�.</h2>
    <button id="introduce-btn" onclick="loadFile('introduce.txt')">��������</button>
	
	<h2><<<���ݱ��� �����ߴ� ������ �ҷ��ɴϴ�.>>></h2>
	
    <h2>Java</h2>
    <button id="java-btn" onclick="loadFile('java.txt')">Java ��������</button>

    <h2>HTML/CSS</h2>
    <button id="html-btn" onclick="loadFile('html.txt')">HTML/CSS ��������</button>

    <h2>JavaScript</h2>
    <button id="js-btn" onclick="loadFile('js.txt')">JavaScript ��������</button>

    <h2>Ajax</h2>
    <button id="ajax-btn" onclick="loadFile('ajax.txt')">Ajax ��������</button>

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
                alert("������ �ε� ���Դϴ�.");
            };
            xhttp.open("GET", filename, true);
            xhttp.send();
        }
    </script>
</body>
</html>
