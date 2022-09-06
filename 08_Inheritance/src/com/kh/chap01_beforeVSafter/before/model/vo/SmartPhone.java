package com.kh.chap01_beforeVSafter.before.model.vo;

public class SmartPhone {

	private String brand;
	private String pCode;
	private String pName;
	private int price;
	private String mobileAgency;
	
	public SmartPhone() {}
	
	
	public SmartPhone(String brand, String pCode, String pName, int price, String mobileAgency) {
		super();
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.mobileAgency = mobileAgency;
	}


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
	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}
	public String getMobileAgency() {
		return this.mobileAgency;
	}
	
	
	
	public String information() {
		return "브랜드명 : " + this.brand + ", 상품코드 : " + this.pCode + ", 상품명 : " + this.pName + ", 상품 가격 : "
				+ this.price + ", 통신사 : " + this.mobileAgency;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
