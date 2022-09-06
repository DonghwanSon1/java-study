package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;

public class PersonMenu {
	
	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();
	
	
	
	public void mainMenu() {
		System.out.println("�л���  �ִ�  3�����  ������  ��  �ֽ��ϴ�. ");
		System.out.println("���� ����� �л��� " + pc.personCount()[0] + "���Դϴ�.");
		System.out.println("�����  �ִ�  10�����  ������  ��  �ֽ��ϴ�.");
		System.out.println("���� ����� ����� " + pc.personCount()[1] + "���Դϴ�.");
		
		boolean a = true;
		do {
		System.out.println();
		System.out.println("1. �л� �޴�");
		System.out.println("2. ��� �޴�");
		System.out.println("9. ������");
		System.out.print("�޴� ��ȣ : ");
		String num = sc.nextLine();
		System.out.println();
		
		if(num.equals("1")) {
			studentMenu();
			a = false;
		} else if (num.equals("2")) {
			employeeMenu();
			a = false;
		} else if(num.equals("9")) {
			System.out.println("�����մϴ�.");
			a = false;
		}else {
			System.out.println("�߸�  �Է��ϼ̽��ϴ�.  �ٽ�  �Է����ּ���.");
		}
	}while(a);
		
	}
	
	public void studentMenu() {
		boolean a = true;
		do {
			System.out.println("1. �л� �߰�");
			System.out.println("2. �л� ����");
			System.out.println("9. ��������");
			if(pc.personCount()[0] == 3) {
				System.out.println("�л��� ���� �� �ִ� ������ �� á�� ������ �л� �߰� �޴��� �� �̻� Ȱ��ȭ ���� �ʽ��ϴ�!");
			}		
			System.out.print("�޴� ��ȣ : ");
			String num = sc.nextLine();
			System.out.println();
			
			if(num.equals("1") && (pc.personCount()[0] == 3)) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				System.out.println();
			} else if(num.equals("1")) {
				insertStudent();
				a = false;
			} else if (num.equals("2")) {
				printStudent();
				System.out.println();
				studentMenu();
				a = false;
			} else if(num.equals("9")) {
				System.out.println("�������� ���ư��ϴ�.");
				mainMenu();
				a = false;
			} else {
				System.out.println("�߸�  �Է��ϼ̽��ϴ�.  �ٽ�  �Է����ּ���.");
			}
		}while(a);
	}
	
	public void employeeMenu() {
		boolean a = true;
		do {
			System.out.println("1. ��� �߰�");
			System.out.println("2. ��� ����");
			System.out.println("9. ��������");
			if(pc.personCount()[1] == 10) {
				System.out.println("����� ���� �� �ִ� ������ �� á�� ������ ��� �߰� �޴��� �� �̻� Ȱ��ȭ ���� �ʽ��ϴ�!");
			}		
			System.out.print("�޴� ��ȣ : ");
			String num = sc.nextLine();
			System.out.println();
			
			if(num.equals("1") && (pc.personCount()[1] == 10)) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				System.out.println();
			} else if(num.equals("1")) {
				insertEmployee();
				a = false;
			} else if (num.equals("2")) {
				printEmployee();
				System.out.println();
				employeeMenu();
				a = false;
			} else if(num.equals("9")) {
				System.out.println("�������� ���ư��ϴ�.");
				mainMenu();
				a = false;
			} else {
				System.out.println("�߸�  �Է��ϼ̽��ϴ�.  �ٽ�  �Է����ּ���.");
			}
		}while(a);
	}
	
	public void insertStudent() {
		while(true) {
		System.out.print("�л� �̸� : ");
		String name = sc.nextLine();
		System.out.print("�л� ���� : ");
		int age = sc.nextInt();
		System.out.print("�л� Ű : ");
		double height = sc.nextDouble();
		System.out.print("�л� ������ : ");
		double weight = sc.nextDouble();
		System.out.print("�л� �г� : ");
		int grade = sc.nextInt();
		sc.nextLine();
		System.out.print("�л� ���� : ");
		String major = sc.nextLine();
		System.out.println();
		pc.insertStudent(name, age, height, weight, grade, major);
		
		if(pc.personCount()[0] == 3) {
			System.out.println("�л��� ���� �� �ִ� ������ �� á�� ������ �л� �߰��� �����ϰ� �л� �޴��� ���ư��ϴ�.");
			System.out.println();
			studentMenu();
			break;
		}	
		if(pc.personCount()[0] < 3) {
			System.out.println("�׸��Ͻ÷���  N(�Ǵ�  n),  �̾��Ͻ÷���  �ƹ�  Ű��  ��������  : ");
			char anyKey = sc.nextLine().charAt(0);
			if(anyKey == 'N' || anyKey == 'n') {
				studentMenu();
				break;
			}
		}
	}
	}
	
	public void printStudent() {
		for(int i = 0; i < pc.personCount()[0]; i++) {
			System.out.println(pc.printStudent()[i]);
		}
	}
	
	public void insertEmployee() {
		while(true) {
			System.out.print("��� �̸� : ");
			String name = sc.nextLine();
			System.out.print("��� ���� : ");
			int age = sc.nextInt();
			System.out.print("��� Ű : ");
			double height = sc.nextDouble();
			System.out.print("��� ������ : ");
			double weight = sc.nextDouble();
			System.out.print("��� �޿� : ");
			int salary = sc.nextInt();
			sc.nextLine();
			System.out.print("��� �μ� : ");
			String dept = sc.nextLine();
			System.out.println();
			pc.insertEmployee(name, age, height, weight, salary, dept);
			
			if(pc.personCount()[1] == 10) {
				System.out.println("����� ���� �� �ִ� ������ �� á�� ������ ��� �߰��� �����ϰ� ��� �޴��� ���ư��ϴ�.");
				System.out.println();
				employeeMenu();
				break;
			}	
			if(pc.personCount()[1] < 10) {
				System.out.println("�׸��Ͻ÷���  N(�Ǵ�  n),  �̾��Ͻ÷���  �ƹ�  Ű��  ��������  : ");
				char anyKey = sc.nextLine().charAt(0);
				if(anyKey == 'N' || anyKey == 'n') {
					employeeMenu();
					break;
				}
			}
		}
	}
	
	public void printEmployee() {
		for(int i = 0; i < pc.personCount()[1]; i++) {
			System.out.println(pc.printEmployee()[i]);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
