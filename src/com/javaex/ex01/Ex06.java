package com.javaex.ex01;

public class Ex06 {

	public static void main(String[] args) {
		
		//자동형변환1		정수형 + 실수형 --> 실수형
		float result = 2+3.5f;
		System.out.println(result);
		
		
		//자동변환2			long형 + float형
		long var02 = 12345L;		//정수형
		float var03 = 1.1f;				//실수형
		float result01 = var02 + var03;
		System.out.println(result01);
		
		
		///////////////////////////////////////////////////
		
		// 강제형변환
		int i = (int)1112.532424;
		System.out.println(i);
		
		//확대변환
		byte v01 = 10;
		int v02 = (int)v01;							// 강제형변환		byte --> int
		System.out.println(v02);
		
		//축소변환 (정상적인 경우)
		int v03 = 10;
		byte v04 = (byte)v03;
		System.out.println(v04);			// 큰집 --> 작은집		1칸만 쓰고 있어서 안망가짐
		
		//축소변환 (비정상적인 경우)
		int v05 = 153029770;
		byte v06 = (byte)v05;
		System.out.println(v06);		
		
		// 실수 --> 정수 :								소수점 아래 삭제 (의도해서 사용할 수 있음)
		double v07 = 5.57;
		int v08 = (int)v07;							//	double --> int
		System.out.println(v08);
		
		// 정수 --> 실수
		double v09 = 7;
		double v10 = (double)v09;							
		System.out.println(v10);
		
		
	}
}
