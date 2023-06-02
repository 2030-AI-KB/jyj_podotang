<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://code.jquery.com/jquery-3.6.4.min.js" integrity="sha256-oP6HI9z1XaZNBrJURtCoUT5SUnxFr8s3BzRl+cbzUq8=" crossorigin="anonymous"></script>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>아래는 저의 인적사항입니다.</h2>
	<button id="intro" onclick="Intro()">인적사항 불러오기</button>
		<!-- id가 intro이고 요소클릭시 Intro() 함수를 수행하는 버튼 -->
	<div id="div1"></div>	//인적사항 txt 출력공간

	<h4>지금까지 수업했던 내용들을 불러옵니다.</h4>

	<p>Java</p>
	<button id=java onclick="Java()">Java 수업내용</button>
	<div id="div2"></div>
	
	<p>HTML/CSS</p>
	<button id=html onclick="Html()">Html,Css 수업내용</button>
	<div id="div3"></div>
	
	<p>JavaScript</p>
	<button id=js onclick="JS()">JavaScript 수업내용</button>
	<div id="div4"></div>
	
	<p>Ajax</p>
	<button id=ajax onclick="Ajax()">Ajax 수업내용</button>
	<div id="div5"></div>
	
	<script>
	function Intro(){
		//1.xhr 객체 생성
		let xhr=new XMLHttpRequest();	//생성자 사용
		//2. 콜백함수 정의(서버로 부터 introduce.txt 파일을 받을것)
		xhr.onload=function(){	//load이벤트(수신발신성공적)가 완료되면 다음 함수를 실행하라
			document.getElementById("div1").innerHTML=this.responseText;
			//responseText는 수신받은 데이터를 의미
		}
		//3. 서버에 요청 보내기 :: open(),send() /GET or POST이용
		xhr.open("GET","introduce.txt");
		xhr.send();
	}	
	function Java(){
		let xhr=new XMLHttpRequest();
		xhr.onload=function(){
			document.getElementById("div2").innerHTML=this.responseText;
		}
		xhr.open("GET","java.txt");
		xhr.send();
	}
	function Html(){
		let xhr=new XMLHttpRequest();
		xhr.onload=function(){
			document.getElementById("div3").innerHTML=this.responseText;
		}
		xhr.open("GET","html.txt");
		xhr.send();
	}
	function JS(){
		let xhr=new XMLHttpRequest();
		xhr.onload=function(){
			document.getElementById("div4").innerHTML=this.responseText;
		}
		xhr.open("GET","js.txt");
		xhr.send();
	}
	function Ajax(){
		let xhr=new XMLHttpRequest();
		xhr.onload=function(){
			document.getElementById("div5").innerHTML=this.responseText;
		}
		xhr.open("GET","ajax.txt");
		xhr.send();
	}
	</script>

</body>
</html>