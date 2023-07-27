package org.NumbreSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Keith {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		boolean b=isKeith(n);
		
		if(b==true) {
			System.out.println("it is Keith");
		}
		else {
			System.out.println("it is not Keith");
		}
	}

	 static boolean isKeith(int n) {
		 int sum=0;int temp=n;
		 int c=isCount(n);
		 ArrayList<Integer> a=new ArrayList<>();
		 while(n!=0) {
			 int r=n%10;
			 a.add(0, r);
			 sum=sum+r;
			 n/=10;
		 }
		 while(sum<temp) {
			 int t=c-1;
			 a.add(sum);
			 int j=a.size()-2;
//			 System.out.print(a.get(j)+" ");
			 while(t!=0) {
				 sum=a.get(j)+sum;
//				 System.out.print(a.get(j)+" ");
				 j--;
				 t--;
			 }
			 
		 }
		 a.add(sum);
		 System.out.println(a);
		return (sum==temp);
	}

	private static int isCount(int n) {
		// TODO Auto-generated method stub
		int c=0;
		do {
			n/=10;
			c++;
		}while(n!=0);
		return c;
	}

}
