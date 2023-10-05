public class program37 {

    public static void main(String[] args)
{
 
  try {
       int a=4, b=0;
       int c=a/b;

        System.out.println("Result:" + c);
      }

   catch(ArithmeticException e) {
        
        System.out.println("can't divided by zero");
      }
}
}  
