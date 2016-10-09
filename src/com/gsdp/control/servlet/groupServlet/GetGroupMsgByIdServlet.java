package com.gsdp.control.servlet.groupServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import com.gsdp.control.service.groupService.GetGroupMsgByIdService;
import com.gsdp.model.entity.group.Group;

/**
 * Servlet implementation class GetGroupMsgServlet
 */
@WebServlet("/GGMBIS")
public class GetGroupMsgByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public GetGroupMsgByIdServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		
		/*int groupId = Integer.parseInt(request.getParameter("GroupId"));*/
		
		//从session中读取操作
		int groupId  = (int) request.getSession().getAttribute("GroupId");
		
		GetGroupMsgByIdService GGMS =  new GetGroupMsgByIdService();
		Group group = GGMS.getGroupMsgServiceById(groupId);
		
		JSONObject jso = JSONObject.fromObject(group);		
		pw.print(jso.toString());
	}

}
