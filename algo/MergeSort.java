package algo;

import java.util.Arrays;

public class MergeSort {

    private static int[] unSortedArray = {3, 4, 1, 2, 6,7,3,10,56,12,87,17, 99, 62, 9, 44, 0, 38,8};
   private static int[] temp = new int[unSortedArray.length];

  public static void sort(int low, int high)
  {
      if(low>=high)
          return;
      int midle = (low+high) / 2;
      sort(low, midle);
      sort(midle+1, high);
      merge(low,midle, high);
  }

  public static void merge(int low , int midle, int high)
  {
      for(int c=0; c<=high; c++)
          temp[c] = unSortedArray[c];
      int i = low;
      int j = midle+1;
      int k = low;

      while(i<=midle && j<=high)
      {
          if(temp[i] <= temp[j])
          {
              unSortedArray[k] = temp[i];
              i++;
          }
          else{

              unSortedArray[k] = temp[j];
              j++;
          }
          k++;
      }

      while(i<=midle)
      {
          unSortedArray[k] = temp[i];
          i++;
          k++;
      }

      while(j<=high)
      {
          unSortedArray[k] = temp[j];
          j++;
          k++;
      }

  }
    public static void main(String[] args)
    {
        sort(0, unSortedArray.length-1);
        System.out.println(Arrays.toString(unSortedArray));
    }
}
