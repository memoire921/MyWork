package j01_basic;

//** 변수(Variable) 정의
//=> type, 변수명, value
//=> type 은 불변, value 는 변경가능

//** 상수(Constant)
//=> type 불변, value도 불변
//=> 주로 고정값 에 사용 (pi = 3.141592)
//=> 전체 대문자로 표기

//** 기본자료형
//=> 예약어로 정의된 Type
//=> 더이상 나누어질수 없는 기본 자료형
//=> int, double, boolean, char
//=> 정수형 : byte(8_1), short(16_2), int(32_4byte), long(64_8byte)
//=> 실수형 : float(4byte), double(8byte)

//** 참조자료형
//=> String, 배열
//=> 모든 클래스는 참조자료형이 될 수 있음
//=============================================

//** 용어정리
//=> identifier: 직접작명하는 식별자 (프로젝트, 클래스, 메서드, 변수, 상수 등의 이름)
//=> modifier: 특징을 제한하는 한정자 (public, static..등 예약어의 일종) 
//=> literal: 변수 우측의 값(Value)

//** identifier 작명의 일반적 규칙  
//=> project, class 명은 대문자로 시작.
//=> 상수명은 전체대문자로 작성. 
//=> 위외는 모두 소문자로 시작. ( 합성: setName ) 
//=> 한글: 허용은 되지만 권장하지 않음
//=> 연산자(+,-,*,/,%) 는 식별자에 포함할 수 없음
//=> 한번 선언된 변수명은 재선언 할수 없음 
//( 동일한 identifier 를 중복 선언할 수 없음 )

//=> 변수명 의 규칙 (ppt J03_01 , 8p)

public class Ex02_Variable01 {

	public static void main(String[] args) {

		// ** 상수 (전체 대문자)
		final double PI=3.141592;
		//PI=3.141592;
		
		// ** 변수
		// 1) 적합성
		String 이름="홍길동"; // 가능하지만 한글 비추
		String irum="홍길동"; // 가동성 측면비추(글로벌 마인드)
		String Name; // name, Name 은 다르며, 변수명의 첫글자 대문자는 바람직하지않음
		
		// 2) Type
		// 2.1) 정수형
		// => byte(8_1), short(16_2), int(32_4byte), long(64_8byte)
		byte b=10;
		short s=100;
		int i=1234567890; //선언과 동시에 초기화
	    // ** 정수사용 주의사항
	    // => Java 는 정수 literal 을 int 로 취급
	    // => int 를 초과하는 정수 literal 을 표현못함
	    // => L/l : 반드시 long Type literal 임을 표시해야함 
		long l; //선언
		l=1234567890123456789L; //값을 할당
		System.out.println("** 정수 => "+(b+s+i+l));
		
	    // 2.2) 실수형
	    // => float(4byte), double(8byte)
	    // => 실수 literal 의 기본형은 double; 
		double d=123.456;
		//float f=123.456f; -> 4byte = 8byte : Error
		float f=123.456f; // f/F 모두허용
		System.out.println("** 실수 => "+(d+f));
		
		// 2.3) boolean
		// => true(1) / false(0)
		// => 모든 관계식의 결과는 boolean Type
		boolean bool;
		System.out.println("** boolean => "+(b>s));
		
	    // 2.4) char
	    // => 한글, 영문 모두 한글자를 의미, 2byte
	    // => 2byte int Type 으로도 사용가능
	    // => ASCII Code (American Standard Code for Information Interchange)
		char aa='A', bb='B', cc='C';
		String ss="Seoul, 한글자이상 가능";
		System.out.println("** (char+char) => "+(aa+bb+cc)); //우선순위: int연산
		System.out.println("** char+char => "+aa+bb+cc);
		System.out.println("** String+char => "+(aa+bb+cc+ss)); //순서적용: int 연산후 문자열연산
		// => char 를 int 로 출력
		System.out.println("** (int)char => "+(int)aa+(int)bb+(int)cc); // int 값, (int)ss : XXXX
		System.out.printf("** A=%d, B=%d, C=%d **\n",(int)aa,(int)bb,(int)cc); // int 값
		
		// => 한글적용
		char k='가', n='나';
		System.out.printf("** k=%s, n=%s **\n",k,n);

		
		
	} //main
} //class
