package com.kh.example.practice4.model.vo;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork {
	
	public void homework() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 : ");
		int num = sc.nextInt();
	
		int[] arr = new int [num];
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			System.out.println("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("총합 : " + sum);
	}
	
}
