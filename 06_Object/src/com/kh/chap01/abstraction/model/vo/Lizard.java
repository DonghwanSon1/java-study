package com.kh.chap01.abstraction.model.vo;

// 원석씨네 도마뱀 이름은 ? => 용감 -> String name;
// 배가 하얗다. => String bellyColor;
// 발은 노랗다. => String footColor;
// 몸도 노랗다. => String bodyColor;
// 눈은 빨갛다. => String eyesColor;


/*
 * 클래스의 구조
 * 
 * public class 클래스이름 {
 * 
 * 						// 필드부
 * 
 * 
 * 						// 생성자부
 * 
 * 
 * 						// 메소드부
 * 
 * 
 * }
 */

// 도마뱀들을 추상화해서 만든 클래스
public class Lizard {
	
	// [필드부]
	// 접근 제한자 자료형 필드이름;
	
	// 접근제한자 : 이 필드에 접근할 수 있는 범위를 제한할 수 있음
	//				public > protected > default > private
	//			클래스 안에서 필드를 선언할 때 반드시 제한자를 써줄것임
	 
	public String name;
	public String bellyColor;
	public String footColor;
	public String bodyColor;
	public String eyesColor;
	public double weight;
	
	
	// [생성자부]
	
	
	
	
	// [메서드부]
	public void eat(int weight) {
		
		this.weight += weight;
		
	}
	
	public void jump() {
		
		if(weight >= 0.15 && weight < 1) {
			System.out.println("응 살안빼~ 너나해~");
		} else {
			weight -= 0.5;
		}
	}
	
	
	
	
	
	
	
	
	

}
