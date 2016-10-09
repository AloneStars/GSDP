package com.gsdp.model.dao.newsDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import com.gsdp.model.entity.user.News;
import com.gsdp.util.DBCPUtil;

public class NewsDao {
	
	/**
	 * 添加新消息
	 * @param news
	 */
	public void addNews(News news){
		
		Connection con = DBCPUtil.getConnection();
		
		String newsTitle = news.getNews_title();
		String newsContent = news.getNews_content();
		int fromAddress = news.getFromAddress();
		int ToAddress = news.getToAddress();
		Date date =  new Date(news.getSendTime());
		int statue = news.getStatue();
		
		String sql = "insert into News(news_title,news_title,news_content,fromAddress,toAddress,sendTime,statue) values(?,?,?,?,?,?);";
				
		PreparedStatement ptmp = null;
		
		try {
			ptmp = con.prepareStatement(sql);
			
			ptmp.setString(1, newsTitle);
			ptmp.setString(2,newsContent);
			ptmp.setInt(3, fromAddress);
			ptmp.setInt(4, ToAddress);
			ptmp.setInt(5,statue);
			
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
	 * 删除消息
	 * @param news
	 */
	public void delNews(int newsId){
		
		Connection con = DBCPUtil.getConnection();
		
		String sql = "delete from News where news_id = ?";
				
		PreparedStatement ptmp = null;
		
		try {
			ptmp = con.prepareStatement(sql);
			
            ptmp.setInt(1, newsId);
			
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
	 * 修改消息的阅读状态
	 * @param statue
	 * @param newsId
	 */
	public void changeNewsStatue(int statue,int newsId){
		
		Connection con = DBCPUtil.getConnection();
		   
		   String sql = "update news set statue = ? where news_id = ?;";
		   
		   PreparedStatement ptmp = null;
		   try {
			ptmp= con.prepareStatement(sql);
			
			ptmp.setInt(1, statue);
			ptmp.setInt(2, newsId);
			
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

}
