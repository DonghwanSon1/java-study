package com.kh.chap02_abstractAndInterface.part02_family.model.vo;

public class Mother extends Person implements Basic {
	
	private String babyBirth; // ���// �Ծ�// ����
	
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
		return "���� => " + super.toString() + ", babyBirth : " + babyBirth;
	}
	
	@Override
	public void eat() {
		// ������ 10 ����
		super.setWeight(super.getWeight() + 10);
		// Ű 0.0001 ����
		super.setHeight(super.getHeight() + 0.0001);
		
	}
	
	@Override
	public void sleep() {
		// Ű 0.00001 ����
		super.setHeight(super.getHeight() + 0.00001);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
