package com.javaex.ex02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String Name;
		int Age;
		double Height;
		
		System.out.println("당신의 이름을 입력해 주세요.");
		System.out.print("이름 : ");
		
		Name = sc.nextLine();
		
		System.out.println("당신의 나이를 입력해 주세요.");
		System.out.print("나이 : ");
		
		Age = sc.nextInt();
		
		System.out.println("당신의 키를 입력해 주세요.");
		System.out.print("키 : ");
		
		Height = sc.nextDouble();
		
		System.out.println("당신의 이름은 "+ Name + "이고 당신의 나이는 " + Age + "입니다. 그리고 키는 " + Height + "입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
