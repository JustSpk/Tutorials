package com.spk.project2;

import java.util.Scanner;

public class PblmSlv {
	public static void main(String args[]) {
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		int result=1;
		int q=a/10;
		while(q!=0) {
			q=q/10;
			result++;
		}
		System.out.println(result);
	}
}
