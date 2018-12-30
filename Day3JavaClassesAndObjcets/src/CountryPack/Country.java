package CountryPack;

public class Country {
	private String country1;
	private int population;
	private int area;

	public Country(String country1, int population, int area) {
		super();
		this.country1 = country1;
		this.population = population;
		this.area = area;
	}

	public String getCountry1() {
		return country1;
	}

	public void setCountry1(String country1) {
		this.country1 = country1;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

}
