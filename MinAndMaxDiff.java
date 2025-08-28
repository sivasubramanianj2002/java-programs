// User function Template for Java

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class MinAndMaxDiff {
    public static void main(String[] args) {
        int [] arr = {1, 2, 2};
        System.out.println(findDiff(arr));
    }
    // Function to find the difference between the maximum and minimum frequency of
    // elements.
    public static int findDiff(int[] arr) {
        
        Map<Integer,Integer>map = new HashMap<>();
        
        for(int num : arr)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        PriorityQueue<Map.Entry<Integer,Integer>> low = new PriorityQueue<>(
            (a,b) -> {
                if(a.getValue().equals(b.getValue()))
                {
                    return a.getKey() - b.getKey();
                }
                else 
                {
                    return a.getValue() - b.getValue();
                }
            }
        );

        PriorityQueue<Map.Entry<Integer,Integer>> high = new PriorityQueue<>(
            (a,b) -> {
                if(b.getValue().equals(a.getValue()))
                {
                    return b.getKey() - a.getKey();
                }
                else
                {
                    return b.getValue() - a.getValue();
                }
            }
        );


            
         
         low.addAll(map.entrySet());
         high.addAll(map.entrySet());
          Map.Entry<Integer,Integer>entry = low.poll();
          int one = entry.getKey();
          
           Map.Entry<Integer,Integer>entry2 = high.poll();
          int second = entry2.getKey();
          
            return   second - one;
            
    }
}