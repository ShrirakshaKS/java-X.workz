public class MobileTester{
	
	
public static void main(String[] work)
{
System.out.println("JVM invoked main");


String unlockValue=Mobile.getUnlock();

System.out.println("unlockValue: "+unlockValue);

Mobile.setUnlock(work[0]);

unlockValue=Mobile.getUnlock();

System.out.println("unlockValue: "+unlockValue);

System.out.println("EXIT :: main");

}
	
}