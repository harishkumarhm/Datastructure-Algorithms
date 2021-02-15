package cache;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class LRUCache<k,v> {
 private final int CAPACITY;
 private final Map<k,v> cache;
 private final ReadWriteLock readWriteLock;
 private final Lock readLock;
 private final Lock writeLock;
   public LRUCache(int capacity)
   {
       this.CAPACITY = capacity;

       cache = Collections.synchronizedMap(new LinkedHashMap<k,v>(CAPACITY, 0.75f, true){

           @Override
           protected boolean removeEldestEntry(Map.Entry<k,v> eldestEntry)
           {
               return size() > CAPACITY;
           }
       });
       this.readWriteLock = new ReentrantReadWriteLock();
       this.readLock = readWriteLock.readLock();
       this.writeLock = readWriteLock.writeLock();
   }

    public v get(Object key) {
       readLock.lock();
        try{
            return cache.get(key);
        }finally
        {
            readLock.unlock();
        }
    }

    public v put(k key, v value) {
       writeLock.lock();
       try {
           return cache.put(key, value);
       }finally {
           writeLock.unlock();
       }
    }
}
