public class Runner
{
public static void main(String[] names)
{
	System.out.println("JVM invokes main");
	
	System.out.println("size of main method is: "+names.length);
	for(int loop=0;loop<names.length;loop++)
	{
		System.out.println("name of the runner at "+ loop + " is: ");
		String mainMethodArgument=names[loop];
		System.out.println("name of Runner is: "+ mainMethodArgument);
	}
	
	System.out.println("Exit :: main");
}


}