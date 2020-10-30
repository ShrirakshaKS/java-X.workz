public class PlaceFinder
{
public static String searching(int fromDistanceToPlace)
{
	
if(fromDistanceToPlace==150)
{
System.out.println("Mysore");
return "Mysore";
}
if(fromDistanceToPlace==1943)
{
System.out.println("Kolkata");
return "Kolkata";
}
if(fromDistanceToPlace==1959)
{
System.out.println("Delhi");
return "Delhi";
}
if(fromDistanceToPlace==724)
{
System.out.println("Chennai");
return "Chennai";
}
if(fromDistanceToPlace==38)
{
System.out.println("Haveri");
return "Haveri";
}
if(fromDistanceToPlace==76)
{
System.out.println("hubli");
return "hubli";
}
if(fromDistanceToPlace>=10000000)
{
System.out.println("not in the earth");
return "place not in earth";
}
return "place not found";
}
}