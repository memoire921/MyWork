package HomeWork;

//**배열 활용 (섞기 Shuffle)
//=> 길이가 10인 배열 정의 하고, 0~9 로 초기화
//=> random 을 이용해서 배열의 임의의 위치에 있는 배열의 값과
// 배열의 첫번째(0) 값과 교환하는일을 100번 반복해서 배열을 
// 뒤섞이도록 한다
//=> 교재 139p 

//** 복습: 연습문제 5-4
//** 예습: 교재6장 160p~175p 를 읽고
//=> 클래스, 객체, 인스턴스를 간단히 비교 & 요약 해오세요 ~~ 


public class homework_20230901 {

	public static void main(String[] args) {
		// 5-4) 2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오.
		int[][] arr = {
				{ 5, 5, 5, 5, 5 },  //25
				{ 10, 10, 10, 10, 10 },  //50
				{ 20, 20, 20, 20, 20 },  //100
				{ 30, 30, 30, 30, 30 }   //150
		};
		
		int total = 0;
		float average = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
			total += arr[i][j];
			} //j
		} //i
		
		average = total / (float)(arr.length * arr[0].length);  //평균계산
		
		System.out.println("total=" + total);  //325
		System.out.println("average=" + average);  //16.25
				
//===============================================
		
		//** 객체지향
		// 장점 => 코드의 재사용성, 유지보수, 중복된 코드의 제거
		
		//** 클래스와 객체
		// 클래스 => 객체를 정의해놓은 것, 객체의 설계도
		// 객체 => 클래스에 정의된 내용대로 메모리에 생성된것. (설계도의 제품?)
		//    -> 속성(property) - 변수 - 크기, 높이, 색상, 볼륨, 채널 등
		//    -> 기능(function) - 메서드 - 켜기, 끄기, 볼륨높이기, 볼륨줄이기, 채널변경 등
		
		// 클래스로부터 객체를 만드는 과정을 인스턴스화, 만들어진 객체를 인스턴스(객체) 라고한다.
		
		// 한 파일에 클래스는 1개로 할것.
		// 소스 파일의 이름은 반드시 public class 의 이름과 일치해야한다.
		// 대소문자를 구분해야하며, public 은 오직 하나.
		
		// ** 객체
		// 객체를 다루려면 먼저 참조변수(t)를 선언, new Tv 인스턴스를 생성한 후, 
		// 생성된 인스턴스의 주소를 참조변수(t)에 저장 해야한다.
		// 인스턴스는 참조변수를 통해서만 다룰 수 있고, 참조변수의 타입은 인스턴스의 타입과 일치해야한다.
		
		// ** 배열
		// Tv[] tvArr = new Tv[3]; // 길이가 3인 Tv타입의 참조변수. ([0],[1],[2])
		
		// ** 변수의 종류 (클래스, 인스턴스)
		// 인스턴스 변수(iv), 클래스 변수(cv) - 클래스영역 / 클래스가 메모리에 올라갈때 / 인스턴스가 생성될때 
		// 지역 변수(lv) - 클래스 영역 이외의 영역 / 변수 선언문이 수행되었을 때
		// 객체는 iv(인스턴스변수) 변수의 묶음
		// 공통속성은 cv, 개별속성은 iv
		// 객체생성 후, 개별속성 iv는 참조변수로(c.어쩌구) 공통속성 cv는 클래스이름을 사용(Card.어쩌구)

	}

}
