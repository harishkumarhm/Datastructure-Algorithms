package HashMap;

import java.util.HashMap;
import java.util.HashSet;

public class PairSum {

    int numberOfWays(int[] arr, int k) {
        // Write your code here
        HashMap<Integer, Integer> numberMap = new HashMap<>();
        int count =0;
        for(int i=0; i<arr.length; i++)
        {
            if(!numberMap.containsKey(arr[i]))
                numberMap.put(arr[i], 1);
            numberMap.put(arr[i],numberMap.get(arr[i])+1);
        }

        for(int i=0; i<arr.length; i++)
        {
            if(numberMap.containsKey(k-arr[i]))
            {
                count = count + numberMap.get(arr[i]);
            }
            if(k-arr[i] == arr[i])
                count--;                    // if k = arr[i] /2 .. that means we are counting ar[i] two times.
        }
        return count /2; // since the count is done two times.
    }

}
