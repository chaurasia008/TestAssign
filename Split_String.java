package AssignmentDay1_2;

public class Split_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Congratulations, Your booking is 1232AB21R";
		
		String[] arr = str.split(" ");
		
		//find the length of string
		System.out.println("Array Length--"+arr.length);
		
		//loop to go alphanumeric string
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("-->"+arr[i]);
			
			if(arr[i].contains("1232AB21R"))
			{
				System.out.println("Alphanumeric string is---"+arr[i]);
			}
		}
		
	}

}
