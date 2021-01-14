package org.question;

import java.util.ArrayList;

public class QuestionDay {

	public static void main(String[] args) {
			
		int a[]=new int[3];
		
		ArrayList<Integer> ind= new ArrayList<Integer>();
		
		ind.add(10); ///10,20,30,90,10,10,40,50
		ind.add(20);
		ind.add(30);
		ind.add(90);
		ind.add(10);
		ind.add(10);
		ind.add(40);
		ind.add(50);
		
		System.out.println(ind.indexOf(50));
		
		System.out.println("********");
		
		ArrayList<Integer> ind1=new ArrayList<Integer>();
		Double sum=0.0;
		ind.add(10);///10,20,30,90,10,10,40,50,10
		ind.add(20);
		ind.add(30);
		ind.add(90);
		ind.add(10);
		ind.add(10);
		ind.add(40);
		ind.add(50);
		ind.add(10);
		
		for (int i = 0; i < ind.size(); i++) {
			
			System.out.println((ind.get(i)/sum)*100+"10%");
			
		}
		
		
		
		
		
		
		
		
		

	}

}
