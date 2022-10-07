package com.atmapp;

import java.util.ArrayList;
import java.util.Scanner;

import com.atm.Atm;
import com.atmlib.AtmLib;

public class AtmApp {
	public static void main(String[] args) {
		
		mainMenu();
	}
	
	//MainMenu for selecting the operation to be performed
	private static void mainMenu() {
		
		//Initializing Scanner
		Scanner input = new Scanner(System.in);
		
		//Initializing ArrayList
		
		char choiceYN= 'n';
		do {
			//welcome page
			System.out.println("------------Welecome--------------");
			System.out.println("Enter the action to be performed");
			System.out.println("1.Add Customer \n2.Update Customer details \n3.Delete Customer \n4.Deposit Money"
					+ "\n5.Withdraw money \n6.Show Balance \n7.List of all Customers \n8.Specific Customer details"
					+ "\n9.Tranfer money to an Account");
			
			int choice = input.nextInt() ;//taking the choice input
			
			//selecting the operation
			switch(choice) {  
			case 1:
				AtmLib.addCustomer();
				break;
				
			case 2:
				AtmLib.updateCustomer();
				break;
				
			case 3:
				AtmLib.deleteCustomer();
				break;
				
			case 4:
				AtmLib.depositMoney();
				break;
				
			case 5:
				AtmLib.withdrawMoney();
				break;
				
			case 6:
				AtmLib.showbalance();
				break;
				
			case 7:
				AtmLib.customerList();
				break;
				
			case 8:
				AtmLib.aCustomer();
				break;
				
			case 9:
				AtmLib.transferMoney();
				break;
				
			default:
				System.out.println("Invalid entry!");
				break;
			
			}
			//To continue the operation
			System.out.println("Do you want to continue to Main menu (y/n)");
			choiceYN = input.next().charAt(0);
		}while(choiceYN == 'y'||choiceYN == 'Y');
		
	}

}
