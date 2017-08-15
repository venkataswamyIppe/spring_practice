package bean;

public class Test {

	private static Test t = null;

	private Test() {
	}

	public static Test getInstance() {
		if (t == null) {
			System.out.println("first time object  create");
			t = new Test();
			return t;
		} else {
			System.out.println("object already created");
			return t;
		}

	}
}
