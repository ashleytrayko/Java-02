package com.kh.exercise;

import java.util.Scanner;

public class Exercise_Triple2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° �� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�� ��° �� : ");
		int num2 = sc.nextInt();
		
		System.out.print("������ �Է� (+ or -): ");
		char operator = sc.next().charAt(0);
		
		String result = (operator == '+') ? num1 + num2 + "" : ((operator == '-') ? num1 - num2 + "" : "�߸��Է��ϼ̽��ϴ�."); // int �� String ����ȯ�ϱ� ���� "" �߰�
		// String.valueOf() �Լ��� ����ص� �� ex) String.valueOf(num1 + num2)
		System.out.println("��� : " + result);
		 
		
		
	
	}

}
