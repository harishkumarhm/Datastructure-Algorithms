package tree;

public class MaxWidthOfTree {
	class Node
	{
	    int data;
	    Node left, right;

	    Node(int item)
	    {
	        data = item;
	        left = right = null;
	    }
	} 
	    
	    int count =0;
	    int getMaxWidth(Node root)
	    {
	        if(root==null)
	          return 0;
	        // Your code here
	        int maxWidth = 0;
	        int h = hieght(root);
	         
	        for(int i=1; i<=h; i++)
	        {
	           count =0;
	           int w = width(root,i);
	           if( w > maxWidth)
	        	   maxWidth = w;
	           
	        }
	        return maxWidth;
	    }
	    
	    public int hieght(Node node)
	    {
	        if(node==null)
	          return 0;
	        int lhieght = 1+hieght(node.left);
	        int rhieght = 1+hieght(node.right);
	        if(lhieght>rhieght)
	          return lhieght;
	         else
	         	return rhieght;
	    }
	    
	    public int width(Node node, int h)
	    { 
	        if(node== null)
	          return 0;
	        if(h==1)
	        {
	          count++;
	        }
	        if(h>1)
	        {
	        	width(node.left, h-1);
	        	width(node.right,h-1);
	        }
	        return count;
	    }
	}


