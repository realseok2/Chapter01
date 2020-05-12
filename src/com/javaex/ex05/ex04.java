package com.javaex.ex05;

public class ex04 {

	public static void main(String[] args) {

//		ppt. 11.배열_배열의 복사 페이지 설명

		int[] ArrayA; // 1번
		ArrayA = new int[3]; // 2번 3번

//		ArrayA배열 값 입력	//		4번
		ArrayA[0] = 3;
		ArrayA[1] = 6;
		ArrayA[2] = 9;

		int[] ArrayB; // 5번
		ArrayB = new int[3]; // 6번 7번

//		값 복사	//		8번
		for (int i = 0; i < ArrayA.length; i++) {
			ArrayB[i] = ArrayA[i];
		}
		
//		출력해서 확인		//		9번
//		ArrayA
		for(int i =0; i<ArrayA.length; i++) {
		System.out.println(ArrayA[i]);
		}
		
		System.out.println("======구분선=======");
		
//		ArrayB
		for(int i =0; i<ArrayB.length; i++) {
		System.out.println(ArrayB[i]);
		}

		System.out.println("==ArrayA[1] 값 변경==");
		
		
		ArrayA[1] = 10;
				
//		ArrayA
		for(int i =0; i<ArrayA.length; i++) {
		System.out.println(ArrayA[i]);
		}
		
		System.out.println("======구분선=======");
		
//		ArrayB
		for(int i =0; i<ArrayB.length; i++) {
		System.out.println(ArrayB[i]);
		}
		
		
	}

}
