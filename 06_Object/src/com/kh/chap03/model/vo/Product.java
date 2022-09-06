package com.kh.chap03.model.vo;

public class Product {
	
	// 상품가격, 상품명, 브랜드명
	
	// [필드부]
	private int price;
	private String name;
	private String b_name;
	
	// [생성자부]

	// [메서드부]
	//------------setter---------
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setB_Name(String b_Name) {
		this.b_name = b_Name;
	}
	
	//-----------getter-------------
	public int getPrice() {
		return this.price;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getB_Name() {
		return this.b_name;
	}
	
	//--------------info-----------
	public String information() {
		return this.b_name + " 브랜드 " + this.name + "는 " + this.price + "원 입니다.!";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
