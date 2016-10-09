package com.gsdp.model.entity.group;

import java.util.Date;

public class Activity {
	
	private int activity_id;  //活动Id
	private String activity_title;  //活动标题
	private String activity_content;  //活动详情
	private long beginTime;   //活动开始时间
	private long endTime;     //活动结束时间
	private int  activitier;    //活动发布者
	private int  sponsor;     //主办方
	private int activity_number;   //活动人数
	private String activity_address;   //活动地点
	private long publishTime; //活动发布时间
	private int permission;  //开放权限

	public int getActivity_id() {
		return activity_id;
	}

	public void setActivity_id(int activity_id) {
		this.activity_id = activity_id;
	}

	public String getActivity_title() {
		return activity_title;
	}

	public void setActivity_title(String activity_title) {
		this.activity_title = activity_title;
	}

	public String getActivity_content() {
		return activity_content;
	}

	public void setActivity_content(String activity_content) {
		this.activity_content = activity_content;
	}

	public long getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(long beginTime) {
		this.beginTime = beginTime;
	}

	public long getEndTime() {
		return endTime;
	}

	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}
    
	public int getActivitier() {
		return activitier;
	}

	public void setActivitier(int activitier) {
		this.activitier = activitier;
	}
	
	public int getSponsor() {
		return sponsor;
	}

	public void setSponsor(int sponsor) {
		this.sponsor = sponsor;
	}

	public int getActivity_number() {
		return activity_number;
	}

	public void setActivity_number(int activity_number) {
		this.activity_number = activity_number;
	}

	public String getActivity_address() {
		return activity_address;
	}

	public void setActivity_address(String activity_address) {
		this.activity_address = activity_address;
	}
	
	public int getPermission() {
		return permission;
	}

	public void setPermission(int permission) {
		this.permission = permission;
	}

	public long getPublishTime() {
		return publishTime;
	}

	public void setPublishTime(long publishTime) {
		this.publishTime = publishTime;
	}

	@Override
	public String toString() {
		return "Activity [activity_id=" + activity_id + ", activity_title="
				+ activity_title + ", activity_content=" + activity_content
				+ ", beginTime=" + beginTime + ", endTime=" + endTime
				+ ", activitier=" + activitier + ", sponsor=" + sponsor
				+ ", activity_number=" + activity_number
				+ ", activity_address=" + activity_address + ", publishTime="
				+ publishTime + ", permission=" + permission + "]";
	}

}
