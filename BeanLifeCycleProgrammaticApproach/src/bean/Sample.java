package bean;

import java.sql.DriverManager;
import java.util.Scanner;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import com.mysql.jdbc.Connection;

public class Sample implements InitializingBean, DisposableBean {

	private String url;
	private String uname;
	private String pwd;
	Connection con;

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
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = (Connection) DriverManager.getConnection(url, uname, pwd);
			if (con != null) {
				System.out.println("Connected.....................");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@SuppressWarnings("resource")
	public void getData() throws Exception {
		System.out.print("Enter Student id : ");
		Scanner sc = new Scanner(System.in);
		String id = sc.next();
		String qy = "select * FROM student where id = " + id;
		java.sql.ResultSet rs = con.createStatement().executeQuery(qy);
		if (rs.next()) {
			System.out.println("--------------------------------------------------");
			System.out.println("StudentName :"+rs.getString(2) + ",  Student Address :" + rs.getString(3));

		} else {
			destroy();
		}

	}
	
	@Override
    public void destroy() throws Exception {
           System.out.println("Closed.........................");
          
    }

}
