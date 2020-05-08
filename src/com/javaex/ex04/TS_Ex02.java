package com.javaex.ex04;

import java.util.Scanner;

public class TS_Ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int i = 1;
		int dan;

		System.out.println("단수를 입력받아 구구단을 출력하는 프로그램입니다.");
		System.out.println("단을 입력해 주세요!");
		System.out.print("단 : ");
		dan = sc.nextInt();

		while (i <= 9) {
			System.out.println(dan + " * " + i + " = " + dan * i);
			i++;
		}
		sc.close();
	}

}
