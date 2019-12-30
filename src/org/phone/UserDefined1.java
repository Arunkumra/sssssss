package org.phone;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UserDefined1 extends B  {
	public static void main(String[] args) {
		Set<UserDefined1> cx=new HashSet<>();
		Scanner sc=new Scanner(System.in);
	
		UserDefined1 ud1=new UserDefined1();
		ud1.setEmpId(sc.nextInt());
		ud1.setName(sc.next());
		UserDefined1 ud2=new UserDefined1();
		ud2.setEmpId(sc.nextInt());
		ud2.setName(sc.next());
		cx.add(ud1);
		cx.add(ud2);
		for (UserDefined1 u : cx) {
			System.out.println(u);
		}
	}
}

	
