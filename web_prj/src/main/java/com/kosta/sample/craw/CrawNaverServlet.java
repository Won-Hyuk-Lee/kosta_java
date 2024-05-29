package com.kosta.sample.craw;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CrawNaverServlet
 */
@WebServlet("/CrawNaverServlet")
public class CrawNaverServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public CrawNaverServlet() {
        super();
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		CrawTest ct = new CrawTest();
		ArrayList<NewsVO> list = ct.getNaverNews();
		System.out.println(list.size());
		
		PrintWriter out = response.getWriter();
		for(NewsVO nvo : list) {
			out.println(nvo.getTitle() + "<br>");
		}
	}

//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}

}
