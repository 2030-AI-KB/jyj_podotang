<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<script src="https://code.jquery.com/jquery-3.6.4.min.js" integrity="sha256-oP6HI9z1XaZNBrJURtCoUT5SUnxFr8s3BzRl+cbzUq8=" crossorigin="anonymous"></script>
<title>Insert title here</title>
<script>
	$(function(){
		$("#h").click(function(){
			$("#h").prompt();
		});
	});

		$(document).ready(function(){
		$("#p").click(function(){
		$("p").hide();	
		$("h1").hide();
		$("h2").hide();
		$("h3").hide();
		});
		});
		
</script>
</head>
<body>

<h1>1����<input type="text" id="H1"></h1>
<button id=h>1���� �޴� ����</button>
<br>
<h2>2����<input type=""text" id="H2"></h2>
<button id=h2>2���� �޴� ����</button>
<br>
<h3 input type=text id=H3>3����</h3>
<button id=h3>3���� �޴� ����</button>
<br>
<p input type=text id=P>�ĺ�����</p>
<button id=p>�ĺ������</button>
<br>
</body>
</html>