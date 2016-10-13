package com.gsdp.control.servlet.AllServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AllServlet
 */
@WebServlet("/AS")
public class AllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AllServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter pw = response.getWriter();
		
		String typeId = request.getParameter("TypeId");
		String groupId = request.getParameter("GroupId");
		
		if(typeId != null && !("".equals(typeId))){
			//将操作写入session中
			request.getSession().setAttribute("TypeId", Integer.parseInt(typeId));			
			System.out.println("session:TypeId="+typeId);
		}else if(groupId != null && !("".equals(groupId))){
			//将操作写入session中
			request.getSession().setAttribute("GroupId", Integer.parseInt(groupId));
			System.out.println("session:GroupId="+groupId);
			pw.print("http://localhost:8080/GSDP/index/GroupMsg.html");
		}else{
			pw.print("wrong params");
			pw.close();
		}
	}

}
