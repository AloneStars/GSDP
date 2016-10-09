package com.gsdp.control.service.groupService;

import com.gsdp.model.dao.groupDao.AdminDao;
import com.gsdp.model.entity.group.Group;

public class GetGroupMsgByIdService {
	
	public Group getGroupMsgServiceById(int groupId){
		
		AdminDao AD =  new AdminDao();
		
		Group group = AD.getGroupMsg(groupId);
		
		return group;
		
	}
	

}
