package com.kh.chap01_polu.part02_electronic.run;

import com.kh.chap01_polu.part02_electronic.controller.ElectronicController2;
import com.kh.chap01_polu.part02_electronic.model.vo.*;

public class Run {
	public static void main(String[] args) {
		
		// 1. 다형성을 적용 안했을 경우(Eletronic Controller1)
		// 객체를 생성 : 재고를 담을 필드들이 메모리영역에 올라감
		/*
		ElectronicController1 ec1 = new ElectronicController1();
		
		// 재고추가
		ec1.insert(new SmartPhone("LG", "베가", 800000, "010-1111-2222"));
		ec1.insert(new NintendoSwitch("Nintendo", "Swithch", 310000, true));
		ec1.insert(new Tv("LG", "짱짱조은티비", 3000000, 100));
		
		
		// 가게에 있는 제품들을 조회해 올것
		NintendoSwitch ns = ec1.selectNintendoSwitch();
		SmartPhone sp = ec1.selectSmartPhone();
		Tv tv = ec1.selectTv();
		
		System.out.println(ns);
		System.out.println(sp);
		System.out.println(tv);
		*/
		
		
		
		// 2. 다형성을 적용했을 경우(Electronic Controller2)
		
		// 객체 생성
		ElectronicController2 ec2 = new ElectronicController2();
		
		// 재고 추가
		ec2.insert(new SmartPhone("LG", "베가", 800000, "010-1111-2222"), 0);
		ec2.insert(new NintendoSwitch("Nintendo", "Swithch", 310000, true), 1);
		ec2.insert(new Tv("LG", "짱짱조은티비", 3000000, 100), 2);
		
		// 재고 조회
		System.out.println("======== 재고 조회 ============");
		SmartPhone sp = (SmartPhone)ec2.select(0); // => 객체 타입은 부모(Electronic)
		// 스마트폰 입장
		// 부모님껀 누구꺼? 내꺼
		// 내껀? 내꺼
		
		// 일렉트로닉 입장
		// 내껀? 내꺼
		// 자식껀 자식꺼
		
		NintendoSwitch ns = (NintendoSwitch)ec2.select(1); // => 객체 타입은 부모(Electronic)
		Tv tv = (Tv)ec2.select(2); // => 객체 타입은 부모(Electronic)
		
		System.out.println(sp);
		System.out.println(ns);
		System.out.println(tv);
		
		// 재고를 싸그리 몽땅 보겠다.
		System.out.println("====== 총 재고 =======");
		Electronic[] elec = ec2.selectAll();
		// 깊은 복사, 얕은 복사
		for(int i = 0; i < elec.length; i++) {
			System.out.println(elec[i]);
		}
		
		/*
		 * 다형성을 사용하는 이유 
		 * 
		 * ★부모타입의 자료형으로 다양한 자식객체들을 모두 다룰 수 있다.★
		 * 
		 * => 메서드의 갯수가 줄어든다.
		 * => 코드가 줄어든다.
		 * => 부모타입의 객체배열로 자식객체들 사용가능(반복문 사용가능)
		 * => 소스코드가 줄어드니깐 효율성이 높아진다.
		 * 
		 */
		
		
		
		
		
	}
	
	
	
	
}
