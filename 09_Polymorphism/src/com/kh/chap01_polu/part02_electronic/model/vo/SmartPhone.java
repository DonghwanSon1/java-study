package com.kh.chap01_polu.part02_electronic.model.vo;

public class SmartPhone extends Electronic{
	
	private String pNum;
	
	public SmartPhone() {}

	public SmartPhone(String brand, String name, int price, String pNum) {
		super(brand, name, price);
		this.pNum = pNum;
	}

	
	
	public String getpNum() {
		return pNum;
	}
	public void setpNum(String pNum) {
		this.pNum = pNum;
	}

	@Override
	public String toString() {
		return super.toString() + ", pNum = " + this.pNum;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
