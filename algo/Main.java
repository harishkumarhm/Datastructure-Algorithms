package algo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {
	
	

public static void main(String[] args)
{
	TestClass testClass = new TestClass();
	testClass.sayHello();
//	try
//	{
//		throw new Derived();
//	}
////	catch(Base ex1)
////	{
////			// Not allowed Base exception before derived.
////	}
//	catch(Derived ex2)
//	{
//		
//	}
//	double p=1;
//	System.out.println(p/0);
	
	
	HashMap map = new HashMap();
	map.put("a", "Anurag");
	map.put("b", "Balaji");
	map.put("c", "Chandru");
	map.put("d", "Devraj");
//   Set keyset = map.keySet();
//	Iterator iter = keyset.iterator();
//	while(iter.hasNext())
//	{
//		System.out.println(iter.next());
//	}
	Set entrySet = map.entrySet();
	
	Iterator iter1 = entrySet.iterator();

	while(iter1.hasNext())
	{  Entry entry =(Entry)iter1.next();
		System.out.println("Key=" + entry.getKey() + " Value=" +entry.getValue());
	}
	
	List<String> list = (List)map.values();
	ListIterator listIter = list.listIterator();
	//listIter.
	for(Entry entry : (Set<Entry>)map.entrySet())
	{
		
	}
}
}
