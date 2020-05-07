package com.javaex.ex02;

public class Ex01 {

	public static void main(String[] args) {

		int i = 2345;
		double d = 3.14;
		String str = "방가방가";
		char c = '굿';
		String s = "굿";
		
		String name = "티에스";
				
		System.out.println("하이~");
		System.out.println(name);
		System.out.println("name");
		
		System.out.print("하이염ㅎㅎ");
		System.out.println("메롱~");
		
		System.out.println(str);
		System.out.println(str+str);
		System.out.println(str+i);													//		문자열 + 정수
		System.out.println(str+" 랑 "+i);									//		방가방가 and 2345
		System.out.println(str+d);												//		문자열 + 실수	
		
		
		
		
		// 추가적으로 알면 좋을 것들
		System.out.println(c);
		System.out.println(c+c);  													//		의도한대로 안나온다. 조심할 것!
		System.out.println(s+c);
		
		// 제 이름은 티에스 입니다.
		System.out.println("제 이름은 " + name + "입니다.");
		
		// 제 이름은 "티에스" 입니다.
		System.out.println("제 이름은 " + '"' + name + '"' + "입니다.");
		System.out.println("제 이름은 \"" +  name + "\"입니다.");
		
		// 제 이름은 \티에스\ 입니다.
		System.out.println("제 이름은 \\" + name + "\\ 입니다.");
		
		//안녕
		//하세요
		System.out.println("하이룽\n~~");
		
		System.out.println("하이 \t 방가방가");	 							// 앞에 띄어쓰기 해야 명령어 적용됨

	}

}
