package arrays;

import java.util.Arrays;

public class OddEven {

    public static void oddEven(int[] arr)
    {
        int a = 0;
        int b = arr.length-1;
        while(a<b)
        {
            if(arr[a] %2 == 0 && arr[b] %2 !=0)
            {
                swap(a, b, arr);
                a++; b--;
            }
            else if(arr[a] %2 != 0 )
                a++;
            else if(arr[b]%2==0)
               b--;


        }
    }

    static void swap(int a, int b, int[] arr)
    {
        int first  = arr[a];
        arr[a] = arr[b];
        arr[b] = first;
    }

    public static void main(String[] args) {
        int[] arr ={2, 1, 12, 6, 3, 7, 18, 8, 4, 9, 21, 10, 4};
         oddEven(arr);
        System.out.println(Arrays.toString(arr));
    }
}
