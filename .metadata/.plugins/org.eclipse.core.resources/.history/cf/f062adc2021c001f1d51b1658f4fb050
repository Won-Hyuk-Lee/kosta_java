package com.kosta.sample.rest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RestServlet")
public class RestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RestServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		
		String searchGubun = request.getParameter("searchGubun");
		String searchStr   = request.getParameter("searchStr");
		PrintWriter out = response.getWriter();
		out.println(searchGubun + "," + searchStr);
	}

//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);
//	}

}
