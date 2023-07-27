package org.NumbreSystem;

import java.util.Scanner;

public class Automorphic {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		boolean b=isAutomorphic(n);
		if(b==true) {
			System.out.println("it is automorphic");
		}
		else {
			System.out.println("it is not automorphic");
		}
	}

	 static boolean isAutomorphic(int n) {
		 int temp=n;
		 int c=isCount(n);
		 int p=isPower(n,c);
		 int ch=isCheck(c);
		 int rem=p%ch;
		 System.out.println(rem);
		 if(n==rem) {
			 return true;
		 }
		 
		return false;
	}

	   static int isCheck(int c) {
		int ch=10;
		int p=1;
		while(c!=0) {
			p=p*ch;
			c--;
		}
		return p;
	}

	static int isPower(int n, int c) {
		  int p=1;
		  while(c!=0) {
			  p=p*n;
			  c--;
		  }
		return p;
	}

	static int isCount(int n) {
		int c=0;
		do {
			n=n/10;
			c++;
		}while(n!=0);
		return c;
	}

}
