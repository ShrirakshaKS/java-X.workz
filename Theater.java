public class Theater
{
	public static void screening(String nameOfTheater)
	{
		System.out.println("Invoked screening method");
		System.out.println("Name of the Theater is: "+ nameOfTheater);
		System.out.println("Exit:: screening method");
	}
	public static void screening(String releasedMovie, int numberOfScreen)
	{
		System.out.println("Invoked screening method");
		System.out.println("Name of the released movie is: "+ releasedMovie);
		System.out.println("Number of the Screen: "+ numberOfScreen);
		System.out.println("Exit:: screening method");
	}
	public static void screening(String actor,String actress)
	{
		System.out.println("Invoked screening method");
		System.out.println("Name of the Actor is: "+ actor);
		System.out.println("Name of the Actress is: "+ actress);
		System.out.println("Exit:: screening method");
	}
}