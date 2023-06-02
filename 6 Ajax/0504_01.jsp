<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- JQuery 적용방법 :: head안에 스크립트 입력-->
<script src="https://code.jquery.com/jquery-3.6.4.min.js" integrity="sha256-oP6HI9z1XaZNBrJURtCoUT5SUnxFr8s3BzRl+cbzUq8=" crossorigin="anonymous"></script>
<script>
	// Jquery문의 script 태그는 보통 head안에서 작성 (법칙은 아니고 권장사항)
	// Jquery :: Js 안에 사용을 간편하게 하는 데에 도움을 주는 Js 라이브러리
	// Jquery는 프로그래밍 언어가 아니다.
	
	// Jquery 기본 문법 :: $("선택자").동작함수()
	// $(document).ready == document.onload	->> 생략가능하다.
	//	=> "문서"를 불러온다, 홈페이지를 이렇게 "구성"한다.
	$(function(){	// ==window.onload
		// $"실행을 하면", $"id가 h인 태그에 해당 문자열을 삽입한다."
		// JS코드도 작성가능
		// document.getElementById("h").innerHTML="성공적으로 문자열 삽입이 수행됨.";
		$("#h").html("성공했습니다.");
	})
	
	
	
	$(document).ready(function(){	// ==   $(function(){	:: 실행해서 홈페이지를 불러올때, 아래 함수를 수행하라
    $("button").click(function(){	// button태그를 클릭하면 아래 함수를 클릭!
    								// 이때, html에 있는 모든 button태그에 적용!!!
    $("p").hide();					// html에 있는 모든 p태그 요소를 숨겨라. 
  	});
	});
	//	=>> $"button태그를 클릭하면", $"모든 p태그 요소를 숨겨라."
	
	// Css처리 -> 태그 style에 대한 적용 (이벤트도 가능하다.)	
	// id는 :: #, class는 :: .

	
	$(function(){		// $()"실행을하면")
	
		$("#h").css("color","pink");	// $"실행하면" + $"id가 h인 태그의 글씨 색으 pink로 한다."
		$("p").click(function(){		// $"p태그를 클릭하면"
			$("p").css("fontSize","25px");	
			$("p").css("color","blue");
			
			});	
	});
	
		
</script>
<title>Insert title here</title>
</head>
<body>
<h2 id="h"></h2>
<h2>This is a heading</h2>

<p>This is a paragraph.</p>
<p>This is another paragraph.</p>

<button>Click me</button>
</body>
</html>