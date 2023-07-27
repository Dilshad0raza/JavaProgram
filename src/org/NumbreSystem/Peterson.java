package org.NumbreSystem;

import java.util.Scanner;

public class Peterson {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		boolean b=isPeterson(n);
		
		if(b==true) {
			System.out.println("it is Peterson");
		}
		else {
			System.out.println("it is not Peterson");
		}

	}

	 static boolean isPeterson(int n) {
		 int temp=n;
		 int sum=0;
		 while(n!=0) {
			 int rem=n%10;
			 int fact=isFact(rem);
			  sum=sum+fact;
			  n/=10;
			 
		 }
		 if(sum==temp) {
			 return true;
		 }
		return false;
	}

	 static int isFact(int rem) {
		 int fact=1;
		 while(rem!=0) {
			 fact=fact*rem;
			 rem--;
		 }
		return fact;
	}

}
