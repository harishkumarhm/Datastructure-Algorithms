package recursion;


import java.util.Arrays;
import java.util.LinkedList;


public class SimpleList {
  public static void main(String[] args)
  {
	  LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(1,2,3,4,6,8,5));
	  recursiveRemove(list);
  }
  
  public static void recursiveRemove(LinkedList<Integer> list)
  {
	  if(list.isEmpty())
		  return ;
	  int i = list.removeFirst();
	  recursiveRemove(list);
	  System.out.println(i);

  }
}
