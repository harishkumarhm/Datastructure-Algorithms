package cache;

public class LRUList<K,V> {
    private Node<Integer,Integer> head;
    private Node<Integer,Integer> tail;
    private int count;
    public LRUList()
    {
        head = new Node(0,0);
        tail = new Node(0,0);
        head.next = tail;
        tail.prev = head;
        count=0;
    }

    public void moveFront(Node node)
    {
        remove(node);
        add(node);

    }

    public void add(Node node)
    {
        Node after = head.next;
        head.next = node;
        node.prev = head;
        node.next = after;
        after.prev = node;
        count++;
    }

    public void remove(Node node)
    {
        Node before = node.prev; Node after = node.next;
        before.next = after;
        after.prev = before;
    }

    public Node removeLast()
    {
        Node del = tail.prev;
        remove(del);
        count--;
        return del;
    }

    public int getCount()
    {
        return count;
    }
}
