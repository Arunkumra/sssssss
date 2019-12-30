package com.selenium;

public class Sample extends BaseClass {
	public static void main(String[] args) {
		getdriver();
		loadurl("https://www.facebook.com/");
		PojoClas p=new PojoClas();
		fill(p.getUserName(), "satiz");
		fill(p.getPassword(), "2922");
		button(p.getLoginbutton());
		
		
	
		
	}

		
	}


