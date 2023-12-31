package j04_array;

import java.util.Arrays;
import java.util.Random;

//** Lotto 번호 생성기 만들기 2
//=> 찾기(Search) & 정렬(Sort)

//*** Random 클래스
//=> java.util 에 있으므로 import 필요하고, new 선언후 사용가능함.
//=> Random() : 호출시마다 현재시간을 이용한 종자값이 자동 설정됨 
//   Random(long seed) : 인자값으로 주어진 종자값이 설정됨 
//   종자값 : 난수 만드는 알고리즘에서 사용되는 값
//	        ( 같으면 같은난수 얻음, setSeed() )
//
//=> Random().nextInt(큰수 - 작은수 + 1) + 작은수 
//   Random().nextInt() , Random().nextLong() , Random().nextBoolean()
//   Random().nextDouble() , Random().nextFloat()

public class Ex05_Lotto02_Sort {

	public static void main(String[] args) {
		// 1) 배열정의
		int[] lotto = new int[6];
		
		// 2) Random 으로 숫자추출 & 배열에 담기
		Random rn = new Random(5);
		for (int i=0; i<lotto.length; i++) {
			
			lotto[i] = rn.nextInt(45)+1;
			// ** 중복확인
			for (int j=0; j<=i-1; j++) {
				if ( lotto[i]==lotto[j] ) {
					--i;
					break;
				} //if
			} //j
		} //i
		
		// 3) 출력 (정렬전)
		System.out.println("** Lotto (정렬전) => "+Arrays.toString(lotto));
		
		// 4) 오름차순 정렬
		// => 순차정렬 (Sequence Sort)
		// => 정렬 알고리즘에서 가장 간단하고 기본이 되는 알고리즘으로
		//    배열의 처음과 끝을 탐색하면서 차순대로 정렬하는 가장 기초적인 정렬 알고리즘
		// ** 정렬 알고리즘 : 삽입(insert)정렬, 합병(Merge)정렬, 퀵(Quick)정렬...
		// => https://blog.naver.com/tepet/221690306235 		
		for (int i=0; i<lotto.length; i++) {
			for (int j=i+1; j<lotto.length; j++) {
				if (lotto[i] > lotto[j]) {
					// => 내림차순 (lotto[i] < lotto[j]) 
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			} //j
		} //i
		System.out.println("** Lotto (정렬후) => "+Arrays.toString(lotto));
		
		// ** 배열 Wrapper Class: Arrays
		// => Arrays 의 주요 메서드 : equals(null, null), sort(null)
		
		// 5) myNumber 생성후 비교하기
		// => 배열정의, Random 추출후, 중복확인후 배열에 담기,
		// => 정렬, equals 비교
		rn = new Random(5);
		// => rn.setSeed(5)
		int myNumber[] = new int[6];
		for (int i=0; i<myNumber.length; i++) {
			myNumber[i]=rn.nextInt(45)+1;
			// 1.2) 중복확인 (Search)
			for (int j=0; j<i; j++) {
				if (myNumber[i]==myNumber[j]) {
					--i; break;
				} // if
			} //for_j
		} //for_i
		Arrays.sort(myNumber);
		System.out.println("** myNumber => "+Arrays.toString(lotto));
		// => // 4. 당첨확인
		if (Arrays.equals(lotto, myNumber))
			 System.out.println("** 축하 합니다 ~~ 당첨 !!! **");
		else System.out.println("** 꽝 !!! ~~ 열공하세요 !!! ~~ **"); 
		  
	} //main
} //class
