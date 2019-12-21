package com.spk.MulThd;

public class App 
{
    public static void main( String[] args ) throws Exception
    {

    	Thread obj1=new Thread(() -> 
		{
			for(int i=1;i<=5;i++) {
				System.out.println("Hi...!"+Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
				try{Thread.sleep(500);}catch(Exception e) {}
			}
		});
    	Thread obj2=new Thread(() -> {
			for(int i=1;i<=5;i++) {
				System.out.println("Hello..!");
				try{Thread.sleep(500);}catch(Exception e) {}
			}
		});
    	obj1.setPriority(Thread.NORM_PRIORITY);
    	obj2.setPriority(Thread.MAX_PRIORITY);
    	System.out.println(obj1.getPriority());
    	System.out.println(obj2.getPriority());
    	
    	obj1.start();
		try{Thread.sleep(10);}catch(Exception e) {}
    	obj2.start();
    	
    	obj1.join();
    	obj2.join();
    	
    	System.out.println(obj1.isAlive());
    	
    	System.out.println("Bye");
    }
}
