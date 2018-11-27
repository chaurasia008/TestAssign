package AssignmentDay1_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Store data in an array list
		List<String> stringList = new ArrayList<String>();
		stringList.add( "Ram" );
		stringList.add( "Mohan" );
		stringList.add( "Shyam" );
		stringList.add("lakshman");
		stringList.add("Bharat");
		
		//Print stored array list
		System.out.println("String array reversed"+stringList);
		
		//next, reverse the list using Collections.reverse method
				Collections.reverse(stringList);
				
				System.out.println("String array reversed"+stringList);
				
				//print the reversed String array
	                //for(int i=0; i < stringArr.length; i++){
					//System.out.println(stringArr[i]);
				//}

	}

}
