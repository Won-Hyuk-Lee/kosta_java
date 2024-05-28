<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script>
var arr = [{"empno":"7733", "ename":"smith"} , 
	        {"empno":"7799", "ename":"king"}];
for(var i =0; i<arr.length; i++) {
	console.log(arr[i]["empno"]);
}

var arr2 = [["7733","smiht"] , ["7799","king"]];
for(var i =0; i<arr2.length; i++) {
	console.log(arr2[i][0]);
}

var arr3 = [["7733","smiht"] , ["7799","king"]];
arr3.forEach(function(val, idx){
	console.log(idx + "," + val[1]);
});

function myprint(prm) {
	console.log("myprint() 호출" + prm);
}

function myprint2(prm) {
	alert("myprint2() 호출" + prm);
}
</script>

<script src="https://code.jquery.com/jquery-3.7.1.js"></script>
<script>
	
	//$(document).ready (function() {});
	
		
	$ (function() {
		myprint("홍길동");
		
		var arr4 = [["7733","smiht"] , ["7799","king"]];
		//for(var i =0; i<arr4.length; i++) {
		//	console.log(arr4[i][0]);
		//}
		$.each(arr4,  function(idx, val){
			console.log(idx + "," + val[1]);
		});
		
		
		var arr5 = [{"empno":"7733", "ename":"smith"} , 
	        {"empno":"7799", "ename":"king"}];
		$.map(arr5,  function(val, idx){
			console.log(idx + "," + val["ename"]);
		});
		
		$("#myBtn").click(  function(){
			myprint2("제이쿼리길동");
		});
		
		$("#myDiv").click(  function(){
			myprint2("제이쿼리div");
		});
	});
	
	
</script>		

</head>
<body>
스크립트 반복문 연습<br>

<a href="#"  onClick="myprint2('홍길동');">스크립트 호출</a>
<table border=1 width=200><tr><td  style="cursor:pointer" onClick="myprint2('홍길동');">스크립트 호출</td></tr></table>
<input type="button" id="myBtn" value="버튼 클릭">
<div style="cursor:pointer" id="myDiv">div클릭</div>
</body>
</html>