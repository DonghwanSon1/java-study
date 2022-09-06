package com.kh.chap01_polu.part02_electronic.model.vo;

public class NintendoSwitch extends Electronic{

	
	private boolean controller;
	
	public NintendoSwitch() {}

	public NintendoSwitch(String brand, String name, int price, boolean controller) {
		super(brand, name, price);
		this.controller = controller;
	}

	public boolean iscontroller() {
		return controller;
	}
	public void setUse(boolean controller) {
		this.controller = controller;
	}

	@Override
	public String toString() {
		return super.toString() + ", controller = " + controller;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
