package com.spk.MultiThreading;

/**
 * Hello world!
 *
 */
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
