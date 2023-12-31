package j02_ifSwitch;

import java.util.Random;
import java.util.Scanner;

// ** 숫자 맞추기 게임
// => 1~10 범위에서 숫자 하나를 입력받아
// => Random 클래스의 추출번호와 일치하면 금메달
// => 차이가 1 이면 은메달, 차이가 2면 동메달, 아니면 꽝
// => Math 클래스를 이용하세요 ~~

public class Ex05_randomGame {
		
	public static void main(String[] args) {
		// 1) Random Number 구하기
		Random rn = new Random();
		int happyNumber = rn.nextInt(10) + 1; // 1~10 내에서 임의의 정수를 제공 
		
		// 2) myNumbr 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("** 1 ~ 10 숫자 입력 : ");
		int myNumber = sc.nextInt();
		
		// 3) 결과처리
		// => 차이 : happyNumber, myNumber 의 절대값
		//    Math.abs(happyNumber - myNumber)
		String medal = "꽝";
		switch(Math.abs(happyNumber - myNumber)) {
		case 0: medal = "Gold"; break;
		case 1: medal = "Silver"; break;
		case 2: medal = "Bronze"; break;
		default: medal = "꽝";
		}
		System.out.printf("** 오늘의 당첨번호 = %d, myNumber = %d, 결과 = %s \n",
				happyNumber, myNumber, medal);
		
		// ** 찬미
	      int randomNum = (int) (Math.random() * 10) + 1;
	       System.out.println("당첨번호 몰래 보기 =>" + randomNum);
	       System.out.printf("1 ~ 10 중 하나의 숫자를 입력하세요. > ");
	       int num = sc.nextInt();
	       int absM = Math.abs(randomNum - num);
	       
	       if (randomNum == num) {
	            System.out.println("당첨입니다잉^^ (정답 봤지 ? )");
	       } else if (absM == 1) {
	            System.out.println("까비 ^^");
	       } else if (absM == 2) {
	            System.out.println("다시 도전해보삼 ㅋㅋ");
	       } else {
	            System.out.println("축하합니다. 당신은 *운없는 사람*에 당첨되셨습니다. ^^");
	       }
	       
		sc.close();
	} //main

} //class
