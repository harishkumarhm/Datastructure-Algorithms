package linkedList;


import java.util.Stack;

public class LinkedList {
	Node head;
	
	class Node {
		Node next;
		int data;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public Node newNode(int data) {
		return new Node(data);
	}

	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}

	}

	public void sortedInsert(Node node) {
		if(head==null || head.data>=node.data)
		{
			node.next = head;
			head = node;
			return;
		}
		else
		{   Node currNode = head;
		    Node prevNode = head;
			while(currNode!=null && currNode.data <= node.data)
			{
				prevNode = currNode;
				currNode = currNode.next;
			}
			prevNode.next = node;
			node.next =currNode;
		}
	
	}
	
	public void middleOfList()
	{
		Node firstPntr =head, secondPntr = head;
		
		while(secondPntr!=null)
		{
		
			secondPntr=secondPntr.next;
			if(secondPntr!=null&&secondPntr.next!=null)
			{
				secondPntr=secondPntr.next;
				firstPntr = firstPntr.next;
			}
		}
		
		System.out.println("middle of the linked list: " +firstPntr.data);
	}
	
	public void PrintreverseLinkedList()
	{
		Stack<Integer> stack = new Stack<Integer>();
		Node currNode = head;
		while(currNode!=null){
			stack.push(currNode.data);
			currNode = currNode.next;
		}
		
		while(!stack.isEmpty())
			System.out.println(stack.pop());
	}
	
	
	public void reverseLinkedList()
	{
		Node currNode = head;
		Node nextNode = null;
		Node prevNode = null;
		while(currNode!=null)
		{
			nextNode = currNode.next;
			currNode.next= prevNode;
			prevNode = currNode;
			currNode = nextNode;
		
		}
		head = prevNode;
	}
	
	public void findLoop()
	{
		Node firstPtr =head, secPntr=head;
		while(firstPtr!=null)
		{
			firstPtr = firstPtr.next;
			if(firstPtr!=null&&firstPtr.next!=null)
			{
				firstPtr = firstPtr.next;
				secPntr = secPntr.next;
			}
			if(firstPtr==secPntr)
			{
				System.out.println("Loop in Linked list....");
				break;
			}
		}
		System.out.println("No loop in  linked list");
	}
	public void findNthFromLast(int n){
	    Node firstPntr = head, secPntr = head;
	    int i=0;
	    while(firstPntr!=null && i<=n-1)
	    {
	    	firstPntr = firstPntr.next;
	    	i++;
	    }
	    while(firstPntr!=null)
	    {
	    	firstPntr = firstPntr.next;
	    	secPntr = secPntr.next;
	    }
	    System.out.println("Data of the list from " + n + "th position from last is: " + secPntr.data);
	}
	
	public void removeDuplicates()
	{
		Node prevNode = null;
		Node currNode = null;
		Node iter = head;
		Node prev = null;
		while(iter!=null)
		{
			prevNode = iter;
			currNode = iter.next;
			prev = prevNode;
			while(currNode!=null)
			{  
				if(prevNode.data==currNode.data)
				{
					prev.next = currNode.next;
					//currNode = prevNode;
				}
				prev = currNode;
				currNode = currNode.next;
			}
			iter = iter.next;
		}
	}
	
	public void removeDuplicatesSorted()
	{
		Node curNode = head;
		Node nextNode = head.next;
		while(nextNode!=null)
		{
			if(curNode.data== nextNode.data)
			{
				curNode.next = nextNode.next;
				curNode = nextNode.next;
				nextNode = curNode.next;
			}
			else
			{
				curNode = curNode.next;
				nextNode = nextNode.next;
			}
		}
	}
	
	public void reverseLinkedListRecurSive()
	{
		head =reverseRecursive(head);
	}
	Node prevNode = null;
	public Node reverseRecursive(Node node)
	{
		if(node.next==null)
			return node;
		Node newHead =reverseRecursive(node.next);	
	//	System.out.println("newHead " + newHead.data);
		  Node p = node.next;
		  p.next = node;
		 node.next = null;
		
		return newHead;
		

	}
	
	public void reverseIteratively(){
		Node currNode = head;
		Node prevNode = null;
		Node nextNode = null;
		while(currNode!=null)
		{
			nextNode = currNode.next;
			currNode.next = prevNode;
			prevNode= currNode;
			currNode = nextNode;
		}
	
		head = prevNode;
	}

	public static void main(String[] args) {
		LinkedList llist = new LinkedList();
	
		Node new_node;
		new_node = llist.newNode(10);
		llist.sortedInsert(new_node);
		new_node = llist.newNode(2);
		llist.sortedInsert(new_node);
		Node new_node_l = llist.newNode(3);
		llist.sortedInsert(new_node_l);
		new_node = llist.newNode(4);
		llist.sortedInsert(new_node);
		new_node = llist.newNode(6);
		llist.sortedInsert(new_node);
		new_node = llist.newNode(1);
		llist.sortedInsert(new_node);
		new_node = llist.newNode(10);
		llist.sortedInsert(new_node);
		System.out.println("Created Linked List");
		llist.printList();
		System.out.println("Finding Midle of the linked list...");
		llist.middleOfList();
		
//		System.out.println("Reversing the linked list..");
//		llist.reverseLinkedList();
//		llist.printList();
		llist.findNthFromLast(6);
		llist.findLoop();
		llist.removeDuplicates();
		llist.printList();
		System.out.println("Reversed Linked list...");
		llist.reverseLinkedListRecurSive();
	//	llist.reverseIteratively();
		llist.printList();
	}

}
