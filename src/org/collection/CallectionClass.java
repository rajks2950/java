package org.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CallectionClass {
	public static void main(String[] args) {
		
		int a[] =new int[3];///>>>>> static arrey they are size will be fixed
		 
		ArrayList ar=new ArrayList();   //// Dyanamic arrey they will be not having fixed size
		
		ar.add(10); // 0	
		ar.add(20);// 1
		ar.add(30);// 2
		ar.add(40);// 3
		
		System.out.println(ar.size());
		
		ar.add(10); // 4	
		ar.add(50);// 5
		ar.add(60);//6
		ar.add(40);// 7
		
		System.out.println(ar.size());// size of array list
		
		System.out.println(ar.get(6));// to get the value of pramanent list
		
		// if i want to print all the value in java  it arrey or arrey list in allwayse using for loop
		// having to 2 way 
		// 1 .using for loop >> it is index base
		// 2. itretr using
		
		for (int i = 0; i <ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
// non generic Vs generic 
			
	ArrayList<Integer> ar1= new ArrayList<Integer>(); //>>> only iteger value will be allow
	
	ar1.add(20);
	ar1.add(40);
	// ar1.add("selenium");
	
	ArrayList<String> ar2=new ArrayList<String>();  //<<< that is generic
		
		ar2.add("ram");
		ar2.add("shyam");
		ar2.add("java");
		ar2.add("selenium");
		for (int i = 0; i < ar2.size(); i++) {
			
		
			System.out.println(ar2.get(i));
		}
		//ArrayList<E> q=new ArrayList<E>();
		// emp created object
		
		Employee e1=new Employee("raj", 29, "QA");
		Employee e2=new Employee("tom", 30, "Dev");
		Employee e3=new Employee("petter", 40, "Admin");
		
		// create ArreyList 
			
		ArrayList<Employee> ar3=new ArrayList<Employee>();
		
		ar3.add(e1);
		ar3.add(e2);
		ar3.add(e3);
		
	// iterator to traverse the value	
		Iterator<Employee> it = ar3.iterator();
		
		while(it.hasNext()) {
			Employee emp = it.next();
			
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
			
			
		}
		// addAll()
		
		
       ArrayList ar4=new ArrayList();   
		
		ar4.add(10); // 0	
		ar4.add(20);// 1
		ar4.add(30);// 2
		
ArrayList<String> ar5=new ArrayList<String>();  //<<< that is generic
		
		ar5.add("ram");
		ar5.add("shyam");
		ar5.add("java");
		
		ar4.addAll(ar5);
		
		for (int i = 0; i < ar4.size(); i++) {
			
			System.out.println(ar4.get(i));
			
		}
		
	//useing removedAll() method 
		
//		ArrayList<String> ar6=new ArrayList<String>();
//		
//		ar6.add("Mohan");
//		ar6.add("raj");
//		ar6.add("peter");
//		
//		ArrayList ar7=new ArrayList();
//		ar7.add(10);
//		ar7.add(20);
//		ar7.add(40);
//		
//		ar6.addAll(ar7);	
//		
//		for (int i = 0; i < ar6.size(); i++) {
//			
//			System.out.println(ar6.get(i));
//			
//		}
//		
		
		ArrayList<Integer> ex=new ArrayList<Integer>();
	
		ex.add(10);
		ex.add(20);
		ex.add(30);
		
		System.out.println(ex);
		
		ArrayList<Integer> ex1=new ArrayList<Integer>();
		ex1.add(30);
		ex1.add(10);
		ex1.add(40);
		ex1.add(50);
		ex1.addAll(ex);
		System.out.println(ex1);
		ex1.removeAll(ex);
		
		System.out.println(ex1);
	
//	-------------------------	indexoff() method
		
	ArrayList<Integer> ind= new	ArrayList<Integer>();
	
	ind.add(40); //0
	ind.add(50);// 1
	ind.add(60);// 2
	ind.add(20);
	
	System.out.println(ind.indexOf(60));
		
//	-------retainAll(): method
	
		
	ArrayList<Integer> ind1=new ArrayList<Integer>();
	
	ind1.add(10);
	ind1.add(20);
	ind1.add(30);
	
	System.out.println(ind1);
	
	ArrayList<Integer> ind2=new ArrayList<Integer>();
	ind2.add(30);
	ind2.add(10);
	ind2.add(40);
	ind2.add(50);
	//ind2.addAll(ind1);	
	
	ind1.retainAll(ind2);
		
		
		
		
		
		
		
		
		
		
	}

}
