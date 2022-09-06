package com.kh.chap02_abstractAndInterface.part02_family.model.vo;

public class Baby extends Person implements Basic{

	// [필드부]
	// 없음
	
	
	// 생성자부
	// 기본, 매개변수
	public Baby() {}
	
	public Baby(String name, double height, double weight) {
		super(name, height,weight);
	}
	
	
	// 메서드부
	// toString
	
	@Override
	public String toString() {
		return "아기 => " + super.toString();
	}

	@Override
	public void eat() { // 애기가 밥먹을 때
		// 몸무게 5 증가
		// weight == 부모의 필드 + 5
		super.setWeight(super.getWeight() + 5);
		// 키 0.5 증가
		super.setHeight(super.getHeight() + 0.5);
	}
	
	@Override
	public void sleep() {
		// 키 0.1 증가
		super.setHeight(super.getHeight() + 0.1);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
