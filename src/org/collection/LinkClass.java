package org.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkClass {
	public static void main(String[] args) {
		
		LinkedList<String> ll=new LinkedList<String>();
		
		// add
		ll.add("java");
		ll.add("seleniu");
		ll.add("paiyhon");
		 // print
		
		System.out.println("content of linkedlist"+ll);
		
		//addfirst
		
		ll.addFirst("raj");
		// addlast
		
		ll.addLast("mohan");
		
		System.out.println(ll);	
		
		// 	set
		
		ll.set(0, "tom");
		 
		System.out.println(ll.get(0));
		
		// removed
		
		ll.remove(2);
		System.out.println("content of linked list"+ll);
		
		// how to iteret all the value of linkedlist
		
		System.out.println("using for loop");
		
		for (int n = 0; n < ll.size(); n++) {
			
			System.out.println(ll.get(n));
			
		}
		// using advance for loop
		
		System.out.println("using advance for loop");
		
		for(String x:ll) {
			
			System.out.println(x);
		}
		// iteretar
	System.out.println("****itrater");
	
	Iterator<String> it = ll.iterator();
	
		while (it.hasNext()){
			
			System.out.println(it.next());
			
			
		}
		// while loop
		System.out.println("***while loop");
		int num=0;
		while(ll.size()>num) {
			
			System.out.println(ll.get(num));
			
			num++;
		}
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
