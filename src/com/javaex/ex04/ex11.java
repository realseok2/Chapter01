package com.javaex.ex04;

public class ex11 {

	public static void main(String[] args) {

		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
				System.out.print("");
			} else {
				System.out.println(i);
			}
			continue;
		}
	}
}
