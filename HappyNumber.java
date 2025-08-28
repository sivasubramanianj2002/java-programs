import java.util.HashSet;

class HappyNumber {
    public boolean isHappy(int n) {
        HashSet<Integer> nums = new HashSet<Integer>();
        while(!nums.contains(n))
        {
            nums.add(n);
            n= getNextNum(n);
            if(n == 1)
            {
                return true;
            }
        }

        return false;
    }

    private int getNextNum(int n)
    {
        int output = 0;
        while(n > 0)
        {
            int digit = n % 10 ;
            output = output + digit * digit ;
            n = n / 10;
        }

        return output;
    }
}