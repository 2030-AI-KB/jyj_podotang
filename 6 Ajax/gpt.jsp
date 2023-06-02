<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<script src="https://code.jquery.com/jquery-3.6.4.min.js" integrity="sha256-oP6HI9z1XaZNBrJURtCoUT5SUnxFr8s3BzRl+cbzUq8=" crossorigin="anonymous"></script>
<title>선생님해설</title>
<script>

	$(document).ready(function(){
		$("#p1").html("-편의점 음식");
		$("#p2").html("-마라탕");
		$("#p3").html("-쌀국수");
		$("#p4").html("-햄버거");
		$("#p5").html("-닭도리탕");
		
		$("#btn1").html("1순위 메뉴보기");
		$("#btn2").html("2순위 메뉴보기");
		$("#btn3").html("3순위 메뉴보기");
		$("#btn4").html("후보지우기");
	})
	$(function(){
		$("#btn1").click(function(){
			//글씨색 빨강, 크기는 가장크게
			$("#p1").css("color","red");
			$("#p1").css("fontSize","40px");
		})
		$("#btn2").click(function(){
			$("#p2").css("color","blue");
			$("#p2").css("fontSize","35px");
		})
		$("#btn3").click(function(){
			$("#p3").css("color","green");
			$("#p3").css("fontSize","30px");
		})
		$("#btn4").click(function(){
			$("#p4").hide();
			$("#p5").hide();
		})
	})

</script>
</head>
<body>
<h2>점심메뉴 후보</h2>

<hr>
<p id="p1"></p>
<p id="p2"></p>
<p id="p3"></p>
<p id="p4"></p>
<p id="p5"></p>

<button id="btn1"></button>
<button id="btn2"></button>
<button id="btn3"></button>
<button id="btn4"></button>

</body>
</html>