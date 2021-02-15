package heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianStream {

    public static void findMedianStream(int[] arr)
    {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        double runningAverage = arr[0];

        //1. If the number is less than the running average and the max heap is more than the min heap.
        //   remove from max heap and insert into the minheap and insert new element in the maxheap. else insert into the max heap. Calculate the median by taking average of both top elements of min and max heap;
        //2. If both the heaps are equal and the number is less than the running average, insert into the max heap and the  top element of max heap is the median else insert into the min heap and top element of the min heap is the average
        //3. else, if minheap is more than the max heap and number i s greater than running average , remove from the min heap and insert into the max heap and insert the new number in the min heap
        // else insert into the max heap.Calculate the median by taking average of both top elements of min and max heap
        maxHeap.add(arr[0]);
        System.out.println("Runnig Median: " + runningAverage);
        for(int i=1; i<arr.length; i++)
        {


            if(minHeap.size() == maxHeap.size())
            {
                if(arr[i] < runningAverage)
                {
                   maxHeap.add(arr[i]) ;
                   runningAverage = maxHeap.peek();
                }else
                {
                    minHeap.add(arr[i]);
                    runningAverage = minHeap.peek();
                }
            }
            if( maxHeap.size() >  minHeap.size())
            {
                if(arr[i] < runningAverage) {
                    minHeap.add(maxHeap.remove());
                    maxHeap.add(arr[i]);
                }else
                {
                    minHeap.add(arr[i]);
                }
                runningAverage = (double)(minHeap.peek() +maxHeap.peek()) /2;
            }else {
                if(arr[i] > runningAverage) {
                    maxHeap.add(minHeap.remove());
                    minHeap.add(arr[i]);
                }else
                {
                    maxHeap.add(arr[i]);
                }
                runningAverage = (double)(minHeap.peek() +maxHeap.peek()) /2;
            }
            System.out.println("Runnig Median: " + runningAverage);
        }

    }

    public static void main(String[] args)
    {
        int[] arr = new int[]{5, 15, 10, 20, 3};
        findMedianStream(arr);

    }
}
