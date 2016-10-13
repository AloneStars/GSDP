package com.gsdp.control.service.situationService;

import java.util.ArrayList;
import java.util.List;

import com.gsdp.model.dao.situationDao.SituationDao;
import com.gsdp.model.entity.group.Situation;

public class GetSituationMsgService {
	
	public List<Situation> getSituationMsgSercice(int groupId){
		
		List<Situation> SituationList = new ArrayList<Situation>();
		
		SituationDao SD =  new SituationDao();
		
		SituationList = SD.getSituationMsg(groupId);
		
		return SituationList;
		
	}

}
