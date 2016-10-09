package com.gsdp.model.entity.group;

public class Group {
     
	private int group_id;   //团体Id
	private String group_icon;  //团体标志
	private String group_name;  //团体名称
	private String group_dec;   //团体介绍
	private String group_contact; //团队联系方式
	private String group_address;  //团体办公地点
	private int group_type;  //团体所属类型
	private int owner;       //团体创建者

	public int getGroup_id() {
		return group_id;
	}

	public void setGroup_id(int group_id) {
		this.group_id = group_id;
	}

	public String getGroup_icon() {
		return group_icon;
	}

	public void setGroup_icon(String group_icon) {
		this.group_icon = group_icon;
	}

	public String getGroup_name() {
		return group_name;
	}

	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}

	public String getGroup_dec() {
		return group_dec;
	}

	public void setGroup_dec(String group_dec) {
		this.group_dec = group_dec;
	}
	
	public String getGroup_contact() {
		return group_contact;
	}

	public void setGroup_contact(String group_contact) {
		this.group_contact = group_contact;
	}

	public String getGroup_address() {
		return group_address;
	}

	public void setGroup_address(String group_address) {
		this.group_address = group_address;
	}

	public int getGroup_type() {
		return group_type;
	}

	public void setGroup_type(int group_type) {
		this.group_type = group_type;
	}

	public int getOwner() {
		return owner;
	}

	public void setOwner(int owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "Group [group_id=" + group_id + ", group_icon=" + group_icon
				+ ", group_name=" + group_name + ", group_dec=" + group_dec
				+ ", group_contace=" + group_contact + ", group_address="
				+ group_address + ", group_type=" + group_type + ", owner="
				+ owner + "]";
	}
	
	
}
