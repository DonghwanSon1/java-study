package com.kh.chap03.run;

import com.kh.chap03.model.vo.Person;

public class Run {

	public static void main(String[] args) {
		
		// == 내가 만든 나만의 자료형(1. 참조자료형, 2. 주소값을 저장, 3. 여러개의 자료형에 여러개 값을 보관 + 기능)
		// == 사용자 정의 자료형
		// person 이라는 클래스를 통해 객체 생성
		
		
		Person person = new Person(); // 인스턴스화
		
		
		// 기본값이 들어있음 => 기본형은 0, 0.0, 공백  // 참조형은 null
		System.out.println(person.information());
		
		
		// 값 대입 => setter
		person.setPNum("010-9698-0336");
		person.setAge(24);
		person.setEmail("sdh549@naver.com");
		person.setGender('여');
		person.setName("방지예");
		person.setNum("970514-111111");
		
		System.out.println(person.information());
	}

}
