package com.javaex.ex03;

import java.util.Scanner;

public class TS_Ex04 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		int time;
		int pay;
	
		System.out.println("근무한 시간을 입력하세요!");
		System.out.print("근무시간 : ");
			
		time = sc.nextInt();
		
		if (time<=8 ) {
			pay = time*10000;
		}
		
		else {
			pay = 8*10000+(time-8)*12000;
		}
		
		System.out.println("당신이 수령 할 임금은 " + pay + "원 입니다. 고생하셨습니다.");
		
//		System.out.println("당신이 근무한 시간을 입력하세요!");
//		System.out.print("근무한 시간 : ");
//		
//		time = sc.nextInt();
//		
//		if (time<=8) {
//			pay = time*10000;
//		}
//		
//		else {
//			pay = (int)(8*10000+(time-8)*10000*1.5);
//		}
//		
//		System.out.println("당신이 수령 할 임금은 " + pay + "원 입니다. 고생하셨습니다.");
		
		sc.close();
	}

}