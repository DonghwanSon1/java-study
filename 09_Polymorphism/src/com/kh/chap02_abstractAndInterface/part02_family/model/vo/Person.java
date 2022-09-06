package com.kh.chap02_abstractAndInterface.part02_family.model.vo;

public abstract class Person {

	// 이름, 키, 몸무게
	private String name;
	private double height;
	private	double weight;
	
	public Person() {}

	public Person(String name, double height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "name : " + this.name + ", height : " + this.height + ", weight : " + this.weight;
	}
	
	public abstract void eat();
	public abstract void sleep();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
