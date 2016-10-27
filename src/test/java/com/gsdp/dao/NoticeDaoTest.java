package com.gsdp.dao;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gsdp.entity.group.Notice;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class NoticeDaoTest {
	
	@Resource(name = "noticeDao")
	private NoticeDao noticeDao;

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Test
	public void testAddNoticeMessage() {
		String noticeContent = "今天我们开会";
		String noticeTime = "2016-12-23 11:00";
		int noticer = 1;
		int groupId = 3;
		Notice notice = new Notice(noticeContent, noticeTime, noticer, groupId);
		int affectRows = noticeDao.addNoticeMessage(notice);
		logger.info("影响的行数:" + affectRows + "返回的自增id:" + notice.getNoticeId());
	}
	
	@Test
	public void testGetNoticeMessage() {
		int groupId = 3;
		List<Notice> list = noticeDao.getNoticeMessage(groupId);
		logger.info("list = {}" + list);
	}
	
	@Test
	public void testGetSingleNoticeMessage() {
		int noticeId = 3;
		Notice notice = noticeDao.getSingleNoticeMessage(noticeId);
		logger.info("notice = {}", notice);
	}
	
	@Test
	public void testDeleteNoticeMessage() {
		int noticeId = 3;
		int affectRows = noticeDao.deleteNoticeMessage(noticeId);
		logger.info("影响的行数:" + affectRows);
	}
}
