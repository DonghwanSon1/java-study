package com.kh.example.practice4.model.vo;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork2 {

	public void homework2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열 : ");
		String word = sc.next();
		
		char[] arr = new char[word.length()];

		System.out.println("문자 : ");
		char word2 = sc.next().charAt(0);
		
		int sum = 0;
		System.out.print(word + "에 " + word2 + "가 존재하는 위치(인덱스) : "); 
		for(int i = 0; i < arr.length; i++) {
			arr[i] = word.charAt(i);
			if(word2 == arr[i]) {
				System.out.print(i + " ");
				sum++;
			}
		}
			
		System.out.println(" ");
		System.out.println(word2 + "의 개수 : " + sum);	
		
	}
	
}
