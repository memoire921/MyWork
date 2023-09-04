package HomeWork;

// ** static, instance 비교
// => 교재 174 ~ 175, 188 ~ 190 (예습)
// => 숙제: 207P 6-1

public class homework_20230904 {

	public static void main(String[] args) {
		// static, instance 비교
		// 메서드 앞에 static 이 붙으면 static 메서드,
		// 없으면 instance 메서드.
		
		// ** instance 메서드
		// => 인스턴스 생성 후, '참조변수.메서드이름()'으로 호출
		// => 인스턴스 멤버(iv, im) 와 관련된 작업을 하는 메서드
		// => 메서드 내에서 인스턴스 변수(iv) 사용가능
		
		// ** static 메서드 (클래스 메서드)
		// => 객체생성없이 '클래스이름.메서드이름()'으로 호출
		// => 인스턴스 멤버(iv, im) 와 관련없는 작업을 하는 메서드
		// => 메서드 내에서 인스턴스 변수(iv) 사용불가
		
		// 교재
		
		// 6-1) 다음과 같은 멤버변수를 갖는 Student 클래스를 정의하시오.
		// 타입        변수명        설명
		// String     name        학생이름
		// int        ban         반
		// int        no          번호
		// int        kor         국어점수
		// int        eng         영어점수
		// int        math        수학점수

		class Student {
			String name;
			int ban;
			int no;
			int kor;
			int eng;
			int math;
		}
		
	} //main

} //class
