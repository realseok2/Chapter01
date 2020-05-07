package com.javaex.ex01;

public class Ex05 {
	public static void main(String[] args) {
		
		
		/*
		 		 
		// 보통의 경우
		double pi = 3.14;
		double result01 = 5*5*pi;
		System.out.println(result01);
		
		pi = 3.1415;				// 변수는 값을 변경 가능
		double result02 = 5*5*pi;
		System.out.println(result02);
		
		*/
		
		final double PI = 3.14;
		double result01 = 5*5*PI;
		System.out.println(result01);
		
		double pi = 3.1415;				// 값을 변경 할 수 없다 --> 상수
		double result02 = 5*5*pi;
		System.out.println(result02);
	}
}
