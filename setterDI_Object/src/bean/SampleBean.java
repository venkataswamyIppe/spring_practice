package bean;

public class SampleBean {

	private DemoBean db;

	public void setDb(DemoBean db) {
		this.db = db;
	}

	public void show() {
		db.m1();
	}

}
