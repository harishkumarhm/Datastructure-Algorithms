package linkedList;

public class ReverseSubList {

    public static Node reverseSubList(Node head, int start, int end)
    {
        if(start==end)
            return head;

        int k=0;
        Node dummyHead = new Node(0,head);
        Node subListHead = dummyHead;

        while(k++<start)
        {
            subListHead = subListHead.next;

        }

        Node current = subListHead;
        while(start++ < end)
        {
            Node next = current.next;
            current.next = next.next;
            next.next = current;
            current = next;
        }
return dummyHead;
    }

}
