package cache;

public class Node<K,V> {
        K key;
        V value;
        Node next;
        Node prev;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }


    }
