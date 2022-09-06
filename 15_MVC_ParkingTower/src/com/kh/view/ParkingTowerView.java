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
			
			System.out.println("----- �������� ���α׷� -----");
			System.out.println("1. ���� ���� ");
			System.out.println("2. ���� ���� ");
			System.out.println("3. ���� �˻� ");
			System.out.println("4. ��ü ��� ");
			System.out.println("0. ���� ");
			
			System.out.println(" �޴� ���� > ");
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
				System.out.println("���α׷� �����ϰڽ��ϴ�!!!");
				return;
			default :
				System.out.println("�޴��� �ٽ� �Է��� �ּ���!!!");
			}
		}
	}
	
	
	public void insertCar() {
		System.out.println("---- ���� �߰� ----");
		System.out.println("�� �޹�ȣ �Է� > ");
		int carNum = sc.nextInt();
		System.out.println("������ ����  ");
		System.out.println("1. ����, 2. ����, 3. SUV, 4. Ʈ��  ");
		int carType = sc.nextInt();
		sc.nextLine();
		System.out.println("�����ڸ� : ");
		String owner = sc.nextLine();
		
		ptc.insertCar(carNum, carType, owner);
	}
	
	
	public void deleteCar() {
		
		System.out.println("---- ���� ���� ----");
		System.out.println("�� �޹�ȣ �Է� > ");
		int carNum = sc.nextInt();
		
		int result = ptc.deleteCar(carNum);
		if(result > 0) {
			System.out.println("������ ����ȣ '" + carNum + "'�� �����߽��ϴ�.!");
		} else {
			System.out.println("������ ����ȣ '" + carNum + "'�� ã�� ���߽��ϴ�.");
		}
		
		
		
	}
	
	
	public void searchCar() {
		
		System.out.println("---- ���� �˻� ----");
		System.out.println("�� �����ڸ� �˻� > ");
		String owner = sc.nextLine();
		
		ArrayList<Car> carList = ptc.searchCar(owner);

		System.out.println("*** ���� �˻� ��� ***");
		if(carList.isEmpty()) {
			System.out.println("�˻��� '" + owner + "'���� ���� �����ϴ�!!");
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
			System.out.println("������ ������ �����ϴ�!!");
		} else {
			for(Car m : carList) {
			System.out.println(m);
			}
		}
		
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
}
