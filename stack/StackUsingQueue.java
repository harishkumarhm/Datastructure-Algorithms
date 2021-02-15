package stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
	Queue<Integer> queue;
	int size;
	public StackUsingQueue()
	{
		size=0;
		queue = new LinkedList <Integer>();
	}
	
    public void push(int data)
    {
    	int oSize = queue.size();
    	queue.add(data);
    	for(int i=0; i<oSize; i++)
    	{
    		int x = queue.remove();
    		queue.add(x);
    	}
    	size++;
    }
    
    public int size()
    {
    	return size;
    }
    
    public int pop() throws Exception
    {
    	if(queue.isEmpty())
    		throw new Exception ("Stack is empty.");
    	return queue.poll();
    	
    }
    public boolean isEmpty()
    {
    	return (size==0);
    }
}
