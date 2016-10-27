package com.gsdp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsdp.entity.group.Group;

/**
 * 管理员的所有操作
 * @author yizijun
 *
 */
public interface GroupDao {
	
	/**
	 * 给团体添加管理员
	 * @param userId
	 * @param groupId
	 * @return
	 */
	int addAdmin(@Param("userId") int userId, @Param("groupId") int groupId);
	
	/**
	 * 删除团体管理员
	 * @param userId
	 * @param groupId
	 * @return
	 */
	int deleteAdmin(@Param("userId") int userId, @Param("groupId") int groupId);
	
	/**
	 * 转让组织给别人
	 * @param userId
	 * @param groupId
	 * @return
	 */
	int changeOwner(@Param("userId") int userId, @Param("groupId") int groupId);
	
	/**
	 * 添加团体成员
	 * @param userId
	 * @param groupId
	 * @return
	 */
	int addMember(@Param("userId") int userId, @Param("groupId") int groupId);
	
	/**
	 * 删除团体成员
	 * @param userId
	 * @param groupId
	 * @return
	 */
	int deleteMember(@Param("userId") int userId, @Param("groupId") int groupId);
	
	/**
	 * 增加一个团体
	 * @param group
	 * @return
	 */
	int addGroup(Group group);
	
	/**
	 * 更新组织信息
	 * @param group
	 * @return
	 */
	int updateGroup(Group group);
	
	/**
	 * 获取组织信息（根据Id）
	 * @param groupId
	 * @return
	 */
	Group getGroupMessage(int groupId);
	
	/**
	 * 获取组织信息（根据类型）
	 * @param groupType
	 * @return
	 */
	List<Group> getGroupMessageByType(int groupType);
	
	/**
	 * 获取所有的团体信息
	 * @return
	 */
	List<Group> getAllGroupMessage();
}
