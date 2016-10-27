package com.gsdp.dao;

import java.util.List;
import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gsdp.entity.group.Activity;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class ActivityDaoTest {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Resource(name = "activityDao")
	private ActivityDao activityDao;

	@Test
	public void testGetAllActivityMessage() {
		List<Activity> list = activityDao.getAllActivityMessage();
		logger.info("list={}", list);
	}

	@Test
	public void testGetActivityMessage() {
		int sponsor = 3;
		List<Activity> list = activityDao.getActivityMessage(sponsor);
		logger.info("list={}", list);
	}
	
	@Test
	public void testAddActivityMessage() {
		String activityTitle = "ACM比赛";
		String activityContent = "关于一场东软的ACM比赛";
		String beginTime = "2016-10-13";
		String endTime = "2016-10-14";
		int activitier = 1;
		int sponsor = 3;
		int activityNumber = 999;
		String activityAddress = "A7-319";
		String publishTime = "2016-10-12";
		int permission = 0;
		Activity activity = new Activity(activityTitle, activityContent, beginTime, endTime, activitier, sponsor, activityNumber, activityAddress, publishTime, permission);
		int insertCount = activityDao.addActivityMessage(activity);
		logger.info("影响的行数" + insertCount + ";返回的自增id:" + activity.getActivityId());
	}
	
	
	@Test
	public void testDeleteActivityMessage() {
		int activityId = 6;
		int affectRows = activityDao.deleteActivityMessage(activityId);
		logger.info("被影响行数:" + affectRows);
	}
	
	@Test
	public void testUpdateActivityMessage() {
		int activityId = 8;
		String activityTitle = "ACM比赛";
		String activityContent = "关于一场东软的ACM比赛(fighting)";
		String beginTime = "2016-10-27";
		String endTime = "2016-10-28";
		int activitier = 1;
		int sponsor = 4;
		int activityNumber = 999;
		String activityAddress = "A7-319";
		String publishTime = "2016-10-26";
		int permission = 1;
		Activity activity = new Activity(activityId,activityTitle, activityContent, beginTime, endTime, activitier, sponsor, activityNumber, activityAddress, publishTime, permission);
		int affectRows = activityDao.updateActivityMessage(activity);
		logger.info("被影响行数:" + affectRows);
	}
	
	@Test
	public void testQueryAvitvityMessage() {
		int activityId = 2;
		Activity activity = activityDao.queryAvitvityMessage(activityId);
		logger.info("activity={}",activity);
	}
}
