public class Table
{
public static void holding(String thing)
{
	System.out.println("holding method invoked");
	System.out.println("The thing on the table is: "+thing);
	System.out.println("exit from holding method");
}
public static void holding(int numberOfThing)
{
	System.out.println("holding method invoked");
	System.out.println("The number of thing on the table: "+numberOfThing);
	System.out.println("exit from holding method");
}
public static void holding(String thing, int countOfThing)
{
	System.out.println("holding method invoked");
	System.out.println("The name of thing on the table is: "+thing);
	System.out.println("The number of "+ thing +" on the table is: "+countOfThing);
	System.out.println("exit from holding method");
}

}