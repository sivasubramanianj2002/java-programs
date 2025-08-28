class FindTarget{
    public static int findMin(int[] nums, int target) {
        int left = 0; int right = nums.length-1;
        int mid = -1;
        while(left<right)
        {
         mid = left+(right-left)/2;
            if(nums[mid] == target)
            {
                return mid;
            }
            if(nums[mid] < target)
            {
                right = mid;
            }else 
            {
                left = mid+1;
            }
        }
        return nums[left];
    }

    public static void main(String [] args)
    {
        int [] arr = {6,7,1,2,3,4,5};
        System.out.println(findMin(arr,4));
    }
}

