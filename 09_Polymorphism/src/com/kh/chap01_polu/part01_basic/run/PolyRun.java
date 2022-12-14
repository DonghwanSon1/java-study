package com.kh.chap01_polu.part01_basic.run;

import com.kh.chap01_polu.part01_basic.model.vo.*;

public class PolyRun {
	/*
	 * ★★★★★★★★★★ 타입 ★★★★★★★★★★★
	 * 메서드, 필드
	 * 
	 */

	public static void main(String[] args) {
		
		// = 의 특징
		// 우항의 값을 좌항에 대입한다.
		// ★★★★★★★★ 양변의 자료형이 같아야만한다. ★★★★★★★★
		
		// 부모꺼는 내꺼 내껀 내꺼 => 자식클래스 종특;
		
		// 1. 부모타입 자료형으로 부모 객체를 다루는 경우
		Parent p1 = new Parent();
		p1.printParent();
		// p1.printChild1(); // 자식꺼는 내꺼가 아니여서 안됌!!
		// p1으로는 Parent에만 접근 가능
		
		
		// 2. 자식타입 자료형으로 자식 객체를 다루는 경우
		Child1 c1 = new Child1();
		c1.printChild1(); // 내껀 내꺼여서 문제 없음!
		c1.printParent(); // 부모꺼도 내꺼여서 문제없음!
		// c1으로는 Parent, Child1에 둘다 접근 가능
		
		
		// 3. 부모타입 자료형으로 자식 객체를 다루는 경우 => 다형성이 적용된 개념
		Parent p2 = /*(Parent)*/new Child1(); // => (Parent)new Child1()으로 자동형변환이 된것이다.!
		p2.printParent();
	//	p2.printChild1(); // 자식꺼는 부모가 못씀
		// p2로는 Parent만 접근이 가능
		
		// 양쪽의 자료형이 다름에도 오류가 나지않음
		// 왜? Parent형으로 자동형변환이 되었으니깐
		// ★상속구조★에서는 클래스 형변환이 가능하다.
		
		((Child1)p2).printChild1();
		
		/*
		 * 클래스 간의 형변환
		 * - "상속구조"일 경우에만 클래스간의 형변환이 가능하다!
		 * 
		 * 1. UpCasting
		 * 	- 자식타입 => 부모타입
		 * 	- 생략이 가능하다.
		 *  - ex) 자식.부모메서드();
		 * 
		 * 2. DownCasting
		 * 	- 부모타입 => 자식타입
		 * 	- 생략이 불가능하다.
		 * 	- ex) ((자식)부모).자식메서드();
		 * 
		 */
		
		// 다형성을 사용하는 이유는??
		// 배열을 써보자
		// 배열의 특징 == 한 종류의 자료형인 값들을 묶어서 관리가 가능하다.
		
		// 다형성을 배우기전...
		// Child1 객체 2개와 Child2 객체 2개를 관리해야 된다면.
		
		Child1[] arr1 = new Child1[2];
		arr1[0] = new Child1(1, 2, 3);
		arr1[1] = new Child1(4, 5, 6);
		
		Child2[] arr2 = new Child2[2];
		arr2[0] = new Child2(1, 2, 3);
		arr2[1] = new Child2(4, 5, 6);
		
		System.out.println("다형성을 접목한 배열 ");
		
		// 부모타입의 객체 배열을 만든 다음에
		// 자식들을 부모 배열로 묶어보자
		
		Parent[] arr = new Parent[4];
		arr[0] = /*(Parent)*/new Child1(1, 2, 3);
		arr[1] = /*(Parent)*/new Child2(4, 5, 6);
		arr[2] = /*(Parent)*/new Child1(7, 8, 9);
		arr[3] = /*(Parent)*/new Child2(10, 11, 12);
		// 눈에는 안보이지만 (Parent)으로 자동형변환 됐다.
		
		// printParent 메서드 호출
		System.out.println("======================");
		System.out.println("printParent 메서드 호출");
		System.out.println("======================");
		for(int i = 0; i < arr.length; i++) {
			arr[i].printParent();
		}
		
		// printChild1,2 메서드 호출이 하고싶다.!
		((Child1)arr[0]).printChild1();
		((Child2)arr[1]).printChild2();
		((Child1)arr[2]).printChild1();
		((Child2)arr[3]).printChild2();
		
		// Child1이였던 녀석을 Child2로 강제형변환을 한다면??
		// ((Child2)arr[0]).printChild2();
		// 	=> ClassCastException이 발생
		//  => 클래스간에 형변환이 잘못되었을 경우 발생함
		// 	=> 원래 Child1인 애를 child2로 바꾸려니깐 에러가 났다.
		
		
		System.out.println("=======================");
		System.out.println("반복문 + 오버라이딩");
		System.out.println("=======================");
		for(int i = 0; i < arr.length; i++) {
			/*
			 * instanceof 연산자 => true / false
			 * 
			 * 현재 레퍼런스가 실질적으로 어떤 클래스타입을 참조하는지 확인할 때 사용
			 * 
			 */
			/*if(arr[i] instanceof Child1) {
				((Child1)arr[i]).printChild1();
			} else {
				((Child2)arr[i]).printChild2();
			}*/
		
		// 각 배열의 인덱스에 차근차근 접근
			arr[i].print();
			// "나 부모야~"가 4번찍혀야되는데?..
			// 오버라이딩해서 안찍힌거임~^^
			// 정작결과는 오버라이딩 된 print가 각각 호출이 됌
			
			/*
			 * 동적바인딩 : 프로그램 실행 되기 전에는 컴파일링 되면서 정적바인딩(자료형의 메서드를 가리킴)
			 * 			단, 실질적으로 참조하는 자식클래스에 해당 메서드가 오버라이딩이 되어있다면
			 * 				프로그램 실행 시 동적으로 그 자식클래스의 오버라이딩 된 메서드를 찾아서 실행
			 * 
			 */
		
			// => 오버라이딩 특징 : 오버라이딩 개념이 적용된 메서드를 호출 시
			//					원조메서드보다 새롭게 정의된 메서드가 우선순위가 높기 때문에 먼저 호출이 됌
			
			// 우리가 앞으로 객체 배열을 쓸때 오버라이딩을 이용하면 굳이 강제 형변환을 안해도 된다.
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		

	}

}
