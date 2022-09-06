package com.kh.chap06.run;

import com.kh.chap06.controller.MethodTest2;

public class Run2 {

	public static void main(String[] args) {
			//MethodTest2 클래스 Run
		
			//MethodTest2 mt2 = new MethodTest2();
			// static : 객체를 생성하지 않아도 호출 가능!!
			// [표현법] 클래스이름.메서드이름(); ex) Math.random()
			
			MethodTest2.method1();
			System.out.println(MethodTest2.method2());
			MethodTest2.method3("손동환", 26);
			System.out.println(MethodTest2.method4("손동환", 26));
			

	}

}
