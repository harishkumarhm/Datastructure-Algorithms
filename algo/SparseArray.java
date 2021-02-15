package algo;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class SparseArray {
	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        String[] strings = new String[n];
	        for(int i = 0; i< n; i++)
	            strings[i] = scanner.next();
	       int q = scanner.nextInt();
	        LinkedHashMap<String, Integer> queries = new LinkedHashMap<String, Integer>();
	        for(int i=0; i<q; i++)
	            queries.put(scanner.next(),0);
	        int count = 0;
	        for(int i=0; i< n; i++)
	            {  count = queries.get(strings[i])!=null?queries.get(strings[i]):0;
	               if(queries.get(strings[i])!=null)
	               queries.put(strings[i], ++count);
	        }
	        for(Entry<String, Integer> entry: queries.entrySet())
	            {
	            System.out.println(entry.getValue());
	        }
	       
	    }
}
