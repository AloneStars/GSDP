package com.gsdp.model.dao.groupDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.gsdp.model.entity.group.Group;
import com.gsdp.model.entity.user.News;
import com.gsdp.util.DBCPUtil;

public class AdminDao {
	
	
	/**
	 * 给团体添加管理员
	 * @param user
	 * @param group
	 */
	public void addAdmin(int userId,int groupId){
		
	   Connection con = DBCPUtil.getConnection();
	   
	   String sql = "insert into admin values(?,?);";
	   
	   PreparedStatement ptmp = null;
	   try {
		ptmp= con.prepareStatement(sql);
		
		ptmp.setInt(1, userId);
		ptmp.setInt(2, groupId);
		
		ptmp.execute();
		
	    } catch (SQLException e) {
		  e.printStackTrace();
	    }finally{
		   try {
			ptmp.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		   
	    }		
	}
	
	/**
	 * 删除团体管理员
	 * @param user
	 * @param group
	 */
	public void delAdmin(int userId,int groupId){
		
	   Connection con = DBCPUtil.getConnection();
	   
	   String sql = "delete from Admin where user_id = ? and group_id = ?;";
	   
	   PreparedStatement ptmp = null;
	   try {
		ptmp= con.prepareStatement(sql);
		
		ptmp.setInt(1, userId);
		ptmp.setInt(2, groupId);
		
		ptmp.execute();
		
	    } catch (SQLException e) {
		  e.printStackTrace();
	    }finally{
		   try {
			ptmp.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		   
	    }		
	}
	
	/**
	 * 转让组织给别人
	 * @param userId
	 * @param groupId
	 */
	public void changeOwner(int userId,int groupId){
		
		Connection con = DBCPUtil.getConnection();
		
		String sql = "update from gdp.Group set owner = ? where group_Id = ? ;";
		
		PreparedStatement ptmp = null;
		
		try {
			ptmp = con.prepareStatement(sql);
			
			ptmp.setInt(1, userId);
			ptmp.setInt(2,groupId);
			
			ptmp.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				ptmp.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
	
	
	
	
	/**
	 * 添加团体成员
	 * @param user
	 * @param group
	 */
	public void addMember(int userId,int groupId){
		
	   Connection con = DBCPUtil.getConnection();
	   
	   String sql = "insert into Member values(?,?);";
	   
	   PreparedStatement ptmp = null;
	   try {
		ptmp= con.prepareStatement(sql);
		
		ptmp.setInt(1, userId);
		ptmp.setInt(2, groupId);
		
		ptmp.execute();
		
	    } catch (SQLException e) {
		  e.printStackTrace();
	    }finally{
		   try {
			ptmp.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		   
	    }		
	}
	
	/**
	 * 删除团体成员
	 * @param user
	 * @param group
	 */
	public void delMember(int userId,int groupId){
		
	   Connection con = DBCPUtil.getConnection();
	   
	   String sql = "delete from Member where user_id = ? and group_id = ?;";
	   
	   PreparedStatement ptmp = null;
	   try {
		ptmp= con.prepareStatement(sql);
		
		ptmp.setInt(1, userId);
		ptmp.setInt(2, groupId);
		
		ptmp.execute();
		
	    } catch (SQLException e) {
		  e.printStackTrace();
	    }finally{
		   try {
			ptmp.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		   
	    }		
	}
	
	
	public void addGroup(Group group){
		
        Connection con = DBCPUtil.getConnection();
        
		String groupIcon =  group.getGroup_icon();
		int groupType =  group.getGroup_type();
		String groupName = group.getGroup_name();
		String groupDec =  group.getGroup_dec();
		String groupAddress =  group.getGroup_address();
		int owner  =  group.getOwner();
		
		String sql = "insert gdp.Group(group_icon,group_type,group_name,group_dec,group_address,owner) values(?,?,?,?,?,?) ;";
		
		PreparedStatement ptmp = null;
		
		try {
			ptmp = con.prepareStatement(sql);
			
			ptmp.setString(1, groupIcon);
			ptmp.setInt(2, groupType);
			ptmp.setString(3, groupName);
			ptmp.setString(4, groupDec);
			ptmp.setString(5, groupAddress);
			ptmp.setInt(6, owner);
			
			ptmp.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				ptmp.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	/**
	 * 更新组织信息
	 * @param group
	 */
	public void updateGroup(Group group){
		
		Connection con = DBCPUtil.getConnection();
		
		int groupId = group.getGroup_id();
		String groupIcon =  group.getGroup_icon();
		int groupType =  group.getGroup_type();
		String groupName = group.getGroup_name();
		String groupDec =  group.getGroup_dec();
		String groupAddress =  group.getGroup_address();
		
		String sql = "update gdp.Group set group_icon = ?,"
				+ "group_type = ?,group_name = ?,group_dec = ?, group_address = ?;";
		
		PreparedStatement ptmp = null;
		
		try {
			ptmp = con.prepareStatement(sql);
			
			ptmp.setString(1, groupIcon);
			ptmp.setInt(2, groupType);
			ptmp.setString(3, groupName);
			ptmp.setString(4, groupDec);
			ptmp.setString(5, groupAddress);
			
			ptmp.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				ptmp.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	/**
	 * 获取组织信息（根据Id）
	 * @param groupId
	 * @return
	 */
	public Group getGroupMsg(int groupId){
		
		Connection con = DBCPUtil.getConnection();
		
		String sql ="select * from gdp.Group where group_id = ? ;";
		
		PreparedStatement ptmp = null;
		
		ResultSet rs =null;
		
		Group group = null;
		
		try {
			ptmp = con.prepareStatement(sql);
			
			ptmp.setInt(1, groupId);
			rs = ptmp.executeQuery();
			
			while(rs.next()){
				group= new Group();
				group.setGroup_id(rs.getInt("group_id"));
				group.setGroup_icon(rs.getString("group_icon"));
				group.setGroup_name(rs.getString("group_name"));
				group.setGroup_dec(rs.getString("group_dec"));
				group.setGroup_contact(rs.getString("group_contact"));
				group.setGroup_address(rs.getString("group_address"));
				group.setGroup_type(rs.getInt("group_type"));
				group.setOwner(rs.getInt("owner"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				rs.close();
				ptmp.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return group;
		
	}
	
	/**
	 * 获取组织信息（根据类型）
	 * @param typeId
	 * @return
	 */
	public List<Group>  getTypeGroupMsg(int typeId){
		List<Group> groupList =  new ArrayList<Group>();
		
		Connection con = DBCPUtil.getConnection();
		String sql = "select * from gdp.Group where group_type = ?;";
		PreparedStatement ptmp = null;
		ResultSet rs = null;
		try {
			ptmp = con.prepareStatement(sql);
			ptmp.setInt(1, typeId);
			rs = ptmp.executeQuery();
			while(rs.next()){
				Group group = new Group();
				group.setGroup_id(rs.getInt("group_id"));
				group.setGroup_icon(rs.getString("group_icon"));
				group.setGroup_name(rs.getString("group_name"));
				group.setGroup_dec(rs.getString("group_dec"));
				group.setGroup_contact(rs.getString("group_contact"));
				group.setGroup_address(rs.getString("group_address"));
				group.setGroup_type(rs.getInt("group_type"));
				group.setOwner(rs.getInt("owner"));
				
				groupList.add(group);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				ptmp.close();
				rs.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return groupList;		
	}
	
	/**
	 * 获取所有的团体信息
	 * @return
	 */
	public List<Group>  getAllGroupMsg(){
		List<Group> groupList =  new ArrayList<Group>();
		
		Connection con = DBCPUtil.getConnection();
		String sql = "select * from gdp.Group ;";
		PreparedStatement ptmp = null;
		ResultSet rs = null;
		try {
			ptmp = con.prepareStatement(sql);
			rs = ptmp.executeQuery();
			while(rs.next()){
				Group group = new Group();
				group.setGroup_id(rs.getInt("group_id"));
				group.setGroup_icon(rs.getString("group_icon"));
				group.setGroup_name(rs.getString("group_name"));
				group.setGroup_dec(rs.getString("group_dec"));
				group.setGroup_contact(rs.getString("group_contact"));
				group.setGroup_address(rs.getString("group_address"));
				group.setGroup_type(rs.getInt("group_type"));
				group.setOwner(rs.getInt("owner"));
				
				groupList.add(group);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				ptmp.close();
				rs.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return groupList;		
	}
	
	public static void main(String[] args) {		
		AdminDao ad = new AdminDao();
		/*Group group = ad.getGroupMsg(3);
		System.out.println(group.toString());
		List<Group> groupList = new ArrayList<Group>();
		groupList = ad.getAllGroupMsg();
		for (Group group2 : groupList) {
			System.out.println(group2.toString());		
		}
		List<Group> groupList1 = new ArrayList<Group>();
		groupList1 = ad.getTypeGroupMsg(1);
		for (Group group2 : groupList1) {
			System.out.println(group2.toString());		
		}
		List<Group> groupList2 = new ArrayList<Group>();
		groupList2 = ad.getTypeGroupMsg(2);
		for (Group group2 : groupList2) {
			System.out.println(group2.toString());		
		}*/
		
		Group group = new Group();
		group.setGroup_address("16A-310");
		group.setGroup_icon("image/GroupIcon/Art.jpg");
		group.setGroup_name("动漫社");
		group.setGroup_contact("12345678910");
		group.setGroup_type(3);
		group.setOwner(1);
		group.setGroup_dec("对方不想对你说话，并向你扔了一点人生经验。");
		
		System.out.println(group.toString());
		
		ad.addGroup(group);
		
	}

}
