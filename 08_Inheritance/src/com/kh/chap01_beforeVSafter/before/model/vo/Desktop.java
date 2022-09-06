package com.kh.chap01_beforeVSafter.before.model.vo;

public class Desktop {

	private String brand;
	private String pCode;
	private String pName;
	private int price;
	private boolean allInOne;
	
	
	// 생성자 단축키 alt + shift + S => O  => alt + G => 기본생성자
	//					  기본생성자 만든 후에 => alt + G => 매개변수 있는 생성자
	public Desktop() {}
	
	
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		super();
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.allInOne = allInOne;
	}


	// alt + shift + S => r => alt + a => alt + r
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return this.brand;
	}
	public void setPCode(String pCode) {
		this.pCode = pCode;
	}
	public String getPCode() {
		return this.pCode;
	}
	public void setPName(String pName) {
		this.pName = pName;
	}
	public String getPName() {
		return this.pName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return this.price;
	}
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	public boolean getAllInOne() {
		return this.allInOne;
	}
	
	
	
	public String information() {
		return "브랜드명 : " + this.brand + ", 상품코드 : " + this.pCode + ", 상품명 : " + this.pName + ", 상품 가격 : "
				+ this.price + ", 일체여부 : " + this.allInOne;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
