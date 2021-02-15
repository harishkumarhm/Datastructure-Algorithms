package stack;

import java.util.Stack;

public class SortStack {

    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(4); stack.push(1); stack.push(8);stack.push(14);stack.push(3);stack.push(21);

        Stack<Integer> tempStack = new Stack<Integer>();

        while(!stack.isEmpty())
        {
            Integer item = stack.pop();
            while(!tempStack.isEmpty()&&tempStack.peek() > item)
            {
                stack.push(tempStack.pop());
            }
            tempStack.push(item);
        }
       while(!tempStack.isEmpty())
           System.out.println(tempStack.pop());
    }
}

