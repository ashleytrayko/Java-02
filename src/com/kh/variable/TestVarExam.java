package com.kh.variable;

public class TestVarExam {
	public static void main(String[] args) {
		// �ڷ����� ������ ����� �ʱ�ȭ �� �� �� ���� ���
		int iNum = 100;
		long lNum = 9999000000000l;
		float fNum = 486.520f;
		double dNum = 456.780123;
		char fCha = 'A';
		String fStr = "Hello World";
		boolean result = true;
		
		System.out.println("������ �� : " + iNum);
		System.out.println("������ ��(9999��) : " + lNum);
		System.out.println("�Ǽ��� �� : " + fNum);
		System.out.println("�Ǽ��� �� : " + dNum);
		System.out.println("������ �� : " + fCha);
		System.out.println("���ڿ��� �� : " + fStr);
		System.out.println("���� �� : " + result);
		
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
