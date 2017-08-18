/**
 * BankAtm.java
 * version 1.1
 * Compiled on 16th Aug 2017  
 */
//package declaration
package session64;
/**
 * This class illustrate BankAtm class with ATM AND BANK details and declare methods to withdraw and deposit money
 * thus, it updates the account balance.
 * If account balance is lesser than 10k , then it throws BANKAtmException ,which is a user defined exception at runtime.
 * It checks the withdrawal amount also as per the account balance.
 * 
 * @author chhaya yadav
 *
 */
//class declaration
public class BankAtm {
	
//instance variable declaration with private access specifier
	
	private int    atmId;
	private String bankName;
	private String location; 
	private double balance ;

//Parameterized constructor details for initialization of all instance variables during object instantiation
public BankAtm(int atmId , String bankName , String location, double balance ){
	    	
	    	this.atmId = atmId ;
	    	
	    	this.bankName = bankName ;
	    	
	    	this.location = location ;
	    	
	    	this.balance = balance ;
	    	
}
	    
//Parameterized Constructor declaration
	    
public BankAtm(int atmId , String bankName , String location){
	    	
	    	this.atmId = atmId ;
	    	
	    	this.bankName = bankName ;
	    	
	    	this.location = location ;
	   	    	
}
	    
	    
//Method declaration for money withdrawal which throws USER-DEFINED Exception 
	    
public void withdraw(double amt) throws BankATMException {
			
//BankATMException exception is thrown if account balance is lesser than 10000	
			
			    if(balance < 10000){
				
			
			        throw new BankATMException(balance);
			        
			    }
				
//if account balance is more than 10000		then check whether user can withdraw the amount or not which is passed as an argument to this method
			    
				else
					
				{
					
//if withdrawal amount is lesser than the balance then deduct the amount from balance and display 
					
					if (amt < balance ){
						
						System.out.println(amt +" is valid amount to withdraw ,please proceed with withdrawl !");
					
						balance = balance - amt ;
						
						System.out.println("Withdrawl succeeded ! Balance has been updated ");
					}

//if withdrawal amount is more than balance then display the error message 					
					else{
						
						System.out.println("Invalid Amount "+amt+" entered for withdrawl which is lesser than the balance "+ balance + "  !");
						
					}
					
						
				
				}
}
		
//method declaration for money deposit if amount is greater than zero
		
public void deposit(double amt){
	
	
//if amount is more than zero then update the balance 
	
		if (amt > 0) {
			
			balance = balance + amt ;
			}
}
		


//get method to retrieve the ATMID details
public int getAtmId() {
			return atmId;
		}

//set method to set the value of ATMid
public void setAtmId(int atmId) {
			this.atmId = atmId;
		}
//get method to retrieve the BANK NAME
public String getBankName() {
			return bankName;
		}
//set method to set the value of bank name
public void setBankName(String bankName) {
			this.bankName = bankName;
		}
//get method to retrieve the BANK location 
public String getLocation() {
			return location;
		}
//set method to set the value of bank location
public void setLocation(String location) {
			this.location = location;
		}
//get method to retrieve the Balance
public double getBalance() {
			return balance;
		}
//set method to set the value of balance
public void setBalance(double balance) {
			this.balance = balance;
		}

}
