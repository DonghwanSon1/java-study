package com.kh.chap03.model.vo;

public class Product {
	
	// ��ǰ����, ��ǰ��, �귣���
	
	// [�ʵ��]
	private int price;
	private String name;
	private String b_name;
	
	// [�����ں�]

	// [�޼����]
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
		return this.b_name + " �귣�� " + this.name + "�� " + this.price + "�� �Դϴ�.!";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
