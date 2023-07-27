package org.NumbreSystem;

import java.util.Scanner;

public class Prime1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n=s.nextInt();
		int b=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				b++;
			}
		}
		if(b==1) {
			System.out.println("it is prime number");
		}
		else {
			System.out.println("it is not prime number");
		}
	}

}
