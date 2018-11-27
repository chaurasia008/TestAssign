package AssignmentDay1_2;

public class SumofNnumber_DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=15;
		int i=0;
		do {
			i=i+n;
			//System.out.println("i"+i);
			n--;
		}while(n>0);
		System.out.println("Sum of n numbers is "+i);

	}

}
