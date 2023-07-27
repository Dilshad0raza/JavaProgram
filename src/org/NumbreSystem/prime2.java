package org.NumbreSystem;

import java.util.Scanner;

public class prime2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n=s.nextInt();
		boolean b=isPrime(n);
		if(b==true) {
			System.out.println("it is prime");
		}
		else {
			System.out.println("it is not prime");
		}
	}

	 static boolean isPrime(int n) {
		 for(int i=2;i*i<=n;i++) {
			 if(n%i==0) {
				 return false;
			 }
		 }
		 
		return true;
	}

}
