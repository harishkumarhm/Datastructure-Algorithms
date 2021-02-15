package stack;

import java.util.Stack;

public class LargestStack {

	Stack<Integer> normStack = new Stack<Integer>();
	Stack<Integer> maxStack = new Stack<Integer>();
	public void push(int item) {
		normStack.push(item);
		
		if (maxStack.isEmpty() || item > maxStack.peek())
			maxStack.push(item);
	
	}
	
	public int pop()
	{
		int item  = normStack.pop();
		if (item==maxStack.peek())
			maxStack.pop();
		return item;
	   //return max_stack;
	}
	
	public int getMax()
	{
		return maxStack.peek();
	}

}
