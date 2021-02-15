package HashMap;

import java.util.HashSet;

public class SumTriplets {

    public boolean findTriplets(int[] arr, int sum)
    {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length-2; i++)
        {
            set.add(i);
            int partialSum = sum - arr[i];
            for(int j= i+1; j<arr.length; j++)
            {
                if(set.contains(partialSum-arr[j]))
                {
                  //  System.out.printf("Triplet is %d, %d, %d", arr[i]), arr[j], partialSum-arr[j]);
                    return true;
                }
                set.add(arr[j]);

            }
        }
        return false;
    }
}
