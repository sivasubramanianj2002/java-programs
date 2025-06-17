import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class UnionArrays{
    public static void main (String [] args)
   {
    int [] arr1 = {2,4,5,6,7,9,13};
    int [] arr2 = {2,3,4,5,6,7,8,9,11,15};
       int[] result = unionArrays(arr1, arr2);
        System.out.println(Arrays.toString(result));

   }
   private static int [] unionArrays (int [] arr1, int [] arr2)
   {    
      Set<Integer> s = new HashSet<>();

     for(int num: arr1)
     {
        s.add(num);
     }

     for(int num:arr2)
     {
        s.add(num);
     }

     int [] ans = new int[s.size()];

     int count = 0;
     for(int n :s)
     {
        ans[count++] = n;
     }

     return ans;
   }
}
