public class program27 {

     static int numberOfInstances = 0;

     public program27(){
    
     numberOfInstances++;
     }

public static void main(String[] args) {
     program27 obj1 = new program27();
     program27 obj2 = new program27();
     program27 obj3 = new program27();


     System.out.println("Number of instances created : " + program27.numberOfInstances);
   }
}
