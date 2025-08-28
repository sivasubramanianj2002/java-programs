import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class RankSort {
    public static void main(String [] args)
    {
        int [] arr = {3,1,2,5};
        int [] rank = {1,1,2,2};

        System.out.println(Arrays.toString(rankSort(arr, rank)));
        
    }
    static int [] rankSort ( int [] arr, int [] ranks)
    {
        HashMap<Integer,Integer> map = new  HashMap<>();

        for(int i =0; i<arr.length; i++)
        {
            map.put(arr[i], ranks[i]);
        }

        PriorityQueue<Map.Entry<Integer,Integer>>pq = new PriorityQueue<>(
            (a,b) -> {
                if(a.getValue().equals(b.getValue()))
                {
                    return a.getKey() - b.getKey();
                }

                return a.getValue() - b.getValue();
            }
        );
        pq.addAll(map.entrySet());
        int [] ans = new int[arr.length];
        int index = 0;
        while(!pq.isEmpty())
        {
            Map.Entry<Integer,Integer> entry = pq.poll();
            int key = entry.getKey();
            ans[index++] = key;
        }
        return ans;
    }
}
