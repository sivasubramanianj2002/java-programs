class FindMin{
    public static int findMin(int[] nums) {
        int left = 0; int right = nums.length-1;
        int mid = -1;
        while(left<right)
        {
         mid = left+(right-left)/2;
            if(nums[mid]>nums[right])
            {
                left = mid+1;
            }else if(nums[mid]<nums[right])
            {
                right = mid;
            }
            System.out.println(mid);
        }
        return nums[left];
    }

    public static void main(String [] args)
    {
        int [] arr = {3,4,5,1,2};
        System.out.println(findMin(arr));
    }
}
// Input: nums = [4,5,6,7,0,1,2], target = 0
                  0 1 2 3 4 5 6
// Output: 4
// 3
// 7


