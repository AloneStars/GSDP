package com.gsdp.entity.group;

public class Group {
    
	//团体Id
	private int groupId;
	
	//团体标志
	private String groupIcon;
	
	//团体名称
	private String groupName;
	
	//团体介绍
	private String groupDec;
	
	//团队联系方式
	private String groupContact;
	
	//团体办公地点
	private String groupAddress;
	
	//团体所属类型
	private int groupType;
	
	//团体创建者
	private int owner;

	//----------------------
	
	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public String getGroupIcon() {
		return groupIcon;
	}

	public void setGroupIcon(String groupIcon) {
		this.groupIcon = groupIcon;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupDec() {
		return groupDec;
	}

	public void setGroupDec(String groupDec) {
		this.groupDec = groupDec;
	}

	public String getGroupContact() {
		return groupContact;
	}

	public void setGroupContact(String groupContact) {
		this.groupContact = groupContact;
	}

	public String getGroupAddress() {
		return groupAddress;
	}

	public void setGroupAddress(String groupAddress) {
		this.groupAddress = groupAddress;
	}

	public int getGroupType() {
		return groupType;
	}

	public void setGroupType(int groupType) {
		this.groupType = groupType;
	}

	public int getOwner() {
		return owner;
	}

	public void setOwner(int owner) {
		this.owner = owner;
	}

	//----------------------
	
	@Override
	public String toString() {
		return "Group [groupId=" + groupId + ", groupIcon=" + groupIcon
				+ ", groupName=" + groupName + ", groupDec=" + groupDec
				+ ", groupContact=" + groupContact + ", groupAddress="
				+ groupAddress + ", groupType=" + groupType + ", owner="
				+ owner + "]";
	}
	
}
