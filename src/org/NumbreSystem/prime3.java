package org.NumbreSystem;

import java.util.Scanner;

public class prime3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n=s.nextInt();
		int t=1;
		for( int i=2;i<=n/2;i++) {
			if(n%i==0) {
				System.out.println("it is not prime");
				t++;
				break;
			}
			
		}
		if(t==1) {
			System.out.println("it is prime");
		}
		
	}

}
