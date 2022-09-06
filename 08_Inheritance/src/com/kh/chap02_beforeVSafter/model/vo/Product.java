package com.kh.chap02_beforeVSafter.model.vo;

/*
 * ���
 * �� Ŭ�������� �ߺ��� �ʵ�, �޼������ �� �ѹ� �� �ϳ��� Ŭ����(�θ�Ŭ����)�� �����ص� ��
 * �ش� Ŭ������ ������ ������ ���� ����
 * 
 * 
 * ������ Ŭ������ �̿��ؼ� ���ο� Ŭ������ �����.
 */

public class Product {

	// ����Ǵ� �ʵ� : brand, pCode, pName, price
	// �ʵ��
	private String brand;
	private String pCode;
	private String pName;
	private int price;
	
	// �����ں�
	public Product() {}
	
	public Product(String brand, String pCode, String pName, int price) {
		super();
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
	}

	
	
	// �޼����
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getpCode() {
		return pCode;
	}
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}
	
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String information() {
		 return "�귣��� : " + this.brand + ", ��ǰ�ڵ� : " + this.pCode + ", ��ǰ�� : "
				+ this.pName + ", ��ǰ ���� : " + this.price;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
