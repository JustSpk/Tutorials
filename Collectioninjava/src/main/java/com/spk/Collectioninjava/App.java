package com.spk.Collectioninjava;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
    	LinkedList al=new LinkedList();
    	al.add("one");
    	al.add("two");
    	al.add("three");
    	al.add("four");
    	
    	al.remove("one");
    	Iterator itr=al.iterator();
    	while(itr.hasNext()) {
    		System.out.println(itr.next());
    	}
    }
}
