package bean;

import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class Student implements InitializingBean, DisposableBean {

	private String driver;
	private String url;
	private String uname;
	private String pwd;

	Connection con;
	
	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		 Class.forName(driver);
         con = (Connection) DriverManager.getConnection(url,uname,pwd);
         System.out.println("connection is open");
	}
	public void save(int id,String name,String address){
		try {
			PreparedStatement ps=(PreparedStatement) con.prepareStatement("insert into student "+"(id, name, address) VALUES"
			+ "(?,?,?)");
			
			ps.setInt(1, id);
			ps.setString(2,name);
			ps.setString(3,address);
			ps.executeUpdate();
			System.out.println("inserted successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void destroy() throws Exception {
		 System.out.println("connection is close");
		con.close();
	}

}
