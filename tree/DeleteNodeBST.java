package tree;

public class DeleteNodeBST {

    public static Node deleteNode(Node root, Node toDelete)
    {
        if(root== null)
            return root;
        if(toDelete.data <root.data)
            root.left = deleteNode(root.left, toDelete);
        else if(toDelete.data > root.data)
            root.right = deleteNode(root.right, toDelete);
        else
        {
            if(root.left==null)
                return root.right;
            if(root.right== null)
                return root.left;
            Node minNode = findMin(root.right);
            root.data = minNode.data;
            root.right = deleteNode(root.right, minNode);
            return root.right;
        }
        return root;
    }

    public static Node findMin(Node node)
    {
        while(node.left!=null)
        {
            node = findMin(node.left);
        }
        return node;
    }
}
