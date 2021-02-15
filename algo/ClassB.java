package algo;

import java.net.SocketException;
import java.sql.SQLException;

public class ClassB extends ClassA {
public void MethodB() 
{
	System.out.println("MethodB in ClassB");
}
@Override
public void MethodA()
{
	System.out.println("MethodA in ClassB");
}


public void MethodC()
{
	System.out.println("MethodC");
}
public static void MethodStatic()
{
	System.out.println("Method B static");
}
}
