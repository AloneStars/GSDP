package com.gsdp.entity.group;

public class Notice {
	
	//通知Id
	private int noticeId;  
	
	//通知内容
	private String noticeContent;
	
	//通知发起的时间
	private String noticeTime;
	
	//通知发起者
	private int noticer;
	
	//通知发布到那个组织
	private int groupId;

	//-----------------------------
	
	public int getNoticeId() {
		return noticeId;
	}

	public void setNoticeId(int noticeId) {
		this.noticeId = noticeId;
	}

	public String getNoticeContent() {
		return noticeContent;
	}

	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}

	public String getNoticeTime() {
		return noticeTime;
	}

	public void setNoticeTime(String noticeTime) {
		this.noticeTime = noticeTime;
	}

	public int getNoticer() {
		return noticer;
	}

	public void setNoticer(int noticer) {
		this.noticer = noticer;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	
	//-----------------------------

	@Override
	public String toString() {
		return "Notice [noticeId=" + noticeId + ", noticeContent="
				+ noticeContent + ", noticeTime=" + noticeTime + ", noticer="
				+ noticer + ", groupId=" + groupId + "]";
	}

}
