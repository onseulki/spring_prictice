package com.care.di_test02;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String config = "classpath:application_test02.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(config);
		SaveClass num = ctx.getBean("sc", SaveClass.class);
		
	//	System.out.print("ù��° �� �Է� : ");
	//	num.setNum1(new Scanner(System.in).nextInt());
	//	System.out.print("������ �Է� :");
	//	num.setOp(new Scanner(System.in).next());
	//	System.out.print("�ι�° �� �Է� : ");
	//	num.setNum2(new Scanner(System.in).nextInt());
		
		num.operationClass();
		num.printClass();
	}
}

