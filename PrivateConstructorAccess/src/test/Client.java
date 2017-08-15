package test;

import java.lang.reflect.Constructor;

public class Client {

	public static void main(String... args){
		try{
			Class c=Class.forName("com.beans.Test");
			Constructor con=c.getDeclaredConstructor();
			con.setAccessible(true);
			con.newInstance(null);
		}catch(Exception e){
			e.getMessage();
		}
	}
}
