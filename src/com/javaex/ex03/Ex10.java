package com.javaex.ex03;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월 별 마지막 날짜를 알아보는 프로그램입니다.");
		System.out.println("원하는 월을 입력하세요.");
		System.out.print("월 : ");
		
		int month;
		int days;
		
		month = sc.nextInt();
		
		
		
		switch (month) {

			case 2 :
				days = 28;
			break;
				
			case 4 :
			case 6 :
			case 9 :
			case 11 :
				days = 30;
			break;
			
			default :
				days = 31;
			break;
				
//			case 1 :
//				System.out.println("1월은 31일까지 있습니다.");
//				break;
//			case 2 :
//				System.out.println("2월은 28일까지 있습니다.");
//				break;
//			case 3 :
//				System.out.println("3월은 31일까지 있습니다.");
//				break;
//			case 4 :
//				System.out.println("4월은 30일까지 있습니다.");
//				break;
//			case 5 :
//				System.out.println("5월은 31일까지 있습니다.");
//				break;
//			case 6 :
//				System.out.println("6월은 30일까지 있습니다.");
//				break;
//			case 7 :
//				System.out.println("7월은 31일까지 있습니다.");
//				break;
//			case 8 :
//				System.out.println("8월은 31일까지 있습니다.");
//				break;
//			case 9 :
//				System.out.println("9월은 30일까지 있습니다.");
//				break;
//			case 10 :
//				System.out.println("10월은 31일까지 있습니다.");
//				break;
//			case 11 :
//				System.out.println("11월은 30일까지 있습니다.");
//				break;
//			case 12 :
//				System.out.println("12월은 31일까지 있습니다.");
//				break;
//			default :
//				System.out.println("헛소리하지말고 꺼졓ㅎㅎ");
		}
		
		System.out.println("선택하신 " + month + "월의 마지막 날짜는 " + days + "일 입니다.");
	
		sc.close();
		}

}
