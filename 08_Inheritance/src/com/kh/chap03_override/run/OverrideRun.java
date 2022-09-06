package com.kh.chap03_override.run;

import com.kh.chap03_override.model.vo.Book;

public class OverrideRun {

	public static void main(String[] args) {
		
		
		Book b = new Book("자바의 정석", "남궁성", 10000);
		
		System.out.println(b.toString());
		System.out.println(b); // toString이 생략을 해도 결과값은 같다.(오버라이딩해서)
				
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
