public class TableTester
{
public static void main(String[] things)
{
	System.out.println("JVM invokes main");
	Table.holding("bottle");
	Table.holding("bottle",2);
	Table.holding(7);
	System.out.println("Exit:: main");
}
}