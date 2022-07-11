package com.kh.operator;

public class Exam_Logical {
	public static void main(String[] args) {
		System.out.println("논리연산자 예제");
		int a = 50;
		int b = 30;
		boolean result1, result2, result3, result4;
		result1 = (a != b) && (a < b);
		result2 = (a < b) || (a == b);
		result3 = (a > b) && (a != b);
		result4 = (a > b) || (a ==b);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		System.out.println("result4 : " + result4);
		System.out.println("\n");
		System.out.println("논리연산자 예제2");
		
		int c = 70;
		int d = 55;
		System.out.println("c == d || c++ < 100");
		System.out.println("c < d && --d < 55");
		System.out.println("c != d && d-- < c++");
		System.out.println("c++ != d || d++ >= 85");
		result1 = (c == d) || (c++ < 100);
		result2 = (c < d) && (--d < 55);
		result3 = (c != d) && (d-- < c++);
		result4 = (c++ != d) || (d++ >= 85);
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		System.out.println("result4 : " + result4);
		System.out.println("c : " + c);
		System.out.println("d : " + d);
		
	}
}
