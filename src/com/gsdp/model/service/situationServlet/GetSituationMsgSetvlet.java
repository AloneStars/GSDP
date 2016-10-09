package com.gsdp.model.service.situationServlet;

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

import com.gsdp.model.entity.group.Situation;
import com.gsdp.model.service.activityService.GetActivityMsgByIdService;
import com.gsdp.model.service.situationService.GetSituationMsgService;

/**
 * Servlet implementation class GetSituationMsgSetvlet
 */
@WebServlet("/GSMS")
public class GetSituationMsgSetvlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetSituationMsgSetvlet() {
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
		PrintWriter pw =  response.getWriter();
		String groupId = request.getParameter("GroupId");
		
		List<Situation> SL =  new ArrayList<Situation>();
		
		GetSituationMsgService GSMS = new GetSituationMsgService();
		
		JSONArray jso = new JSONArray();
		
		SL = GSMS.getSituationMsgSercice(Integer.parseInt(groupId));
		
		for (Situation situation : SL) {
			
			JSONObject js =JSONObject.fromObject(situation);
			
			jso.add(js);
			
		}
		
		pw.print(jso.toString());
				
	}

}
