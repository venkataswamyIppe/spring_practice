package bean;

public class Engine {

	private String modelYear;

	public Engine() {
		System.out.println("engine constructor");
	}

	public String getModelYear() {
		return modelYear;
	}

	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}

}
