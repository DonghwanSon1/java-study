package com.kh.chap02.run;

import java.util.ArrayList;

import com.kh.chap02.objectArray.model.vo.Phone;

public class ObjectArrayRun {

	public static void main(String[] args) {
		
		// Phone 클래스의 Run
		
		Phone[] arr = new Phone[3];
		
		System.out.println(arr); // => 주소값나옴
		System.out.println(arr.length); // => 3
		System.out.println(arr[0]); // => null
		
		arr[0] = new Phone();
		System.out.println(arr[0]);
		arr[0].setName("아이폰");
		arr[0].setSeries("13");
		arr[0].setBrand("Apple");
		arr[0].setPrice(1090000);
		System.out.println(arr[0].information());
		
		arr[1] = new Phone("갤럭시", "S22", "삼성", 2200000);
		arr[2] = new Phone("애니콜", "ANC", "삼성", 3000000);
		
		// 총가격, 평균가 출력
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i].getPrice();
		}
		System.out.println("총 합계 : " + sum + ", 평균가 : " + (sum/arr.length));
		
		
		// ArrayList 버전
		ArrayList<Phone> list = new ArrayList<>(3); // Phone 객체만 담을 수 있는 ArrayList(3칸짜리)를 생성
		
		list.add(new Phone("갤럭시", "S22", "삼성", 2200000));
		list.add(new Phone("아이폰", "13", "Apple", 1090000));
		list.add(new Phone("애니콜", "ANC", "삼성", 3000000));
		list.add(0, new Phone("아이폰", "14", "Apple", 50000)); // 자동으로 사이즈 up, 0번 인덱스에 삽입
		
		int sum2 = 0;
		for(int i = 0; i < list.size(); i++) {
			sum2 += list.get(i).getPrice();
		}
		System.out.println("총 합계 : " + sum2 + ", 평균가 : " + (sum2/list.size()));
		
		
		
		

	}

}
