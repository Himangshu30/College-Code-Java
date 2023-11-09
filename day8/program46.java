//Wap in java which will take input from the command prompt and show that on screen.

public class program46{
     public static void main(String [] args)
     {
      if (args.length > 0) {
      System.out.println("You entered : " + String.join(" ", args));
     }else{
     System.out.println("Please provide input as command-line arguements.");
     }
   }
}

