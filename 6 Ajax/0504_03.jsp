<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>혼자도전</title>
<script src="https://code.jquery.com/jquery-3.6.4.min.js" integrity="sha256-oP6HI9z1XaZNBrJURtCoUT5SUnxFr8s3BzRl+cbzUq8=" crossorigin="anonymous"></script>
<script>
	$(document).ready(function(){
		$("#p").html("오늘 저녁메뉴");
		$("#btn").html("버튼입니다.");
//		$("#div").html("chihiro015.jpg");
	})
	
	$(function(){
		$("#btn").click(function(){
			$.get("chihiro015.jpg",function(data.status){
				alert("될까요?");
				$("#p").html(data+status);
			})
		})
	})

</script>
</head>
<body>
<p id="p"></p>
<button id="btn"></button>
</body>
</html>