package com.gsdp.dao;

import java.util.List;

import com.gsdp.entity.group.Notice;

/**
 * 
 * @author yizijun
 *
 */
public interface NoticeDao {
	
	/**
	 * 添加通知消息
	 * @param notice
	 * @return
	 */
	int addNoticeMessage(Notice notice);
	
	/**
	 * 获取个人全部的通知消息
	 * @param groupId
	 * @return
	 */
	List<Notice> getNoticeMessage(int groupId);
	
	/**
	 * 获取单个的通知消息
	 * @param noticeId
	 * @return
	 */
	Notice getSingleNoticeMessage(int noticeId);
	
	/**
	 * 删除通知消息
	 * @param noticeId
	 * @return
	 */
	int deleteNoticeMessage(int noticeId);

}
