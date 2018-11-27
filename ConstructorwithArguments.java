package AssignmentDay1_2;

public class ConstructorwithArguments {
	
	
	private static ConstructorwithArguments obj;
	int i=5;
	int x=6;
	String str="Santosh";
	String strt="Kumar";
	

	public ConstructorwithArguments(int z, int y, String str1, String str2) 
	{
		// TODO Auto-generated constructor stub
		
		this.i=z;
		this.x=y;
		this.str=str1;
		this.strt=str2;
		
	}
	void add1()
	{
		
		int a=i+x;
		
		System.out.println(""+str +""+a);
	}
	void concatenate() {
		System.out.println(""+str +""+strt);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorwithArguments.obj = new ConstructorwithArguments(0,0,"Santosh ","Kumar");
		obj.concatenate();
	
		ConstructorwithArguments.obj = new ConstructorwithArguments(10,15,"Addition is: ","");
		obj.add1();
		

	}

}