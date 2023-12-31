package j09_innerClass;

// ** 실습
// 추상 메서드가 2개 있는 interface 를 정의하고 
// 이를  main 메서드에서 익명 클래스를 이용해서 구현하고
// 실행 시켜 보세요 ~~ 

// ** 복습(숙제)
// => 교재 연습문제 (284~288p)
// 7-3 ~ 7-8

// ** 예습(숙제)
// => 293 p 예외클래스의 계층구조 참고
// => Exception, Error, RuntimeException, IOException 의 차이점을 요약해오세요~~

interface Hero { 
	void batman(); 
	void ironman();
	} //Hero

public class Ex06_Test {
	
	public static void main(String[] args) {
		Hero h = new Hero() {
			@Override
			public void batman() { System.out.println(" 아이엠 배트맨 "); }
			
			@Override
			public void ironman() { System.out.println(" 아이엠 아이언맨 "); }
		} ;
		h.batman();
		h.ironman();

	} //main

} //class
