package com.kh.model.vo;

public class Car {

	private int parkingNum;
	private int carNum;
	private int carType;
	private String owner;
	
	public Car () {}

	
	
	public Car(int parkingNum, int carNum, int carType, String owner) {
		this.parkingNum = parkingNum;
		this.carNum = carNum;
		this.carType = carType;
		this.owner = owner;
	}

	public int getParkingNum() {
		return parkingNum;
	}

	public void setParkingNum(int parkingNum) {
		this.parkingNum = parkingNum;
	}

	public int getCarNum() {
		return carNum;
	}

	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}

	public int getCarType() {
		return carType;
	}

	public void setCarType(int carType) {
		this.carType = carType;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	
	
	@Override
	public String toString() {
		String carType = null;
		if(this.carType == 1) {
			carType = "경차";
		} else if(this.carType == 2) {
			carType = "세단";
		} else if(this.carType == 3) {
			carType = "SUV";
		} else if(this.carType == 4) {
			carType = "트럭";
		}
		
		return "주차장 => [ 주차NO. : " + parkingNum + ", 차번호 : " + carNum + ", 차종류 : " + carType + ", 차오너 : " + owner
				+ "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
