public class TownFinder
{
public static String finding(int fromDistanceToPlace,int toDistance)
{
	if(fromDistanceToPlace>20 && toDistance<=40)
	{
		System.out.println("Haveri");
	return "Haveri";
	}
	if(fromDistanceToPlace>40 && toDistance<=80)
	{
		System.out.println("Hubli");
	return "Hubli";
	}
	if(fromDistanceToPlace>80 && toDistance<=150)
	{
		System.out.println("Mysore");
	return "Mysore";
	}if(fromDistanceToPlace>150 && toDistance<=900)
	{
		System.out.println("Haveri");
	return "Haveri";
	}
	if(fromDistanceToPlace>900 && toDistance<=2000)
	{
		System.out.println("Delhi");
	return "Delhi";
	}
	return "Place not found";
}

}