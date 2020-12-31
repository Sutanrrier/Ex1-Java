package application;

import java.util.Locale;
import java.util.Scanner;

import util.Functions;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double value; //valor que irá servir para acrescentar ou diminuir do saldo
		
		System.out.print("Enter account number: ");
		int acc_num = sc.nextInt();
		System.out.print("Enter account name: ");
		String accName = sc.next();
		System.out.print("Is there an initial deposit (y/n)? ");
		char opt = sc.next().charAt(0);
		
		if (opt == 'y') {
			System.out.print("Enter the initial deposite value: ");
			double saldo = sc.nextDouble();
			System.out.println("Account Data: ");
			Functions user = new Functions(accName, opt, acc_num, saldo);
			user.Status();
			System.out.print("Enter a deposit value: ");
			value = sc.nextDouble();
			user.AddSaldo(value);
			System.out.println("Updated account data: ");
			user.Status();
			System.out.print("Enter a withdraw value: ");
			value = sc.nextDouble();
			user.RemoveSaldo(value);
			System.out.println("Updated account data: ");
			user.Status();
		}
		else {
			Functions user = new Functions(accName, opt, acc_num);
			System.out.println("Account Data: ");
			user.Status();
			System.out.print("Enter a deposit value: ");
			value = sc.nextDouble();
			user.AddSaldo(value);
			System.out.println("Updated account data: ");
			user.Status();
			System.out.print("Enter a withdraw value: ");
			value = sc.nextDouble();
			user.RemoveSaldo(value);
			System.out.println("Updated account data: ");
			user.Status();
		}
		sc.close();
	}

}
