package com.care.di_ex02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		//STBean st = new STBean();
		String config ="classpath:applicationST.xml"; //classpath:applicationST.xml ������ ��ü�� �������� config�� �־��ش�.
		GenericXmlApplicationContext  ctx = new GenericXmlApplicationContext(config);
		// ���� �ý����̳� Ŭ���� ��ο� �ִ� XML ���� ������ �ε��Ͽ� �����ϴ� �����̳ʿ� config��ü�� ctx�� �־��ش�.
		STBean  st = ctx.getBean("stb",STBean.class);//stb������ stbean.class �����̴�. 
		
		//st.setName("ȫ�浿11111");
		//st.setAge(2000);
		st.namePrint();
		st.agePrint();
	}
}

