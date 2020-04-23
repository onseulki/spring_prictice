package com.care.di_test03;

import java.util.ArrayList;

public class PrintClass {
	public void print(String name, ArrayList food) {
		System.out.println("첫번째 음식 : "+food.get(0));
		System.out.println("두번째 음식 : "+food.get(1));
		System.out.println("세번째 음식 : "+food.get(2));
	}
}
