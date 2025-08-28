import java.util.ArrayList;
import java.util.List;

public class ConsecutiveOnes {
    public static void main(String [] args)
    {
        int [] arr = {1,0,1,1,0,1,1,0,1,1,1,1};
        //output 1 0 1 1 0 0 1 1 0 0 1 1 0 1 1 0
        int k = 2;
       System.out.println(consecutiveOnes(arr,k));
    }

    public static List<Integer> consecutiveOnes(int [] arr, int k)
    {
        List<Integer>list = new ArrayList<>();
        int count = 0;
        for(int i = 0; i < arr.length; i++)
        {
            list.add(arr[i]);

            if(arr[i] == 1)
            {
                count++;

                if(count == k)
                {
                    list.add(0);
                    count = 0;
                }
            }else{
                count = 0;
            }
        }

        return list;
    }
}
