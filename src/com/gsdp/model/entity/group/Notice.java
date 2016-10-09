package com.gsdp.model.entity.group;

import java.util.Date;

public class Notice {
	
	private int notice_id;  //通知Id
	private String notice_content;  //通知内容
	private long noticeTime;  //通知发起的时间
	private int noticer;      //通知发起者
	private int group_id;     //通知发布到那个组织

	public int getNotice_id() {
		return notice_id;
	}

	public void setNotice_id(int notice_id) {
		this.notice_id = notice_id;
	}

	public String getNotice_content() {
		return notice_content;
	}

	public void setNotice_content(String notice_content) {
		this.notice_content = notice_content;
	}

	public long getNoticeTime() {
		return noticeTime;
	}

	public void setNoticeTime(long noticeTime) {
		this.noticeTime = noticeTime;
	}

	public int getNoticer() {
		return noticer;
	}

	public void setNoticer(int noticer) {
		this.noticer = noticer;
	}

	public int getGroup_id() {
		return group_id;
	}

	public void setGroup_id(int group_id) {
		this.group_id = group_id;
	}

	@Override
	public String toString() {
		return "Notice [notice_id=" + notice_id + ", notice_content="
				+ notice_content + ", noticeTime=" + noticeTime + ", noticer="
				+ noticer + ", group_id=" + group_id + "]";
	}
	
	

}
