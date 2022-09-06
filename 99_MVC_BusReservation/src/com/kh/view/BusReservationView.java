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
				
				System.out.println("----- ��õ �������� ���α׷� -----");
				System.out.println("1. ���� �ð�ǥ ��� ");
				System.out.println("2. ������ �˻� ");
				System.out.println("3. ���� ���� ");
				System.out.println("4. ���� ���� ��� ");
				System.out.println("5. ���� �ð�ǥ ���� ");
				System.out.println("6. ���� ���� ���� ���� ");
				System.out.println("0. ���� ");
				
				System.out.println(" �޴� ���� > ");
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
					System.out.println("���α׷� �����ϰڽ��ϴ�!!!");
					return;
				default :
					System.out.println("�޴��� �ٽ� �Է��� �ּ���!!!");
				}
			}
		}
	
	public void selectList() {
		System.out.println("---- ���� �ð�ǥ ----");
		ArrayList<Bus> busList = brc.selectList();		
		for(Bus b : busList) {
			System.out.println(b);
		}
		System.out.println();
	}
	
	
	public void searchBus() {
		System.out.println("---- ������ �˻� ----");
		System.out.println("���ϴ� ������ : ");
		String location = sc.nextLine();
		
		ArrayList<Bus>busList = brc.searchBus(location);
		for(Bus b : busList) {
			System.out.println(b);
		}
		System.out.println();
		
	}
	
	
	public void bookBus() {
		System.out.println("---- ���� ���� ----");
		System.out.println("������ : ");
		String location = sc.nextLine();		
		System.out.println("�����ð� ex)xx:xx :");
		String busHour = sc.nextLine();
		
		int result = brc.bookBus(location, busHour);
		if(result > 0) {
			System.out.println("���������� �����߽��ϴ�!");
		} else {
			System.out.println("�������� ���߽��ϴ�. �ٽ� �õ����ּ���!");
		}
	}
	
	
	
	public void deleteBus() {
		System.out.println("---- ���� ���� ��� ----");
		System.out.println("�� �޹�ȣ �Է� > ");
		int busNum = sc.nextInt();
		
		int result = brc.deleteBus(busNum);
		if(result > 0) {
			System.out.println("���������� ���� ��� �߽��ϴ�!");
		} else {
			System.out.println("���� ��� ���� ���߽��ϴ�. �ٽ� �õ����ּ���!");
		}
		
	}
	
	
	
	public void updateBus() {
		System.out.println("----- ���� ���� �ð�ǥ ���� -----");
		System.out.println("�ٲٰ� ���� ������ > ");
		String location = sc.nextLine();
		System.out.println("�ٲٰ� ���� �ð� > ");
		String busHour = sc.nextLine();
		
		System.out.println("�ٲ� ������ > ");
		String updateLocation = sc.nextLine();
		System.out.println("�ٲ� �ð� > ");
		String updateBusHour = sc.nextLine();

		int result = brc.updateBus(location, busHour, updateLocation, updateBusHour);
		if(result > 0) {
			System.out.println("���������� ���� ���� �߽��ϴ�!");
		} else {
			System.out.println("���� ���� ���� ���߽��ϴ�. �ٽ� �õ����ּ���!");
		}
		
	}
	

	
	public void myBusList() {
		System.out.println("---- ���� ���� ���� ���� ----");
		ArrayList<Bus> mybusList = brc.myBusList();
		
		for(Bus b : mybusList) {
			System.out.println(b);
		}
		System.out.println();
	}
	
	
	
	
	
}
