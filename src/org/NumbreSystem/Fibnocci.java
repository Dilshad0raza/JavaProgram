package org.NumbreSystem;
import java.util.Scanner;
public class Fibnocci {

	public static void main(String[] args) {
		System.out.println("Enter the size of Series:");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int f=0;
		int f1=1;
	
		while(n!=0) {
				System.out.print(f+" ");
				int f3=f+f1;
				f=f1;
				f1=f3;
			n--;
			
		}
		
	}

}
