package com.kh.exercise;

public class Exercise_Typetrans2 {
	public static void main(String[] args) {
		int iNum1 = 3;
		double iNum2 = 2.55567; // 자동형변환
		double result = iNum1 + iNum2;
		System.out.println(result);
		System.out.println((int)result); // 강제형변환
	}
}
