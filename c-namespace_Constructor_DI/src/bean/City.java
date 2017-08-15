package bean;

public class City {

	private String cityName;
	private int population;

	public City(String cityName, int population) {
		this.cityName = cityName;
		this.population = population;
	}

	public String getCityName() {
		return cityName;
	}

	public int getPopulation() {
		return population;
	}

}
