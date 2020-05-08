package com.javaex.ex03;

import java.util.Scanner;

public class TS_Ex05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
			int point;
			
			System.out.println("숫자를 입력하세요!");
			System.out.print("입력 할 숫자는 ");
			
			point = sc.nextInt();
			
			if ( point%3 == 0) {
				System.out.println("입력하신 숫자는 3의 배수입니다.");
			}
			
			else {
				System.out.println("입력하신 숫자는 3의 배수가 아닙니다.");
			}
		
		
		
		
		
		sc.close();
		
		
	}

}
