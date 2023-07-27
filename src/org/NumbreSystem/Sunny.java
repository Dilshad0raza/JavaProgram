package org.NumbreSystem;

import java.util.Scanner;

public class Sunny {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		boolean b=isSunny(n);
		
		if(b==true) {
			System.out.println("it is Sunny");
		}
		else {
			System.out.println("it is not Sunny");
		}
	}

       static boolean isSunny(int n) {
		 double squar=Math.sqrt(n+1);
		return (squar-Math.floor(squar)==0);
	}

}
