package com.kh.chap02_inherit.model.vo;

public class Airplane extends Vehicle{
	
	private int wing;
	private int tire;
	
	
	public Airplane() {}
	
	
	public Airplane(String name, double mileage, String kind, int wing, int tire) {
		super(name, mileage, kind);
		this.wing = wing;
		this.tire = tire;
	}


	public int getWing() {
		return wing;
	}
	public void setWing(int wing) {
		this.wing = wing;
	}

	public int getTire() {
		return tire;
	}
	public void setTire(int tire) {
		this.tire = tire;
	}
	
	
	public String toString() {
		return super.toString() + ", 날개 크기 : " + this.wing + ", 타이어 크기 : " + this.tire;
	}
	
	
	public void howToMove() {
		System.out.println("바퀴로 구르다가 날개로 난다.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
