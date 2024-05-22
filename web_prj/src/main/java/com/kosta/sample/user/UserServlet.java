package com.kosta.sample.user;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//페이지 구분을 위한 input type=hidden 값(P001 or P002)
		String pagecode = request.getParameter("pagecode");
		UserDAO dao = new UserDAO();
		
		// -------------------register --------------------
		if(pagecode.equals("P001")) {
			//seq - user_seq.nextval
			String userid  = request.getParameter("userid");
			String uname   = request.getParameter("uname");
			String email   = request.getParameter("email");
			String passwd  = request.getParameter("passwd");
			//regdate - sysdate
			
			UserVO uvo = new UserVO();
			uvo.setUserid(userid);
			uvo.setUname(uname);
			uvo.setEmail(email);
			uvo.setPasswd(passwd);
			
			int insertRows = dao.userInsert(uvo);
			if(insertRows == 1) {
				//회원가입 성공
				response.sendRedirect("index.jsp");
			} else {
				//회원가입 실패
				response.sendRedirect("500.html");
			}
		
		// -------------------login --------------------
	    } else if(pagecode.equals("P002")) {
	    	String userid = request.getParameter("userid");
	    	String passwd = request.getParameter("passwd");
	    	
	    	//boolean loginCheck = dao.userLogin(userid, passwd);
	    	//if(loginCheck == true) {
	    	UserVO uvo = dao.userLogin(userid, passwd);
	    	//if(uvo != null) {
	    	if(uvo.getLoginCheck()) {
				//로그인 성공
	    		
				//session.add("MYKEY_GRADE", grade);
				System.out.println("--------- 세션 할당 ------------" + uvo.getGrade());
				
				response.sendRedirect("index.jsp");
			} else {
				//로그인 실패
				response.sendRedirect("500.html");
			}
	    
	    // -------------------other --------------------
		} else {
			response.sendRedirect("500.html");
		}
		
		
		
	}

}
