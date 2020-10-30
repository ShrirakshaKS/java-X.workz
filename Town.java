public class Town
{
public static void main(String[] find)
{
System.out.println("JVM invokes main method");
int sizeOfTowns=find.length;
String distanceOfTown=find[0];
String distanceOfTownAt1=find[1];
int fromDistanceToTown=Integer.parseInt(distanceOfTown);
int toDistance=Integer.parseInt(distanceOfTownAt1);	

String nameOfTownAt1=TownFinder.finding(fromDistanceToTown,toDistance);
System.out.println("name of Town is: "+ nameOfTownAt1);
System.out.println("Exit from main");
}
}