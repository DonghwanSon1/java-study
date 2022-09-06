package com.kh.chap02_beforeVSafter.model.vo;

public class SmartPhone extends Product{
	
	
	// [필드부]
	private String mobileAgency;
	// + brand, pCode, pName, price <= product클래스에게 상속을 받는다.
	
	
	
	
	// [생성자부]
	// 생성자는 상속을 받을 수 없다.
	public SmartPhone() {
		super();
	}

	// 초기화를 모두 진행할 생성자
	public SmartPhone(String brand, String pCode, String pName, int price, String mobileAgency) {
		// super : 해당 부모의 주소를 담고있따. (즉, super. 부모에 접근가능)
		// super.brand = brand; => 접근제한자가 private이기 때문에 보이지 않음
		// 단, 접근하고자하는 그 어떤것이 private일 경우 외부에서는 접근이 불가능하다.(아무리 자식이여도!!)
		// 해결방법은 3가지 있음
		
		// 해결방법 1. 부모클래스의 필드를 자식까지는 접근 가능하도로 설정 => 부모클래스에서 (protected)로 쓴다.
		// 해결방법 2. 부모클래스에 있는 public 접근제한자인 setter메서드를 호출한다.
		/*
		 * super.setBrand(brand);
		 * super.setPCode(pCode);
		 * .
		 * .
		 * 
		 */
		// 해결방법 3. 부모생성자 호출하기
		super(brand, pCode, pName, price);
		this.mobileAgency = mobileAgency;
		
	}


	
	
	
	
	
	// [메서드부]
	public String getMobileAgency() {
		return this.mobileAgency;
	}
	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}
	
	
	public String information() {
		return super.information() + ", 통신사 : " + this.mobileAgency;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
