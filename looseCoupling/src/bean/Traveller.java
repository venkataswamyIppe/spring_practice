package bean;

public class Traveller implements Journey{

	private Vehicle v;
	
	public void setV(Vehicle v) {
		this.v = v;
	}

	@Override
	public void startJourney() {
		System.out.println("journey starts...!");
		v.movie();
		
	}

}
