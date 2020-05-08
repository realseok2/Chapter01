package com.javaex.ex03;

import java.util.Scanner;

public class TS_Ex01 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		int score;
		
		System.out.println("당신의 점수를 입력하세요.");
		System.out.print("점수 : ");
		
		 score = sc.nextInt();
		 
		if (score>=60) {
			System.out.println("합격입니다. 고생하셨습니다.");
		}
		
		
		sc.close();
	}

}
