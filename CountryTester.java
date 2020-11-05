public class CountryTester
{
public static void main(String[] info)
{
System.out.println("JVM invokes main");
	String countryName=Country.nameOfCountry;
	byte code=Country.countryCode;
	String continent=Country.continent;
	String president=Country.president;
	long population=Country.population;
	
	
	System.out.println(countryName);
	System.out.println(code);
	System.out.println(continent);
	System.out.println(president);
	System.out.println(population);
	
	System.out.println("***********************************");
	//changing the value of the local variable
	countryName="Srilanka";
	code=+94;
	president="Gotabaya Rajapaksa";
	population=21700000l;
	
	
	System.out.println(countryName);
	System.out.println(code);
	System.out.println(continent);
	System.out.println(president);
	System.out.println(population);
	
	System.out.println("***********************************");
	
	//changing the value of the field
	Country.nameOfCountry="United States";
	Country.countryCode=+1;
	Country.continent="North America";
	Country.president="Donald Trump";
	Country.population=329877505l;
	
	System.out.println(Country.nameOfCountry);
	System.out.println(Country.countryCode);
	System.out.println(Country.continent);
	System.out.println(Country.president);
	System.out.println(Country.population);
	
System.out.println("EXIT ::  main");	
}

}