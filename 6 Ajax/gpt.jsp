<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<script src="https://code.jquery.com/jquery-3.6.4.min.js" integrity="sha256-oP6HI9z1XaZNBrJURtCoUT5SUnxFr8s3BzRl+cbzUq8=" crossorigin="anonymous"></script>
<title>�������ؼ�</title>
<script>

	$(document).ready(function(){
		$("#p1").html("-������ ����");
		$("#p2").html("-������");
		$("#p3").html("-�ұ���");
		$("#p4").html("-�ܹ���");
		$("#p5").html("-�ߵ�����");
		
		$("#btn1").html("1���� �޴�����");
		$("#btn2").html("2���� �޴�����");
		$("#btn3").html("3���� �޴�����");
		$("#btn4").html("�ĺ������");
	})
	$(function(){
		$("#btn1").click(function(){
			//�۾��� ����, ũ��� ����ũ��
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
<h2>���ɸ޴� �ĺ�</h2>

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