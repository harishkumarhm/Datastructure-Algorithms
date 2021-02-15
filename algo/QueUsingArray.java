package algo;

public class QueUsingArray {

	int[] arr;
	int size, front, rear;
	public QueUsingArray(int size) {
		this.size = size;
		arr = new int[size];
		front = rear = -1;
	}

	public void enque(int val) throws Exception {
		if(isFull())
			throw new Exception("Que is full..");
		arr[++rear] = val;
		System.out.println("Enqueing the value: " + val);
		//System.out.println("Value of Rear: " + rear);
	}
	
	public boolean isEmpty()
	{
		return (front==-1 && rear==-1);
	}
	
	public boolean isFull()
	{
		return rear+1==size;
	}
	
	public int deque() throws Exception
	{
		if(isEmpty())
			throw new Exception("Que is Empty.");
		int val = arr[++front];
		
		System.out.println("dequeing the value: " + val);
		return val;
		
	}
}
