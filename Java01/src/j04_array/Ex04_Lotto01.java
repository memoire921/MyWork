package j04_array;

import java.util.Arrays;
import java.util.Random;

// ** Lotto 번호 생성기 만들기 1
// => int 를 6개 담을 수 있는 배열 생성 : lotto
// => Random 으로 1~45 범위의 숫자를 생성해서 배열 초기화 하기
//    (추가: 단, 중복은 허용하지 않음)
// => 출력

public class Ex04_Lotto01 {

	public static void main(String[] args) {
		// 1) 배열정의
		int[] lotto = new int[6];
		
		// 2) Random 으로 숫자추출 & 배열에 담기
		// => Random, for 구문
		Random rn = new Random();
		//lotto[0] = rn.nextInt(45) + 1; ~ lotto[5] = rn.nextInt(45) + 1;
		// => for 구문으로
		for (int i = 0; i < lotto.length; i++) {
			
			lotto[i] = rn.nextInt(45) + 1;
			// ** 중복확인 절차
			// => 숫자추출 후, lotto에 담기전 : 임시변수 필요
			//    -> 임시변수 필요, 중복존재하면 안담고, 존재하지 않으면 담는다
			// => 숫자추출 후, lotto에 담은후
			//    -> 중복존재하면 i 값을 후진시켜 다시 담도록 (본 예제에서 사용)

			// ** 중복확인 방법
			// => 이미 lotto 배열에 담겨있는 Data 와 동일성 비교
			//   (그러므로 반복문 필요)
			// => 값이 동일한 자료가 존재하는지 확인 (동일 자료 찾아보기 : search)
			for (int j = 0; j <= i - 1; j++) {
				if (lotto[i] == lotto[j]) {
					--i;
					break;
				} //if
			} //j
		} //i
		
		// 3) 출력
		System.out.println("** Lotto => " + Arrays.toString(lotto));
		
		// 4) 최대값 & 최소값 출력하기
		int max = lotto[0], min = lotto[0];
		for (int i = 1; i < lotto.length; i++) {
			// => 최대값 찾기
			if (max < lotto[i]) max = lotto[i];
			// => 최소값 찾기
			if (min > lotto[i]) min = lotto[i];
     	}
		System.out.println("** 최대값 => " + max);
		System.out.println("** 최소값 => " + min);
		
		// 5) 오름차순 정렬
		// => Ex05 ~~~ 에서
		
		
	} //main

} //class
