package com.kh.example.practice4.model.vo;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork2 {

	public void homework2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڿ� : ");
		String word = sc.next();
		
		char[] arr = new char[word.length()];

		System.out.println("���� : ");
		char word2 = sc.next().charAt(0);
		
		int sum = 0;
		System.out.print(word + "�� " + word2 + "�� �����ϴ� ��ġ(�ε���) : "); 
		for(int i = 0; i < arr.length; i++) {
			arr[i] = word.charAt(i);
			if(word2 == arr[i]) {
				System.out.print(i + " ");
				sum++;
			}
		}
			
		System.out.println(" ");
		System.out.println(word2 + "�� ���� : " + sum);	
		
	}
	
}
