package com.spk.MultiThreading;

public class ThreadDemo2 {
	public void run() {
		for(int i=1;i<=5;i++) {
		System.out.println("Second Thread..!");
		try{Thread.sleep(1000);}catch(Exception e) {}
		}
	}	
}
