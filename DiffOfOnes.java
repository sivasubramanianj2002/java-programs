public class DiffOfOnes {
    public static void main(String[] args) {
        int [] arr  = {0,1,1,0,0,1,0,1,1,1,1,1,0};
       System.out.println(diffOfOne(arr));
    }

    public static int diffOfOne(int [] arr)
    {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int currentCount = 0;
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i]==1)
            {
                currentCount = currentCount + 1;
            }else{
                if(currentCount > 0)
                {
                    min = Math.min(min, currentCount);
                    max = Math.max(max, currentCount);
                }
              currentCount = 0;
            }

            if(currentCount > 0)
            {
                min = Math.min(min, currentCount);
                max = Math.max(max, currentCount);
            }
        }

        return max - min;
    }
}
