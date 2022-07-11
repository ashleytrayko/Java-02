package com.kh.exercise;

import java.util.Scanner;

public class Exercise_Logical2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 하나 입력해주세요 : ");
		char alpha = sc.next().charAt(0);
		//boolean cap = 65 <= alpha && alpha <= 90; // -> 아스키코드 숫자를 이용
		//System.out.println("영어 대문자 확인 : " + cap);
		
		//char alpha = sc.next().charAt(0);
		//boolean cap = alpha >= 'A' && alpha <= 'Z'; // -> 이것도 가능
		//System.out.println("영어 대문자 확인 : " + cap);
		 
	}
}
