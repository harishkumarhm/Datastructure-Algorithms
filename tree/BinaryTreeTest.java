package tree;


public class BinaryTreeTest {
public static void main(String[] args)
{
	BinaryTree tree = new BinaryTree(new Node(2));
	tree.root.left =new Node(1);												//				2
	tree.root.right =new Node(4);												//			1			4
	tree.root.right.left = new Node(3);										//					3		5
	tree.root.right.right= new Node(5);										//						  6		7
	tree.root.right.right.left = new Node(6);
	tree.root.right.right.right = new Node(7);
	boolean var = tree.checkBST();
	System.out.println(var);
//	System.out.println("In order Traversal...");
//	tree.inOrderTraversal();
//	System.out.println("Tree Hieght = " + tree.hieght());
//	System.out.println("Pinting tree at level 2");
//	tree.printAtGivenLevel(2);
//	System.out.println("Tree Level order traversal using iteration...");
//	tree.levelOrderIteration();
//	System.out.println("Tree Level order reverse traversal using iteration...");
//	tree.reverseLevelOrder();
//	boolean var1 = tree.isBST4(tree.root);
//	System.out.println(var1);

	Node node = tree.findLCA(tree.root, new Node(6), new Node(7));
	System.out.println("LCA: "+ node.data);
//
//	TreeView view = new TreeView();
//	System.out.println("---Top View ---");
//	view.printTopView(tree.root);
//
//	System.out.println("---Bottom View---");
//	view.printBottomView(tree.root);
//
//	System.out.println("----Print all paths------");
//	tree.printAllPath(tree.root, new int[100], 0);
}


}
