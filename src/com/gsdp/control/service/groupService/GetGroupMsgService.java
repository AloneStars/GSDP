package com.gsdp.control.service.groupService;

import java.util.ArrayList;
import java.util.List;

import com.gsdp.model.dao.groupDao.AdminDao;
import com.gsdp.model.entity.group.Group;

public class GetGroupMsgService {
    
	public List<Group> getGroupMsg(){
		
		List<Group> groupList = new ArrayList<Group>();
		
		AdminDao AD = new AdminDao();
		
		groupList = AD.getAllGroupMsg();
		
		return groupList;
		
	}
}
