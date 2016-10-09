package com.gsdp.control.service.groupService;

import java.util.ArrayList;
import java.util.List;

import com.gsdp.model.dao.groupDao.AdminDao;
import com.gsdp.model.entity.group.Group;

public class GetGroupMsgByTypeService {
	
	public List<Group> getGroupMsgByType(int typeId){
		
		List<Group> groupList = new ArrayList<Group>();
	
	    AdminDao AD = new AdminDao();
	    
	    groupList = AD.getTypeGroupMsg(typeId);
	    
	    return groupList;
		
	}
}
