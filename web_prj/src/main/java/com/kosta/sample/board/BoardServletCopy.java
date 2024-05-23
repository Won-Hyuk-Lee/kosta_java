package com.kosta.sample.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BoardServlet
 */
@WebServlet("/board_servlet_url")
public class BoardServletCopy extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BoardServletCopy() {
        //super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		String vUserid = request.getParameter("userid");
		response.getWriter().append("GET" + " " + vUserid);
		
		System.out.println("====request method : GET====");
		//response.sendRedirect("IndexPractice.html");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		String vUserpwd = request.getParameter("userpwd");
		String vUserid = request.getParameter("userid");
		String vUsergender = request.getParameter("gender");
		String vUsercontents = request.getParameter("contents");
		System.out.println("====request method : POST====");
		
		response.getWriter().append("POST" + vUserid);
		//System.out.println(vUserpwd + vUserid + vUsergender + vUsercontents);
	}

}