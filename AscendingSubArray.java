
class AscendingSubArray {
    public  static int maxAscendingSum(int[] nums) {
        int cur = nums[0];
        int result = nums[0];
        for(int i = 1; i<nums.length; i++)
        {
            
            if(nums[i]>nums[i-1])
            {
                cur = cur + nums[i];
               
            }else
            {
                cur = nums[i];
        
            }

            result = Math.max(cur,result);
        }

        return result;
    }

    public static void main(String [] args)
    {
        int [] arr = {10, 20, 30, 5, 10, 50};
        System.out.println(maxAscendingSum(arr));

    }
}