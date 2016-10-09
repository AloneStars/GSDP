package com.gsdp.model.entity.user;

import java.util.List;

public class User {
	
	private int user_id; //用户id
	private String headPicture; //用户头像
	private String loginEmail;  //登录邮箱，本项目使用邮箱登录验证
	private String password;  //登录密码
	private String username;  //昵称
	private List groups;  //参加的组织，可能为多个所以用List存储
	private String user_dec;  //个性签名，或者说是个人介绍
	private int sex;   //性别
	private int age;   //年龄
	private String QQ;  //以下为可选的联系方式
	private String WeChat;
	private String Phone;
	private int LStatue;  //登录状态״̬
	

	public int getUser_id() {
		return user_id;
	}
	
	public void setUser_id(int user_id) {
		this.user_id = user_id;
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
	
	public List getGroups() {
		return groups;
	}
	
	public void setGroups(List groups) {
		this.groups = groups;
	}
	
	public String getUser_dec() {
		return user_dec;
	}
	
	public void setUser_dec(String user_dec) {
		this.user_dec = user_dec;
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
	
	public String getQQ() {
		return QQ;
	}
	
	public void setQQ(String qQ) {
		QQ = qQ;
	}
	
	public String getWeChat() {
		return WeChat;
	}
	
	public void setWeChat(String weChat) {
		WeChat = weChat;
	}
	
	public String getPhone() {
		return Phone;
	}
	
	public void setPhone(String phone) {
		Phone = phone;
	}
	
	public int getLStatue() {
		return LStatue;
	}
	
	public void setLStatue(int lStatue) {
		LStatue = lStatue;
	}
	
	
	
	

}
