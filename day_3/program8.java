//wap a program  in java to create an integer  array and intiliaze and print  it

public class  program8 {

	public static void main (String[] args){

		//create an integer 
 		int[] numbers = {10,20,30,40,50};

		//print the value of the integer
		System.out.println("The  values of the array :");
  		
		for(int i=0; i<numbers.length; i++){
		  System.out.println("Elements at index " + i + ":" +numbers[i]);
		}
	}
} 
