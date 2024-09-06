public class prelim {

   public static void main(String[] args) {
   int i=10;
   
      for (int n=0;n<=i;n++) {
      
       System.out.println("fibonacci("+ n + ")" + " -> "+ fibonacci(n));
      }             

    }


    public static int fibonacci (int n) {
        if (n == 0) 
            return 0;
             
        else if (n == 1) 
            return 1;
            
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);}
  }

}
