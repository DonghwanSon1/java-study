package com.kh.chap02_abstractAndInterface.part01_basic.model.vo;

public class Soccer extends Sports{

	// 추상클래스를 상속받으면 무조건 abstract메서드를  완성시켜주던가 아니면 
	// 상속받은 자식도 abstract 클래스로 만들어줘야된다.
	@Override
	public void rule() {
		System.out.println("손으로 공을 만지면 혼남!");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
