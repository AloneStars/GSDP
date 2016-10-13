package com.gsdp.dao;

import java.util.List;

import com.gsdp.entity.group.Situation;

/**
 * 
 * @author yizijun
 *
 */
public interface SituationDao {
	
	/**
	 * 获取全部的动态消息
	 * @param groupId
	 * @return
	 */
	List<Situation> getSituationMessage(int groupId);
	
	/**
	 * 获取单个的动态消息
	 * @param situationId
	 * @return
	 */
	Situation getSingleSituationMessage(int situationId);
	
	/**
	 * 添加动态消息
	 * @param situation
	 * @return
	 */
	int addSitutationMessage(Situation situation);
	
	/**
	 * 删除动态消息
	 * @param situationId
	 * @return
	 */
	int deleteSituationMessage(int situationId);

}
