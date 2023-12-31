package j03_forWhile;

public class Ex06_Star {

	public static void main(String[] args) {
		// 1) 반삼각형
		// => * 을 1개 부터 시작해서 갯수를 늘려가면서 9 Line 출력
		// => 각 행별로 행번호 갯수만큼 출력하기
		System.out.println("** 1) 반삼각형 **");
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		// 2) 피라미드(삼각형)
		System.out.println("\n** 2) 피라미드(삼각형) **");
		// => 5행, 9컬럼(마지막행, 각 line * 2 - 1)
		int line = 9;
		for (int i = 1; i <= line; i++) {
			// => 반복문 1: space
			for (int j = 1; j <= line - i; j++) {
				System.out.print(" ");
			}
			// => 반복문 2: *
			for (int j = 1; j <= (i * 2 - 1); j++) {
				System.out.print("*");
			}
			System.out.println("");
		} // for_i

		// 3) 다이아몬드
		System.out.println("\n** 3) 다이아몬드 **");
		// => 상부출력
		line = 9;
		for (int i = 1; i <= line; i++) {
			// => 반복문 1: space
			for (int j = 1; j <= line - i; j++) {
				System.out.print(" ");
			}
			// => 반복문 2: *
			for (int j = 1; j <= (i * 2 - 1); j++) {
				System.out.print("*");
			}
			System.out.println("");
		} // for_i

		// => 하부출력
		// => 총 그리는 line 갯수(위의 line-1=4) ~ 1 까지 감소
		for (int i = line - 1; i >= 1; i--) {
			// => 반복문 1: space
			for (int j = 1; j <= line - i; j++) {
				System.out.print(" ");
			}
			// => 반복문 2: *
			for (int j = 1; j <= (i * 2 - 1); j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		// 4) 모래시계
		// => 상부출력
		line = 9;
		System.out.println("\n** 4) 모래시계 **");
		for (int i = line; i >= 1; i--) {
			// => 반복문 1: space
			for (int j = 1; j <= line - i; j++) {
				System.out.print(" ");
			}
			// => 반복문 2: *
			for (int j = 1; j <= (i * 2 - 1); j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		// => 하부출력
		for (int i = 2; i <= line; i++) {
			// => 반복문 1: space
			for (int j = 1; j <= line - i; j++) {
				System.out.print(" ");
			}
			// => 반복문 2: *
			for (int j = 1; j <= (i * 2 - 1); j++) {
				System.out.print("*");
			}
			System.out.println("");
		} // for_i

	} // main

}
// class
