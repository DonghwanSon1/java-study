package com.kh.chap01_oneVsmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVsmany.model.vo.Book;

public class ObjectArrayRun {

	public static void main(String[] args) {
		
		// Book �迭Ŭ���� Run
		
		// �迭�� Ư¡
		// �������̴�, �ε����� 0������ , ������ �ִ�, �� ���� �ڷ��� ������ ���� �� �ִ�.��
		// int[] iArr = new int[5]; => iArr ������ �迭 5ĭ¥��
		// String[] sArr = new String[5]; => sArr ���ڿ��� �迭 5ĭ¥��
		// Book[] bArr = new Book[3]; 
		
		// ��ü �迭�� ���� �� �Ҵ�!
		// [ǥ����]
		// Ŭ�����̸�[] �迭�̸� = new Ŭ�����̸�[�迭ũ��];
		
		
		Book[] arr = new Book[3]; // arr[0], arr[1], arr[2]
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			
			System.out.println("å�� �����ּ��� : ");
			String title = sc.nextLine();
			
			System.out.println("���ǻ縦 �����ּ��� : ");
			String publisher = sc.nextLine();
			
			System.out.println("�۰��� �����ּ��� : ");
			String author = sc.nextLine();
			
			System.out.println("������ �����ּ��� : ");
			int price = sc.nextInt();
			
			System.out.println("���η��� �����ּ��� : ");
			double discountRate = sc.nextDouble();
			sc.nextLine();
			
			arr[i] = new Book(title, publisher, author,price, discountRate);
		}
		for(int i = 0; i < 3; i++) {
			arr[i].inform();
		}
		
		System.out.println("�˻��� å ���� : ");
		String searchTitle = sc.nextLine();
		
		for(int i = 1; i < arr.length+1; i++) {
			if(arr[i].getTitle().equals(searchTitle)) {
				System.out.println(i + "��°�� " + searchTitle + "�� ������ : " + arr[i].getPrice());
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
