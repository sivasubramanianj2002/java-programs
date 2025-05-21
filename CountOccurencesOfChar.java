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

//Count occurences of odd index my method
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
    String s ="aabbccdc";
    
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
            if(index[i] > 0 && index[i] %2 !=0)
            {
                System.out.print((char)(i + 'a'));
            }
        }
       
    }
    

}
//with string builder
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
    String s ="aabbdccc";
    
    findCount(s);
}
    private static void findCount(String s)
    {
        int [] index = new int [26];
        StringBuilder seen = new  StringBuilder();
        char [] arr = s.toCharArray();
        
        for(int i =0; i<arr.length; i++)
        {
            char ch = arr[i];
            index [ch - 'a']++;
          
            if(seen.indexOf(String.valueOf(ch)) == -1)
            {
                seen.append(ch);
            }
        }
        
       for (int i = 0; i < seen.length(); i++) {
            char ch = seen.charAt(i);
              System.out.print(index);
            if (index[ch - 'a'] % 2 != 0) {
                // System.out.print(ch);
            }
        }
       
    }
    

}
