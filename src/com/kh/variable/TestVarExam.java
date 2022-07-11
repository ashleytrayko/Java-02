package com.kh.variable;

public class TestVarExam {
	public static void main(String[] args) {
		// 자료형별 변수를 만들고 초기화 한 후 그 값을 출력
		int iNum = 100;
		long lNum = 9999000000000l;
		float fNum = 486.520f;
		double dNum = 456.780123;
		char fCha = 'A';
		String fStr = "Hello World";
		boolean result = true;
		
		System.out.println("정수의 값 : " + iNum);
		System.out.println("정수의 값(9999억) : " + lNum);
		System.out.println("실수의 값 : " + fNum);
		System.out.println("실수의 값 : " + dNum);
		System.out.println("문자의 값 : " + fCha);
		System.out.println("문자열의 값 : " + fStr);
		System.out.println("논리의 값 : " + result);
		
		System.out.println(1+1);
		System.out.println(1.1+1.1);
		System.out.println('1'+'1');
		System.out.println("1"+"1");
		
		System.out.println("Hello"+'q');
		System.out.println("Hello"+10);
		System.out.println("Hello"+3.14);
		System.out.println(10+"hello");
		System.out.println(10+20+"Hello");
		System.out.println(10+(20+"hello"));
		System.out.println(10+"hello"+20);
		
		boolean flag = true;
		System.out.println(!!!!flag);
		
		int a = 10;
		int b = 20;
		int c = 30;
		a++;
		b = (--a)+b;
		c = (a++)+(--b);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		
	}
}
