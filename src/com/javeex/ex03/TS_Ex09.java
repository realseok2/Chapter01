package com.javeex.ex03;

import java.util.Scanner;

public class TS_Ex09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int code;
		
		System.out.println("수강 할 과목을 선택하세요!");
		System.out.println("( 1. JAVA 2. C 3. C++ 4. Python )");
		System.out.print("과목 코드 : ");
		
		code = sc.nextInt();
		
		switch (code) {
			case 1 :
				System.out.println("당신이 수강신청한 강좌의 강의실은 R101호 입니다.");
				break;
			case 2 :
				System.out.println("당신이 수강신청한 강좌의 강의실은 R202호 입니다.");
				break;
			case 3 :
				System.out.println("당신이 수강신청한 강좌의 강의실은 R303호 입니다.");
				break;
			case 4 :
				System.out.println("당신이 수강신청한 강좌의 강의실은 R404호 입니다.");
				break;
			default :
				System.out.println("없는 과목 코드입니다. 상담원에게 문의하세요.");
				break;
		}
		
		
		sc.close();
		
		
	}

}
