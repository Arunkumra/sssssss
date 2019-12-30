package org.phone;

public class ExternalsStroage {
public void size() {
System.out.println("s");
}
public static void main(String[] args) {
	ExternalsStroage E=new ExternalsStroage();
	E.size();
	InternalStroage I=new InternalStroage();
	I.processorName();
	I.ramSize();
}
}
