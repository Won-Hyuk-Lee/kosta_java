<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.kosta.sample.chart.EmpVO" %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="shortcut icon" href="#"><!-- favicon 에러 해결방안 -->
<!-- 
C3.js :  (easy) to generate D3-based charts  
      :  (D3-based) reusable (JavaScript chart library). 
D3.js : open-source JavaScript library for visualizing.

https://cdnjs.cloudflare.com/ajax/libs/c3/0.7.20/c3.min.js
https://cdnjs.cloudflare.com/ajax/libs/c3/0.7.20/c3.js

https://cdnjs.cloudflare.com/ajax/libs/c3/0.7.20/c3.css
https://cdnjs.cloudflare.com/ajax/libs/c3/0.7.20/c3.min.css
 -->
 
<!-- Load c3.css -->
<link href="https://cdnjs.cloudflare.com/ajax/libs/c3/0.7.20/c3.css" rel="stylesheet">
<link href="https://cdnjs.cloudflare.com/ajax/libs/c3/0.7.20/c3.min.css" rel="stylesheet">

<!-- Load d3.js and c3.js   https://cdnjs.cloudflare.com/ajax/libs/d3/5.15.0/d3.js -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/d3/5.15.0/d3.js" charset="utf-8"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/c3/0.7.20/c3.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/c3/0.7.20/c3.min.js"></script>


<script src="https://code.jquery.com/jquery-3.7.1.js"></script>
<script>
	$(function() {
		
	});
</script>		

</head>
<body>
여기에 차트<br>
<div id="my_chart_div"></div>


<%
ArrayList<EmpVO> list = (ArrayList<EmpVO>)request.getAttribute("KEY_EMPLIST");
out.println("총:" + list.size());
for(EmpVO evo  : list) {
	out.println(evo.getSal());
}
%>
		
		
<script>
var chart = c3.generate({
    bindto: '#my_chart_div',
    data: {
      columns: [
        ['급여', 3000, 200, 100, 400, 150, 250]
        //,['data2', 50, 20, 10, 40, 15, 25]
      ]
    }
});
</script>

</body>
</html>