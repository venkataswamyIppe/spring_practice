package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionPooling {

	private String driver;
	private String url;
	private String username;
	private String password;
	
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public void createConnection() throws SQLException, ClassNotFoundException{
		Class.forName(driver);
		Connection conn=DriverManager.getConnection(url, username, password);
		System.out.println("connection is open");
		System.out.println(conn);
	}
}
