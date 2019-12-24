package com.spk.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class App 
{
    public static void main( String[] args )
    {
        ArrayList list=new ArrayList();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.remove("one");
        Iterator itr=list.iterator();
        Iterator itr2=list.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
        while(itr2.hasNext()) {
        	System.out.println(itr2.next());
        }
    }
}
