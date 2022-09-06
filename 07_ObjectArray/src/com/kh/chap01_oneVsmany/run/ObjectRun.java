package com.kh.chap01_oneVsmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVsmany.model.vo.Book;

public class ObjectRun {

	public static void main(String[] args) {
		
		// Book Ŭ���� Run
		
		
		Book b1 = new Book();
//		b.setAuthor("�յ�ȯ");
//		b.setTitle("�ڹ�");
//		b.setPublisher("kh");
//		b.setPrice(150000);
//		b.setDiscountRate(0.5);
		b1.inform();
		
		Book b2 = new Book("��", "����å��", "����������������");
		b2.inform();
		
		Book b3 = new Book("�ڹ��� ����", "�ڹ����ǻ�", "���ü�", 15000, 0.1);
		b3.inform();
		
		// ���������� �Է¹޾Ƽ� �������� ������ ������ִ� ���α׷�!
		// å 3���� ������ �Է¹ްڴٰ� �����Ұ�!
		// ��ü�� ���ε��� ����!
		// �Է��� ��ĳ�� ���!!
		
		b1 = null;
		b2 = null;
		b3 = null; // reset
		
		Scanner sc = new Scanner(System.in);
		for(int i = 1; i <= 3; i++) {
		System.out.println("å�� �����ּ��� : ");
		String title = sc.nextLine();
		
		System.out.println("���ǻ縦 �����ּ��� : ");
		String publisher = sc.nextLine();
		
		System.out.println("�۰��� �����ּ��� : ");
		String author = sc.nextLine();
		
		System.out.println("������ �����ּ���");
		int price = sc.nextInt();
		
		System.out.println("���η��� �����ּ���");
		double discountRate = sc.nextDouble();
		sc.nextLine();
		
		if(i == 1) {
			b1 = new Book(title, publisher, author, price, discountRate);
		}else if(i == 2) {
			b2 = new Book(title, publisher, author, price, discountRate);
		}else {
			b3 = new Book(title, publisher, author, price, discountRate);
		}
	}
		
		b1.inform();
		b2.inform();
		b3.inform();
		
		// �ǽ�
		// ����ڷκ��� �˻��� ������ ������ �Է¹޾Ƽ�
		// �� ��ü �������� ����� �ϳ��ϳ� ���ؼ� ��ġ�ϴ� ������ ������ �˷��ִ� ���α׷�
		
		System.out.println("ã����� ������ ������ �˷��ּ��� : ");
		String search = sc.nextLine();
		
		if(b1.getTitle().equals(search)) {
			System.out.println(search + "�� ������ : " + b1.getPrice());
		}
		if(b2.getTitle().equals(search)) {
			System.out.println(search + "�� ������ : " + b2.getPrice());
		}
		if(b3.getTitle().equals(search)) {
			System.out.println(search + "�� ������ : " + b3.getPrice());
		}
		
		
		
		
		
	}

}
