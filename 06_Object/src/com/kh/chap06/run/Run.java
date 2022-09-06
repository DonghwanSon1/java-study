package com.kh.chap06.run;

import com.kh.chap06.controller.MethodTest1;

public class Run {

	public static void main(String[] args) {
		
		//	MethodTest1 Å¬·¡½º Run
		
		MethodTest1 mt1 = new MethodTest1();
		
		mt1.method1();
		
		System.out.println(mt1.method2());
		// int a = mt1.method2();
		// System.out.println(a);
		
		mt1.method3(10, 120);
		
		System.out.println(mt1.method4(3,4));
		
		
		

	}

}
