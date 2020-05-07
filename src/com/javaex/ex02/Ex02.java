package com.javaex.ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int Age;
				
		//		출력문 출력
		System.out.println("What's your name?");
		System.out.print("Name : ");
		
		//		키보드에서 이름을 입력받는다.
		
		//		String name
		name = sc.nextLine();
		
		System.out.println("How old are you?");
		System.out.print("Age : ");
		
		Age = sc.nextInt();
				
				
				// 		name + 문자열을 출력한다.
		System.out.println("Your name is " + name + " And Your Age is " + Age);
		

		
		
		
		
		sc.close();
		
	}
}
