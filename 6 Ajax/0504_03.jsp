<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ȥ�ڵ���</title>
<script src="https://code.jquery.com/jquery-3.6.4.min.js" integrity="sha256-oP6HI9z1XaZNBrJURtCoUT5SUnxFr8s3BzRl+cbzUq8=" crossorigin="anonymous"></script>
<script>
	$(document).ready(function(){
		$("#p").html("���� ����޴�");
		$("#btn").html("��ư�Դϴ�.");
//		$("#div").html("chihiro015.jpg");
	})
	
	$(function(){
		$("#btn").click(function(){
			$.get("chihiro015.jpg",function(data.status){
				alert("�ɱ��?");
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