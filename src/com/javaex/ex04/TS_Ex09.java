package com.javaex.ex04;

import java.util.Scanner;

public class TS_Ex09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1;
		int num2;

		System.out.println("처음 입력받은 숫자가 두번째 입력받은 숫자의 배수인지 여부를 확인 할 수 있는 프로그램입니다. [0을 입력하면 프로그램이 종료됩니다.]");
		System.out.print("확인하고자 하는 숫자를 입력하세요 : ");
		num1 = sc.nextInt();
		System.out.print("배수인지 확인하고자 하는 숫자를 입력하세요 : ");
		num2 = sc.nextInt();

		while (true) {
			if (num1 == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (num1 % num2 == 0) {
				System.out.println("입력하신 [" + num1 + "]는 " + num2 + "의 배수가 맞습니다.");
				break;
			} else {
				System.out.println("입력하신 [" + num1 + "] 은(는) " + num2 + "의 배수가 아닙니다.");
				break;
			}
		}

		sc.close();

	}

}
