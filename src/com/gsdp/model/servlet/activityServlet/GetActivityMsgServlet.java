package com.gsdp.model.servlet.activityServlet;

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
import com.gsdp.model.entity.group.Activity;
import com.gsdp.model.service.activityService.GetActivityMsgService;

/**
 * Servlet implementation class GetActivityMsgServlet
 */
@WebServlet("/GAMS")
public class GetActivityMsgServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetActivityMsgServlet() {
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
		
		GetActivityMsgService GAMS = new GetActivityMsgService();
		
		List<Activity> ActivityList = GAMS.GetActivityMsgService();
		
        JSONArray jsa = new JSONArray();
		
		for (Activity activity : ActivityList) {
			
			JSONObject js = JSONObject.fromObject(activity);
			
			jsa.add(js);
		}
		
		pw.print(jsa.toString());
		pw.close();
	}

}
