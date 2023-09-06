package j06_packageTest;

class Car {

	public int speed;
	public int mileage;
	public String color = "yellow";
	
	// ** package Test용 변수 선언 
	public static int ddd = 100;

	// ** 맴버메서드 (Method, function, procedure)
	public void speedUp() {
		speed += 10;
	}

	public void speedDown() {
		speed -= 10;
	}
	public String toString() {
		return "[ 속도: " + speed + " 주행거리: " + mileage + " 색상: " + color + " ]";
	}

} // Car


public class Ex01_CarTest {

	public static void main(String[] args) {
		

	} // main

} // class