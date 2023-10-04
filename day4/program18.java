//Wap in java to show the use of labelled continue.

public class program18 {
        public static void main (String [] args)
     {
      first:
           for ( int i = 0; i<3; i++)
     {

      second:
           for ( int j = 0; j<3; j++)
     {

            if ( i==1 && j==1)
     {
		 
		continue first ;
                }
              System.out.println( i + " " +j);
             }
          }
       }
 }

	
