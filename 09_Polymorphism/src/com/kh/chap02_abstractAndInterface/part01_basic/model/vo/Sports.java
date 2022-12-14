package com.kh.chap02_abstractAndInterface.part01_basic.model.vo;

// 추상 클래스
// [표현법]
// 접근제한자 abstract class 클래스이름 {
// abstract : 예약어 -> 추상클래스, 추상메서드 선언할 때 붙임!

/*
 * 추상메서드가 존재하는 순간 추상클래스로 정의됌
 * abstract라는 예약어를 사용해서 정의해야함!
 * 객체 생성이 불가능하다.
 * 부모클래스 구실은 가능(다형성이 적용 가능)
 * 
 * 추상클래스 == 일반필드 + 일반메서드 + 추상메서드(생략가능)
 *  => 추상메서드가 없어도 추상클래스로 정의가능!
 *  언제 ? -> 개발자 역량이다!
 *  
 *  => 기술적으로 개발자가 판단했을 때 이 클래스는 객체 생성이 불가능해야한다 라고 생각이 들면 추상클래스로 가능
 *  => 개념적으로 개발자가 판단했을 때 해당 클래스가 아직 구체적으로 덜 구현된 상태인것 같다 할때 abstract붙였다가 완성되면 다시 지운다.
 * 
 */

public abstract class Sports {

	// 사람
	private int people;

	public Sports() {}
	
	
	public Sports(int people) {
		this.people = people;
	}


	public int getPeople() {
		return people;
	}
	public void setPeople(int people) {
		this.people = people;
	}

	// 추상메서드
	// [표현법]
	// 접근제한자 abstract 반환형 메서드이름(){
	
	

	public abstract void rule();
	
	/*
	 * method body가 존재하지 않는 미완성메서드
	 * abstract 예약어를 써서 정의해야 함!
	 * 
	 * 미완성 메서드가 하나라도 포함되는 순간 해당 클래스는 미완성클래스(추상클래스)가 된다.
	 * 해당 클래스 앞에도 abstract라는 예약어를 써야한다.
	 * 
	 */
	
	
	
	@Override
	public String toString() {
		return " people : " + people;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
