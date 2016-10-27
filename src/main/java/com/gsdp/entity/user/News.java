package com.gsdp.entity.user;

public class News {
	
	private int newsId;
	
	private String newsTitle;
	
	private String newsContent;
	
	private int fromAddress;
	
	private int toAddress;
	
	private String sendTime;
	
	//标记是否已阅读，已读还是未读
	private int statue;
	
	public News() {};
	
	public News(String newsTitle, String newsContent, int fromAddress,
			int toAddress, String sendTime, int statue) {
		this.newsTitle = newsTitle;
		this.newsContent = newsContent;
		this.fromAddress = fromAddress;
		this.toAddress = toAddress;
		this.sendTime = sendTime;
		this.statue = statue;
	}

	//--------------------------

	public int getNewsId() {
		return newsId;
	}

	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}

	public String getNewsTitle() {
		return newsTitle;
	}

	public void setNewsTitle(String newsTitle) {
		this.newsTitle = newsTitle;
	}

	public String getNewsContent() {
		return newsContent;
	}

	public void setNewsContent(String newsContent) {
		this.newsContent = newsContent;
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

	public String getSendTime() {
		return sendTime;
	}

	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}

	public int getStatue() {
		return statue;
	}

	public void setStatue(int statue) {
		this.statue = statue;
	}

	//--------------------------
	
	@Override
	public String toString() {
		return "News [newsId=" + newsId + ", newsTitle=" + newsTitle
				+ ", newsContent=" + newsContent + ", fromAddress="
				+ fromAddress + ", toAddress=" + toAddress + ", sendTime="
				+ sendTime + ", statue=" + statue + "]";
	}
}
