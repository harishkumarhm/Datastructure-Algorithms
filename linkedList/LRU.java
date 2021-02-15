package linkedList;


import java.util.HashMap;

class LRUCache {

        HashMap<Integer, Node1> map = new HashMap<>();
        Integer capacity;
        DoublyLinkedList list;

        public LRUCache(int capacity) {
            this.capacity = capacity;
            list = new DoublyLinkedList(capacity);
        }

        public int get(int key) {
            if(map.containsKey(key))
            {
                Node1 node = map.get(key);
                list.updateNode(node); // we need to make it to the top of the list.

                return node.value;
            }else
            {
                return -1;
            }
        }

        public void put(int key, int value) {

            if(list.getSize()==capacity)
            {
                Node1 delNode = list.removeNode();
                map.remove(delNode.key);// Remove the last node
            }
            Node1 newNode = new Node1(key,value);
            map.put(key,newNode);


            list.insertNode(newNode);

        }



    }

    class DoublyLinkedList
    {

        Node1 front;
        Node1 rear;
        int capacity;
        int size;
        public DoublyLinkedList(int capacity)
        {
            this.capacity = capacity;
            this.size =0;

            front = new Node1(0,0);
                rear = new Node1(0,0);

        }

        public void insertNode(Node1 node)
        {
            if(size==0)
            {
                front = node;
                front.next = rear;

            } else
            {
                node.next = front;
                front.prev = node;
                front = node;
            }
            size++;
        }


        public Node1 removeNode()
        {
            Node1 delNode = rear;
            Node1 node = rear.prev;
            //node.next = null;
            rear = node;
            size--;
            return delNode;
        }


        public void updateNode(Node1 node)
        {
            Node1 prev = node.prev;
            Node1 next = node.next;
            prev.next = next;
            // next.prev = prev;

            node.next = front;
            front.prev = node;
            node.prev = null;

            front = node;

        }

        public int getSize()
        {
            return size;
        }

    }

    class Node1
    {
        Node1 prev;
        Node1 next;
        int value;
        int key;
        public Node1 (int key, int value)
        {
            this.value = value;
            this.key = key;
        }
    }

    class Solution
    {
        public static void main(String[] args)
        {

            LRUCache cache = new LRUCache(2);

            cache.put(1, 1);
            cache.put(2, 2);

            System.out.println(cache.get(1));

            cache.put(3, 3);    // evicts key 2
            System.out.println(cache.get(2));
/*cache.put(4, 4);    // evicts key 1
//cache.get(1);       // returns -1 (not found)
cache.get(3);       // returns 3
cache.get(4);       // returns 4 */



        }

    }


/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */

