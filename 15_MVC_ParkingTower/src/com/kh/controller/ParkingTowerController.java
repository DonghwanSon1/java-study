package com.kh.controller;

import java.util.ArrayList;

import com.kh.model.vo.Car;

public class ParkingTowerController {

	private ArrayList<Car> carList = new ArrayList<>();
	private int a = 0;
	
	public void insertCar(int carNum, int carType, String owner) {
			a++;
			carList.add(new Car(a, carNum, carType, owner));
			
	}
	
	
	
	public int deleteCar(int carNum) {
		int result = 0;
		for(int i = 0; i < carList.size(); i++) {
			if(carList.get(i).getCarNum() == carNum) {
				carList.remove(i);
				result++;
			}
		}
		return result;
	}
	
	
	
	public ArrayList<Car> searchCar(String owner){
		ArrayList<Car> searched = new ArrayList<>(); 
		
		for(int i = 0; i < carList.size(); i++) {
			if(carList.get(i).getOwner().contains(owner)) {
				searched.add(carList.get(i));
			}
		}
		return searched;
	}
	
	
	public ArrayList<Car> selectList(){
		
		return carList;
	}
	
	
	
	
	
	
	
}
