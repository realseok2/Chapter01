package com.javaex.ex04;

public class ex10 {

	public static void main(String[] args) {

		System.out.println("Lotto 번호를 출력하는 프로그램입니다.");

		int no1, no2, no3, no4, no5, no6;
		
		no1 = (int) (Math.random() * 45) + 1;
		no2 = (int) (Math.random() * 45) + 1;
		no3 = (int) (Math.random() * 45) + 1;
		no4 = (int) (Math.random() * 45) + 1;
		no5 = (int) (Math.random() * 45) + 1;
		no6 = (int) (Math.random() * 45) + 1;

		System.out.println("첫번째 숫자는 : " + no1);
		System.out.println("두번째 숫자는 : " + no2);
		System.out.println("세번째 숫자는 : " + no3);
		System.out.println("네번째 숫자는 : " + no4);
		System.out.println("다섯번째 숫자는 : " + no5);
		System.out.println("여섯번째 숫자는 : " + no6);
	}
}
