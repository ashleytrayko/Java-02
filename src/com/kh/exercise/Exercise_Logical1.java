package com.kh.exercise;

import java.util.Scanner;

public class Exercise_Logical1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		
		int num = sc.nextInt();
		
		boolean flag = 0 < num && num < 101;
		// 삼항연산자일 경우 String isResult = 0 < num && num < 101 ? "true" : "false";
		
		System.out.println("1부터 100사이의 숫자인가? " + flag);
	}

}
