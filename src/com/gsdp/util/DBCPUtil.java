package com.gsdp.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSourceFactory;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class DBCPUtil {

	private static final Log log = LogFactory.getLog(DBCPUtil.class);
	/*在这里注意src没有算为一个路径（也就是说源文件夹不算一个路径），但是resourse这个包算为了一个路径，
	 * 这是与web中有点不同的一点
	 *
	 */
	private static final String configFile = "/db.properties";

	 private static DataSource dataSource;

	 static {
	//Properties 类表示了一个持久的属性集。Properties 可保存在流中或从流中加载。属性列表中每个键及其对应值都是一个字符串。 	 
	  Properties dbProperties = new Properties();
	  try {
		  /*
		   * InputStream getResourceAsStream(String fileName)
		   * 返回读取指定资源的输入流。
		   * void load(InputStream inStream)
 		   * 从输入流中读出属性列表
		   */
	   dbProperties.load(DBCPUtil.class.getResourceAsStream(configFile));
	   //然后用dbcp给出的工厂创建一个DataSource
	   dataSource = BasicDataSourceFactory.createDataSource(dbProperties);

/*	   Connection conn = getConnection();
	   
	    * getMetaData()方法的介绍
	    * 获取一个 DatabaseMetaData 对象，该对象包含关于此 Connection 对象所连接的
	    * 数据库的元数据。元数据包括关于数据库的表、受支持的 SQL 语法、存储过程、此连接功能
	    * 等等的信息。 
	    
	   DatabaseMetaData mdm = conn.getMetaData();
	   
	    * getDatabaseProductName()
	    * 获得此数据库产品的名称
	    * getDatabaseProductVersion()
	    * 获得此数据库产品的版本号
	    
	   log.info("Connected to " + mdm.getDatabaseProductName() + " "
	     + mdm.getDatabaseProductVersion());
	   
	   if (conn != null) {
	    conn.close();
	   }*/
	   
	   
	  } catch (Exception e) {
	   log.error("初始化连接池失败：" + e);
	  }
	 }

	 private DBCPUtil() {
	 }

	 /**
	  * 获取链接，用完后记得关闭
	  * 
	  * @see {@link DBManager#closeConnection(Connection)}
	  * @return
	  */
	 public static final Connection getConnection() {
	  Connection conn = null;
	  try {
		  //获取数据库的连接
	   conn = dataSource.getConnection();
	   
	   //即使我在这里设置为false，其在执行sql语句的时候也会提交
	   //并且当我db.properties中设置了defalutAutoCommit = false
	   //这里获取的也为true；
	   //如果这里设置为false，其也能自动提交。
	   //  conn.setAutoCommit(false);
	   //  System.out.println(conn.getAutoCommit());
	  } catch (SQLException e) {
	   log.error("获取数据库连接失败：" + e);
	  }
	  return conn;
	 }
	 
	 /**
	  * 关闭jdbc数据库的ResultSet和PreparedStatement连接，如果没有用到指定的参数，
	  * 则设为null
	  * @param res
	  * @param pre
	  */
	 public static void closeResAndPre(ResultSet res, PreparedStatement pre) {
		 try {
			if(res != null) {
				 res.close();
			 }
			if(pre != null) {
				pre.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	 }

	 /**
	  * 关闭连接
	  * 
	  * @param conn
	  *            需要关闭的连接
	  */
	 public static void closeConnection(Connection conn) {
	  try {
	   if (conn != null && !conn.isClosed()) {
	   // conn.setAutoCommit(true);
	    conn.close();
	   }
	  } catch (SQLException e) {
	   log.error("关闭数据库连接失败:hehehaha" + e);
	  }
	 }

}
