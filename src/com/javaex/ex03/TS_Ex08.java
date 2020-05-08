package com.javaex.ex03;

import java.util.Scanner;

public class TS_Ex08 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
			int code;
			String room;
		
			System.out.println("수강 할 과목을 선택하세요!");
			System.out.println("( 1. JAVA 2. C 3. C++ 4. Python )");
			System.out.print("과목 코드 : ");
			
			code = sc.nextInt();
			
			if (code == 1) {
				room = "당신은 JAVA 과목을 선택하셨습니다. 강의실은 R101호 입니다. 열심히 하세요.";
			}
			
			else if (code == 2) {
				room = "당신은 C 과목을 선택하셨습니다. 강의실은 R202호 입니다. 열심히 하세요.";
			}
			
			else if (code == 3) {
				room = "당신은 C++ 과목을 선택하셨습니다. 강의실은 R303호 입니다. 열심히 하세요.";
			}
			
			else if (code == 4) {
				room = "당신은 Python 과목을 선택하셨습니다. 강의실은 R404호 입니다. 열심히 하세요.";
			}
			
			else {
				room = "존재하지 않는 과목 코드입니다. 상담원에게 문의하세요.";
			}
			
			System.out.println(room);
		
		
		
		
		sc.close();
		
	}

}
