<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.4.min.js" integrity="sha256-oP6HI9z1XaZNBrJURtCoUT5SUnxFr8s3BzRl+cbzUq8=" crossorigin="anonymous"></script>
<script>
//������ �ϸ�, �̹��� �±׿� p/div �±׿� ���� ������ �̹����� txt������ �ҷ����� �Ѵ�.
$(function(){
	$("img").attr("src","chihiro015.jpg");
	$("img").css("width","200px");
	$("p").load("����.txt");
})
$(function(){
	$("button").click(function(){
		$.get("���.txt",function(data,status){
			alert("�������մϴ�."+status);
			$("p").html(data);			
		})
		$("img").attr("src","ponyo036.jpg");
		$("img").css("width","200px");
	})
})
</script>
</head>
<body>
<!-- html�±� ���� :: ��ư 1��, �̹��� �±� 1��, p�Ǵ� div �±� 1�� -->
<button>�̹��� ����</button>	<br>
<img>
<p></p>
</body>
</html>