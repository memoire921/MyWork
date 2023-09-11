package j08_AbsInterface;

// ** 클래스의 형변환
// => 자동 형변환 (형변환 생략가능)
//    조상 <- 자손 (Up_Casting)

// => 명시적 형변환 (형변환 생략불가능)
//    자손 <- 조상 (Down_Casting)
//    실제적 클래스타입이 변환가능한 경우에만 적용됨 
//    (변환불가능한 경우에는 컴파일 오류 없어도 런타임 오류(ClassCastException) 발생)

//Animal => Mammal 포유류  => PetAnimal
//Animal => Reptile 파충류 

// ** 복습 (교재 예제 입력하고 실행 해보기)
// => 249p 예제7_7

class Ex7_7 {
	public static void main(String args[]) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe; //car = (Car)fe; 에서 형변환이 생략됨
		fe2 = (FireEngine)car; // 자손타입 <- 조상타입. 형변환 생략 불가
		fe2.water();
	}
}

class Car {
	String color;
	int door;
	
	void drive() { // 운전하는 기능
		System.out.println("drive, Brrrr~");
	}
	void stop() { // 멈추는 기능
		System.out.println("stop!!!");
	}
}
class FireEngine extends Car { // 소방차
	void water() { // 물을 뿌리는 기능
		System.out.println("water!!!");
	}
}

// => 253p 예제7_8

class Product {
	int price; // 제품의 가격
	int bonusPoint; // 제품구매 시 제공하는 보너스점수
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price / 10.0); // 보너스점수는 제품가격의 10%
	}
}
class Tv1 extends Product {
	Tv1() {
		// 조상클래스의 생성자 Product(int price)를 호출한다.
		super(100); // Tv의 가격을 100만원으로 한다.
	}
	// Object클래스의 toString()을 오버라이딩한다.
	public String toString() { return "Tv"; }
}
class Computer extends Product {
	Computer() { super(200); }
	public String toString() { return "Computer"; }
}
class Buyer { // 고객, 물건을 사는 사람
	int money = 1000; // 소유금액
	int bonusPoint = 0; // 보너스점수
	
	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money -= p.price; // 가진 돈에서 구입한 제품의 가격을 뺀다.
		bonusPoint += p.bonusPoint; // 제품의 보너스 점수를 추가한다.
		System.out.println(p + "을/를 구입하셨습니다.");
	}
}
class Ex7_8 {
	public static void main(String args[]) {
		Buyer b = new Buyer();
		b.buy(new Tv1());
		b.buy(new Computer());
		System.out.println("현재 남은돈은 " + b.money + "만원입니다.");
		System.out.println("현재 보너스점수는 " + b.bonusPoint + "점입니다.");
	}
}

// => 269p 예제7_11

class Ex7_11 {
	public static void main(String[] args) {
		Child3 c = new Child3();
		c.method1();
		c.method2();
		MyInterface.staticMethod();
		MyInterface2.staticMethod();
	}
}
class Child3 extends Parent3 implements MyInterface, MyInterface2 {
	public void method1() {
		System.out.println("method1() in child3"); // 오버라이딩
	}
}
class Parent3 {
	public void method2() {
		System.out.println("method2() in Parent3");
	}
}
interface MyInterface {
	default void method1() {
		System.out.println("method1() in MyInterface");
	}
	default void method2() {
		System.out.println("method2() in MyInterface");
	}
	
	static void staticMethod() {
		System.err.println("staticMethod() in MyInterface");
	}
}

interface MyInterface2 {
	default void method1() {
		System.out.println("method1() in MyInterface2");
	}
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface2");
	}
}

//=================================================================

class Animal2 {
	String name;
	public Animal2() { System.out.println("** Animal 생성자 **"); }
	void breath() {
		System.out.println(name + " 는 숨을 쉽니다 ~~");
	}
} //Animal

class Mammal extends Animal2 {
	String cry ;
	public Mammal() { System.out.println("** Mammal 생성자 **"); }
	void crying() {
		System.out.println(super.name+ " 은(는) " + cry + " 웁니다 ~~");
	}
} //Mammal

class PetAnimal extends Mammal {
	PetAnimal() { System.out.println("~~ PetAnimal 생성 ~~"); }
	void checking() { System.out.printf("** %s는 예방접종을 했습니다.\n", name);  } 
} //PetAnimal

class Reptile extends Animal2 {
} //Reptile


public class Ex07_classCasting {

	public static void main(String[] args) {
		// Test 1.
		PetAnimal dog = new PetAnimal(); 
		// =>instanceof Test
		if (dog instanceof PetAnimal) System.out.println("** dog 는 PetAnimal 입니다. **");
		if (dog instanceof Mammal) System.out.println("** dog 는 Mammal 입니다. **");
		if (dog instanceof Animal2) System.out.println("** dog 는 Animal2 입니다. **");
		
		// Test 2. class Up_Casting Test
		Animal2 an1 = new PetAnimal(); // 조상 <- 후손 : Up_Casting, 자동
		//an1 = new Reptile(); // 모든후손은 교체가능 (다형성 적용가능)
		
		//PetAnimal pa = new Animal2(); // 후손 <- 조상 : Down_Casting, XXXX
		
		// => 생성자 종류에 따른 Animal 인스턴스(an1, an2) 비교
		// => 모두 Up_Casting 허용됨.
		Animal2 an2 = new Animal2();
		//an1 = dog;
		//an2 = dog;  // an2 = new PetAnimal() 과 동일효과
		
		// Test 3. Down_Casting
		// => 가능한 경우에만 명시적으로 허용
		System.out.println("** Down_Casting Test **");
		an1.breath(); // Animal2 에 정의된 멤버만 접근 가능
		PetAnimal cat = null;
		cat = (PetAnimal)an1; // PetAnimal(후손) Type <- Animal2(조상) Type
		cat.checking(); // PetAnimal 에 정의된 멤버 접근가능
		
		//cat = (PetAnimal)an2;
		//cat.checking();
		// => 컴파일오류 없음, 런타임오류_ClassCastException
		//   ( 위 60행 있을때(정상실행), 없을때(런타임오류) 비교 )
	    // => 그러므로 instanceof 연산자로 확인 후 Down_Casting 적용
		if (an2 instanceof PetAnimal) {
			cat = (PetAnimal)an2;
			System.out.println("** an2는 PetAnimal 입니다 **");
		} else System.out.println("** an2는 PetAnimal 이 될 수 없습니다 **");
		
		// ** 인스턴스의 class Type 확인하기
		// => Object 에 정의된 getClass() 메서드 이용
		System.out.println("** dog 의 Class Type => " + dog.getClass().getName());
		System.out.println("** cat 의 Class Type => " + cat.getClass().getName());
		System.out.println("** an1 의 Class Type => " + an1.getClass().getName());
		System.out.println("** an2 의 Class Type => " + an2.getClass().getName());
		
		System.out.println("** Program Stop **");
	} //main

} //class
