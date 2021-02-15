package linkedList;


public class StackByLinkedList {
 ListNode head;
 int data, length =0;
 public void push(int data)
 {
	 ListNode temp = new ListNode(data);
	 temp.next = head;
	 this.head = temp;
	 length++;
 }
 public int pop() throws Exception
 {
	 if(isEmpty())
		 throw new Exception();
	 length--;
	 int result = head.data;
	 this.head = head.next;
	 return result;
 }
 public boolean isEmpty()
 {
	 return(length==0);
 }
 public int size(){
	 return length;
 }
 
}
