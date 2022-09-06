package com.kh.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.controller.ParkingTowerController;
import com.kh.model.vo.Car;

public class ParkingTowerView {

	private Scanner sc = new Scanner(System.in);
	private ParkingTowerController ptc = new ParkingTowerController();
	
	public void mainMenu() {
		
		while(true) {
			
			System.out.println("----- 주차관리 프로그램 -----");
			System.out.println("1. 차량 주차 ");
			System.out.println("2. 차량 출차 ");
			System.out.println("3. 차량 검색 ");
			System.out.println("4. 전체 출력 ");
			System.out.println("0. 종료 ");
			
			System.out.println(" 메뉴 선택 > ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 :
				insertCar();
				break;
			case 2 :
				deleteCar();
				break;
			case 3 :
				searchCar();
				break;
			case 4 :
				selectList();
				break;
			case 0 :
				System.out.println("프로그램 종료하겠습니다!!!");
				return;
			default :
				System.out.println("메뉴를 다시 입력해 주세요!!!");
			}
		}
	}
	
	
	public void insertCar() {
		System.out.println("---- 차량 추가 ----");
		System.out.println("차 뒷번호 입력 > ");
		int carNum = sc.nextInt();
		System.out.println("차량의 종류  ");
		System.out.println("1. 경차, 2. 세단, 3. SUV, 4. 트럭  ");
		int carType = sc.nextInt();
		sc.nextLine();
		System.out.println("소유자명 : ");
		String owner = sc.nextLine();
		
		ptc.insertCar(carNum, carType, owner);
	}
	
	
	public void deleteCar() {
		
		System.out.println("---- 차량 출차 ----");
		System.out.println("차 뒷번호 입력 > ");
		int carNum = sc.nextInt();
		
		int result = ptc.deleteCar(carNum);
		if(result > 0) {
			System.out.println("출차할 차번호 '" + carNum + "'을 출차했습니다.!");
		} else {
			System.out.println("출차할 차번호 '" + carNum + "'을 찾지 못했습니다.");
		}
		
		
		
	}
	
	
	public void searchCar() {
		
		System.out.println("---- 차량 검색 ----");
		System.out.println("차 소유자명 검색 > ");
		String owner = sc.nextLine();
		
		ArrayList<Car> carList = ptc.searchCar(owner);

		System.out.println("*** 차량 검색 결과 ***");
		if(carList.isEmpty()) {
			System.out.println("검색한 '" + owner + "'님의 차는 없습니다!!");
		} else {
			for(Car m : carList) {
				System.out.println(m);
			}
		}
		
		System.out.println();
		
		
	}
	
	
	public void selectList() {
		ArrayList<Car> carList = ptc.selectList();
		if(carList.isEmpty()) {
			System.out.println("주차된 차량이 없습니다!!");
		} else {
			for(Car m : carList) {
			System.out.println(m);
			}
		}
		
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
}
