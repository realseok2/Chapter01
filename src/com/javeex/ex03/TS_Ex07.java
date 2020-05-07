package com.javeex.ex03;

import java.util.Scanner;

public class TS_Ex07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
			int num;
			String result;
			
			System.out.println("확인 할 숫자를 입력해 주세요.");
			System.out.print("입력 할 숫자는 ");
			
			num = sc.nextInt();
			
			if (num<0) {
				result = "당신이 입력한 숫자는 음수입니다.";
			}
			
			else if (num == 0 ) {
				result = "당신이 입력한 숫자는 0입니다.";
			}
			
			else if (num%2 == 0) {
				result = "당신이 입력한 숫자는 짝수입니다.";
			}

			else {
				result = "당신이 입력한 숫자는 홀수입니다.";
			}
			
			
		
			System.out.println(result);
		
		
		sc.close();
		
	}

}
