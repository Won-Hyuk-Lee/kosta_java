<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	
	<!-- -------------------------------------------------------------
	    사용자 정의 Javascript 테스트 
	--------------------------------------------------------------- -->
	<script src="js/my.js"></script>
	<script>
	   //public int myprint(int a, int b) {  syso.print... }
	   function myprint(a, b) {
		   //alert(a+b);
		   console.log(a+b);
	   }
	</script>
	
	
	<!-- -------------------------------------------------------------
	    사용자 정의 CSS 테스트 
	--------------------------------------------------------------- -->
	<style>
	  	p {
	    	color:red;
	    	font-weight:bold;
	  	}
    </style>
  	<link href="css/my.css" rel="stylesheet" />
  	
 
  	<!-- -------------------------------------------------------------
    jQuery는 HTML의 클라이언트 사이드 조작을 (단순화) 하도록 설계된 
            크로스 플랫폼의 (자바스크립트 라이브러리)다
     - <form> 제어        
     - 조건문(if)
     - 반복문(for , foreach)
     - 전송 (Ajax)
  	------------------------------------------------------------------
  	$  (document).ready    (        function() {}     );
	$                      (        function() {}     );  	
  	id    = "abc"    $("#abc")
  	class = "abc"    $(".abc")
  	-->
  	
	<script src="https://code.jquery.com/jquery-3.7.1.js"></script>
    <script>
		$(function() {
			//---------------------------------------------------------
			// id접근 $(".__")    vs.    class접근  $("#__")
			//---------------------------------------------------------
		  	//$("p").text(  "text 변경변경"  );
			$("#PTAG_ID").text(  "text 변경변경-#PTAG_ID"  );
			
			$(".PTAG_CLASS").text(  "text 변경변경-.PTAG_CLASS"  );
			//$("#PTAG_ID_11").text(  "text 변경변경-.PTAG_CLASS"  );
			//$("#PTAG_ID_22").text(  "text 변경변경-.PTAG_CLASS"  );
			
			
			//---------------------------------------------------------
			//seq 값 가져오기 및 변수할당
			//---------------------------------------------------------
			//var msg = $("#seq").val();  //seq     값 가져오기
			//alert(  msg );  
			
			//---------------------------------------------------------
			//uname에 값 넣기     == value="hong"
			//---------------------------------------------------------
			// $("#uname").val("hong");                //id로 접근
			// $(".uname").val("hong");                //class로 접근
			// $("input[name='uname']").val("hong");   //name으로 접근
			$("#uname").val("hong"); 
			
			//---------------------------------------------------------
			// <form> 제어하기
			//---------------------------------------------------------
			$("#regbtn").click(  function(){
				if ($("#uname").val() == "") {
					alert("아이디 입력하세요");
					$("#uname").focus();
					return false;
				} else if ($("#passwd").val() == "") {
					alert("비번 입력하세요");
					$("#passwd").focus();
					return false;
				}
				
				$("#loginForm").attr("method","post");
				$("#loginForm").attr("action","/BoardServlet");
				$("#loginForm").submit();
				return true;
			});
			//------------------------------------------------------------
			
		});
		
	</script>
</head>

<body>
   <form name="loginForm" id="loginForm" method="post">  method action <br>
    	hidden:<input type="hidden"    name="seq"    id="seq"    class="seq"    value="12345"><br>
    	uname:<input type="text"      name="uname"  id="uname"  class="uname"><br>
    	passwd:<input type="password"  name="passwd" id="passwd" class="passwd"><br>
    	<input type="button"    name="regbtn" id="regbtn" class="regbtn"  value="가입">
    </form>
    
	<p id="PTAG_ID">Not loaded yet111</p><br>         <!--  id : 고유해야 한다. -->
	
	<p id="PTAG_ID_11" class="PTAG_CLASS">aaaaa</p>	  <!--  class : 일괄 적용시켜야 할 경우 사용 -->
	<p id="PTAG_ID_22" class="PTAG_CLASS">bbbbb</p>
	
    <a href="#" onClick="myprint(5,3)"> 클릭 내부js</a><br>
    <div        onClick="myprint(5,3)"> 클릭 내부js div  </div>
    <a href="#" onClick="myjsPrint()"> 클릭 외부my.js</a><br>
    

</body>

</html>