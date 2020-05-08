package com.javaex.ex04;

//import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {

		
//		1부터 10까지의 총 합계를 한번에 출력하는 프로그램
		
//		int sum = 0;
//		
//		for (int i =1; i<=10; i++) {
//			sum = sum+i;
//		}
//		
//		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");

//		1부터 10까지의 누적 합계를 각 줄마다 출력하는 프로그램
		
		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			sum = sum + i;																																//		총 합계 = 이전의 합 + 현재 숫자

			System.out.println(i + "까지의 합은 " + sum + "입니다.");
		}
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
//==================================================================================
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("1부터 10까지의 합을 구하는 프로그램입니다."); 								// 이전의 합 + 현재 숫자
//		System.out.print("확인하실 범위의 숫자를 입력해 주세요 : ");
//		int i; 																																						// 현재 숫자
//		int sum = 0; 																																		// 이전의 합
//		i = sc.nextInt();
//		sum = sum + i;
//		System.out.println("1부터 " + i + "까지의 숫자의 합은 " + sum + "입니다.");

//		while (i <= 10) {
//			
//			i++;
//			sum = sum + i;
//		}

//		int i;
//		i = sc.nextInt();
//		int sum = i;
//
//		while (i <= 10) {
//			System.out.println("1부터 10까지의 정수의 합은 " + sum + "입니다.");
//			i++;
//		}

//		int i;
//		int sum;
//
//		System.out.print("합 : ");
//		i = sc.nextInt();
//
//		while (i <= 10) {
//			System.out.println(i + "까지의 합은 " + sum + "입니다.");
//			i++;
//		}

//		System.out.print("합 : ");
//		i = sc.nextInt();
//		int sum = i;
//
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(i + "까지의 합은 " + sum);
//
//			
//
//			sc.close();

	}

}
