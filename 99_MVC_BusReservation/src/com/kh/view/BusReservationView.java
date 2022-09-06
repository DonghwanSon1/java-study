package com.kh.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.controller.BusReservationController;
import com.kh.model.vo.Bus;




	public class BusReservationView {
	
		private Scanner sc = new Scanner(System.in);
		private BusReservationController brc = new BusReservationController();
		
		
	public void mainMenu() {
			
			while(true) {
				
				System.out.println("----- 인천 버스예매 프로그램 -----");
				System.out.println("1. 버스 시간표 출력 ");
				System.out.println("2. 목적지 검색 ");
				System.out.println("3. 버스 예매 ");
				System.out.println("4. 버스 예매 취소 ");
				System.out.println("5. 예매 시간표 변경 ");
				System.out.println("6. 나의 버스 예매 내역 ");
				System.out.println("0. 종료 ");
				
				System.out.println(" 메뉴 선택 > ");
				int menu = sc.nextInt();
				sc.nextLine();
				
				switch(menu) {
				case 1 :
					selectList();
					break;
				case 2 :
					searchBus();
					break;
				case 3 :
					bookBus();
					break;
				case 4 :
					deleteBus();
					break;
				case 5 :
					updateBus();
					break;
				case 6 :
					myBusList();
					break;
				case 0 :
					System.out.println("프로그램 종료하겠습니다!!!");
					return;
				default :
					System.out.println("메뉴를 다시 입력해 주세요!!!");
				}
			}
		}
	
	public void selectList() {
		System.out.println("---- 버스 시간표 ----");
		ArrayList<Bus> busList = brc.selectList();		
		for(Bus b : busList) {
			System.out.println(b);
		}
		System.out.println();
	}
	
	
	public void searchBus() {
		System.out.println("---- 목적지 검색 ----");
		System.out.println("원하는 목적지 : ");
		String location = sc.nextLine();
		
		ArrayList<Bus>busList = brc.searchBus(location);
		for(Bus b : busList) {
			System.out.println(b);
		}
		System.out.println();
		
	}
	
	
	public void bookBus() {
		System.out.println("---- 버스 예매 ----");
		System.out.println("목적지 : ");
		String location = sc.nextLine();		
		System.out.println("버스시간 ex)xx:xx :");
		String busHour = sc.nextLine();
		
		int result = brc.bookBus(location, busHour);
		if(result > 0) {
			System.out.println("성공적으로 예약했습니다!");
		} else {
			System.out.println("예약하지 못했습니다. 다시 시도해주세요!");
		}
	}
	
	
	
	public void deleteBus() {
		System.out.println("---- 버스 예매 취소 ----");
		System.out.println("차 뒷번호 입력 > ");
		int busNum = sc.nextInt();
		
		int result = brc.deleteBus(busNum);
		if(result > 0) {
			System.out.println("성공적으로 예매 취소 했습니다!");
		} else {
			System.out.println("예매 취소 하지 못했습니다. 다시 시도해주세요!");
		}
		
	}
	
	
	
	public void updateBus() {
		System.out.println("----- 버스 예매 시간표 변경 -----");
		System.out.println("바꾸고 싶은 목적지 > ");
		String location = sc.nextLine();
		System.out.println("바꾸고 싶은 시간 > ");
		String busHour = sc.nextLine();
		
		System.out.println("바꿀 목적지 > ");
		String updateLocation = sc.nextLine();
		System.out.println("바꿀 시간 > ");
		String updateBusHour = sc.nextLine();

		int result = brc.updateBus(location, busHour, updateLocation, updateBusHour);
		if(result > 0) {
			System.out.println("성공적으로 예매 변경 했습니다!");
		} else {
			System.out.println("예매 변경 하지 못했습니다. 다시 시도해주세요!");
		}
		
	}
	

	
	public void myBusList() {
		System.out.println("---- 나의 버스 예매 내역 ----");
		ArrayList<Bus> mybusList = brc.myBusList();
		
		for(Bus b : mybusList) {
			System.out.println(b);
		}
		System.out.println();
	}
	
	
	
	
	
}
