package com.kh.model.vo;

public class Bus {

	private String busHour;
	private int busNum;
	private String busType;
	private String location;
	
	
	public Bus() {}


	public Bus(String busHour, int busNum, String busType, String location) {
		this.busHour = busHour;
		this.busNum = busNum;
		this.busType = busType;
		this.location = location;
	}


	public String getBusHour() {
		return busHour;
	}


	public void setBusHour(String busHour) {
		this.busHour = busHour;
	}


	public int getBusNum() {
		return busNum;
	}


	public void setBusNum(int busNum) {
		this.busNum = busNum;
	}


	public String getBusType() {
		return busType;
	}


	public void setBusType(String busType) {
		this.busType = busType;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	
	
	@Override
	public String toString() {
		return "버스 [ 버스시간 : " + busHour + ", 버스 차 번호 : " + busNum + ", 버스 타입 : " + busType + ", 목적지 : " + location
				+ "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
