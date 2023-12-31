package j05_classMethod;

// ** MyClass
// => 맴버변수 3개, 메서드 2개 정의
// => MyClass 를 정의하고
//    Ex02_MyClassTest 에서 인스턴스 2개 만들어 출력하기

// ** 전역변수 와 지역변수 Test

class Throne {
	// ** 맴버 변수
	// => 전역(Global) 변수
	//    클래스내에 있는 모든 메서드에서 사용가능
	public int price;
	public int weight;
	public String color;
	
	public void priceUp(int myprice) {
		
		// ** void 메서드의 return Test
		if (myprice > 1000) {
			System.out.println("** myprice 값 이상으로 종료합니다 **");
			return;
		}
		
		int price = 5000; 
		// => 2. 위치변경후 price1 출력값 비교
		
		price += 10000; // 전역변수 ( 위 2번 적용전까지 )
		System.out.println("** priceUp price1 = " + price); // 지역 price???
		// ** 지역(local)변수
		// => 메서드 내부에 정의된 변수, 인자
		//    {   } 내부에서만 적용가능
		//    클래스 외부에서도 접근 불가능
		//    전역변수와 동일한 이름의 지역변수를 정의하면 지역변수 우선 적용/
		//    (단, 지역변수 선언 이후부터)
		myprice += price;
		int money = 10000;
		//int price = 5000; // 1. 지역변수, 2.위치를 메서드내 첫줄로 이동 
		System.out.println("** priceUp price2 = " + price);	// 지역 price
	}
	public void priceDown() {price -= 10000;}
	
	public String toString() {
		return "[ 가격: " + price + ", 무게: " + weight + ", 색상: " + color + " ]";
	}
} //throne

public class Ex02_MyClassTest {

	public static void main(String[] args) {
		System.out.println("** 왕좌 class Test **");
		
		Throne JkThrone = new Throne();
		JkThrone.price = 20000;
		JkThrone.weight = 1000;
		JkThrone.color = "black";
		System.out.println("** JK의 왕좌 ** => " + JkThrone.toString());
		
		// ** 지역변수, void_return Test
		JkThrone.priceUp(1000);
		JkThrone.priceUp(2000);
		
		Throne JSThrone = new Throne();
		JSThrone.price = 30000;
		JSThrone.weight = 2000;
		JSThrone.color = "Dark_gray";
		System.out.println("** JS의 왕좌 ** => " + JSThrone);
		
	} //main

} //class
