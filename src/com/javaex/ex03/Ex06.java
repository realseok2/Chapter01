package com.javaex.ex03;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
			System.out.print("점수를 입력하세요 : ");
			int point = sc.nextInt();
			
			if (point>=90) {
				System.out.println("당신은 A등급 입니다.");
			}
			
			else if (point>=80) {
				System.out.println("당신은 B등급 입니다.");
			}
			
			else if (point>=70) {
				System.out.println("당신은 C등급 입니다.");
			}
			
			else if (point>=60) {
				System.out.println("당신은 D등급 입니다.");
			}
			
			else {
				System.out.println("당신은 F등급 입니다.");
			}
		
		
		
		sc.close();
	}

}
