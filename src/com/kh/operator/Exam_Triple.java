package com.kh.operator;

public class Exam_Triple {
	public static void main(String[] args) {
		// ���ǽ� ? (true�϶� �����ڵ�) : (false�϶� �����ڵ�)
		// a = a < b ? a++ : a--;
		// ���� ���� ���굵 ����
		 int num = 3;
		 String resultStr;
		 resultStr = num % 2 == 0 ? "¦��" : "Ȧ��";
		 System.out.println(num +"��/��"+resultStr+"�Դϴ�.");
	}
}
