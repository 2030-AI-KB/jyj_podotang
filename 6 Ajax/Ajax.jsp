<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.4.min.js" integrity="sha256-oP6HI9z1XaZNBrJURtCoUT5SUnxFr8s3BzRl+cbzUq8=" crossorigin="anonymous"></script>
<script>
// Jquery이용한 Ajax 구현
// Ajax :: 로딩없이 페이지를 갱신하는 데에 도움을 주는 역할 

//$(function(){
//	$("#btn").click(function(){
//		$("#p").load("통신.txt");
//	})
//})

// get().post() 메소드 사용
// $.get("받아올데이터","콜백함수");
$(function(){
	$("#btn").click(function(){
		$.get("통신.txt",function(data,status){
			alert("통신성공했다릐~");
		$("p").html("데이터: "+data+"<br>상태: "+status);
		})
	})
})

// $.post("데이터 저장할공간",데이터,콜백함수);
$(function(){
	$("#btn").click(function(){
		$post("하하.txt",{name: 정유진, age: XX},function(data,status){
			$("#text").html(data+"<br>상태: "+status);
		})
	})
})
</script>

</head>
<body>
	<button id="btn">텍스트 파일 불러오기</button>
	<p id="p"></p>
	<p id="text"></p>
	
</body>
</html>