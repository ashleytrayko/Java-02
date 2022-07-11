package com.kh.operator;

public class Exam_Triple {
	public static void main(String[] args) {
		// 조건식 ? (true일때 실행코드) : (false일때 실행코드)
		// a = a < b ? a++ : a--;
		// 이중 삼항 연산도 가능
		 int num = 3;
		 String resultStr;
		 resultStr = num % 2 == 0 ? "짝수" : "홀수";
		 System.out.println(num +"은/는"+resultStr+"입니다.");
	}
}
