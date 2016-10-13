package com.gsdp.control.servlet.activityServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.gsdp.control.service.activityService.GetActivityMsgByIdService;
import com.gsdp.model.entity.group.Activity;

/**
 * Servlet implementation class ActivityServlet
 */
@WebServlet("/GAMBIS")
public class GetActivityMsgByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetActivityMsgByIdServlet() {
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
		String groupId = request.getParameter("GroupId");
		
		GetActivityMsgByIdService GAMS = new GetActivityMsgByIdService();
		
		List<Activity> ActivityList = GAMS.getActivityMsg(Integer.parseInt(groupId));
		
		JSONArray jsa = new JSONArray();
		
		for (Activity activity : ActivityList) {
			
			JSONObject jso = JSONObject.fromObject(activity);
			
			jsa.add(jso);
			
		}
		
		pw.print(jsa.toString());	
		
		pw.close();
	}

}
