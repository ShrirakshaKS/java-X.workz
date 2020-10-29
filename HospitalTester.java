public class HospitalTester
{
	public static void main(String[] repute)
	{
		System.out.println("JVM invokes main");
		String surgery="heart";
		Hospital.operation(surgery);
		Hospital.operation(100,250);
		Hospital.operation(100000);
		System.out.println("exit from main");
	}
}