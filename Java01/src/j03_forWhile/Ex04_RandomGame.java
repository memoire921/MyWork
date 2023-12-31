package j03_forWhile;

import java.util.Random;
import java.util.Scanner;

//** 숫자 맞추기 게임
//=> 1~10 범위에서 숫자 하나를 입력받아
//=> Random 함수의 결과와 일치하면 금메달
//=> 차이가 1 이면 은메달, 차이가 2면 동메달, 아니면 꽝
//=> Math 클래스를 이용하세요 ~~

//=> 반복문 적용: 당첨될때까지 

public class Ex04_RandomGame {
	public static void main(String[] args) {
		// 1) Random Number 구하기
		Random rn = new Random();
		int happyNumber = rn.nextInt(10) + 1; // 1~10 내에서 임의의 정수를제공

		// 2) myNumber 입력받고 확인하기
		// => 당첨될때까지
		Scanner sc = new Scanner(System.in);
		int myNumber = 0;
		int abs = 0; // 차이값
		while (true) {
			// 2.1) myNumber 입력 받기
			System.out.print("** 1~10 사이의 숫자를 입력하세용~ : \n");
			myNumber = sc.nextInt();

			// 2.2) 확인
			// => 일치, 차이가 1 or 2 : 반복문 탈출(break)
			// 아니면 계속 진행
			abs = Math.abs(happyNumber - myNumber);
			if (abs <= 2)
				break;

		} // while 끝

		// 3) 결과처리 (출력)
		String medal = "꽝";
		switch (abs) {
		case 0:
			medal = "1등 짝짝짜ㅏ짜ㅏ짝짝!!!";
			break;
		case 1:
			medal = "2등 짝짝짝!!!";
			break;
		case 2:
			medal = "3등이당~";
			break;
		default:
			medal = "아 설마 꽝";
		}
		System.out.printf("**오늘의 당첨번호=%d, myNumber=%d, 결과=%s \n", happyNumber, myNumber, medal);

	} // main 끝

}// class 끝