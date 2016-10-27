package com.gsdp.entity.group;

import java.util.List;

public class Situation {

	//该条动态的Id
	private int situationId;
	
	//动态的内容
	private String situationTitle;

	//动态详情
	private String situationContent;
	
	//发布该条动态的人
	private int publisher;
	
	//该条动态的发布时间
	private String publishTime;
	
	//该条动态发到那个团体中
	private int groupId;
	
	//一个动态的所有回复
	private List<Reply> replies;
	
	public Situation() {};
	
	public Situation(String situationTitle, String situationContent,
			int publisher, String publishTime, int groupId) {
		this.situationTitle = situationTitle;
		this.situationContent = situationContent;
		this.publisher = publisher;
		this.publishTime = publishTime;
		this.groupId = groupId;
	}

	public int getSituationId() {
		return situationId;
	}

	public void setSituationId(int situationId) {
		this.situationId = situationId;
	}

	public String getSituationTitle() {
		return situationTitle;
	}

	public void setSituationTitle(String situationTitle) {
		this.situationTitle = situationTitle;
	}

	public String getSituationContent() {
		return situationContent;
	}

	public void setSituationContent(String situationContent) {
		this.situationContent = situationContent;
	}

	public int getPublisher() {
		return publisher;
	}

	public void setPublisher(int publisher) {
		this.publisher = publisher;
	}

	public String getPublishTime() {
		return publishTime;
	}

	public void setPublishTime(String publishTime) {
		this.publishTime = publishTime;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	
	
	public List<Reply> getNotices() {
		return replies;
	}

	public void setNotices(List<Reply> replies) {
		this.replies = replies;
	}
	
	//------------------------

	@Override
	public String toString() {
		return "Situation [situationId=" + situationId + ", situationTitle="
				+ situationTitle + ", situationContent=" + situationContent
				+ ", publisher=" + publisher + ", publishTime=" + publishTime
				+ ", groupId=" + groupId + ", replies=" + replies + "]";
	}

}
