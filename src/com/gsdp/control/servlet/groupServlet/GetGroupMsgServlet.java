package com.gsdp.control.servlet.groupServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.gsdp.control.service.groupService.GetGroupMsgService;
import com.gsdp.model.entity.group.Group;

/**
 * Servlet implementation class GetGroupMsgServlet
 */
@WebServlet("/GGMS")
public class GetGroupMsgServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetGroupMsgServlet() {
        super();
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
		GetGroupMsgService GGMS = new GetGroupMsgService();
		
		List<Group> groupList = new ArrayList<Group>();
		
		groupList = GGMS.getGroupMsg();
		
        JSONArray jsa = new JSONArray();
		
		for (Group group : groupList) {
			
			JSONObject js = JSONObject.fromObject(group);
			
			jsa.add(js);
		}
		
		pw.print(jsa.toString());
		
		pw.close();
	}

}
