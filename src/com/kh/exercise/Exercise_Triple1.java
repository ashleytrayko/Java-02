package com.kh.exercise;

import java.util.Scanner;

public class Exercise_Triple1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		String decide =  num1 > 0 ? "양수" : (num1 < 0 ? "음수" : "0");
		System.out.println("입력하신 수는 : " + decide + "입니다.");
		
	
	}

}
