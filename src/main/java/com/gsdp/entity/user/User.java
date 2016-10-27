package com.gsdp.entity.user;

import java.util.List;

import com.gsdp.entity.group.Group;

public class User {
	
	//用户id
	private int userId; 
	
	//用户头像
	private String headPicture;
	
	//登录邮箱，本项目使用邮箱登录验证
	private String loginEmail;
	
	//登录密码
	private String password;
	
	//昵称
	private String username;
	
	//参加的组织，可能为多个所以用List存储
	private List<Group> groups;  
	
	//个性签名，或者说是个人介绍
	private String userDec;
	
	//性别
	private int sex;   
	
	//年龄
	private int age;   
	
	//以下为可选的联系方式
	private String qq;  
	
	private String weChat;
	
	private String phone;
	
	//登录状态
	private int lstatue;

	//-----------------------------
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getHeadPicture() {
		return headPicture;
	}

	public void setHeadPicture(String headPicture) {
		this.headPicture = headPicture;
	}

	public String getLoginEmail() {
		return loginEmail;
	}

	public void setLoginEmail(String loginEmail) {
		this.loginEmail = loginEmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<Group> getGroups() {
		return groups;
	}

	public void setGroups(List<Group> groups) {
		this.groups = groups;
	}

	public String getUserDec() {
		return userDec;
	}

	public void setUserDec(String userDec) {
		this.userDec = userDec;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getWeChat() {
		return weChat;
	}

	public void setWeChat(String weChat) {
		this.weChat = weChat;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getLstatue() {
		return lstatue;
	}

	public void setLstatue(int lstatue) {
		this.lstatue = lstatue;
	}
	
	
	//-----------------------------
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", headPicture=" + headPicture
				+ ", loginEmail=" + loginEmail + ", password=" + password
				+ ", username=" + username + ", groups=" + groups
				+ ", userDec=" + userDec + ", sex=" + sex + ", age=" + age
				+ ", qq=" + qq + ", weChat=" + weChat + ", phone=" + phone
				+ ", lstatue=" + lstatue + "]";
	} 
	
	
	
}
