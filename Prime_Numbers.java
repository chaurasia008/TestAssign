package AssignmentDay1_2;


public class Prime_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  //initialize variables
		int i =0;
	       int n =0;
	       //for prime number
	       String  primeNumbers = "";
	       
//loop for numbers from 1 to 100
	       for (i = 1; i <= 100; i++)         
	       { 		  	  
	          int j=0; 	
	          //loop to check prime number
	          for(n =i; n>=1; n--)
		         {
	             if(i%n==0)
		            {
	 		          j = j + 1;
		             }
		          }
	          
		  if (j ==2)
		     {
		     //Appended the Prime number to the String
		     primeNumbers = primeNumbers + i + " ";
		      }	
	       }
	       
	       System.out.println("Prime numbers from 1 to 100 are :");
	       System.out.println(primeNumbers);

	}

}
