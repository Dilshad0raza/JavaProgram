package org.NumbreSystem;

import java.util.Scanner;

public class Tech {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		boolean b=isTech(n);
		
		if(b==true) {
			System.out.println("it is Tech");
		}
		else {
			System.out.println("it is not Tech");
		}
	}

	 static boolean isTech(int n) {
		 int temp=n;
		 int c=isCount(n);
		 if(c%2==1) {
			 return false;
		 }
		 int p=c/2;
		 int ch=isPower(p);
		 int sum=(n%ch)+(n/ch);
		 int pro=sum*sum;
		 return(pro==temp) ;
	}

	  static int isPower(int p) {
		  int ch=10;
		  int n=1;
		  while(p!=0) {
			  n=n*ch;
			  p--;
		  }
		return n;
	}

	static int isCount(int n) {
		 int c=0;
		 do {
			 n/=10;
			 c++;
		 }while(n!=0);
		return c;
	}

}
