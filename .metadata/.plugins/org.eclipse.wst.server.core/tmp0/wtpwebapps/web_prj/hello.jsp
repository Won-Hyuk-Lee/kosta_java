<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    %>
<!-- 
hello.jsp는 WAS의 servlet container에 의해 서블릿(hello_jsp.java)으로 변환
  위치 : C:\IT\workspace_java\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\work\Catalina\localhost\ROOT\org\apache\jsp  
-->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
dddddd

<% 
for(int i=0; i<3; i++) {
	out.println(i);
	System.out.println(i);
} 
%>

</body>
</html>