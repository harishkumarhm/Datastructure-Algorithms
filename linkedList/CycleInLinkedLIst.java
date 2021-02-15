package linkedList;




public class CycleInLinkedLIst {
	public static void main(String[] args)
	{
		
	}
 public boolean containsCycle(Node head)
 {
	 Node firstPtr = head;
	 Node secPtr = head;
	 boolean cycleFound = false;
	 while(firstPtr!=null)
	 {
		 
		 secPtr = secPtr.next;
		 if(secPtr!=null && secPtr.next!=null)
		 {
			 secPtr = secPtr.next;
			 firstPtr = firstPtr.next;
			 if(firstPtr == secPtr)
				 cycleFound= true;
		 }
	 }
	 
	 return cycleFound;
 }
}
