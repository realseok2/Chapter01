package com.javaex.ex03;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		int room;
		
		System.out.println("과목을 선택하세요!");
		System.out.println("(1. JAVA 2. C 3. C++ 4. Phython)");
		System.out.print("과목번호 : ");
		
		room = sc.nextInt();
		
		switch (room) {
			case 1:
				System.out.println("R101호");
				break;
				
			case 2:
				System.out.println("R202호");
				break;
				
			case 3:
				System.out.println("R303호");
				break;
				
			case 4:
				System.out.println("R404호");
				break;
				
			default :
				System.out.println("헛소리하지말고 집이나 가세여^^");
		}
		
		
		
		
		
		sc.close();
		
	}

}
