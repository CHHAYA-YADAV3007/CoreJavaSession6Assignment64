/**
 * BankATMException.java
 * version 1.1
 * Compiled on 16th Aug 2017  
 */
//package declaration
package session64;
/**
 * This class illustrate BankAtmException CLASS which is a subclass of Parent Class Exception.
 * @author chhaya yadav
 *
 */
//class declaration 
public class BankATMException extends Exception{

//instance variable declaration
	
	double bal ;
	
//parameterized constructor declaration
	
public BankATMException(double balance)
	{
		bal = balance  ;
		
//display message to show that account balance is lesser than 10000.
		
	    System.out.println("Funds below 10000 INR , Withdrawl not allowed " + bal);
	}

}
