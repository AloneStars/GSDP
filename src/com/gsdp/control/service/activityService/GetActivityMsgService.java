package com.gsdp.control.service.activityService;

import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.gsdp.model.dao.activityDao.ActivityDao;
import com.gsdp.model.entity.group.Activity;

public class GetActivityMsgService {

	public List<Activity> GetActivityMsgService() {
		// TODO Auto-generated constructor stub
		
		ActivityDao ad = new ActivityDao();
				
		List<Activity> ActivityList = new ArrayList<Activity>();
		
		ActivityList = ad.getAllActivityMsg();
		
		return ActivityList;
	}

}
