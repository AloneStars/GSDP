package com.gsdp.model.entity.group;

import java.util.Date;

public class Reply {
	
	private int reply_id;  //该条回复(评论)的id
	private String reply_content;  //该条回复(评论)的内容
	private int replyer;   //发出该条回复(评论)的人
	private Date replyTime;  //回复（评论）时间
	private int situation_id;  //针对那条动态的回复或者评论

	public int getReply_id() {
		return reply_id;
	}

	public void setReply_id(int reply_id) {
		this.reply_id = reply_id;
	}

	public String getReply_content() {
		return reply_content;
	}

	public void setReply_content(String reply_content) {
		this.reply_content = reply_content;
	}

	public int getReplyer() {
		return replyer;
	}

	public void setReplyer(int replyer) {
		this.replyer = replyer;
	}

	public Date getReplyTime() {
		return replyTime;
	}

	public void setReplyTime(Date replyTime) {
		this.replyTime = replyTime;
	}

	public int getSituation_id() {
		return situation_id;
	}

	public void setSituation_id(int situation_id) {
		this.situation_id = situation_id;
	}
	
	
	

}
