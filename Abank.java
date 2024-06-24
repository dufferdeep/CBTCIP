package BankSystem;

import java.util.Scanner;

public class Abank {

	public static void main(String[] args) {
		BankAccount obj=new BankAccount("SUBHADIP GOSWAMI", "AB0000001");
     obj.showMenu();
	}

}
class BankAccount {
	int bal;
	int preTrans;
	String CustomerName;
	String CustomerId;
	
	BankAccount(String cname, String cid){
		CustomerName=cname;
		CustomerId=cid;
	}
	
	void deposit(int amo) {
		if(amo!=0) {
			bal=bal+amo;
			preTrans=amo;
		}
	}
	void withdraw(int amo) {
		if(amo!=0) {
			bal=bal-amo;
			preTrans=-amo;
		}
	}
	void getPreviousTransaction() {
		if(preTrans>0) {
			System.out.println("Deposited: "+preTrans);
		}
		else if(preTrans<0) {
			System.out.println("Withdraw: "+Math.abs(preTrans));
		}
		else {
			System.out.println("No Transaction Occured");
		}
	}
	public void showMenu() {
		char option='\0';
		Scanner s=new Scanner(System.in);
		System.out.println("Welcome "+CustomerName);
		System.out.println("Your Id "+CustomerId);
		System.out.println("\n");
		System.out.println("A : Check your Balance");
		System.out.println("B : Deposit");
		System.out.println("C : Withdraw");
		System.out.println("D : Previous Transaction");
		System.out.println("E : Exit the System");
		
		do {
			System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
			System.out.println("Enter Your Option");
			System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
			option=s.next().charAt(0);
			System.out.println("\n");
			
			switch(option) {
			case 'A' :
				System.out.println("---------------------------------------------------------------------");
				System.out.println("Balance = "+bal);
				System.out.println("---------------------------------------------------------------------");
				System.out.println("\n");
				break;
				
			case 'B' :
				System.out.println("---------------------------------------------------------------------");
				System.out.println("Enter amount to deposit ");
				System.out.println("---------------------------------------------------------------------");
				
				int amo=s.nextInt();
				deposit(amo);
				System.out.println("\n");
				break;
				
			case 'C' :
				System.out.println("---------------------------------------------------------------------");
				System.out.println("Enter amount to withdraw ");
				System.out.println("---------------------------------------------------------------------");
				
				int amo2=s.nextInt();
				withdraw(amo2);
				System.out.println("\n");
				break;
				
			case 'D' :
				System.out.println("---------------------------------------------------------------------");
				getPreviousTransaction();
				System.out.println("---------------------------------------------------------------------");
				System.out.println("\n");
				break;
				
			case 'E' :
				System.out.println("======================================================================================");
				break;
				
				default:
					System.out.println("Invalid Option !! Please enter a valid option..!!");
					break;
			}
		}
		while(option != 'E');
		System.out.println("Thank You for using our Services......!!");
	}
	}
