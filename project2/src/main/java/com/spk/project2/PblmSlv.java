package com.spk.project2;

import java.util.Scanner;

public class PblmSlv {
	public static void main(String args[]) {
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		boolean isPrime=true;
		for(int i=2;i<=a/2;i++) {
			if(a%i==0) {
				isPrime=false;
				break;
			}	
		}
		if(isPrime) {
			System.out.println("It is a Prime Number");
		}
		else {
			System.out.println("It is not a Prime Number");
		}
	}
}
