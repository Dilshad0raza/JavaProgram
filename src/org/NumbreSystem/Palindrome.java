package org.NumbreSystem;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n=s.nextInt();
		boolean b=isPalindrome(n);
		if(b==true) {
			System.out.println("it is palindrome");
		}
		else {
			System.out.println("it is not palidrome");
		}
	}

	 static boolean isPalindrome(int n) {
		 int rev=0;
		 int t=n;
		 while(n!=0) {
			 int d=n%10;
			 rev=(rev*10)+d;
			 n/=10;
		 }
		 if(t==rev) {
			 return true;
		 }
		 
		 return false;
	}

}
