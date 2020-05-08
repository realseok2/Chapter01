package com.javaex.ex03;

import java.util.Scanner;

public class TS_Ex03 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
			int num;
			String  value;
			
			System.out.println("숫자를 입력하세요.");
			System.out.print("당신이 선택 한 숫자 : ");
			
			num = sc.nextInt();
			
			if (num>0) {
				value = "양수";
			}
			
			else if (num<0) {
				value = "음수";
			}
			
			else {
				value = "0";
			}
		
			System.out.println("당신이 선택 한 숫자는 " + value + "입니다.");
		
		
		
		
		sc.close();
		
	}

}
