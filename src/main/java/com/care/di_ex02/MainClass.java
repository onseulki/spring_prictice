package com.care.di_ex02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		//STBean st = new STBean();
		String config ="classpath:applicationST.xml"; //classpath:applicationST.xml 를통해 객체를 얻어오고값을 config에 넣어준다.
		GenericXmlApplicationContext  ctx = new GenericXmlApplicationContext(config);
		// 파일 시스템이나 클래스 경로에 있는 XML 설정 파일을 로딩하여 구동하는 컨테이너에 config객체를 ctx에 넣어준다.
		STBean  st = ctx.getBean("stb",STBean.class);//stb에대한 stbean.class 유형이다. 
		
		//st.setName("홍길동11111");
		//st.setAge(2000);
		st.namePrint();
		st.agePrint();
	}
}

