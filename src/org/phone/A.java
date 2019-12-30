package org.phone;



import java.util.ArrayList;
import java.util.List;


public class A{
	public static void main(String[] args) {
	List<Integer> sa=new ArrayList<Integer>();
	sa.add(10);
	sa.add(20);
	sa.add(30);
	sa.add(40);
	sa.add(50);
	sa.add(60);
	sa.add(70);
	sa.add(80);
	sa.add(10);
	sa.add(10);
	sa.add(20);
	System.out.println(sa);
	List<Integer> sa1=new ArrayList<Integer>();
	sa1.add(200);
	sa1.add(30);
	sa1.add(400);
	sa1.add(500);
	sa1.add(20);
	System.out.println(sa1);
	sa.retainAll(sa1);
	System.out.println(sa);
;


	}
		
	}


	
	

		
	
		


	
	


