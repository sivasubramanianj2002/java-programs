
class Main {
    public static void main(String[] args) {
       char c = 'A';
       System.out.println(checkAlphabet(c));
    }   
    
    private static String checkAlphabet(char c)
    {
        int value = (int)c;
        if(value >=65 && value <= 90 || value >= 97 && value <= 122)
        {
            return "it is alphabet";
        }
        
        return "it is not an alphabet";
    }
}
