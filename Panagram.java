import java.util.Scanner;

class Panagram {
    public static void main(String [] args)
    {
        System.out.println("enter any value");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Panagram pg  = new Panagram();
        System.out.println(pg.isPanagram(s));

    }

    public  boolean isPanagram(String s)
    {
        int [] arr = new int [26];
        char [] words = s.toCharArray();
        for(char word:words)
        {
            arr[word - 'a']++;
        }

        for(int arrs:arr)
        {
            if(arrs<1)
            {
                return false;
            }
        }

        return true;
    }
}
