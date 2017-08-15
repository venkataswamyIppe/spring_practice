package bean;

public class SampleBean {

	private DemoBean db;

	public void setDb(DemoBean db) {
		this.db = db;
	}

	public void show() {
		System.out.println("m1 caling samplebean class");
		db.m1();
	}

}
