package com.javaex.ex05;

public class ex03 {

	public static void main(String[] args) {

		System.out.println("Lotto 번호를 생성하는 프로그램입니다.");
		System.out.println("마지막에 생성되는 번호는 보너스 번호입니다.\n");

		int[] lottoNo = new int[7];

//		로또번호 생성 배열 입력
		for (int i = 0; i < lottoNo.length; i++) {
			lottoNo[i] = (int) (Math.random() * 45) + 1;
		}

//		로또 번호 출력 (배열이동)
		for (int i = 0; i < lottoNo.length; i++) {
			System.out.println(">> 생성된 로또 번호는 " + lottoNo[i] + " 입니다.");

	}
//	System.out.println("추가 보너스 번호는 " + lottoNo[i] + "입니다.");
	}
}
