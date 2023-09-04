package j05_classMethod;

// ** 맴버메서드(Method)
// => 함수(Function), 프로시져(Procedure)

// J06_  15,16 p
// 1) 정의 , 실행

// 2) return 값
// => return 이 있으면 Type 을 지정, 없으면 무조건 void  
// => 메서드 실행결과 return Type에 해당하는 결과값을 제공
// => return 명령어를 void 메서드 에서 사용하면 메서드 종료

// 3) 매개변수
// => 매개변수(Argument, 인자), Parameter
// => 메서드의 지역변수이며, 모든타입 정의 가능
// => 매개변수의 값 전달방법
//    CallByValue (기본자료형, String -> 매개변수의 값 전달)
//    CallByReference (참조자료형: 배열, 인스턴스 -> 주소전달)   

// ** 기본자료형 : Primitive Data Type (int, double, boolean....)
// ** 참조자료형 : Reference Data Type (String, 배열 등 클래스타입) 

public class Ex03_Method {

	// 1. 메서드 종류별 4종 정의
	// 2. return Test 
	//    => return 값 활용 (main 에서 Test)
	//    => void 메서드 에서 사용 : 메서드 종료 
	// 3. 매개변수 전달방법
	//     => CallByValue (기본자료형, String -> 매개변수의 값 전달됨) 
	//     => CallByReference (참조자료형, 주소값을 전달 -> 배열, 인스턴스)	
	
	int price = 5000; // 맴버(전역, Global) 변수
	
	// 1) 매개변수, return 값 없음
	public void juiceCafe1() { // 메서드의 헤더, {...실행문...} 메서드의 바디
		System.out.println("** 무슨 쥬스를 원하시나요? ");
	}
	
	// ** 메서드명
	// => 일반적인 식별자 규칙을 준수
	// => 소문자로 시작...
	// => 동일한 이름의 메서드명 허용 (매개변수의 갯수, 타입이 다른경우)
	public void juiceCafe1(int n) {
		System.out.println("** 메서드명 Test => " + n);
	}
	
	// 2) 매개변수 있고, return 값 없음
	// => 5잔이하 주문시 종료하기
	// => void 메서드에서 return 사용하면 종료
	public void juiceCafe2(String s, int n) {
		if (n < 5) {
			System.out.println("** 5잔 이상 주문 하세요 ~~ **");
			return;
		}
		System.out.println("** 주문 내용 **");
		System.out.printf("=> %s 쥬스, %d 잔 \n", s, n);
		
		// ** 매개변수 전달 Test (CallByValue)
		// => kind 에 의해 전달된 s의 값을 변경
		s = "바나나";
		System.out.println("** CallByValue Test s => " + s);
	}
	
	// 3) 매개변수 없고, return 값 있음
	public String juiceCafe3() {
		return "쥬스 1잔은 " + price + "원 입니다.";
	}
	
	// 4) 매개변수 있고, return 값 있음
	public int juiceCafe4(String s, int n) {
		System.out.printf("=> %s 쥬스, %d 잔 총액 \n", s, n);
		return price*n;
	}
	
	// 5) 참조자료형
	// => 매개변수 있고, return 값 있음
	public int carTest(Car car, int speed) {
		System.out.println("** carTest car1 => " + car);
		car.color = "Pink";
		System.out.println("** carTest car2 => " + car);
		return car.speed + speed;
	}
	
	public static void main(String[] args) {
		// ** 메서드 호출
		// => 같은 클래스에서도 접근하기 위해서는 인스턴스 필요함
		//juiceCafe1();  price = 9000;  -> 인스턴스 없이 호출안됨
		Ex03_Method ex03 = new Ex03_Method();
		ex03.juiceCafe1();
		ex03.juiceCafe2("수박", 2);
		//ex03.juiceCafe2(2, "수박");  // 호출시 반드시 인자가 일치해야함
		System.out.println("** juiceCafe3 => " + ex03.juiceCafe3());
		System.out.println("** juiceCafe4 => " + ex03.juiceCafe4("오렌지", 2));
		// ** 메서드명 Test
		ex03.juiceCafe1(123);
		
		// ** 매개변수 전달 Test1 (CallByValue)
		String kind = "딸기";
		ex03.juiceCafe2(kind, 12);
		System.out.println("** main kind => " + kind);
		
		// ** 매개변수 전달 Test2 (CallByReference 참조자료형)
		Car c1 = new Car();
		c1.color = "Blue";
		c1.speed = 1000;
		c1.mileage = 1000;
		System.out.println("** main Before c1 => " + c1);  //Blue
		ex03.carTest(c1, 500);
		System.out.println("** main After c1 => " + c1);  //Pink

	    // => 참조형 매개변수 사용 비교
	    //  -> 매개변수 위치에서 바로 생성해도 됨
	    //  -> Car 를 일회성 매개변수로만 사용하는 경우 적당
		System.out.println("** main 바로생성 return값 => " + ex03.carTest(new Car(), 999));
		
	} //main

} //class
