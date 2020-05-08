package com.javaex.ex04;

import java.util.Scanner;

public class TS_Ex03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력 받아 입력 받은 숫자 단수의 구구단을 출력하는 프로그램입니다.");
		System.out.println("출력할 단을 입력해 주세요.");
		System.out.print("단 : ");

		int dan;
		dan = sc.nextInt();

		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + dan * i);
		}
		sc.close();
	}

}
