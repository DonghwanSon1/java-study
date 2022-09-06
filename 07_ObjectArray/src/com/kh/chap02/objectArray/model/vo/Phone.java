package com.kh.chap02.objectArray.model.vo;

public class Phone {
	
	// [�ʵ��]
	// �̸�, �ø���, �귣��, ����
	private String name;
	private String series;
	private String brand;
	private int price;	
	
	
	// [�����ں�]
	// �⺻������
	// ��� �ʵ忡 ���� �Ű����� ������
	public Phone() {}
	
	public Phone(String name, String series, String brand, int price) {
		this.name = name;
		this.series = series;
		this.brand = brand;
		this.price = price;
	}
	
	
	// [�޼����]
	// getter/setter
	// information
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setSeries(String series) {
		this.series = series;
	}
	public String getSeries() {
		return this.series;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return this.brand;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return this.price;
	}
	
	public String information() {
		return "�̸� : " + this.name + ", �ø��� : " + this.series + ", �귣�� : " + this.brand + ", ���� : " + this.price; 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
