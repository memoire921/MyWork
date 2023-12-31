package j07_classExtends;

// ** 클래스와 클래스 간의 관계
// 1) 집합(has-a): Student 와 Car
// 2) 사용(use)  : Ex04_classnclass 와 Car
// 3) 상속(is-a) : Person, Student

// ** 숙제
// => 상속의 특징을 3개만 정리하세요 ~~
//    교재 7장 222p ~233p 까지 읽어오세요 ~~ 

// ** 상속의 특징 3개 알아볼것.
// 1) 기존 클래스를 재사용하여 새로운 클래스를 작성하는것을 상속이라 한다.
// 2) 자손 클래스는 조상 클래스의 모든 멤버를 상속받기 때문에, 
//    자손 클래스의 멤버는 조상 클래스의 멤버 수 보다 항상 같거나 많다.
// 3) 조상은 하나만 허용된다. 즉, 단일 상속이라한다. 
//    단, 두개의 조상을 사용 하려면 하나의 조상을 상속하고 다른 조상은 포함하여 코드를 작성하면 된다.

public class Ex01_classNclass {
	
	static Ex01_Car car = new Ex01_Car(100, 200, "Yellow");
	
	public static void myCar(Ex01_Car car) {
		car.speedDown();
		System.out.println("** 2) 사용(use) 관계: myCar_speed => " + car.speed);
	}
	
	public static void main(String[] args) {
		// 1) 집합(has-a)
		// => Ex01_classNclass 클래스와 Ex01_Car 클래스 관계
		System.out.println("** 1) 집합(has-a) => " + car);

		// => Student 와 Car 클래스의 관계
		Ex01_Student s1 = new Ex01_Student("0001", "이진기", 99);
		System.out.println("** main student => " + s1);
		System.out.println("** main car_color => " + s1.car.color);
		System.out.println("** main mycar_color => " + Ex01_Student.mycar.color.toUpperCase());
		
		// 2) 사용(use)
		// => Ex01_classNclass 클래스가 메서드 인자로 Ex01_Car 를 사용한 경우
		myCar(car);
		
		// 3) 상속(is-a)
	    // => 후손과 조상이 같은 Type 이 될 수 있다.
	    // => Ex01_Car 와 SportsCar
	    // => Ex02_CarTest.java (참고)		
		
	} //main

} //class

