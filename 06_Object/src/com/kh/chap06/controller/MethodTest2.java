package com.kh.chap06.controller;

public class MethodTest2 {
	
	// static 메서드를 만들기
	
	
	//  1.
	public static void method1() {
		System.out.println("매개변수랑 반환값이 둘다 없는 메서드입니다.");	
	}
	
	// 2.
	public static String method2() {
		return "매개변수는 없지만 반환값은 있는 메서드입니다.";
	}
	
	//3.
	public static void method3(String name, int age) {
		System.out.println("매개변수는 있고 반환값은 없는 메서드입니다.");
		System.out.println("출력구문 : " + name + "님 " + age + "살");
	}
	
	//4.
	public static String method4(String name, int age) {
		System.out.println("매개변수와 반환값 둘 다 있는 메서드입니다.");
		return name + "님 안녕하세요. " + age + "살이시네요.";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
