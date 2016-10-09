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

import com.gsdp.control.service.groupService.GetGroupMsgByTypeService;
import com.gsdp.model.entity.group.Group;

/**
 * Servlet implementation class GetGroupMsgByTypeServlet
 */
@WebServlet("/GGMBTS")
public class GetGroupMsgByTypeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetGroupMsgByTypeServlet() {
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
		
		/*int typeId = Integer.parseInt(request.getParameter("TypeId"));*/
		int typeId;
		
		Object O = request.getSession().getAttribute("TypeId");
		//从session中读取操作
		if(O == null){
			typeId = 1;
		}else{
			typeId = (Integer) O;
		}
		
		System.out.println(typeId);
		
		GetGroupMsgByTypeService GGMBIS = new GetGroupMsgByTypeService();
		
		List<Group> groupList = new ArrayList<Group>();
		
		groupList = GGMBIS.getGroupMsgByType(typeId);
		
		JSONArray jsa = new JSONArray();
		
		for (Group group : groupList) {
			
			JSONObject js = JSONObject.fromObject(group);
			
			jsa.add(js);
		}
		
		pw.print(jsa.toString());
		
	}

}
