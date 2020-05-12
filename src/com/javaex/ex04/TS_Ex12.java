package com.javaex.ex04;

import java.util.Scanner;

public class TS_Ex12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		System.out.println("사용자에게 숫자를 입력받아 그 합계를 구하는 프로그램입니다. [0을 입력하면 프로그램이 종료됩니다.");

		System.out.println("사용자에게 숫자 다섯개를 입력받아 그 합계를 구하는 프로그램입니다.");
		System.out.println("입력 중간에 0을 입력 받으면 그 즉시 프로그램이 종료됩니다.");
		
		int num;
		int sum = 0;
		int numcount = 0;
		
		do {
			
		System.out.println("\n숫자를 입력하세요. [0 입력시 종료]");
		System.out.print("숫자 : ");
		num = sc.nextInt();
				
		sum = sum + num;
		numcount = numcount + 1;
		
		System.out.println("합계 : " + sum);
		
		}while (numcount <5 && num != 0);
		System.out.println("\n종료조건을 만족하였습니다. 종료하겠습니다.");
		
		
		sc.close();
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
//		TS_1번 방법
//		int num;
//		int sum = 0;
//
//		System.out.print("숫자를 입력하세요 : ");
//
//		while (true) {
//			num = sc.nextInt();
//			sum = sum + num;
//			System.out.println("합계 : " + sum);
//
//			if (num == 0) {
//
//				break;
//			}
//			System.out.print("숫자 : ");
//		}
//		System.out.println("종료");
//
//		sc.close();
//
//	}
//
//}
