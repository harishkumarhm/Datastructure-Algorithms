package algo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class FindNumCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,7,4,1,4,8,5,7,6,7};
		HashMap<Integer,Integer> map = new HashMap<>();
		int count=0;
		for(int i=0; i<arr.length; i++)
		{	
			count = (map.get(arr[i]))!=null?map.get(arr[i]):0;
			map.put(arr[i], ++count);
		}
		Iterator iter = map.entrySet().iterator();
		while(iter.hasNext())
		{    Entry e = (Entry) iter.next();
			System.out.println("Key: "+e.getKey()+" Value: "+e.getValue());
		}
	}

}
