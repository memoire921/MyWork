package HomeWork;

public class homework_20230830 {

	public static void main(String[] args) {
		// 3-3) 아래는 변수 num의 값 중에서 백의 자리 이하를 버리는 코드이다
		// 변수 num의 값이 '456' 이라면 '400' 이 되고, '111' 이라면 '100' 이 된다. 알맞은 코드를 넣으시오.
//		int num = 456;
//		System.out.println(num / 100 * 100);

		// 3-4) 사과담는 바구니 수를 구하는 코드. 사과 123개이고 하나의 바구니에는 10개의 사과를 담을수 있다면,
		// 13개의 바구니가 필요할 것이다. 알맞은 코드를 넣으시오.
//		int numOfApples = 123; // 사과의 개수
//		int sizeOfBucket = 10; // 바구니의 크기 ( 바구니에 담을 수 있는 사과의 개수)

//		int numOfBucket = (numOfApples / sizeOfBucket) + (numOfApples % sizeOfBucket > 0 ? 1 : 0);
		// 모든 사과를 담는데 필요한 바구니의 수

//		System.out.println("필요한 바구니의 수 :" + numOfBucket);

		// 3-5) 변수 num 의 값에 따라 '양수','음수','0' 을 출력하는 코드. 삼항 연산자를 이용하라.
//		num = 10;
//		System.out.println(num > 0 ? "양수" : (num == 0 ? 0 : "음수"));

		// 4-1) 조건식을 표현하라
		// 1. int 형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
//		int x = 15;
//		if (10 < x && x < 20)
//			System.out.println("true");
//		else
//			System.out.println("false");

		// 2. char 형 변수 ch 가 공백이나 탭이 아닐 때 true인 조건식
//		char ch = '악';
//		if (ch != ' ' || ch != '\t')
//			System.out.println("true");
//		else
//			System.out.println("false");

		// 3. char형 변수 ch가 'x' 또는 'X'일 때 true인 조건식
//		char ch = 'x';
//		if (ch == 'x' || ch == 'X')
//			System.out.println("true");
//		else
//			System.out.println("false");

		// 4. char형 변수 ch가 숫자('0'~'9')일 때 true인 조건식
//		char ch = '3';
//		if ('0' <= ch && ch <= '9')
//			System.out.println("true");
//		else
//			System.out.println("false");

		// 5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
//		char ch = 'a';
//		if ('a' <= ch && ch <= 'z' || 'A' <= ch && ch <= 'Z')
//			System.out.println("true");
//		else
//			System.out.println("false");

		// 6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지 않을 때 true인 조건
//		int year = 406;
//		if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0)
//			System.out.println("true");
//		else
//			System.out.println("false");

		// 7. boolean형 변수 powerOn이 false일 때 true인 조건식
//		boolean powerOn = false;
//		if (powerOn == false)
//			System.out.println("true");
//		else
//			System.out.println("false");

		// 8. 문자열 참조변수 str이 "yes"일 때 true인 조건식
//		String str = "yes";
//		if (str == "yes")
//			System.out.println("true");
//		else
//			System.out.println("false");

		// 4-8) Math.random()을 이용해서 1부터 6 사이의 임의의 정수를 변수 value에 저장하는 코드를 완성.
//		int value = (int) (Math.random() * 6) + 1;
//		System.out.println("value:" + value);

	} // main

} // class
