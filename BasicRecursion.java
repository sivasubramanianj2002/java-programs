class Main {
    public static void main(String[] args) {
       int result = Factorial(5);
       System.out.print(result);
    }
    
    public static int Factorial(int num)
    {
        
        if(num ==0)
        {
            return 1;
        }
     return  num * Factorial(num-1);
    }
}

//Sum of numbers

class Main{
  public static void main(String [] args){
    int result = Sum(5);
    System.out.print("Sum is " + result);
  }

  public static int Sum(int num){
    if (num ==0)
    {
      return 0;
    }

    return num + Sum(num -1);
  }
}

class Main {
    public static void main(String[] args) {
        printNumbers(5);
    }

    public static void printNumbers(int n) {
        if (n == 0) {
            return; 
        }
        System.out.print(n + " ");
        printNumbers(n - 1);
   
    }
}

