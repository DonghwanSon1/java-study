package com.kh.chap02_beforeVSafter.model.vo;
// 			부모 클래스 				자식 클래스
//			조상 클래스				후손 클래스
//			상위 클래스				하위 클래스
//			슈퍼 클래스				서브 클래스
//			확장 클래스				파생 클래스
// ----------------- 다 같은 말이다 --------------------


// 자식클래스 extends 부모클래스이름  => 상속하는 방법
public class Desktop extends Product {
	// 부모로부터 상속받은 부분은 기술하지 않는다.
	// 단, 메서드는 가능! 상속을 받아서 재정의해서 사용할 경우!! => 오버라이딩!
	
	
	
	// [필드부]
	// brand, pCode, pName, price => 이것들이 다 존재함
	private boolean allInOne;
	
	
	// [생성자부]
	public Desktop() {}
	
	// brand, pCode, pName, price : 부모클래스인 Product에 있는 필드에 초기화가 된다.
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		// super.brand = brand; <= private이라서 안됌!
		
		// 1. 부모클래스의 필드들의 접근제한자를 private에서 protected로 바꾸는 방법
		// 2. 부모클래스의 setter를 이용해서 Product의 필드를 초기화 시키는 방법
		// 3. 부모클래스의 생성자를 호출해서 Product의 필드를 초기화 시키는 방법 => 주로 이방법씀
		super(brand, pCode, pName, price);
		this.allInOne = allInOne;
	}


	
	
	// [메서드부]
	// 오버라이딩이라는 개념을 적용 가능
	// brand, pCode, pName, price에 대한 setter/getter는 작성하지 않아도 호출이 가능 => 상속받아서!
	
	public boolean getAllInOne() {
		return this.allInOne;
	}	
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	
	// information은 ? 
	// 부모클래스(Product)의 information은 가격까지만 반환을 해주므로
	// 우리가 필요한 AllInOne도 반환을 해줍시다. => 오버라이딩
	public String information() {
		return /*"브랜드명 : " + super.getBrand() + ", 상품코드 : " + super.getpCode() + ", 상품명 : " + super.getpName() + ", 상품 가격 : "
				+ super.getPrice()*/
				super.information() + ", 일체여부 : " + this.allInOne;
	}
	
	
	
}
