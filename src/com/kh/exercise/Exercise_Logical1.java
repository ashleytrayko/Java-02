package com.kh.exercise;

import java.util.Scanner;

public class Exercise_Logical1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		
		int num = sc.nextInt();
		
		boolean flag = 0 < num && num < 101;
		// ���׿������� ��� String isResult = 0 < num && num < 101 ? "true" : "false";
		
		System.out.println("1���� 100������ �����ΰ�? " + flag);
	}

}
