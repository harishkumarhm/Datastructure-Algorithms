package cache;

public class CacheTest {

    public static void main(String[] args)
    {
        LRU<String,String> cache = new LRU<>(3);
        try
        {
            cache.put("A", "A");
            cache.put("B", "B");
            cache.put("C", "C");
            System.out.println(cache.get("A"));
            cache.put("D", "D");
            cache.get("B");
        }catch(KeyNotFoundException exception)
        {
            System.out.println(exception.getMessage());
        }
    }
}
