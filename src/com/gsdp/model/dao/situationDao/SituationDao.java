package com.gsdp.model.dao.situationDao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gsdp.model.entity.group.Situation;
import com.gsdp.util.DBCPUtil;

public class SituationDao {
	
	
	/**
	 * 获取全部的动态消息
	 * @param groupId
	 * @return
	 */
	public List<Situation> getSituationMsg(int groupId){
		
		List<Situation> SituationList = new ArrayList<Situation>();
		
		Connection con = DBCPUtil.getConnection();
		
		String sql = "select * from Situation where group_id = ? ;";
		
		PreparedStatement ptmp = null;
		ResultSet rs =null;
		
		try {
			ptmp= con.prepareStatement(sql);
			ptmp.setInt(1, groupId);
			rs = ptmp.executeQuery();
				
			while(rs.next()){
				
				Situation situation  =  new Situation();
				situation.setSituation_id(rs.getInt("situation_id"));
				situation.setSituation_title(rs.getString("situation_title"));
				situation.setSituation_content(rs.getString("situation_content"));
				situation.setPublisher(rs.getInt("publisher"));
				situation.setPublishTime(rs.getDate("publishTime").getTime());
				situation.setGroup_id(rs.getInt("group_id"));
				
				SituationList.add(situation);
				
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
		
		return SituationList;
		
	}
	
	/**
	 * 获取单个的动态消息
	 * @param situationId
	 * @return
	 */
	public Situation getSingalSituationMsg(int situationId){
		Situation situation = new Situation();
		
		Connection con = DBCPUtil.getConnection();
		PreparedStatement ptmp = null;
		ResultSet rs = null;
		
		String sql="select * from Situation where situation_id = ? ;";
		
		try {
			ptmp = con.prepareStatement(sql);
			
			ptmp.setInt(1, situationId);
			
			rs = ptmp.executeQuery();
			
			while(rs.next()){
				situation.setSituation_id(rs.getInt("situation_id"));
				situation.setGroup_id(rs.getInt("group_id"));
				situation.setSituation_title(rs.getString("situation_title"));
				situation.setSituation_content(rs.getString("situation_content"));
				situation.setPublisher(rs.getInt("publisher"));
				situation.setPublishTime(rs.getDate("publishTime").getTime());				
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
		
		return situation;
	}
	
	/**
	 * 添加动态消息
	 * @param situation
	 */
	public void addSitutationMsg(Situation situation){
		
		Connection con = DBCPUtil.getConnection();
		
		String sql = "insert into Situation(situation_title,situation_content,publisher,publishTime,group_id) values(?,?,?,?,?) ;";
		
		PreparedStatement ptmp = null;
		try {
			 ptmp = con.prepareStatement(sql);
			 ptmp.setString(1, situation.getSituation_title());
			 ptmp.setString(2, situation.getSituation_content());
			 ptmp.setInt(3, situation.getPublisher());
			 ptmp.setDate(4, new Date(situation.getPublishTime()));
			 ptmp.setInt(5, situation.getGroup_id());
			 
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
	
	public void delSituationMsg(int situationId){
		Connection con =  DBCPUtil.getConnection();
		String sql="delete from situation where situation_id = ?";
		
		PreparedStatement ptmp = null;
		
		try {
			ptmp = con.prepareStatement(sql);
			ptmp.setInt(1, situationId);
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
	
	public static void main(String[] args) {
		/*SituationDao SD =  new SituationDao();
		
		
		Situation situation = new Situation();
		situation.setSituation_title("摄影爱好这交流会");
		situation.setSituation_content("全体摄影爱好者一起交流摄影的心得和体会");
		situation.setPublisher(1);
		situation.setPublishTime(999999999);
		situation.setGroup_id(3);
		
		System.out.println("begin");
		SD.addSitutationMsg(situation);
		System.out.println("end");
		
		System.out.println("begin");
		System.out.println(SD.getSingalSituationMsg(2).toString());
		System.out.println("end");
		
		System.out.println("begin");
		
		List<Situation> SL =SD.getSituationMsg(3);		
		for (Situation situation1 : SL) {
			System.out.println(situation1.toString());
		}
		System.out.println("end");
		
		System.out.println("begin");
		SD.delSituationMsg(2);
		System.out.println("end");
		
        System.out.println("begin");
		
		List<Situation> SL2 =SD.getSituationMsg(3);		
		for (Situation situation2 : SL2) {
			System.out.println(situation2.toString());
		}
		System.out.println("end");*/
	}

}
