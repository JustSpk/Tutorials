package com.spk.project2;

import java.util.Scanner;

public class PblmSlv {
	public static void main(String args[]) {
		System.out.println("    @");
		for(int i=1;i<=3;i++) {
			for(int j=3;j>=i;j--) {
				System.out.print(" ");
			}
			System.out.print("@");
			for(int k=1;k<=i;k++) {
				System.out.print("  ");
			}
			System.out.print("@");
			System.out.println();
		}
		for(int i=2;i>=1;i--) {
			for(int j=3;j>=i;j--) {
				System.out.print(" ");
			}
			System.out.print("@");
			for(int k=1;k<=i;k++) {
				System.out.print("  ");
			}
			System.out.print("@");
			System.out.println();
		}
		System.out.println("    @");
	}
}
