package com.javaex.ex03;

import java.util.Scanner;

public class TS_Ex10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int month;
		String days;

		System.out.println("선택한 달의 마지막 날짜를 알려드리는 프로그램입니다.");
		System.out.print("선택한 달을 입력해 주세요 :");

		month = sc.nextInt();

		if (0 < month && month < 13) { // 1에서 12 사이의 숫자 입력 경우에만 정상 값이 나옵니다.
			switch (month) {
			case 2:
				days = "28";
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				days = "30";
				break;
			default:
				days = "31";

			}
			System.out.println("당신이 입력한 " + month + "월의 마지막 날은 " + days + "일 입니다.");
		} else

		{ // 잘못 입력한 경우
			System.out.println("잘못 입력하셨습니다."); 
		}

//			if (month == 1) {
//				System.out.println("1월의 마지막 날짜는 31일입니다. 숙지하세요.");
//			}
//			
//			else if (month == 2) {
//				System.out.println("2월의 마지막 날짜는 28일입니다. 숙지하세요.");
//			}
//			
//			else if (month == 3) {
//				System.out.println("3월의 마지막 날짜는 31일입니다. 숙지하세요.");
//			}
//			
//			else if (month == 4) {
//				System.out.println("4월의 마지막 날짜는 30일입니다. 숙지하세요.");
//			}
//			
//			else if (month == 5) {
//				System.out.println("5월의 마지막 날짜는 31일입니다. 숙지하세요.");
//			}
//			
//			else if (month == 6) {
//				System.out.println("6월의 마지막 날짜는 30일입니다. 숙지하세요.");
//			}
//			
//			else if (month == 7) {
//				System.out.println("7월의 마지막 날짜는 31일입니다. 숙지하세요.");
//			}
//			
//			else if (month == 8) {
//				System.out.println("8월의 마지막 날짜는 31일입니다. 숙지하세요.");
//			}
//			
//			else if (month == 9) {
//				System.out.println("9월의 마지막 날짜는 30일입니다. 숙지하세요.");
//			}
//			
//			else if (month == 10) {
//				System.out.println("10월의 마지막 날짜는 31일입니다. 숙지하세요.");
//			}
//			
//			else if (month ==11) {
//				System.out.println("11월의 마지막 날짜는 30일입니다. 숙지하세요.");
//			}
//			
//			else {
//				System.out.println("12월의 마지막 날짜는 31일입니다. 숙지하세요.");
//			}
//			
//			System.out.println(month);

		sc.close();

	}

}
