package activity;

import java.text.NumberFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class multiple {

	static int Entry;
	static int choice;
	static Random ran = new Random();
	static Date timestamp = new Date();
	static String dep;
	static int dep1;
	static int with;
	static int num1 = 9896;
	static int num2 = 52000;
	static int pin1 = 1876;
	static int pin2;
	static int bal2 = ran.nextInt(1789);
	static int bal1 = ran.nextInt(1500);
	static Scanner scan = new Scanner(System.in);
	static User user1 = new User();
	static int con = 1;

	public static void main(String[] args) {
		Acc();

	}

	// this method will focus on switching between savings and checking account

	public static void Acc() {
		System.out.println("Please enter your name to get started with your account.");
		user1.setName(scan.nextLine());
		System.out.println("\nEnter your 4 digit ID pin.");
		pin2 = scan.nextInt();
		System.out.println("\nFollow the prompt below to choose an account.\n\nTo select an account "
				+ "please use the number assosociated with that option " + "" + "to access that account(1..2).");

		System.out.println("\n1.Checking Account\n2.Savings Account\n3.Transfer");
		Entry = scan.nextInt();
		System.out.println("Entry: " + Entry);

		switch (Entry) {

		case 1:
			try {

				if (Entry == 1)
					System.out.println("\nChecking account selected.\n\nLoading......\n\n");
				NumberFormat fmt6 = NumberFormat.getCurrencyInstance();
				System.out.println("Intial balance : " + fmt6.format(bal1));
				System.out.println("Account number : " + num1 + ran.nextInt(9896));
				System.out.println("Routing number : " + num2 + ran.nextInt(1113));
				System.out.println(timestamp = new Date());

				System.out.println("\nWould you like to make a deposit or withdrawl?(1/2).");
				choice = scan.nextInt();
				if (choice == con)
					System.out.println("To deposit enter '1' or to withdraw enter '2'");
				dep = scan.nextLine();
				if (choice == 1) {
					System.out.println("\nPlease enter an amount to Deposit.");
					dep1 = scan.nextInt();
					System.out.println("New checking account balance : " + fmt6.format(dep1 + bal1));

					break;
				} else if (choice == 2) {
					System.out.println("Please enter an amount to withdraw.");
					with = scan.nextInt();
					if (with > bal1)
						System.out.println("Insufficent funds.");
					else
						System.out.println("New checking account balance : " + fmt6.format(bal1 - with));
					System.out.println(timestamp = new Date());
					break;
				}
			}

			catch (Exception e) {
				System.out.println("Input error please enter a numberic value." + e);
				break;

			}
		case 2:

			if (Entry == 2)
				System.out.println("\nSavings account selected.\n\nLoading......\n\n");
			NumberFormat fmt6 = NumberFormat.getCurrencyInstance();
			System.out.println("Intial balance : " + fmt6.format(bal2));
			System.out.println("Account number : " + num1 + ran.nextInt(9896));
			System.out.println("Routing number : " + num2 + ran.nextInt(1113));
			System.out.println(timestamp = new Date());

			System.out.println("\nWould you like to make a deposit or withdrawl?(1/2).");
			choice = scan.nextInt();
			if (choice == 2) {
				System.out.println("Please enter an amount to withdraw.");
				with = scan.nextInt();
				if (with > bal1)
					System.out.println("Insufficient funds");
				else
					System.out.println("New Savings account balance : " + fmt6.format(bal2 - with));

				break;
			}

			else if (choice == 1)
				System.out.println("Please enter an amount to deposit.");
			dep1 = scan.nextInt();

			System.out.println("New Savings account balance : " + fmt6.format(dep1 + bal2));

			System.out.println(timestamp = new Date());

		   
		case 3:
	 
			   if(Entry == 3)
				   System.out.println("Please select an account to transfer money from.");
		          
			   System.out.println("1.Checking\n2.Savings");
		         Entry = scan.nextInt();
		         System.out.println("You have selected to transfer money from.");
		         if(Entry==1)
		        	 System.out.println("\nChecking account.");
		         
		       
		         else 
		        	 System.out.println("\nSavings account selected.");
		         
		    
		    if(Entry == 1){
		    	NumberFormat fmt8 = NumberFormat.getCurrencyInstance();
		    	System.out.println("Intial balance : " + fmt8.format(bal1));
		    	System.out.println("How much would you like to transfer to your savings account?");
		    	choice = scan.nextInt();
		    	System.out.println("Transfering.....");
		    	System.out.println("You have sucessfully transferred " + fmt8.format(choice) + " to your savings account.");
		    	System.out.println("Remaining checking account balance : " + fmt8.format(bal1-choice));
		    	System.out.println("\nTransaction Occurence");
		    	System.out.println(timestamp = new Date());
		    }
		    	else 
		    	if(Entry == 2){
				    	NumberFormat fmt7 = NumberFormat.getCurrencyInstance();
				    	System.out.println("Intial balance : " + fmt7.format(bal2));
				    	System.out.println("How much would you like to transfer to your checking account?");
				    	choice = scan.nextInt();
				    	System.out.println("Transfering.....");
				    	System.out.println("You have sucessfully transferred " + fmt7.format(choice) + " to your checking account.");
				    	System.out.println("Remaining savings account balance : " + fmt7.format(bal2-choice));
				    	System.out.println("\nTransaction Occurence");
				    	System.out.println(timestamp = new Date());
		   
				    
		    	}
		}
	
		
		
	
		
	}	
}
