package com.spk.MultiThreading;

public class ThreadDemo {
	public void run() {
		for(int i=1;i<=5;i++) {
		System.out.println("First Thread..!");
		try{Thread.sleep(1000);}catch(Exception e) {}
		}
	}
	
}
