public class SkillSetTester
{
public static void main(String[] exp)
{
	System.out.println("JVM invokes main method");
SkillSet.practising("java");
SkillSet.practising("java",3);
SkillSet.practising(4);
System.out.println("exit from main");
}
}