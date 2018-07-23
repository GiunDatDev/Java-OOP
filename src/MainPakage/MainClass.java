package MainPakage;
import java.util.Scanner;

import JavaUserLib.*;

public class MainClass {	
	public static void makeNewObjectdeb() {
		Scanner usr_in = new Scanner(System.in);
		
		System.out.println("Please enter your name at here: ");
		String customerName= usr_in.nextLine();
		System.out.println("Please enter your account number at here: ");
		String accountNumber = usr_in.nextLine();
		System.out.println("Please enter your phone number at here: ");
		String phoneNumber = usr_in.nextLine();
		System.out.println("Please enter your email at here: ");
		String email = usr_in.nextLine();
		System.out.println("Please enter your S.I.N number at here: ");
		String sinNumber = usr_in.nextLine();
		
		debitAccount debitObject = new debitAccount(customerName, accountNumber, phoneNumber, email, sinNumber);
		debitObject.showInfo();
	}
	
	public static void makeNewObjectcre() {
		Scanner usr_in = new Scanner(System.in);
		
		System.out.println("Please enter your name at here: ");
		String customerName= usr_in.nextLine();
		System.out.println("Please enter your account number at here: ");
		String accountNumber = usr_in.nextLine();
		System.out.println("Please enter your phone number at here: ");
		String phoneNumber = usr_in.nextLine();
		System.out.println("Please enter your email at here: ");
		String email = usr_in.nextLine();
		System.out.println("Please enter your S.I.N number at here: ");
		String sinNumber = usr_in.nextLine();
		
		creditAccount creditObject = new creditAccount(customerName, accountNumber, phoneNumber, email, sinNumber);
		creditObject.showInfo();
	}
	
	public static void main(String args[]) {
		makeNewObjectdeb();
		makeNewObjectcre();
	}
}








