package com.care.di_test;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		String config = "classpath:application_test.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(config);
		PrintString ps = ctx.getBean("pst", PrintString.class);
		//System.out.print("°ªÀÔ·Â : ");
		//ps.setPrint(new Scanner(System.in).next());
		ps.Aprint();
		
	}
}

