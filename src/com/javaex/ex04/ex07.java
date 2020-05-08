package com.javaex.ex04;

public class ex07 {

	public static void main(String[] args) {

//		y줄마다 *의 갯수를 하나씩 늘리는 프로그램
		
		for (int y = 1; y <= 6; y++) {
			for (int x = 1; x <= y; x++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
