package com.kh.exscanner;

import java.util.Scanner;

public class TestScanner2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요 : ");
		int iNum = sc.nextInt();
		
		System.out.println("실수를 입력해주세요 : ");
		double dNum = sc.nextDouble();
		
		System.out.println("문자열을 입력해주세요 : ");
		String inputStr = sc.next(); // .next() -> 공백안받기, .nextLine() -> 공백도 받아오기
		
		System.out.println("문자를 입력해주세요 : ");
		char inputChar = sc.next().charAt(0); // charAt -> 글자 잘라오기
		
		System.out.println("입력한 정수는 : " + iNum);
		System.out.println("입력한 실수는 : " + dNum);
		System.out.println("입력한 문자는 : " + inputChar);
		System.out.println("입력한 문자열은 : " + inputStr);
	}
}
