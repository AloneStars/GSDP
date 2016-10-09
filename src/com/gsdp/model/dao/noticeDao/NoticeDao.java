package com.gsdp.model.dao.noticeDao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gsdp.model.entity.group.Notice;
import com.gsdp.util.DBCPUtil;

public class NoticeDao {
	
	/**
	 * 添加通知消息
	 * @param notice
	 */
	
	public void addNoticeMsg(Notice notice){
		
		Connection con = DBCPUtil.getConnection();
		
		String sql = "insert into notice(notice_content,noticeTime,noticer,group_id) value(?,?,?,?);";
		
		PreparedStatement ptmp = null;
		
	    try {
	    	
			ptmp = con.prepareStatement(sql);
			ptmp.setString(1, notice.getNotice_content());
			ptmp.setDate(2, new Date(notice.getNoticeTime()));
			ptmp.setInt(3, notice.getNoticer());
			ptmp.setInt(4, notice.getGroup_id());
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
	 * 获取个人全部的通知消息
	 * @param ToAddress
	 * @return
	 */
	public List<Notice> getNoticeMsg(int groupId){
		
    	List<Notice> noticeList = new ArrayList<Notice>();
    	
    	Connection con = DBCPUtil.getConnection();
    	
    	PreparedStatement ptmp = null;
    	
    	ResultSet rs = null;
    	
    	String sql = "select * from notice where group_id = ? ;";
    	
    	try {
			ptmp = con.prepareStatement(sql);
			ptmp.setInt(1, groupId);
			
			rs = ptmp.executeQuery();
			
			while(rs.next()){
				Notice notice = new Notice();
				
				notice.setNotice_id(rs.getInt("notice_id"));
				notice.setNotice_content(rs.getString("notice_content"));
				notice.setNoticeTime(rs.getDate("noticeTime").getTime());
				notice.setNoticer(rs.getInt("noticer"));
				notice.setGroup_id(rs.getInt("group_id"));
				
				noticeList.add(notice);				
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
    	
    	return noticeList;
    	
    }
	
	/**
	 * 获取单个的通知消息
	 * @param noticeId
	 * @return
	 */
	public Notice getSingalNoticeMsg(int noticeId){
		
		Notice notice =  new Notice();
		
		Connection con = DBCPUtil.getConnection();
		
		String sql = "select * from notice where notice_id = ? ;";
		
		PreparedStatement  ptmp = null;
		
		ResultSet rs = null;
	
		try {
			ptmp = con.prepareStatement(sql);
			ptmp.setInt(1, noticeId);
			rs = ptmp.executeQuery();
			while(rs.next()){
			notice.setNotice_id(rs.getInt("notice_id"));
			notice.setNotice_content(rs.getString("notice_content"));
			notice.setNoticeTime(rs.getDate("noticeTime").getTime());
			notice.setNoticer(rs.getInt("noticer"));
			notice.setGroup_id(rs.getInt("group_id"));
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
				
		return notice;
	}
    
	/**
	 * 删除通知消息
	 * @param noticeId
	 */
	public void delNoticeMsg(int noticeId){
		
		Connection con = DBCPUtil.getConnection();
		
		String sql = "delete from notice where notice_id = ? ;";
		
		PreparedStatement  ptmp = null;
		
	
		try {
			ptmp = con.prepareStatement(sql);
			ptmp.setInt(1, noticeId);
			
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
        NoticeDao ND = new NoticeDao();
		
	/*	Notice notice = new Notice();
		notice.setNotice_content("明天下午5点，办公室开会，全体成员没事都要到场。");
		notice.setNoticer(1);
		notice.setNoticeTime(1324353123);
		notice.setGroup_id(3);
		
		System.out.println(notice.toString());
		ND.addNoticeMsg(notice);
		System.out.println("success");*/
		
		/*notice = ND.getSingalNoticeMsg(1);
		System.out.println(notice.toString());*/
        
       /* List<Notice> noticeList = ND.getNoticeMsg(3);
        
        for (Notice notice : noticeList) {
			System.out.println(notice.toString());
		}*/
	}
		

}
