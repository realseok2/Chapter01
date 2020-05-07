package com.javaex.ex01;

public class Ex08 {
	
	public static void main(String[] args) {
		
		// 대입연산자 =
		int a = 7;
		int b = 2;
		//----> 실수형 해볼 것,						 정수 + 실수 해볼 것
		
		
		System.out.println("산술연산자");                 				//Sysout + ctrl + space bar 		--> 			System.out.pirntln(); 		자동완성
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		
		// 부호연산자
		System.out.println("부호연산자");
		int var = -3;
		int pVar = +var;
		int mVar = -var;
		
		System.out.println(pVar);
		System.out.println(mVar);
		
		// 증감연산자
		System.out.println("증감연산자");
		System.out.println(a);															//	7 출력
		System.out.println(++a);													//   7 --> 8 출력
		System.out.println(b);														//   2 출력
		System.out.println(--b);														//   2 --> 1 출력
		System.out.println(a++);													//   8 출력			8 --> 9
		System.out.println(a);															//   9 출력
		System.out.println(b);														//	1 출력
		System.out.println(b--);														//	1 출력			1 --> 0
		System.out.println(b);														//	0 출력
	}

}
