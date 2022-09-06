package com.kh.chap01_polu.part02_electronic.controller; // 기능

import com.kh.chap01_polu.part02_electronic.model.vo.*;

// 용산 전자상가에 새로 차린 가게 : 다형성 적용 전
public class ElectronicController1 {
	
	// [필드부]
	private NintendoSwitch ns;
	private SmartPhone sp;
	private Tv tv;
	
	// [생성자부] => 생략
	// JVM이 기본생성자를 자동으로 생성해줌
	
	
	// [메서드부]
	// 재고를 추가해주는 기능!!
	// 같은 메서드명 = 오버로딩
	// 매개변수의 자료형이나 순서나 갯수가 달라야한다.
	public void insert(NintendoSwitch ns) {
		this.ns = ns;
	}
	public void insert(SmartPhone sp) {
		this.sp = sp;
	}
	public void insert(Tv tv) {
		this.tv = tv;
	}
	
	// 내가 갖고 있는 상품 뭐 있나?
	// 오버로딩? 불가능! => 매개변수가 없어서
	public NintendoSwitch selectNintendoSwitch() {
		return this.ns;
	}
	public SmartPhone selectSmartPhone() {
		return this.sp;
	}
	public Tv selectTv() {
		return this.tv;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
