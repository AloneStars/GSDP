package com.gsdp.model.dao.activityDao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gsdp.model.entity.group.Activity;
import com.gsdp.util.DBCPUtil;

public class ActivityDao {
	
	
	public List<Activity> getAllActivityMsg(){
		
List<Activity> ActivityList = new ArrayList<Activity>();
		
		Connection con =  DBCPUtil.getConnection();
		
		String sql = "select * from activity ;";
		
		PreparedStatement ptmp=null;
		ResultSet rs=null;
		try {
			ptmp = con.prepareStatement(sql);		
			rs= ptmp.executeQuery();
			while(rs.next()){
				Activity activity = new Activity();
				activity.setActivity_id(rs.getInt("activity_id"));
				activity.setActivity_title(rs.getString("activity_title"));
				activity.setActivity_content(rs.getString("activity_content"));
				activity.setBeginTime(rs.getDate("beginTime").getTime());;
				activity.setEndTime(rs.getDate("endTime").getTime());
				activity.setActivity_address(rs.getString("activity_id"));
				activity.setActivity_number(rs.getInt("activity_number"));
				activity.setSponsor(rs.getInt("sponsor"));
				activity.setPermission(rs.getInt("permission"));
				activity.setActivitier(rs.getInt("activitier"));
				activity.setPublishTime(rs.getDate("publishTime").getTime());
				
				/*System.out.println("DAO:"+activity.toString());*/
				
				ActivityList.add(activity);				
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
		
		return ActivityList;
		
	}
	
	/**
	 * 根据groupId来获取activity信息
	 * @param groupId
	 * @return
	 */
	public List<Activity> getActivityMsg(int groupId){
		
		List<Activity> ActivityList = new ArrayList<Activity>();
		
		Connection con =  DBCPUtil.getConnection();
		
		String sql = "select * from activity where sponsor = ? ;";
		
		PreparedStatement ptmp=null;
		ResultSet rs=null;
		try {
			ptmp = con.prepareStatement(sql);
			ptmp.setInt(1, groupId);			
			rs= ptmp.executeQuery();
			while(rs.next()){
				Activity activity = new Activity();
				activity.setActivity_id(rs.getInt("activity_id"));
				activity.setActivity_title(rs.getString("activity_title"));
				activity.setActivity_content(rs.getString("activity_content"));
				activity.setBeginTime(rs.getDate("beginTime").getTime());;
				activity.setEndTime(rs.getDate("endTime").getTime());
				activity.setActivity_address(rs.getString("activity_id"));
				activity.setActivity_number(rs.getInt("activity_number"));
				activity.setSponsor(rs.getInt("sponsor"));
				activity.setPermission(rs.getInt("permission"));
				activity.setActivitier(rs.getInt("activitier"));
				activity.setPublishTime(rs.getDate("publishTime").getTime());
				
				/*System.out.println("DAO:"+activity.toString());*/
				
				ActivityList.add(activity);				
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
		
		return ActivityList;
		
	}
	
	/**
	 * 添加activity信息
	 * @param activity
	 */
	public void addActivityMsg(Activity activity){
		
		Connection con = DBCPUtil.getConnection();
		
		String sql ="insert into activity(activity_title,activity_content,beginTime,endTime,activity_number,"
				+ "activitier,sponsor,activity_address,permission,publishTime) values(?,?,?,?,?,?,?,?,?,?) ; ";
		
		PreparedStatement  ptmp = null;
		
		try {
			ptmp = con.prepareStatement(sql);
			ptmp.setString(1, activity.getActivity_title());
			ptmp.setString(2, activity.getActivity_content());
			ptmp.setDate(3, new Date(activity.getBeginTime()));
			ptmp.setDate(4, new Date(activity.getEndTime()));
			ptmp.setInt(5, activity.getActivity_number());
			ptmp.setInt(6, activity.getActivitier());
			ptmp.setInt(7, activity.getSponsor());
			ptmp.setString(8, activity.getActivity_address());
			ptmp.setInt(9, activity.getPermission());
			ptmp.setDate(10, new Date(activity.getPublishTime()));
			
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
	 * 根据Id来删除activity信息
	 * @param activityId
	 */
	public void delActivityMsg(int activityId){
		
		Connection con = DBCPUtil.getConnection();
		
		String sql = "delete from activity where activity_id = ?";
		
		PreparedStatement ptmp = null;
		
		try {
			ptmp = con.prepareStatement(sql);
			ptmp.setInt(1, activityId);
			
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
	 * 更新activity的信息，传入activity对象
	 * @param args
	 */
	public void updateActivityMsg(Activity activity){
		
        Connection con = DBCPUtil.getConnection();
		
		String sql ="update activity set acitvity_title = ? ,activity_content = ?,beginTime = ?,endTime = ?,activity_number = ?,"
				+ "activitier = ? ,sponsor = ? ,activity_address = ?,permission = ?,publishTime = ? where activity = ? ; ";
		
		PreparedStatement  ptmp = null;
		
		try {
			
			ptmp = con.prepareStatement(sql);
			ptmp.setString(1, activity.getActivity_title());
			ptmp.setString(2, activity.getActivity_content());
			ptmp.setDate(3, new Date(activity.getBeginTime()));
			ptmp.setDate(4, new Date(activity.getEndTime()));
			ptmp.setInt(5, activity.getActivity_number());
			ptmp.setInt(6, activity.getActivitier());
			ptmp.setInt(7, activity.getSponsor());
			ptmp.setString(8, activity.getActivity_address());
			ptmp.setInt(9, activity.getPermission());
			ptmp.setDate(10, new Date(activity.getPublishTime()));
			ptmp.setInt(11, activity.getActivity_id());
			
			ptmp.execute();
			
		} catch (SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				ptmp.close();
				con.close();
			} catch (SQLException e){
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}		
	}
	
	/**
	 * 查询activity中的信息，根据传入的ID来获取相应的activity信息。
	 * @param args
	 */
	public Activity queryAvitvityMsg(int activityId){
		
		Activity activity = null;
	
		Connection con = DBCPUtil.getConnection();
		
		String sql = "select * from Activity where Activity = ? ;";
		
		PreparedStatement ptmp = null;
		
		ResultSet rs = null ;
		
		try {
			 ptmp = con.prepareStatement(sql);
			 ptmp.setInt(1, activityId);
			 
			 rs = ptmp.executeQuery();
			 
			 while(rs.next()){
				 
				activity = new Activity();
				
				activity.setActivity_id(rs.getInt("activity_id"));
				activity.setActivity_title(rs.getString("activity_title"));
				activity.setActivity_content(rs.getString("activity_content"));
				activity.setBeginTime(rs.getDate("beginTime").getTime());;
				activity.setEndTime(rs.getDate("endTime").getTime());
				activity.setActivity_address(rs.getString("activity_id"));
				activity.setActivity_number(rs.getInt("activity_number"));
				activity.setSponsor(rs.getInt("sponsor"));
				activity.setPermission(rs.getInt("permission"));
				activity.setActivitier(rs.getInt("activitier"));
				activity.setPublishTime(rs.getDate("publishTime").getTime());
				 
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
		return activity;		
	}
	
	public static void main(String[] args) {
		
		/*Activity activity = new Activity();

		activity.setActivity_title("大连动漫展");
		activity.setActivity_content("难得一见的动漫展，不去肯定会后悔");
		activity.setBeginTime(234513499);;
		activity.setEndTime(999999999);
		activity.setActivity_address("东软三期食堂");
		activity.setActivity_number(100);
		activity.setSponsor(5);
		activity.setPermission(0);
		activity.setActivitier(1);
		activity.setPublishTime(125364789);
		
		System.out.println(activity.toString());*/
		
		
		/*ActivityDao ad = new ActivityDao();*/
		/*ad.getActivityMsg(3);*/
		
		/*ad.addActivityMsg(activity);*/
		/*ad.delActivityMsg(4);*/
		
		/*List<Activity> ActivityList = new ArrayList<Activity>();
		ActivityList = ad.getAllActivityMsg();
		
		for (Activity activity2 : ActivityList) {
			
			System.out.println(activity2.toString());
			
		}*/
	}

}
