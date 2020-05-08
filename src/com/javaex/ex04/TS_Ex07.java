package com.javaex.ex04;

public class TS_Ex07 {

	public static void main(String[] args) {

		System.out.println("y줄의 순번만큼 x개의 *을 출력하는 프로그램입니다.");

		for (int y = 1; y <= 6; y++) {
			for (int x = 1; x <= y; x++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
