package cache;

import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class LRU<K,V> {

    private HashMap<K, Node<K,V>> nodeMap;
    private final int capacity;
    private LRUList cacheList = new LRUList();
    private ReadWriteLock readWriteLock;
    private Lock readLock;
    private Lock writeLock;

    public LRU(int capacity) {
        this.capacity = capacity;
        nodeMap = new HashMap<>();
        readWriteLock = new ReentrantReadWriteLock();
        readLock = readWriteLock.readLock();
        writeLock = readWriteLock.writeLock();
    }

    public V get(K key) throws KeyNotFoundException {
        Node<K, V> node = null;
        readLock.lock();
        try {
            node = nodeMap.get(key);
            if (null == node)
                throw new KeyNotFoundException("Key not found in the cache");
            cacheList.moveFront(node);
        }finally {
            readLock.unlock();
        }
        return node.value;
    }

    public void put(K key, V value) {
        Node<K,V> node = null;
        writeLock.lock();
        try {
            node = nodeMap.get(key);

            if (cacheList.getCount() > capacity) {
                Node deletedNode = cacheList.removeLast();
                nodeMap.remove(deletedNode.key);
            }

            if (null == node) {
                node = new Node(key, value);
                nodeMap.put(key, node);
                cacheList.add(node);
            } else {
                node.value = value;
                cacheList.moveFront(node);
            }
        Integer.parseInt("s");
        } finally {
            writeLock.unlock();
        }
    }

}

