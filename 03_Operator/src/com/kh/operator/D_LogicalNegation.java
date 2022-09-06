package com.kh.operator;

public class D_LogicalNegation {
	
	/*
	 * 논리 부정 연산자 : 논리값(true, false)을 반대로 바꿔주는 연산자
	 * 
	 * [표현법] !논리값
	 * 
	 */
	
	public void method1() {
		
		System.out.println("true의 부정" + !true); //
		System.out.println("false의 부정" + !false); //
		
		boolean b1 = true;
		boolean b2 = !b1;
		
		System.out.println(b1);
		System.out.println(b2);
		
	}

}
