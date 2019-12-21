package com.spk.MultiThreading;

public class App 
{
    public static void main( String[] args )
    {
       ThreadDemo td=new ThreadDemo();
       ThreadDemo2 td2=new ThreadDemo2();
       td.run();
       td2.run();
    }
}
class ThreadDemo{
	public void run() {
		for(int i=1;i<=5;i++) {
		System.out.println("First Thread..!");
		try{Thread.sleep(1000);}catch(Exception e) {}
		}
	}
}
class ThreadDemo2{
	public void run() {
		for(int i=1;i<=5;i++) {
		System.out.println("Second Thread..!");
		try{Thread.sleep(1000);}catch(Exception e) {}
		}
	}
}
