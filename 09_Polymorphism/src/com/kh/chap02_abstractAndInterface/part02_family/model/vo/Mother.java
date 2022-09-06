package com.kh.chap02_abstractAndInterface.part02_family.model.vo;

public class Mother extends Person implements Basic {
	
	private String babyBirth; // 출산// 입양// 없음
	
	public Mother() {}

	public Mother(String name, double height, double weight, String babyBirth) {
		super(name, height, weight);
		this.babyBirth = babyBirth;
	}

	public String getBabyBirth() {
		return babyBirth;
	}
	public void setBabyBirth(String babyBirth) {
		this.babyBirth = babyBirth;
	}

	@Override
	public String toString() {
		return "엄마 => " + super.toString() + ", babyBirth : " + babyBirth;
	}
	
	@Override
	public void eat() {
		// 몸무게 10 증가
		super.setWeight(super.getWeight() + 10);
		// 키 0.0001 증가
		super.setHeight(super.getHeight() + 0.0001);
		
	}
	
	@Override
	public void sleep() {
		// 키 0.00001 증가
		super.setHeight(super.getHeight() + 0.00001);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
