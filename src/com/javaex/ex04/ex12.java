package com.javaex.ex04;

import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num;
		int sum = 0;

		System.out.println("사용자에게 숫자를 입력받아 그 합계를 구하는 프로그램입니다. (0이면 종료)");

		System.out.println("\n숫자를 입력하세요. [0이면 종료]");
		System.out.print("숫자 : ");

//		방법1
//		do {
//			num = sc.nextInt();
//			sum = sum + num;
//			
//			System.out.println("합계 : " + sum);
//		} while (num != 0);
//		System.out.println("종료");

//		방법2
//		while (true) {
//			num = sc.nextInt();
//			sum = sum + num;
//			System.out.println("합계 : " + sum);
//			System.out.print("숫자 : ");
//
//			if (num == 0) {
//				break;
//			}
//		}
//		System.out.println("종료");

//		ts방법
//		int num;
//		int sum = 0;
//		int numcount = 0;
//
//		do {
//
//			num = sc.nextInt();
//			sum = sum + num;
//			System.out.print("합계 : " + sum + "\n");
//			numcount = numcount + 1;
//			System.out.print("숫자 : ");
//		} while (numcount <5&& num != 0);
//		
//		System.out.println("종료");

//		방법3
		boolean flag = true;

		while (flag) {
			num = sc.nextInt();
			sum = sum + num;
			System.out.println("합계 : " + sum);
			System.out.print("숫자 : ");

			if (num == 0) {
				flag = false;
			}
		}System.out.println("종료");

		sc.close();

	}

}
