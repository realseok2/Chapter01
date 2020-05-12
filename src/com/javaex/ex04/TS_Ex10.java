package com.javaex.ex04;

public class TS_Ex10 {

	public static void main(String[] args) {

		System.out.println("자동으로 Lotto번호를 추출해 내는 프로그램입니다.\n");

		int no1, no2, no3, no4, no5, no6;

		no1 = (int) (Math.random() * 45) + 1;
		no2 = (int) (Math.random() * 45) + 1;
		no3 = (int) (Math.random() * 45) + 1;
		no4 = (int) (Math.random() * 45) + 1;
		no5 = (int) (Math.random() * 45) + 1;
		no6 = (int) (Math.random() * 45) + 1;

		System.out.println("첫번째로 추출된 숫자는 : " + no1);
		System.out.println("두번째로 추출된 숫자는 : " + no2);
		System.out.println("세번째로 추출된 숫자는 : " + no3);
		System.out.println("네번째로 추출된 숫자는 : " + no4);
		System.out.println("다섯번째로 추출된 숫자는 : " + no5);
		System.out.println("여섯번째로 추출된 숫자는 : " + no6);
		System.out.println("\n이 번호로 Lotto를 구매하세요!");
	}//main

}//class
