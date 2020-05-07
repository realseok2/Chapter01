package com.javeex.ex03;

import java.util.Scanner;

public class TS_Ex06 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
			int score;
			String result;
			System.out.println("당신의 점수 등급을 알려드립니다.");
			System.out.print("당신의 점수를 입력하세요 : ");
			
			score = sc.nextInt();
			
			if (score>=90) {
				result = "당신은 A등급입니다. 축하합니다.";
			}
			
			else if (score>=80) {
				result = "당신은 B등급입니다. 고생하셨습니다.";
			}
			
			else if (score>=70) {
				result = "당신은 C등급입니다. 수고하셨습니다.";
			}
			
			else if(score>=60) {
				result = "당신은 D등급입니다. 분발하세요.";
			}
			
			else {
				result = "당신은 F등급입니다. 공부하세요.";
			}
			
			System.out.println(result);
			
		
		sc.close();
		
	}

}
