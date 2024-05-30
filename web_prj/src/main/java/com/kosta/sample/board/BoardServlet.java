package com.kosta.sample.board;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * 글자 전송에 사용
     - response.sendRedirect("xx.jsp")  : 
     - response.sendRedirect("xx.jsp?UID=kim&UPW=111");

 * 객체 전송에 사용
     - page scope : 가져온 값을 어느 범위까지 공유해서 사용할것인가?
     - page < request < session < appication
     - request.setAttribute("KEY_BOARDLIST", list);
*/


@WebServlet("/BoardServlet")
public class BoardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public BoardServlet() { }
   
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		
		String pagecode = request.getParameter("pagecode");
		BoardDAO dao = new BoardDAO();
		
		//게시물 목록보기
		if(pagecode.equals("B001")) {
			ArrayList<BoardVO> list = dao.boardSelect();
			request.setAttribute("KEY_BOARDLIST", list);
			//RequestDispatcher rd = request.getRequestDispatcher("tables.jsp");
			//rd.forward(request, response);
			request.getRequestDispatcher("tables.jsp").forward(request, response);
			
		//게시물 상세보기	
		} else if(pagecode.equals("B002")) {
			int seq = Integer.parseInt(request.getParameter("seq"));  //*****
			
//			BoardVO bvo = dao.boardSelectOne(seq);
//			request.setAttribute("KEY_BOARDVO", bvo);
//			ArrayList<ReplyVO> rlist = dao.replySelect(seq);
//			request.setAttribute("KEY_REPLYLIST", rlist);
			
			
			BoardVO bvo = dao.boardReplySelect(seq);
			request.setAttribute("KEY_BOARDVO", bvo);
			
			RequestDispatcher rd = request.getRequestDispatcher("tables_detail.jsp");
			rd.forward(request, response);
			
		//댓글삭제	
		} else if(pagecode.equals("B005")) {
			int seq  = Integer.parseInt(request.getParameter("seq"));   //게시글 글번호
			int rseq = Integer.parseInt(request.getParameter("rseq"));  //댓글 글번호
			int deleteRows = dao.replyDelete(rseq);
			
			//상세보기파라미터 : pagecode:B002  seq
			response.sendRedirect(request.getContextPath() + "/BoardServlet?pagecode=B002&seq="+seq);
			
			
		} else {
			response.sendRedirect("500.html?msg=200ok");
		}
    	System.out.println("====request method : GET====");
		
	}
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		
		String pagecode = request.getParameter("pagecode");
		BoardDAO dao = new BoardDAO();
		
		//게시물 수정
		if(pagecode.equals("B003")) {
			System.out.println("수정---");
//			System.out.println(request.getParameter("seq"));
//			System.out.println(request.getParameter("regid"));
//			System.out.println(request.getParameter("regdate"));
//			System.out.println(request.getParameter("title"));
//			System.out.println(request.getParameter("contents"));
			BoardVO bvo = new BoardVO();
			bvo.setSeq(Integer.parseInt(request.getParameter("seq")));
			bvo.setTitle(request.getParameter("title"));
			bvo.setContents(request.getParameter("contents"));
			int updateRows = dao.boardUpdate(bvo);
			if (updateRows >= 1) {
				String url= request.getContextPath()+"/BoardServlet?seq="+request.getParameter("seq")+"&pagecode=B002";
				response.sendRedirect(url);
			} else {
				response.sendRedirect("500.html");
			}
		//게시물 삭제	
		} else if(pagecode.equals("B004")) {
			System.out.println("삭제---");
			System.out.println(request.getParameter("seq"));
			int seq = Integer.parseInt(request.getParameter("seq"));
			int deleteRows = dao.boardDelete(seq);
			if (deleteRows >= 1) {
				response.sendRedirect(request.getContextPath() + "/BoardServlet?pagecode=B001");
			} else {
				response.sendRedirect("500.html");
			}
		//댓글 등록
		} else if(pagecode.equals("B006")) {
			System.out.println("댓글등록--");
			
			int seq = Integer.parseInt(request.getParameter("seq"));
			String reply = request.getParameter("reply");
			ReplyVO rvo = new ReplyVO();
			rvo.setSeq(seq);
			rvo.setReply(reply);
			int insertRows = dao.replyInsert(rvo);
			if (insertRows >= 1) {
				response.sendRedirect(request.getContextPath() + "/BoardServlet?pagecode=B002&seq="+seq);
			} else {
				response.sendRedirect("500.html");
			}
		}
		System.out.println("====request method : POST====");
	}

}






