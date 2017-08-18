/**
 * MainClass.java
 * version 1.1
 * Compiled on 16th Aug 2017  
 */
//package declaration
package session64;
/**
 * This class illustrate MainClass CLASS which will instantiate the object of BankAtm class.
 * 
 * @author chhaya yadav
 *
 */
//class declaration 
public class MainClass {
	
//Main method declaration	
	
	public static void main(String[] args){
	
//BankAtm class object ba1 instantiation to display User-defined exception
		
		BankAtm ba1 = new BankAtm(2007, "ICICI BANK" ,"ECITY",2000);
			
		ba1.deposit(1000);             //method called to perform bank deposit
		
		printBankDetails(ba1);           //method called to print bank details 
				
		InvokeException(ba1,10000);      //method called for money withdrawal
		
		System.out.println("CUSTOMER BALANCE AMOUNT : " +ba1.getBalance());
		
		
//BankAtm class object ba2 instantiation to display message when withdrawal amount is more than balance
		
		BankAtm ba2 = new BankAtm(3008, "AXIS BANK" ,"ECITY",3000);
		
		ba2.deposit(9000);                 //method called to perform bank deposit
		
		printBankDetails(ba2);             //method called to print bank details 
		
		InvokeException(ba2,50000);        //method called for money withdrawal
		
		System.out.println("CUSTOMER BALANCE AMOUNT : " +ba2.getBalance());
		
		
//BankAtm class object ba3 instantiation for processing when account balance is above 10K and 
//withdrawal limit is below account balance
		
		BankAtm ba3 = new BankAtm(4008, "SBI BANK" ,"ECITY",4000);
		
		ba3.deposit(9001);                        //method called to perform bank deposit
		
		printBankDetails(ba3);                    //method called to print bank details 
		
		InvokeException(ba3,2000);	              //method called for money withdrawal
			
		System.out.println("CUSTOMER BALANCE AMOUNT : " +ba3.getBalance());
		
		InvokeException(ba3,1000);	             //method called for money withdrawal
		
		System.out.println("CUSTOMER BALANCE AMOUNT : " +ba3.getBalance());
		
		InvokeException(ba3,2000);	             //method called for money withdrawal  
		
		System.out.println("CUSTOMER BALANCE AMOUNT : " +ba3.getBalance());
	}
	
//Method definition of invocation of user defined exception for each BankAtm object instantiated from main method	
	
public  static void InvokeException(BankAtm ba , int withdrawlAmt){

//declaration of try block		
		try
		{
		
		ba.withdraw(withdrawlAmt);
		
		}
//declaration of catch block for user defined exception BankATMException
		
		catch(BankATMException bae) {
			System.out.println("BankATMException has been invoked ");
		}
		
}
	
//display the details of member variables for each object of BankAtm class
	
public static void printBankDetails(BankAtm ba){
		
		System.out.println("________________________________________________");
		
		System.out.println("Customer BANK name : "+ ba.getBankName());
		
		System.out.println("Customer BANK location : " + ba.getLocation()) ;
		
		System.out.println("Customer Bank ATM Id : " + ba.getAtmId()) ;
		
	}

}

