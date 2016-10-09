package com.gsdp.model.entity.group;

public class File {
	
	private int file_id;  //文件Id
	private int file_type;  //文件类型
	private String file_name;  //文件名
	private String file_src;   //文件地址
	private int updater;    //上传人
	private int updateTime;  //上传时间
	private int group_id;    //文件上传到那个组织
	private int permission;  //浏览权限，只对团体内成员开放，还是对所有人开放
	

	public int getFile_id() {
		return file_id;
	}

	public void setFile_id(int file_id) {
		this.file_id = file_id;
	}

	public int getFile_type() {
		return file_type;
	}

	public void setFile_type(int file_type) {
		this.file_type = file_type;
	}

	public String getFile_name() {
		return file_name;
	}

	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}

	public String getFile_src() {
		return file_src;
	}

	public void setFile_src(String file_src) {
		this.file_src = file_src;
	}

	public int getUpdater() {
		return updater;
	}

	public void setUpdater(int updater) {
		this.updater = updater;
	}

	public int getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(int updateTime) {
		this.updateTime = updateTime;
	}

	public int getGroup_id() {
		return group_id;
	}

	public void setGroup_id(int group_id) {
		this.group_id = group_id;
	}

	public int getPermission() {
		return permission;
	}

	public void setPermission(int permission) {
		this.permission = permission;
	}
	
	
	

}
