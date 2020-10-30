public class MobileTester
{
	public static void main(String[] use)
	{
		System.out.println("JVM invokes main");
		
		Mobile.watching("3 Idiots",2010);
		Mobile.watching("Jolly Days");
		System.out.println("exit from main");
	}
}