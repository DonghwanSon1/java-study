package com.kh.chap01_oneVsmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVsmany.model.vo.Book;

public class ObjectRun {

	public static void main(String[] args) {
		
		// Book 클래스 Run
		
		
		Book b1 = new Book();
//		b.setAuthor("손동환");
//		b.setTitle("자바");
//		b.setPublisher("kh");
//		b.setPrice(150000);
//		b.setDiscountRate(0.5);
		b1.inform();
		
		Book b2 = new Book("신", "열린책들", "베르나르베르베르");
		b2.inform();
		
		Book b3 = new Book("자바의 정석", "자바출판사", "남궁성", 15000, 0.1);
		b3.inform();
		
		// 도서정보를 입력받아서 도서들의 정보를 출력해주는 프로그램!
		// 책 3권의 정보를 입력받겠다고 가정할것!
		// 객체를 따로따로 관리!
		// 입력은 스캐너 사용!!
		
		b1 = null;
		b2 = null;
		b3 = null; // reset
		
		Scanner sc = new Scanner(System.in);
		for(int i = 1; i <= 3; i++) {
		System.out.println("책을 적어주세요 : ");
		String title = sc.nextLine();
		
		System.out.println("출판사를 적어주세요 : ");
		String publisher = sc.nextLine();
		
		System.out.println("작가를 적어주세요 : ");
		String author = sc.nextLine();
		
		System.out.println("가격을 적어주세요");
		int price = sc.nextInt();
		
		System.out.println("할인률을 적어주세요");
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
		
		// 실습
		// 사용자로부터 검색할 도서의 제목을 입력받아서
		// 각 전체 도서들의 제목과 하나하나 비교해서 일치하는 도서의 가격을 알려주는 프로그램
		
		System.out.println("찾고싶은 도서의 제목을 알려주세요 : ");
		String search = sc.nextLine();
		
		if(b1.getTitle().equals(search)) {
			System.out.println(search + "의 가격은 : " + b1.getPrice());
		}
		if(b2.getTitle().equals(search)) {
			System.out.println(search + "의 가격은 : " + b2.getPrice());
		}
		if(b3.getTitle().equals(search)) {
			System.out.println(search + "의 가격은 : " + b3.getPrice());
		}
		
		
		
		
		
	}

}
