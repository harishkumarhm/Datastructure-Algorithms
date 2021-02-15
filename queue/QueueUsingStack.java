package queue;

import java.util.Stack;

public class QueueUsingStack {
	Stack<Integer> mainStack = new Stack<Integer>();
	Stack<Integer> auxStack = new Stack<Integer>();
	public QueueUsingStack() {

	}
	public void enqueue(int data)
	{
		mainStack.push(data);
	}
	
	public int dequeue()
	{
		if(auxStack.isEmpty())
		{
			while(!mainStack.isEmpty())
				auxStack.push(mainStack.pop());
		}
		return auxStack.pop();
	}
	
	public boolean isEmpty()
	{
		return mainStack.isEmpty() && auxStack.isEmpty();
	}
	
	public static void main(String[] args)
	{
		QueueUsingStack queue = new QueueUsingStack();
		for(int i=0; i<10; i++)
		queue.enqueue(i);
		while(!queue.isEmpty())
			System.out.println(queue.dequeue());
	}
}
