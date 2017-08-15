package bean;

public class ExampleBean {

	private DemoBean db;

	public void setDb(DemoBean db) {
		this.db = db;
	}

	public void show() {
		System.out.println("m1 caling ExampleBean class");
		db.m1();
	}
}
