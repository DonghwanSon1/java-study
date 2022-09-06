package com.kh.controller;

public class A_StringPoolTest {

	// String 클래스 => 불면클래스(변하지 않는 클래스)
	// 수정하는 순간 기존의 값이 담겨져있는 공간에서 수정되지 않는다.
	
	/*
	 * String 클래스 형태의 객체 생성 방법
	 * 
	 * 1. new 키워드로 생성자 호출 
	 * 2. 대입연산자를 통해서 직접 값을 넣어서 생성
	 * 
	 * 
	 */
	
	// 1. 생성자를 통해서 문자열 담기
	public void method1() {
		
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		
		System.out.println(str1.toString());
		System.out.println(str2);
		// 1. String클래스의 toString()의 경우
		// 실제 담겨있는 문자열을 반환하게끔 오버라이딩이 되어 있음
		
		// equals()
		System.out.println(str1.equals(str2));
		// true => 문자열을 비교했는데 동일하다.
		// 2. String클래스의 equals()의 경우
		// 주소값 비교가 아닌 문자열 비교를 하도록 오버라이딩
		
		// hashCode()
		// 16진수의 주소값 => 10진수의 형태로 변환해주는것
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		// 3. String클래스의 hasCode()
		// 주소값을 변환해주는 것이 아닌 실제 담긴 물자열을 기반으로
		// 해시코드값을 만들어서 반환
		
		// 진짜 주소값을 알고싶다면??
		// System.identityHashCode(참조형변수명);
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		// 실제 주소값의 해시코드를 출력
		// str1과 str2의 주소값이 다르다!
		
		// ==
		System.out.println(str1 == str2); // false
		
	}
	
	// 2. 문자열을 리터럴로 생성
	public void method2() {
		
		String str1 = "hello";
		String str2 = "hello";
		
		// toString 메서드
		System.out.println(str1);
		System.out.println(str2);
		
		// equals()
		System.out.println(str1.equals(str2));
		
		// hashCode()
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		
		// System.identityHashCode()
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		// ???? 두개의 찐 주소값이 똑같다.??,,??..
		
		// == (동등비교)
		System.out.println(str1 == str2);
		
	}
	
	// String 클래스의 StringPool
	public void method3() {
		
		String str = "hello";
		// 리터럴 대입시 String pool 영역에 올라감
		// String pool의 특징 : 동일한 내용의 문자열이 존재 불가하다!
		
		
		System.out.println(System.identityHashCode(str));
		
		str = "good bye";
		System.out.println(System.identityHashCode(str));
		
		// 연결이 끊긴 문자열들은 가비지콜렉터가 알아서 정리해줌
		// 불변이라고 해서 아예 수정이 안되는것이 아니라
		// 매번 새로운 주소값을 참조한다라는 뜻이다.
		
		str += "abc";
		System.out.println(System.identityHashCode(str));
		
		
	}
	
	public void method4() {
		// StringBuffer
		// 문자열은 안에 내용이 변경될때마다 새로운 공간을 할당하고 새로 집어넣는다.
		// 이를 막기위해 임시공간(buffer)을 하나 준비하여
		// 임시공간에 차곡차곡 담아두었다가 한번에 처리해주는 클래스가
		// StringBuffer / StrfingBuilder 이다.
		
		StringBuffer sb = new StringBuffer();
		sb.append("Hello");
		System.out.println("Hello".hashCode());
		System.out.println(sb.hashCode());
		
		sb.append(" World!");
		System.out.println("Hello World!".hashCode());
		System.out.println(sb.hashCode());
		
		System.out.println("결과 : " + sb);
		
		// StringBufer는 동시제어 기능(Thread Safe)기능을 가진다.
		// 간단히 프로그램 구현이나, 동시제어를 다른 프로그램이 제공하는 경우
		// 굳이... 버퍼까지?? 동시제어를 구현할 필요는 없다.
		// 이 기능만 쏙 뺀 클래스가 필요했는데 그게 StringBuilder이다.!!
		
	}
	
	public void method5() {
		StringBuilder sb = new StringBuilder();
		sb.append("Hello");
		System.out.println("Hello".hashCode());
		System.out.println(sb.hashCode());
		
		sb.append(" World!");
		System.out.println("Hello World!".hashCode());
		System.out.println(sb.hashCode());
		
		System.out.println("결과 : " + sb);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
