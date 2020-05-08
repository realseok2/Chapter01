package com.javaex.ex04;

public class ex08 {

	public static void main(String[] args) {

		System.out.println("두 수의 최소공배수를 구하는 프로그램입니다.");

		int i = 1;

		while (true) {
			if (i % 6 == 0 && i % 14 == 0) {
				System.out.println("6과 14의 최소공배수는 " + "[" + i + "]" + "입니다.");
				break;
			} // if
			i++;
		} // while

	}// main

}// class
