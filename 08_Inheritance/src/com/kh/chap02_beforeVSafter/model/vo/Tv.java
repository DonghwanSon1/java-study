package com.kh.chap02_beforeVSafter.model.vo;

public class Tv extends Product{

	// [필드부]
	private int inch;
	
	
	// [생성자부]
	public Tv() {}
	
	public Tv(String brand, String pCode, String pName, int price, int inch) {
		super(brand, pCode, pName, price);
		this.inch = inch;
	}


	
	
	
	// [메서드부]
	public int getInch() {
		return inch;
	}
	public void setInch(int inch) {
		this.inch = inch;
	}
	
	
	public String information() {
		return super.information() + ", 인치 : " + inch;
	}
	
	
	// 자식 클래스에 오버라이딩(부모클래스의 메서드를 재정의)를 했을 경우
	// 자시 클래스에 오버라이딩 된 메서드가 우선권을 가져서 호출됨!!
	
	/*
	 * 상속의 장점
	 * 
	 * - 중복된 코드를 공통적으로 관리
	 * 	 => 새로운 코드를 작성하거나 수정할 때 용이하다.
	 * 	 => 보다 적은양의 코드로 새로운 클래스를 만들 수 있다.
	 * - 프로그램의 생산성과 가독성과 유지보수에 크게 기여!
	 * 
	 * 
	 * 상속의 특징
	 * 
	 * - 클래스간의 다중상속은 불가능하다. (단일 상속만 가능)
	 * - 명시되어 있지는 않지만 모든 클래스는 Object클래스의 후손이다.
	 * (모든 클래스 : 내가만든클래스, 자바에서 이미 제공하는 클래스)
	 *  => Object클래스에 있는 메서드를 호출해서 쓸 수 있음
	 *  => Object클래스에 있는 메서드가 마음에 안들면? 오버라이딩을 통해 재정의 가능!
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
