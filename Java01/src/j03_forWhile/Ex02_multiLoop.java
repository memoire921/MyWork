package j03_forWhile;

// ** 반복문의 중첩
// 1) if 와의 중첩
// => 자전거를 10바퀴를 돌리면 0.2Kg 감량 (if)
// 만약 자전거를 200바퀴를 돌렸을때의 감량 출력하기 (for)

// 2) for , for 중첩
// => 자전거를 1번 돌릴때마다 , 줄넘기를 10번 한다.
// => 자전거 5회 돌릴때 까지 매번 과정의 횟수를 출력한다.
// 자전거 1 : 줄넘기 1,2,3,4,5,6,7,...10
// 자전거 2 : 줄넘기 1,2,3,4,5,6,7,...10
// [1,1] [1,2] [1,3] [1,4]......[1,10]
// [2,1] [2,2] [2,3] [2,4]......
// => 전체 줄넘기 횟수 출력하기

public class Ex02_multiLoop {

	public static void main(String[] args) {
		// 1) if 와의 중첩
		// => 자전거를 10바퀴를 돌리면 0.2Kg 감량 (if)
		// 만약 자전거를 200바퀴를 돌렸을때의 감량 출력하기 (for)
		double result = 0;
		for (int i = 1; i <= 200; i++) {
			if (i % 10 == 0)
				result -= 0.2;
		}
		System.out.println("** 1) result => " + result);

		// => 연습
		// => 1~100 까지의 정수중 3의 배수의 합을 출력하세요 ~~
		result = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0)
				result += i;
		}
		System.out.println("** 1) 방법1 result => " + result);
		// => 방법2.
		result = 0;
		for (int i = 3; i <= 100; i += 3) {
			result += i;
		}
		System.out.println("** 1) 방법2 result => " + result);

		System.out.println("");

		// 2) for, for 중첩
		// => 자전거를 1번 돌릴때마다 , 줄넘기를 10번 한다.
		// => 자전거 5회 돌릴때 까지 매번 과정의 횟수를 출력한다.
		// [1,1] [1,2] [1,3] [1,4]......[1,10]
		// [2,1] [2,2] [2,3] [2,4]......
		// => 전체 줄넘기 횟수 출력하기
		int count = 0; // 전체 줄넘기 횟수
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.printf("[%d,%d] ", i, j);
				count++;
			} // j
			System.out.println("");
		} // i
		System.out.println("** 2) for 중첩 count => " + count);

	} // main

} // class
