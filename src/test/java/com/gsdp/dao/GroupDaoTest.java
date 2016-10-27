package com.gsdp.dao;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gsdp.entity.group.Group;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class GroupDaoTest {

	@Resource(name = "groupDao")
	private GroupDao groupDao;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Test
	public void testAddAdmin() {
		int userId = 1;
		int groupId = 3;
		int affectRows = groupDao.addAdmin(userId, groupId);
		logger.info("影响的行数" + affectRows);
	}
	
	@Test
	public void testDeleteAdmin() {
		int userId = 1;
		int groupId = 3;
		int affectRows = groupDao.deleteAdmin(userId, groupId);
		logger.info("影响的行数" + affectRows);
	}
	
	@Test
	public void testChangeOwner() {
		int userId = 2;
		int groupId = 3;
		int affectRows = groupDao.changeOwner(userId, groupId);
		logger.info("影响的行数:" + affectRows);
	}
	
	@Test
	public void testAddMember() {
		int userId = 2;
		int groupId = 4;
		int affectRows = groupDao.addMember(userId, groupId);
		logger.info("影响的行数:" + affectRows);
	}
	
	@Test
	public void testDeleteMember() {
		int userId = 2;
		int groupId = 4;
		int affectRows = groupDao.deleteMember(userId, groupId);
		logger.info("影响的行数:" + affectRows);
	}
	
	@Test
	public void testAddGroup() {
		String groupIcon = "image/GroupIcon/ACG.jpg";
		String groupName = "高冷社团";
		String groupDec = "我们很高冷";
		String groupContact = "13811111111";
		String groupAddress = "16A-310";
		int groupType = 4;
		int owner = 2;
		Group group = new Group(groupIcon, groupName, groupDec, groupContact, groupAddress, groupType, owner);
		int affectRows = groupDao.addGroup(group);
		logger.info("影响的行数:" + affectRows + "返回的自增id为:" + group.getGroupId());
	}
	
	@Test
	public void testUpdateGroup() {
		int groupId = 6;
		String groupIcon = "image/GroupIcon/ACG.jpg";
		String groupName = "高冷社团";
		String groupDec = "我们很高冷，并且我们也很帅";
		String groupContact = "13811111111";
		String groupAddress = "16A-310";
		int groupType = 4;
		int owner = 2;
		Group group = new Group(groupId, groupIcon, groupName, groupDec, groupContact, groupAddress, groupType, owner);
		int affectRows = groupDao.updateGroup(group);
		logger.info("影响的行数:" + affectRows);
	}
	
	@Test
	public void testGetGroupMessage() {
		int groupId = 6;
		Group group = groupDao.getGroupMessage(groupId);
		logger.info("group = {}", group);
	}
	
	@Test
	public void testGetGroupMessageByType() {
		int groupType = 4;
		List<Group> list = groupDao.getGroupMessageByType(groupType);
		logger.info("list = {}", list);
	}
	
	@Test
	public void testGetAllGroupMessage() {
		List<Group> list = groupDao.getAllGroupMessage();
		logger.info("list = {}", list);
	}

}
