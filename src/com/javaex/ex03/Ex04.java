package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int hour;
		int pay;
		
		System.out.println("근무시간을 입력해 주세요.");
		
		System.out.print("근무시간 : ");
		
		hour = sc.nextInt();
		
		if (hour<=8) {
			pay = hour*10000;
		}
		
		else {
			pay = 8*10000 + (hour - 8) * 12000;
		}
		
		System.out.println("임금은 " + pay + "원 입니다.");

						
		if (hour<=8) {
			pay = hour*10000;
		}
		
		else {
			pay = (int)(8*10000+(hour-8)*(10000*1.5));

		}
		
		System.out.println("임금은 " + pay + "원 입니다.");
		
		
		
		
		sc.close();
		
		
	}

}
