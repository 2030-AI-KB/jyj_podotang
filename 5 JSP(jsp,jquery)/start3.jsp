<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Text Files</title>
</head>
<body>
	<h2>아래는 저의 인적사항입니다.</h2>
	<button id="introBtn">인적사항</button>
	<h2>Java</h2>
	<button id="javaBtn">Java</button>
	<h2>HTML/CSS</h2>
	<button id="htmlBtn">HTML/CSS</button>
	<h2>JavaScript</h2>
	<button id="jsBtn">JavaScript</button>
	<h2>Ajax</h2>
	<button id="ajaxBtn">Ajax</button>

	<p id="text"></p>

	<script>
		let introBtn = document.getElementById("introBtn");
		let javaBtn = document.getElementById("javaBtn");
		let htmlBtn = document.getElementById("htmlBtn");
		let jsBtn = document.getElementById("jsBtn");
		let ajaxBtn = document.getElementById("ajaxBtn");

		let text = document.getElementById("text");

		function loadText(url) {
			let xhttp = new XMLHttpRequest();

			xhttp.onload = function() {
				text.innerHTML = this.responseText;
			}

			xhttp.onprogress = function() {
				text.innerHTML = "통신 중입니다.";
			}

			xhttp.open("GET", url);
			xhttp.send();
		}

		introBtn.addEventListener("click", function() {
			loadText("introduce.txt");
		});

		javaBtn.addEventListener("click", function() {
			loadText("java.txt");
		});

		htmlBtn.addEventListener("click", function() {
			loadText("html.txt");
		});

		jsBtn.addEventListener("click", function() {
			loadText("js.txt");
		});

		ajaxBtn.addEventListener("click", function() {
			loadText("ajax.txt");
		});
	</script>
</body>
</html>
