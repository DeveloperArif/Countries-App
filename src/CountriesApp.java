import java.util.Arrays;
import java.util.List;

public class CountriesApp {
	
	public static void main(String[] args) {
		List<Countries> countryList = CountriesUtil.readFile();
		for (Countries country : countryList) {
			System.out.println(country);
		}
		
		List<Countries> players = Arrays.asList(
				new Countries("America", "North America");
				
				new Countries("Brazil", "South America")
		);
		CountriesUtil.writeFile(players);
		
		Countries country = new Countries("Bangladesh", "Asia");
		CountriesUtil.appendLine(country);
		
		CountriesUtil.createDirectory(System.getProperty("user.home") + "/Desktop/Countries");
		CountriesUtil.createBlankFile(System.getProperty("user.home") + "/Desktop/Countries/countries.txt");
	}

}
