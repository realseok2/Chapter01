package com.javaex.ex04;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("구구단을 출력하는 프로그램입니다. 원하는 단수를 입력하세요");

		int i = 1;
		int dan;

		System.out.print("단 : ");
		dan = sc.nextInt();

		while (i < 10) {
			System.out.println(dan + " * " + i + " = " + dan * i);

			i++;
		}

		sc.close();

	}

}
