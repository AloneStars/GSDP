package com.gsdp.model.entity.group;

public class Situation {

	
	private int situation_id;  //该条动态的Id
	private String situation_title; //动态的内容
	private String situation_content;  //动态详情
	private int publisher;   //发布该条动态的人
	private long publishTime;  //该条动态的发布时间
	private int group_id;    //该条动态发到那个团体中

	public int getSituation_id() {
		return situation_id;
	}

	public void setSituation_id(int situation_id) {
		this.situation_id = situation_id;
	}

	public String getSituation_title() {
		return situation_title;
	}

	public void setSituation_title(String situation_title) {
		this.situation_title = situation_title;
	}

	public String getSituation_content() {
		return situation_content;
	}

	public void setSituation_content(String situation_content) {
		this.situation_content = situation_content;
	}

	public int getPublisher() {
		return publisher;
	}

	public void setPublisher(int publisher) {
		this.publisher = publisher;
	}

	public long getPublishTime() {
		return publishTime;
	}

	public void setPublishTime(long l) {
		this.publishTime = l;
	}

	public int getGroup_id() {
		return group_id;
	}

	public void setGroup_id(int group_id) {
		this.group_id = group_id;
	}

	@Override
	public String toString() {
		return "Situation [situation_id=" + situation_id + ", situation_title="
				+ situation_title + ", situation_content=" + situation_content
				+ ", publisher=" + publisher + ", publishTime=" + publishTime
				+ ", group_id=" + group_id + "]";
	}
	
	
}
