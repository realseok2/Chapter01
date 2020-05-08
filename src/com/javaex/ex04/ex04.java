package com.javaex.ex04;

//import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			sum = sum + i; 																																	// 총 합계 = 이전의 합 + 현재 숫자

			System.out.println(i + "까지의 합은 " + sum + "입니다.");
		}
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");

	}

}
