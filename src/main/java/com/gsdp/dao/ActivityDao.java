package com.gsdp.dao;

import java.util.List;

import com.gsdp.entity.group.Activity;

/**
 * 活动的Dao层接口
 * @author yizijun
 *
 */
public interface ActivityDao {
	
	/**
	 * 获取所有的活动信息
	 * @return
	 */
	List<Activity> getAllActivityMessage();
	
	/**
	 * 查询指定社团所举办的所有活动
	 * @param sponsor 社团对应的id
	 * @return
	 */
	List<Activity> getActivityMessage(int sponsor);
	
	/**
	 * 添加一个活动，并把自增的id写回到该实体对应的activityId
	 * @param activity
	 * @return 数据库影响的行数
	 */
	int addActivityMessage(Activity activity);
	
	/**
	 * 删除一个活动
	 * @param activityId
	 * @return 数据库影响的行数
	 */
	int deleteActivityMessage(int activityId);
	
	/**
	 * 更新一个activity
	 * @param activity
	 * @return
	 */
	int updateActivityMessage(Activity activity);
	
	/**
	 * 查询activity中的信息，根据传入的id来获取相应的activity信息。
	 * @param activityId
	 * @return
	 */
	Activity queryAvitvityMessage(int activityId);

}
