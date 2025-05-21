// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
    String s ="java";
    
    findCount(s);
}
    private static void findCount(String s)
    {
        int [] index = new int [26];
        
        char [] arr = s.toCharArray();
        
        for(int i =0; i<arr.length; i++)
        {
            char ch = arr[i];
            index [ch - 'a']++;
        }
        
        for(int i =0; i<26; i++)
        {
            if(index[i] > 0)
            {
                System.out.print((char)(i + 'a') + ":" + index[i]);
            }
        }
       
    }
    

}
