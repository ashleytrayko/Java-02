package com.kh.operator;

public class Exam_comparison {
	public static void main(String[] args) {
		System.out.println("�񱳿����� ����");
		int a = 50;
		
		int b = 30;
		boolean result = a < b;
		System.out.println("(a < b)�� ��� : "+result);
		result = a > b;
		System.out.println("(a > b)�� ��� : "+result);
		result = (a == b);
		System.out.println("(a == b)�� ��� : "+result);
		result = (a != b);
		System.out.println("(a != b)�� ��� : "+result);
		
		// ¦��Ȧ�� �Ǻ� ���α׷�
		int num = 2;
		result = (num / 2 == 1);
		System.out.println("¦���ΰ� : "+result);
	}
}
