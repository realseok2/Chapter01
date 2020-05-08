package com.javaex.ex04;

import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {

		System.out.println("숫자를 입력받아 3의 배수인지 확인하는 프로그램입니다.");

		Scanner sc = new Scanner(System.in);
		int num = 1;

		System.out.println("확인할 숫자를 입력해 주세요.");
		System.out.print("숫자 : ");
		num = sc.nextInt();

		while (true) {
			if (num == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (num % 3 == 0) {
				System.out.println("3의 배수입니다.");
				break;
			} else {
				System.out.println("3의 배수가 아닙니다.");
				break;
			}
		}
		sc.close();
	}
}
