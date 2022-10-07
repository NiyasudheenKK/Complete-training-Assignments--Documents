package com.atmlib;

import java.util.ArrayList;
import java.util.Scanner;

import com.atm.Atm;

public class AtmLib {
	
	static ArrayList<Atm> customerArray = new ArrayList<Atm>();
	//To add a customer
	public static void addCustomer(){
		
		char choice = 'n';
		

	   do {
	        Scanner objScanner = new Scanner(System.in);
	        Atm customer = new Atm();
	
	
	       System.out.println("Enter the customer name: ");
	       customer.setCustomerName(objScanner.nextLine());
	
	
	       System.out.println("Enter the customer account type: \n1. Savings\n2. Current");
	        switch (Integer.parseInt(objScanner.next())) {
	        case 1:
	            customer.setAccountType("Savings");
	            break;
	        case 2:
	            customer.setAccountType("Fixed");
	            break;
	        default:
	            System.out.println("Invalid entry! please try again");
	        }
	        
	       
	       //customer mobile number
	       System.out.println("Enter the customer mobile number: ");
	       customer.setMobNumber(objScanner.nextLong());
	
	       //taking email
	       System.out.println("Enter the customer email id: ");
	       customer.setEmailId(objScanner.next());
	
	       //Atm pin generator
	       customer.setAccountNumber(Atm.generateAccountNumber());
	       customer.setAtmPin(Atm.generateAtmPin());
	
	       //Taking the balance input
	       System.out.println("Account is created with a minimum balance of 1000.00 ");
	       customer.setBalance(1000);
	
	       customerArray.add(customer);
	        System.out.println("Your account has been added successfully\n");
	       System.out.println(customer);
	       
	       
	        System.out.println("Do you want to add another record..? y or n");
	        choice = objScanner.next().charAt(0);
	    } while (choice == 'y' || choice == 'Y');
	}
	
	
	//To Update customer details
	public static void updateCustomer(){
		
		//Initializing scanner
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the 9 digit account number");
		long accountNo = input.nextLong();
		
		for (Atm customer : customerArray) {
			if (customer.getAccountNumber()==accountNo) {
				
            Scanner scanner = new Scanner(System.in);
	        int option ;
	        System.out.println("Enter the field to update: \n1.Mobile Number\n2.Email Id");
	        switch(Integer.parseInt(scanner.next())){
	        case 1:
	        	System.out.println("Enter the mobile number: ");
	            customer.setMobNumber(Integer.parseInt(scanner.next()));
	            break;
	        case 2:
	        	System.out.println("Enter the email id: ");
	            customer.setEmailId(scanner.next());
	            break;
	       
	        default:
	            System.out.println("Invalid input!!");
	            break;
	        	}
         }
      }
	}
	
	
	//To delete a customer
	public static void deleteCustomer(){
		
		//Initializing scanner
				Scanner input = new Scanner(System.in);
				
				//Taking the account number as input
				System.out.println("Enter the 9 digit account number");
				long accountNo = input.nextLong();
				
				//scanning for the given account number in the customrArray
				for (Atm customer : customerArray) {
					if (customer.getAccountNumber()==accountNo) {
						
						customer.setAccountNumber(0);
						customer.setAtmPin(0);
			            customer.setAccountType(null);
			            customer.setCustomerName(null);
			            customer.setBalance(input.nextDouble());
			            customer.setEmailId(null);
			            customer.setMinimumBalance(0.00);
			            customer.setMobNumber(0000000000);
			            System.out.println("The customer details are deleted");
		            
					}
					else if(customer.getAccountNumber()!=accountNo) {
						System.out.println("This bank account doesn't exit");
					}
		      }
	}
	
	
	//To deposit money 
	public static void depositMoney(){
		
		//Initializing scanner
		Scanner input = new Scanner(System.in);
		
		//Taking the account number as input
		System.out.println("Enter the 9 digit account number");
		long accountNo = input.nextLong();
		
		//scanning for the given account number in the customrArray
		for (Atm customer : customerArray) {
			if (customer.getAccountNumber()==accountNo) {
				
				System.out.println("Enter the amount to be deposited");
				double amountDeposited = input.nextDouble();
				
				if(amountDeposited > 50000) {
					System.out.println("Enter your pan card number");
					long panNumber = input.nextLong();
					customer.setBalance(customer.getBalance()+amountDeposited);
					System.out.println("The new Balance of the account number"+ accountNo+" is "+customer.getBalance());
				}
				
				else if (amountDeposited >0 && amountDeposited<50000 ) {
					customer.setBalance(customer.getBalance()+amountDeposited);
				} 
			}
      }
	}
	
	
	//To withdraw money
	public static void withdrawMoney(){
		
		//Initializing scanner
		Scanner input = new Scanner(System.in);
		
		//Taking the account number as input
		System.out.println("Enter the 9 digit account number");
		long accountNo = input.nextLong();
		
		//scanning for the given account number in the customrArray
		for (Atm customer : customerArray) {
			if (customer.getAccountNumber()==accountNo) {
				
				System.out.println("Enter the amount to withdraw");
				double amountToWithdraw = input.nextDouble();
				
				if(amountToWithdraw > 50000) {
					System.out.println("Enter your pan card number");
					long panNumber = input.nextLong();
					customer.setBalance(customer.getBalance()-amountToWithdraw);
					System.out.println("The new Balance of the account number"+ accountNo+" is "+customer.getBalance());
				}
				
				else if (amountToWithdraw >0 && amountToWithdraw<50000 ) {
					customer.setBalance(customer.getBalance()-amountToWithdraw);
					System.out.println("The new Balance of the account number"+ accountNo+" is "+customer.getBalance());
				}
			}
		}
	}
	
	
	//To show balance of a customer
	public static void showbalance() {
		
		//Initializing scanner
		Scanner input = new Scanner(System.in);
		
		//Taking the account number as input
		System.out.println("Enter the 9 digit account number");
		long accountNo = input.nextLong();
		
		//scanning for the given account number in the customrArray
		for (Atm customer : customerArray) {
			if (customer.getAccountNumber()==accountNo) {
				
				System.out.println("The balace amount that is available to withdraw is  "+customer.getBalance());

         }
      }
	}
	
	
	//To display customer list
	public static void customerList() {
		
		for (Atm customer : customerArray) {
			System.out.println(customerArray);
		}
	}
	
	
	//To show details of a specific customer
	public static void aCustomer() {
		
		//Initializing scanner
		Scanner input = new Scanner(System.in);
		
		//Taking the account number as input
		System.out.println("Enter the 9 digit account number");
		long accountNo = input.nextLong();
		
		//scanning for the given account number in the customrArray
		for (Atm customer : customerArray) {
			if (customer.getAccountNumber()==accountNo) {
				
				System.out.println(customer.getCustomerName());
				System.out.println("Account number "+customer.getAccountNumber());
				System.out.println("Account type "+customer.getAccountType());
				System.out.println("Account Pin "+customer.getAtmPin());
				System.out.println("The Balance amount excluding minimum balance is  "+ customer.getBalance());
				System.out.println("Minimum balance  "+customer.getMinimumBalance());
				System.out.println("Email Id  "+customer.getEmailId());
				System.out.println("Mob number "+customer.getMobNumber());
         }
        
      }
		
	}
	
	
	//Transfer money from one account to another
	public static void transferMoney() {
		
		//Initializing scanner
		Scanner input = new Scanner(System.in);
		
		//Taking the account number as input
		System.out.println("Enter the 9 digit account number ");
		long accountNoToWithdraw = input.nextLong();
		
		//Taking the account number of the receiving Bankaccount
		System.out.println("Enter the account number of the  receiving Bank account");
		long accountNoToDeposit = input.nextLong();
		
		//scanning for the given account number in the customrArray
		for (Atm customer : customerArray) {
			if(customer.getAccountNumber()==accountNoToDeposit) {
				
				if (customer.getAccountNumber()==accountNoToWithdraw) {
					
					System.out.println("Enter the amount to transfer");
					double amountToTransfer = input.nextDouble();
					
					if(amountToTransfer<customer.getBalance()) {
						System.out.println("Insufficeint funds!");
					}
					
					else {
						if(amountToTransfer > 50000) {
							System.out.println("Enter your pan card number");
							long panNumber = input.nextLong();
							customer.setBalance(customer.getBalance()-amountToTransfer);
							System.out.println("The new Balance of the account number"+ accountNoToWithdraw+" is "+customer.getBalance());
							
							//Setting the balance of the receiving Bank account
							if(customer.getAccountNumber()==accountNoToDeposit) {
								customer.setBalance(customer.getBalance()+amountToTransfer);
								System.out.println("The new Balance of the account number"+ accountNoToDeposit+" is "+customer.getBalance());
							}
						}
						
						else if (amountToTransfer >0 && amountToTransfer<50000 ) {
							customer.setBalance(customer.getBalance()-amountToTransfer);
						}
					}
			}
				else {
					System.out.println("There is no receiving bank account in this account number");
				}
			
			
	     }
	    
	  }
		
	}

}
