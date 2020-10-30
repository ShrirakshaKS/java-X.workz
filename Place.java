public class Place
{
public static void main(String[] search)
{
System.out.println("JVM invokes main method");
int sizeOfplaces=search.length;
String distanceOfPlace=search[0];

int fromDistanceToPlace=Integer.parseInt(distanceOfPlace);
	
String nameOfPlace=PlaceFinder.searching(fromDistanceToPlace);
System.out.println("name of place is: "+ nameOfPlace);

System.out.println("Exit from main");
}
}