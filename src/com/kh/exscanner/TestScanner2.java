package com.kh.exscanner;

import java.util.Scanner;

public class TestScanner2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է����ּ��� : ");
		int iNum = sc.nextInt();
		
		System.out.println("�Ǽ��� �Է����ּ��� : ");
		double dNum = sc.nextDouble();
		
		System.out.println("���ڿ��� �Է����ּ��� : ");
		String inputStr = sc.next(); // .next() -> ����ȹޱ�, .nextLine() -> ���鵵 �޾ƿ���
		
		System.out.println("���ڸ� �Է����ּ��� : ");
		char inputChar = sc.next().charAt(0); // charAt -> ���� �߶����
		
		System.out.println("�Է��� ������ : " + iNum);
		System.out.println("�Է��� �Ǽ��� : " + dNum);
		System.out.println("�Է��� ���ڴ� : " + inputChar);
		System.out.println("�Է��� ���ڿ��� : " + inputStr);
	}
}
