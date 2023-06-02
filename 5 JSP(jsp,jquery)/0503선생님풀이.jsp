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
	<h2>�Ʒ��� ���� ���������Դϴ�.</h2>
	<button id="intro" onclick="Intro()">�������� �ҷ�����</button>
		<!-- id�� intro�̰� ���Ŭ���� Intro() �Լ��� �����ϴ� ��ư -->
	<div id="div1"></div>	//�������� txt ��°���

	<h4>���ݱ��� �����ߴ� ������� �ҷ��ɴϴ�.</h4>

	<p>Java</p>
	<button id=java onclick="Java()">Java ��������</button>
	<div id="div2"></div>
	
	<p>HTML/CSS</p>
	<button id=html onclick="Html()">Html,Css ��������</button>
	<div id="div3"></div>
	
	<p>JavaScript</p>
	<button id=js onclick="JS()">JavaScript ��������</button>
	<div id="div4"></div>
	
	<p>Ajax</p>
	<button id=ajax onclick="Ajax()">Ajax ��������</button>
	<div id="div5"></div>
	
	<script>
	function Intro(){
		//1.xhr ��ü ����
		let xhr=new XMLHttpRequest();	//������ ���
		//2. �ݹ��Լ� ����(������ ���� introduce.txt ������ ������)
		xhr.onload=function(){	//load�̺�Ʈ(���Ź߽ż�����)�� �Ϸ�Ǹ� ���� �Լ��� �����϶�
			document.getElementById("div1").innerHTML=this.responseText;
			//responseText�� ���Ź��� �����͸� �ǹ�
		}
		//3. ������ ��û ������ :: open(),send() /GET or POST�̿�
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