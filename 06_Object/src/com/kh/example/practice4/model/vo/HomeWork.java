package com.kh.example.practice4.model.vo;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork {
	
	public void homework() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� : ");
		int num = sc.nextInt();
	
		int[] arr = new int [num];
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			System.out.println("�迭 " + i + "��° �ε����� ���� �� : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("���� : " + sum);
	}
	
}
