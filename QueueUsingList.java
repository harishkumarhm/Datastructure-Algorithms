package algo.Queue;

public class QueueUsingList {
	public class Node {
		Node next;
		int data;
		public Node(int data) {
			this.data = data;
		}
	}
	Node head;
	Node rear;
	int size;
	public QueueUsingList() {
		head = null;
		size = 0;
	}
	public boolean isEmpty() {
		return size == 0;
	}
	public void enque(int val) {

		Node new_node = new Node(val);
		new_node.next = head;
		head = new_node;
		size++;
		System.out.println("Enqueing value : " + val);

	}
	public int size() {
		return size;
	}
	public int deque() throws Exception {
		if (isEmpty())
			throw new Exception("Que is empty");
		Node new_node = head;
		head = new_node.next;
		size--;
		System.out.println("Dequeing value: " + new_node.data);
		return new_node.data;

	}
}
