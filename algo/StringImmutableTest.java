package algo;

public class StringImmutableTest {
public static void main(String[] args)
{
	String test = "Harish";
	String s1 = test;
	test="Girish";
	
	System.out.println(s1==test);
	
	StringBuilder s2 = new StringBuilder("Harish");
	
	StringBuilder s3= s2;
	s2 = s2.append("Girish");
	System.out.println(s2==s3);
	
}
}
