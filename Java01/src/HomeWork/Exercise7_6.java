package HomeWork;

class Outer { // 외부 클래스
	class Inner { // 내부 클래스(인스턴스 클래스)
		int iv=100;
	}
}

class Exercise7_6 {
	public static void main(String[] args) {
		Outer o = new Outer(); // 외부 클래스 인스턴스 생성
		Outer.Inner ii = o.new Inner(); // 내부 클래스의 인스턴스 생성
		System.out.println(ii.iv); // 내부 클래스 iv 값을 출력
	}
}