package com.kh.exercise;

import java.util.Scanner;

public class Exercise_Triple1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		String decide =  num1 > 0 ? "���" : (num1 < 0 ? "����" : "0");
		System.out.println("�Է��Ͻ� ���� : " + decide + "�Դϴ�.");
		
	
	}

}
