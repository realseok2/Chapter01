package com.javaex.ex04;

import java.util.Scanner;

public class TS_Ex08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("입력하는 두 숫자의 최소공배수를 구하는 프로그램입니다.");

		int i = 1;
		int num1;
		int num2;

		System.out.println("최소공배수를 알고자 하는 숫자 두개를 입력해 주세요.");
		System.out.print("첫번째 숫자 : ");
		num1 = sc.nextInt();
		System.out.print("두번째 숫자 : ");
		num2 = sc.nextInt();

		while (true) {
			if (i % num1 == 0 && i % num2 == 0) {									//	num1의 값으로 나눴을 때 나머지가 0인 값과 num2의 값으로 나눴을 때 나머지가 0인 값의 공통되는 숫자를 찾는 수식입니다.
				System.out.println(num1 + "과 " + num2 + "의 최소공배수는 [" + i + "] 입니다.");
				break;													//	여기서 break로 정지시켜주지 않으면 num1과 num2의 모든 공배수들이 출력되므로 프로그램이 정지하지 않고 계속 돌아가는 상황이 발생할 수 있습니다.
			}
			i++;
		}
		sc.close();
	}

}
