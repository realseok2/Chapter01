package com.javaex.ex03;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
	
		int study_num;
		String name = null;
		String room = null;
		
		Scanner sc = new Scanner(System.in);

		
		
		System.out.println("과목을 선택하세요!");
		System.out.println("(1. JAVA 2. C 3. C++ 4. Phython)");
		System.out.print("과목번호 : ");
			
		study_num = sc.nextInt();
			
		if (study_num==1) {
			name = "JAVA";
			room ="101";
		}
			
		else if  (study_num==2) {
			name = "C";
			room = "202";
		}
		
		else if  (study_num==3) {
			name = "C++";
			room = "303";
		}
		
		else if  (study_num==4) {
			name = "Phython";
			room =  "404";
		}
			
		else {
			System.out.println("나머지는 상담원에게 문의하세요! 귀찮게하지말고^^");
		}
		
		System.out.println(name + " 과목을 선택하셨습니다. 강의실은 R" + room + "호 입니다.");
		
		sc.close();
		
	}

}
