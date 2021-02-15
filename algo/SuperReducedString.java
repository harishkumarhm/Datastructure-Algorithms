package algo;

import java.util.Scanner;
import java.util.Stack;

public class SuperReducedString {
	 static String super_reduced_string1(String s){
	      StringBuilder temp = new StringBuilder(s);
	      int i=0, j=0;
	      while(i< s.length() )
	      {
	    	  if((j+1)< temp.length()&&(temp.charAt(j)==temp.charAt(j+1)) )
	    	  {
	    		  temp.delete(j, j+2);
	    		 
	    		  i = i+2;
	    		//  j=temp.length()-1;
	    	  }
	    	  else if(j> 0 && (temp.charAt(j)==temp.charAt(j-1)))
	    	  {
	    		  temp.delete(j-1, j+1);
	    		  i= i+2;
	    	  }
	    	  else
	    	  {
	    		  i++;
	    		  j++;
	    	  }
	      }
	      if(temp.toString().trim().isEmpty())
	      return "Empty String";
	      else
	    	  return temp.toString();
	    }
	 
	 static String super_reduced_string(String s){
		 Stack<Character> stack = new Stack<Character>();
		 StringBuilder returnStr = new StringBuilder();
		 char ch;
		 for(int i=0; i<s.length(); i++)
		 {
			 ch = s.charAt(i);
			 if(!stack.isEmpty()&& ch== stack.peek())
			 {
				stack.pop(); 
			 }
			 else
				 {
				 stack.push(ch);
				 }
			 
			 
		 }
		 if(stack.isEmpty())
			 return "Empty String";
		 else
		 {
			 for(char ch1 : stack)
				 returnStr.append(ch1);
			 return returnStr.toString();
		 }
	 }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String s = in.next();
	        
	       
	        String result = super_reduced_string1(s);
	        System.out.println(result);
	    }
}
