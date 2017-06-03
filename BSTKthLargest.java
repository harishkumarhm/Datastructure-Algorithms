public class BSTKthLargest {
	class Node {
		int data;
		Node left, right;

		Node(int d) {
			data = d;
			left = null;
			right = null;
		}
	}

	int c = 0;

	public void kthLargest(Node root, int k) {
		if (root == null || k <= 0)
			return;
		c = k;
		findLargest(root);

	}

	public void findLargest(Node node) {
		if (node == null || c <= 0) {
			return;
		}

		findLargest(node.right);
		c--;
		if (c == 0) {
			System.out.println(node.data);
			return;
		}
		findLargest(node.left);

		// return node;

	}
}
