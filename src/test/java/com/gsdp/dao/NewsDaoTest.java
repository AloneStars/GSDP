package com.gsdp.dao;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gsdp.entity.user.News;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class NewsDaoTest {

	@Resource(name = "newsDao")
	private NewsDao newsDao;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Test
	public void testAddNews() {
		String newsTitle = "吃饭了吗?";
		String newsContent = "我反正吃了。";
		int fromAddress = 1;
		int toAddress = 2;
		String sendTime = "2016-10-27";
		int statue = 0;
		News news = new News(newsTitle, newsContent, fromAddress, toAddress, sendTime, statue);
		int affectRows = newsDao.addNews(news);
		logger.info("影响的行数:" + affectRows + "自增的id:" + news.getNewsId());
	}
	
	@Test
	public void testDeleteNews() {
		int newsId = 2;
		int affectRows = newsDao.deleteNews(newsId);
		logger.info("影响的行数:" + affectRows);
	}
	
	@Test
	public void testChangeNewsStatue() {
		int statue = 1;
		int newsId = 2;
		int affectRows = newsDao.changeNewsStatue(statue, newsId);
		logger.info("影响的行数:" + affectRows);
	}
}
