<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- Ajax는 프로그래밍 언어가 아님 -->
	<!-- Ajax :: 로딩없이 웹페이지가 갱신되고, 백그라운드 ->웹서버로 데이터 상호전송 사용 -->
	<!-- Js이벤트 동작을 도와주는 라이브러리 -->
	<!-- "바닐라(순수)Js 통해 구현" or JQuery통해 구현 -->
	
	<button id="btn" onclick="Func()">눌러</button>
	<!-- id가 btn이고 클릭을하면 Func이라는 함수를 생성한다. -->
	<p id="test"></p>	<!-- onprogress함수 실행 결과 출력 -->
	<p id="text"></p>	<!-- onload함수 실행 결과 출력 -->
	
	<script>
		// XMLHttpRequest 객체 :: 웹 서버와 "데이터 교환"에 사용
		//		이 객체를 통해서, 페이지중 일부만 업데이트 가능 ()
		
		// *콜백 함수 종류
		// onload :: xhr(XMLHttpRequest) 객체가 서버로부터 데이터를 성공적으로 받을 때 수행할 함수
		// onerror	:: xhr 객체 통한 데이터 발신/수신 또는 xhr 객체 자체에 문제 발생 시 수행할 함수
		// onprogress :: xhr 객체에서 데이터 수신받을 때 호출할 함수
		// ....
		
		//응용방법
		function Func(){
			//1. XMLHttpRequest 객체 생성 -> 내장된 생성자 이용
			//let 객체명=new XMLHttpRequest();
			//let xhttp=new XMLHttpRequest();
			let xhttp=new XMLHttpRequest();
			//2. 콜백 함수(데이터 수신/발신 시 수행할 함수) 정의
			//xhr객체명.콜백함수명=fuction(){
				//(콜백함수를 실행시키는 조건이 만족할 때) 수행할 명령문
			//}
			//xhttp.onload=function{}
			xhttp.onprogress=function(){
				document.getElementById("test").innerHTML="통신 중입니다.";
			}
			xhttp.onload=function(){
				document.getElementById("text").innerHTML=this.responseText;
			}

			//콜백함수 적용은 여러개 정의 가능
			//3. 서버에 요청 보내기 :: open(), send() ->순서대로 작성하여야함
			//open() :: 서버에 요청할 내용 기술
				// xhr객체명.open("GET/POST","서버에 요청할 데이터");
				// GET :: 서버로부터 데이터를 받아올 때 사용 (=데이터를 요청할 떄 사용)
				// POST :: 서보로 데이터를 보낼 때 사용
			//send() :: 서버에 요청을 보냄
				//xhr객체명.send(); -> POST형식일 때, string형 매개변수가 있어야한다.(send(string))
			xhttp.open("GET", "메모테스트.txt");	//메모테스트.txt 파일을 받아올 것 요청한다.
			xhttp.send();
			//GET 형식을 사용할 때, open()의 두번째 매개변수 필요로함
			//POST 형식을 사용할 때, send()의 첫번쨰 매개변수 필요로함
		}
		
		
	</script>
</body>
</html>


