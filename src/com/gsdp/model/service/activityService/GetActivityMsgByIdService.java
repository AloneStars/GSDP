package com.gsdp.model.service.activityService;

import java.util.ArrayList;
import java.util.List;

import com.gsdp.model.dao.activityDao.ActivityDao;
import com.gsdp.model.entity.group.Activity;

public class GetActivityMsgByIdService {
	
	public List<Activity> getActivityMsg(int groupId){
		
		List<Activity> ActivityList = new ArrayList<Activity>();
		
		ActivityDao AD = new ActivityDao();
		
		ActivityList = AD.getActivityMsg(groupId);
		
/*		for (Activity activity : ActivityList) {
			System.out.println("service:"+activity.toString());
		}*/
		
		return ActivityList;
	}
	
	public static void main(String[] args) {
		GetActivityMsgByIdService GAMS = new GetActivityMsgByIdService();
		GAMS.getActivityMsg(3);
	}

}
