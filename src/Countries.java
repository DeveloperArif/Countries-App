
public class Countries {
	
	private String name;
	private String continent;
	
	//Constructor
	public Countries(String name, String continent) {
		super();
		this.name = name;
		this.continent = continent;
	}
	
	//Getters & Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	//To String
	@Override
	public String toString() {
		return "Countries [name=" + name + ", continent=" + continent + "]";
	}
	

}
