package com.kosta.sample.rest;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.kosta.sample.board.BoardVO;


@WebServlet("/RestServlet")
public class RestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RestServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		Gson gson = new Gson();
		String pagecode = request.getParameter("pagecode");
		
		//-------------------- #AjaxBtn 또는 #1__Str_Str_Btn --------------------
		if (pagecode.equals("R001")) {
			String searchGubun = request.getParameter("searchGubun");
			String searchStr   = request.getParameter("searchStr");
			System.out.println(searchGubun + "," + searchStr);
			
			//String responseStr = "이건 서버가 보낸 메세지";
			ArrayList<BoardVO> list = new ArrayList<BoardVO>();
			BoardVO bvo = new BoardVO(); 
			bvo.setTitle("aaa");
			bvo.setRegid("kim");    //[ {"title"="aaa" , "regid"="kim"} ]
			list.add(bvo);
			bvo = new BoardVO(); 
			bvo.setTitle("bbb");
			bvo.setRegid("hong");		
			list.add(bvo);			//[ {"title"="aaa" , "regid"="kim"}, {"title"="bbb" , "regid"="hong"} ]
			
			
			String gsonString = gson.toJson(list);    //"[ {"title":"aaa" , "regid":"kim"}, {"title":"bbb" , "regid":"hong"} ]"
			System.out.println(gsonString + "," + gsonString.getClass());
			
			PrintWriter out = response.getWriter();
			out.print(gsonString);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		
		Gson gson = new Gson();
		String pagecode = request.getParameter("pagecode");
		//-------------------- #2__JsonStr_Str_Btn --------------------
		//data : "MY_JSONKEY=" + JSON.stringify(objData) ,
		if (pagecode.equals("R002")) {
			response.setContentType("text/html;charset=UTF-8");
			String jsonStr = request.getParameter("MY_JSONKEY");
			System.out.println(jsonStr + "," + jsonStr.getClass());
			PrintWriter out = response.getWriter();
			out.print("R002 응답 ok");
		
		//-------------------- #3__Json_Str_Btn --------------------
        //contentType : "application/json; charset=UTF-8",			
		//data 		  : JSON.stringify(objData)
		} else if (pagecode.equals("R003")) {
			response.setContentType("text/html;charset=UTF-8");
			String jsonStr = request.getReader().lines().collect(Collectors.joining());
			System.out.println(jsonStr + "," + jsonStr.getClass());
			
			// obj  : JSON.stringify({"title":"aaaaatitle","regid":"hong"});
			// str  : "{"title":"aaaaatitle","regid":"hong"}"
			// fromjson : {"title":"aaaaatitle","regid":"hong"}
			BoardVO bvo = gson.fromJson(jsonStr, BoardVO.class);
			System.out.println(bvo.getTitle()); 
			
			PrintWriter out = response.getWriter();
			out.print("R003 응답 ok");
			
		//-------------------- #4__Str_Json_Btn --------------------
		} else if (pagecode.equals("R004")) {
			response.setContentType("application/json;charset=UTF-8");
			
			HashMap<String, String> map = new HashMap<String, String>();
			map.put("status", "200");
			map.put("message", "R004 응답 ok");
			String jsonStr = gson.toJson(map);
			//String jsonStr = "{\"status\":\"200\", \"message\":\"R004 응답 ok\"}";
			PrintWriter out = response.getWriter();
			out.print(jsonStr);
		//-------------------- #5__JsonStr_Json_Btn --------------------
		//data : "MY_JSONKEY=" + JSON.stringify(objData) ,	
		} else if (pagecode.equals("R005")) {
			response.setContentType("application/json;charset=UTF-8");
			String jsonStrParam = request.getParameter("MY_JSONKEY");
			System.out.println(jsonStrParam + "," + jsonStrParam.getClass());
				
				
			HashMap<String, String> map = new HashMap<String, String>();
			map.put("status", "200");
			map.put("message", "R005 응답 ok");
			String jsonStr = gson.toJson(map);
			//String jsonStr = "{\"status\":\"200\", \"message\":\"R004 응답 ok\"}";
			PrintWriter out = response.getWriter();
			out.print(jsonStr);
		//-------------------- #6__Json_Json_Btn --------------------
		} else if (pagecode.equals("R006")) {
			response.setContentType("application/json;charset=UTF-8");
			
			HashMap<String, String> map = new HashMap<String, String>();
			map.put("status", "200");
			map.put("message", "R006 응답 ok");
			String jsonStr = gson.toJson(map);
			//String jsonStr = "{\"status\":\"200\", \"message\":\"R004 응답 ok\"}";
			PrintWriter out = response.getWriter();
			out.print(jsonStr);
		}
		
	}

}
