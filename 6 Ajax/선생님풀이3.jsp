<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.4.min.js" integrity="sha256-oP6HI9z1XaZNBrJURtCoUT5SUnxFr8s3BzRl+cbzUq8=" crossorigin="anonymous"></script>
<script>
//실행을 하면, 이미지 태그와 p/div 태그에 각각 임의의 이미지와 txt파일을 불러오게 한다.
$(function(){
	$("img").attr("src","chihiro015.jpg");
	$("img").css("width","200px");
	$("p").load("저녁.txt");
})
$(function(){
	$("button").click(function(){
		$.get("김밥.txt",function(data,status){
			alert("결과출력합니다."+status);
			$("p").html(data);			
		})
		$("img").attr("src","ponyo036.jpg");
		$("img").css("width","200px");
	})
})
</script>
</head>
<body>
<!-- html태그 구성 :: 버튼 1개, 이미지 태그 1개, p또는 div 태그 1개 -->
<button>이미지 변경</button>	<br>
<img>
<p></p>
</body>
</html>