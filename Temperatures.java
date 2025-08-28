 class Temperatures {
        public static int[] dailyTemperatures(int[] temperatures) {
            int [] ans = new int [temperatures.length];
            int day = 1;
            for(int i = 1; i<temperatures.length; i++)
            {
                if(temperatures[i] > temperatures[i-1])
                {
                    ans[i]=1;
                }else
                {
                    int val = temperatures[i-1];
                    for(int j = i+1; i<temperatures.length;i++)
                    {
                        if(val>temperatures[i])
                        {
                            ans[i]= day;
                        }
                        day++;
                    }
                    
                }
            }
            return ans;
        }

        public static void main(String[] args)
        {   
            int [] arr = {73,74,75,71,69,72,76,73};
            int[] result = dailyTemperatures(arr);

            for (int r : result) {
                System.out.print(r + " ");
            }
        }
      
}
