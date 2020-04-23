package com.care.di_test02;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String config = "classpath:application_test02.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(config);
		SaveClass num = ctx.getBean("sc", SaveClass.class);
		
	//	System.out.print("첫번째 값 입력 : ");
	//	num.setNum1(new Scanner(System.in).nextInt());
	//	System.out.print("연산자 입력 :");
	//	num.setOp(new Scanner(System.in).next());
	//	System.out.print("두번째 값 입력 : ");
	//	num.setNum2(new Scanner(System.in).nextInt());
		
		num.operationClass();
		num.printClass();
	}
}

