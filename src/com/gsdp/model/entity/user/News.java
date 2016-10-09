package com.gsdp.model.entity.user;

import java.util.Date;

public class News {
	
	private int news_id;
	private String news_title;
	private String news_content;
	private int fromAddress;
	private int toAddress;
	private long sendTime;
	private int statue;//标记是否已阅读，已读还是未读
	
	public int getNews_id() {
		return news_id;
	}

	public void setNews_id(int news_id) {
		this.news_id = news_id;
	}

	public String getNews_title() {
		return news_title;
	}

	public void setNews_title(String news_title) {
		this.news_title = news_title;
	}

	public String getNews_content() {
		return news_content;
	}

	public void setNews_content(String news_content) {
		this.news_content = news_content;
	}

	public int getFromAddress() {
		return fromAddress;
	}

	public void setFromAddress(int fromAddress) {
		this.fromAddress = fromAddress;
	}

	public int getToAddress() {
		return toAddress;
	}

	public void setToAddress(int toAddress) {
		this.toAddress = toAddress;
	}

	public long getSendTime() {
		return sendTime;
	}

	public void setSendTime(long sendTime) {
		this.sendTime = sendTime;
	}


	public int getStatue() {
		return statue;
	}


	public void setStatue(int statue) {
		this.statue = statue;
	}
	
	
	
}
