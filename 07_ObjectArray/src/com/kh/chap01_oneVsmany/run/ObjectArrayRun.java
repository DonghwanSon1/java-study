package com.kh.chap01_oneVsmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVsmany.model.vo.Book;

public class ObjectArrayRun {

	public static void main(String[] args) {
		
		// Book 배열클래스 Run
		
		// 배열의 특징
		// 참조형이다, 인덱스는 0번부터 , 순서가 있다, ★ 같은 자료형 끼리만 묶을 수 있다.★
		// int[] iArr = new int[5]; => iArr 정수형 배열 5칸짜리
		// String[] sArr = new String[5]; => sArr 문자열형 배열 5칸짜리
		// Book[] bArr = new Book[3]; 
		
		// 객체 배열의 선언 및 할당!
		// [표현법]
		// 클래스이름[] 배열이름 = new 클래스이름[배열크기];
		
		
		Book[] arr = new Book[3]; // arr[0], arr[1], arr[2]
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			
			System.out.println("책을 적어주세요 : ");
			String title = sc.nextLine();
			
			System.out.println("출판사를 적어주세요 : ");
			String publisher = sc.nextLine();
			
			System.out.println("작가를 적어주세요 : ");
			String author = sc.nextLine();
			
			System.out.println("가격을 적어주세요 : ");
			int price = sc.nextInt();
			
			System.out.println("할인률을 적어주세요 : ");
			double discountRate = sc.nextDouble();
			sc.nextLine();
			
			arr[i] = new Book(title, publisher, author,price, discountRate);
		}
		for(int i = 0; i < 3; i++) {
			arr[i].inform();
		}
		
		System.out.println("검색할 책 제목 : ");
		String searchTitle = sc.nextLine();
		
		for(int i = 1; i < arr.length+1; i++) {
			if(arr[i].getTitle().equals(searchTitle)) {
				System.out.println(i + "번째의 " + searchTitle + "의 가격은 : " + arr[i].getPrice());
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
