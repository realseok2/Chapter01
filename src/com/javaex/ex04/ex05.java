package com.javaex.ex04;

public class ex05 {

	public static void main(String[] args) {

		System.out.println("구구단을 9단까지 자동으로 출력하는 프로그램입니다.");

		for (int dan = 2; dan <= 9; dan++) {
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan + " * " + i + " = " + dan * i);
			}
		}
	}
}
