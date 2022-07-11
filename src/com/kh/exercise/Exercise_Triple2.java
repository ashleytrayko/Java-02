package com.kh.exercise;

import java.util.Scanner;

public class Exercise_Triple2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 수 : ");
		int num2 = sc.nextInt();
		
		System.out.print("연산자 입력 (+ or -): ");
		char operator = sc.next().charAt(0);
		
		String result = (operator == '+') ? num1 + num2 + "" : ((operator == '-') ? num1 - num2 + "" : "잘못입력하셨습니다."); // int 를 String 형변환하기 위해 "" 추가
		// String.valueOf() 함수를 사용해도 됨 ex) String.valueOf(num1 + num2)
		System.out.println("결과 : " + result);
		 
		
		
	
	}

}
