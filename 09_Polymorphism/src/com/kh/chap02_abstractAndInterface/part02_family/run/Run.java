package com.kh.chap02_abstractAndInterface.part02_family.run;

import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Baby;
import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Basic;
import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Mother;

public class Run {

	public static void main(String[] args) {
		
		
		// Person p = new Person();
		// Person은 추상클래스라 객체 생성 불가능!
		
		// 다형성 적용 인터페이스 적용 전
	/*	Person mom = new Mother("엄마", 160, 50, "출산");
		Person baby = new Baby("응애", 90, 2.3 );
		
		System.out.println(mom);
		System.out.println(baby);
		
		// 밥먹고, 잠자기
		mom.eat(); // 엄마 : 몸무게 + 10, 키 + 0.0001
		baby.eat(); // 애기 : 몸무게 + 5, 키 + 0.5
		mom.sleep(); // 엄마 : 키 + 0.00001 
		baby.sleep(); // 애기 : 키 + 0.1
		System.out.println("========= 먹고 자기 ============");
		System.out.println(mom);
		System.out.println(baby);
		
		*/
		
		// 2. 인터페이스 적용 후
		// Basic b = new Basic(); // 객체 생성 불가능
		
		Basic mom = new Mother("엄마", 160, 50, "출산");
		Basic baby = new Baby("응애", 90, 2.3 );
		
		System.out.println(mom);
		System.out.println(baby);
		
		// 밥먹고, 잠자기
		mom.eat(); // 엄마 : 몸무게 + 10, 키 + 0.0001
		baby.eat(); // 애기 : 몸무게 + 5, 키 + 0.5
		mom.sleep(); // 엄마 : 키 + 0.00001 
		baby.sleep(); // 애기 : 키 + 0.1
		System.out.println("========= 먹고 자기 ============");
		System.out.println(mom);
		System.out.println(baby);
		
		
		
		
		
		
		
		

	}

}
