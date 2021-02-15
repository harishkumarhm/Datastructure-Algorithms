package tree;

import java.util.Calendar;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class BinaryTree {

	Node root;
	public BinaryTree(Node node) {
		this.root = node;
	}

	public void preOrderTraversal() {
		preOrderTraversal(root);
	}

	public void inOrderTraversal() {
		inOrderTraversal(root);
	}

	public void postOrderTraversal() {
		postOrderTraversal(root);
	}

	public void preOrderTraversal(Node node) {
		if (node == null)
			return;
		System.out.println(node.data + " ");
		preOrderTraversal(node.left);
		preOrderTraversal(node.right);
	}

	public void inOrderTraversal(Node node) {
		if (node == null)
			return;

		inOrderTraversal(node.left);
		System.out.println(node.data + " ");
		inOrderTraversal(node.right);
	}

	public void postOrderTraversal(Node node) {
		if (node == null)
			return;

		postOrderTraversal(node.left);
		postOrderTraversal(node.right);
		System.out.println(node.data + " ");

	}
	public int hieght() {
		return hieght(root);
	}

	public int hieght(Node node) {
		if (node == null)
			return 0;
		else {
			int lhieght = 1 + hieght(node.left);
			int rhieght = 1 + hieght(node.right);
			if (lhieght > rhieght)
				return lhieght;
			else
				return rhieght;
		}
	}

	public void printAtGivenLevel(int level) {
		printAtGivenLevel(root, level);
	}

	public void printAtGivenLevel(Node node, int level) {
		if (node == null)
			return;
		if (level == 1)

			System.out.println(node.data);

		else if (level > 1) {
			printAtGivenLevel(node.left, level - 1);
			printAtGivenLevel(node.right, level - 1);
		}
	}

	public void levelOrderTraversal() {
		int h = hieght();
		for (int i = 0; i <= h; i++)
			printAtGivenLevel(i);
	}

	public void levelOrderIteration() {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node tempNode = queue.poll();
			System.out.println(tempNode.data);
			if (tempNode.left != null)
				queue.add(tempNode.left);
			if (tempNode.right != null)
				queue.add(tempNode.right);
			
		}
	}

	public Node Insert(int value) {

		if (root == null)
			return createNewNode(value);
		Node current = root;
		Node parent = null;
		while (true) {

			if (value <= current.data) {
				parent = current;
				if (parent.left == null) {
					parent.left = createNewNode(value);
					break;
				}
				current = parent.left;
			} else {
				parent = current;
				if (parent.right == null) {
					parent.right = createNewNode(value);
					break;
				}
				current = parent.right;
			}
		}
		return root;

	}

	static Node createNewNode(int value) {
		Node newNode = new Node(value);
		return newNode;
	}
	
public  void reverseLevelOrder()
{
	Stack<Node> stack = new Stack<Node>();
	Queue<Node> que = new LinkedList<Node>();
		que.add(root);
	while(!que.isEmpty())
	{
		Node tempNode = que.poll();
		stack.push(tempNode);
		if(tempNode.left!=null)
			que.add(tempNode.left);
		if(tempNode.right!=null)
			que.add(tempNode.right);
		
	}
	//while(!stack.isEmpty())
//	{   Node tempNode = stack.pop();
////		System.out.println(tempNode.data);
//		char[] chr;
//		chr.l
//     }
	

}
  public boolean checkBST()
  {
	  return isBST3(root);
  }
	boolean isBST(Node node)
	{
	
	    if(node== null)
	        return true;
	    if((node.left!=null && node.data <= node.left.data ) || (node.right!=null && node.data >= node.right.data))
	       return false;
	    else
	       return (isBST(node.left) && isBST(node.right));
	
	}
	Node prev = null;
	boolean isBST2(Node node)
    {
          if(node==null)
        return true;
           if(!isBST2(node))
            return false;
          if(prev!=null && node.data<=prev.data)
              return false;
            prev = node;
          return isBST2(node.right); 
   /* if(node== null)
        return true;
    if((node.left!=null && node.data <= node.left.data ) || (node.right!=null && node.data >= node.right.data))
        return false;
    else
      return (isBST(node.left) && isBST(node.right));*/
    
   }
	
 public boolean isBST3(Node node)
 {
	 if(node==null)
		 return true;
	 isBST3(node.left);
	 if(prev!=null && (prev.data >=node.data))
	   return false;
	   prev = node;
	  return isBST3(node.right);
 }

 public boolean isBST4(Node node)
 {
	 if(node==null)
		 return true;
	 if(prev!=null && (prev.data >=node.data))
		   return false;
		   prev = node;
	 isBST4(node.left);
	
	  return isBST4(node.right);
 }

 public Node findLCA(Node root, Node p1, Node p2)
 {
 	if(root == null)
 		return null;
 	if(root.data==p1.data|| root.data== p2.data)
	{
		System.out.println("Returning the searched node..." + "root :" +root.data);
		return root;
	}
 	Node lNode = findLCA(root.left, p1, p2);
	 System.out.println("left tree scan completed " + "root :" +root.data);
 	Node rNode = findLCA(root.right, p1, p2);
	 System.out.println("right tree scan completed: " + "root :" + root.data);

 	if(lNode!=null && rNode!=null) {
		System.out.println("both lanode and rnode found...lnode: " + lNode + " right node: "+ rNode + " root: " +root.data);
		return root;
	}
	 System.out.println("returning any one of the lnode / rnode , lnode: " + lNode + " right node: "+ rNode + " root :" + root.data);
 	if(lNode!=null) System.out.println("lNode " + lNode.data);
	 if(rNode!=null) System.out.println("rNode " + rNode.data);

	 return lNode!=null?lNode: rNode;
 }

 public void printAllPath(Node root, int[] paths, int n)
 {
 	if(root==null)
	 	return;
 	paths[n] = root.data;
 	n++;
 	if(root.left== null && root.right== null)
 		printPath(paths, n);
    else
	 {
		 printAllPath(root.left,paths, n);
		 printAllPath(root.right, paths, n);
	 }

 }

 public void printPath(int[] paths, int n)
 {
 	for(int i=0; i<n; i++)
	{
		System.out.print(paths[i]);
	}
	 System.out.println("");
 }

}