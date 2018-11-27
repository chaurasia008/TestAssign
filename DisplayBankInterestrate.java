package Interface_Assignment;

public class DisplayBankInterestrate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Display different rate of interest of banks
		BankInterface biC=new Citi();

		System.out.println("Citi Bank Rate of Interest : "+biC.rateOfInterest());
		
		BankInterface biH=new HDFC();
		
		System.out.println("HDFC Bank Rate of Interest : "+biH.rateOfInterest());
		
		BankInterface biI=new ICICI();
		
		System.out.println("ICICI Bank Rate of Interest : "+biI.rateOfInterest());
		
        BankInterface biK=new KotakBank();
		
		System.out.println("Kotak Bank Rate of Interest : "+biK.rateOfInterest());

	}

}
