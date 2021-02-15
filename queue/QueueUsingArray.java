package queue;

public class QueueUsingArray {
  int[] arr;
  int front;
  int rear;
  int capacity = 10;
  int size;
  public QueueUsingArray()
  {
	  arr = new int[capacity];
	  front=-1;
	  rear=-1;
	  size=0;
  }
  
  public boolean isFull()
  {
	  return size==(capacity-1);
  }
  
  public boolean isEmpty()
  {
	  return size==0;
  }
  
  public void enque(int val) throws Exception
  {
	  if(isFull())
		  throw new Exception("Que is over flowing..");
	  front = (front+1)%capacity;
	  arr[front] = val;
	  size++;
	  System.out.println("Enqued the value: "+ val);
	 
  }
  
  public int deque() throws Exception
  {
	  if(isEmpty())
		 throw new Exception("Que is Empty");
	  rear = (rear+1)%capacity;
	  System.out.println("Dequing the value: "+arr[rear] );
	  size--;
	  return arr[rear];
  }
}
