package com.gsdp.entity.group;

import com.gsdp.entity.user.User;

public class Reply {
	
	//该条回复(评论)的id
	private int replyId;
	
	//该条回复(评论)的内容
	private String replyContent;
	
	//发出该条回复(评论)的人
	private int replyer;
	
	//回复（评论）时间
	private String replyTime;
	
	//针对那条动态的回复或者评论
	private int situationId;
	
	//发这条评论的人
	private User user;

	//-------------------------
	
	public int getReplyId() {
		return replyId;
	}

	public void setReplyId(int replyId) {
		this.replyId = replyId;
	}

	public String getReplyContent() {
		return replyContent;
	}

	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}

	public int getReplyer() {
		return replyer;
	}

	public void setReplyer(int replyer) {
		this.replyer = replyer;
	}

	public String getReplyTime() {
		return replyTime;
	}

	public void setReplyTime(String replyTime) {
		this.replyTime = replyTime;
	}

	public int getSituationId() {
		return situationId;
	}

	public void setSituationId(int situationId) {
		this.situationId = situationId;
	}
		
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
	
	@Override
	public String toString() {
		return "Reply [replyId=" + replyId + ", replyContent=" + replyContent
				+ ", replyer=" + replyer + ", replyTime=" + replyTime
				+ ", situationId=" + situationId + ", user=" + user + "]";
	}


}
