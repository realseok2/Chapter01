package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사용자가 입력한 숫자가 3의 배수인지 알려주는 프로그램입니다.");
		
		int num;																											//		숫자
		
		System.out.println("숫자를 입력하세요!");
		System.out.print("숫자 : ");
		
		 num = sc.nextInt();
		
		if (num%3==0) {
			System.out.println(num + "은(는) 3의 배수 입니다.");
		}
		
		else {
			System.out.println(num + "은(는) 3의 배수가 아닙니다.");
		}
		
		sc.close();
		
	}

}
