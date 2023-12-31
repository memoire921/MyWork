package j02_ifSwitch;

import java.util.Scanner;

// ** switch - case - break 문
// 1. => switch(key) 문 인자의 Type은 int, char, String 만 가능
// 2. => break : 무조건 탈출 (없으면 아래로 계속 default 까지 진행)
// 3. => case 블럭에 구문이 없어도 됨 (아래 구문으로 진행됨)
// 4. => case 블럭에는 복합구문에도 {....} 사용하지 않음 
// 5. => case 값으로 변수 사용은 불가 그러나 변수를 사용하지 않은 수식은 허용

//** if ~ else if 와 비교 
//=> switch 가 더 효율적 ( direct 분기하므로 )  

public class Ex03_switchbasic {

	public static void main(String[] args) {
		// ** Scanner 적용
		Scanner sc = new Scanner(System.in);
		System.out.println("** 정수를 입력하세요 =>");
		
		// ** 1) int
		int i = Integer.parseInt(sc.nextLine());
		
		switch(i) {
		case 1: System.out.println("** 1 **"); 
		        break;
		case 2: System.out.println("** 2 **"); break;
		case 13:System.out.println("** 13 **");
		case 4: 
		case 5: System.out.println("** 5 **");
				// i 값이 짝수/홀수 인지 출력
				if ( i % 2 == 0 ) {
					System.out.println("** i 는 짝수 **");
					System.out.println("** i => " + i);
				} else System.out.println("** i 는 홀수 **");					
		
				break;
		default: System.out.println("** default **");
		} //switch(i)

		// ** 2) char
		System.out.println("** 코드를 입력하세요 =>");
		//char code = (char)sc.nextLine(); XXXXXX
		char code = sc.nextLine().toUpperCase().charAt(0); // sc.nextLine -> 스트링을 의미한다
		//char code = 'A';
		switch(code) {
		case 'A' : System.out.println("** 예술가 **"); break;
		case 'P' : System.out.println("** 개발자 **"); break;
		case 'C' : System.out.println("** 요리사 **"); break;
		default : System.out.println("** 학생 **");
		}		
		
		// ** 3) String
		System.out.println("** color 를 입력하세요 =>");
		String color = sc.nextLine().toLowerCase();
		switch(color) {
		case "red": System.out.println("** 빨강 **"); break;
		case "black": System.out.println("** 까망 **"); break;
		case "white": System.out.println("** 하얀 **"); break;
		default: System.out.println("** Error: 몰라요 ~~ **");
		}
		
		// ** 4) Switch 구문 중첩
		// => 위 2) 구문을 이용하여, 예술가인 경우에는
		//	  color 를 입력받아 출력하도록 구현하세요
		System.out.println("** 코드를 입력하세요 =>");
		code = sc.nextLine().toUpperCase().charAt(0);
		switch(code) {
		case 'A' : System.out.println("** 예술가 **");
			
				   System.out.println("** color 를 입력하세요 =>");
			       color = sc.nextLine().toLowerCase();
			       switch(color) {
			       case "red": System.out.println("** 빨강 **"); break;
			       case "black": System.out.println("** 까망 **"); break;
			       case "white": System.out.println("** 하얀 **"); break;
			       default: System.out.println("** Error: 몰라요 ~~ **");
		           } 
			       
			       break;
		case 'P' : System.out.println("** 개발자 **"); break;
		case 'C' : System.out.println("** 요리사 **"); break;
		default : System.out.println("** 학생 **");
		}		
		
		sc.close();
		System.out.println("** Program 정상 종료 **");
	} //main

} //class
