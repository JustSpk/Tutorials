package com.spk.Collectioninjava;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
    	Collection value=new ArrayList();
    	value.add(7);
    	value.add("spk");
    	value.add(9.8);
    	Iterator itr=value.iterator();
    	while(itr.hasNext()) {
    		System.out.println(itr.next());
    		System.out.println();
    	}
    }
}
