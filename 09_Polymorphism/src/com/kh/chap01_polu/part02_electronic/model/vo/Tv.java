package com.kh.chap01_polu.part02_electronic.model.vo;

public class Tv extends Electronic{

	private int inch;
	
	public Tv() {}

	public Tv(String brand, String name, int price, int inch) {
		super(brand, name, price);
		this.inch = inch;
	}

	public int getInch() {
		return inch;
	}
	public void setInch(int inch) {
		this.inch = inch;
	}

	@Override
	public String toString() {
		return super.toString() + ", inch = " + this.inch + " ] ";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
