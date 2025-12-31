package com.sisa;

public class VariableTest {
	// 변수 테스트

//	  <이클립스 단축키>
//	   인터프린터 실행 : Ctrl +F11 
//	   자동(단어)완성: Ctrl+Space 
//	   코드제안 : Ctrl+1 주석 : Ctrl+ / 
//	   코드복사 : Ctrl+ alt + ↑↓ 
//	   코드 정렬 : Ctrl + Shift + F 
//	   syso (Ctrl+Space)
//	 

	public static void main(String[] args) {
		System.out.println("단축키에 대해 알아보아요!!!!");

		// 문제) 3*1부터 3*9 까지 결과를 출력하세오 (반복문없이)
		// => 예시 3*1=3
		System.out.println(3 + "*" + 1 + "=" + 3*1);
		System.out.println(3 + "*" + 2 + "=" + 3*2);
		System.out.println(3 + "*" + 3 + "=" + 3*3);
		System.out.println(3 + "*" + 4 + "=" + 3*4);
		System.out.println(3 + "*" + 5 + "=" + 3*5);
		System.out.println(3 + "*" + 6 + "=" + 3*6);
		System.out.println(3 + "*" + 7 + "=" + 3*7);
		System.out.println(3 + "*" + 8 + "=" + 3*8);
		System.out.println(3 + "*" + 9 + "=" + 3*9);
		
		// 변수를 사용하는 이유 
		// 동일한 데이터를 두번이상 사용할때 이제는 5단을 출력 하고 싶어요 
		int dan=7;		
		for (int i = 1; i <= 9; i++) {
		    System.out.println(dan + "*" + i + "=" + (dan * i));
		}

	}
}
