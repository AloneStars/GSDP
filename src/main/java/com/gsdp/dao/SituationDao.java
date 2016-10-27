package com.gsdp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsdp.entity.group.Situation;

/**
 * 这是团队管理员发表的动态的数据库映射操作，我是根据实际的前端交互模型来写的Dao层，
 * 如果还有一些操作没有写出来。待用到了再说，因为现在需求不明确
 * @author yizijun
 * 
 */
public interface SituationDao {

	/**
	 * 获取全部的动态消息
	 * 
	 * @param groupId
	 * @return
	 */
	List<Situation> getSituationMessage(int groupId);

	/**
	 * 获得单个动态的消息（包含这个动态所包含的全部回复，并且每条回复都包含了这条回复的用户）
	 * 
	 * @param situationId
	 *            动态id
	 * @param offset
	 *            查询回复的偏移量
	 * @param limit
	 *            限制查询回复的条数
	 * @return
	 */
	Situation getSingleSituationMessage(@Param("situationId") int situationId,
			@Param("offset") int offset, @Param("limit") int limit);

	/**
	 * 添加动态消息
	 * 
	 * @param situation
	 * @return
	 */
	int addSitutationMessage(Situation situation);

	/**
	 * 删除动态消息
	 * 
	 * @param situationId
	 * @return
	 */
	int deleteSituationMessage(int situationId);

}
