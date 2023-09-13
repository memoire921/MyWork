package j10_Exception;

import java.util.Scanner;

// ** 실습
// => 두개의 정수를 입력 받아 4칙연산(+,-,*,/) 결과 출력하기
// => 입력 정수는 1 ~ 99 까지 허용
// => nextInt() 또는 nextLine() 으로 입력 받기 -> try~catch 적용하기
// 1) 범위를 벗어난 값를 입력하면 정상 값 입력 할때까지 반복
// 2) 반복분 이용해서 종료하고 싶을때까지 Test 하기.

// ** Scanner 사용시 주의 사항
// => nextInt() , nextLine() 사용시 주의
//    nextInt()는 개행문자 (\n) 가 뒤에 붙고, 숫자만 받아 처리한다. 
//    그래서 nextInt() 만 계속되면 문제가 없는데, 
//    뒤이어서 nextLine() 이 오면 앞 nextInt() 의 
//    남겨진 \n 을 한줄로 인식 받아 버린다.

public class Ex02_Calculator {

	public static void main(String[] args) {
		// 1. Scanner 인스턴스, 변수 정의
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		
		// 2. 반복문, try~ catch 적용
		// => 두개의 정수를 입력 받기
		// => 입력 받은 정수 범위 확인 ( 1 ~ 99 )
		//    Yes : 4칙연산(+,-,*,/) 결과 출력하고 종료
		//    No : 다시 입력받기 반복
		while(true) {
			try {
				System.out.println("** 첫번째 숫자 입력해 (1 ~ 99) =>");
				n1 = Integer.parseInt(sc.nextLine());
				// => 문자입력시: NumberFormatException
				//n1 = sc.nextInt();
				// => InputMismatchException 발생
				//    주의 -> 입력값중 숫자만 가져가고 남아있는 enter_Key 값 때문에 무한반복됨
				
				if(n1 < 1 || n1 > 99) {
					System.out.println("** 입력은 1 ~ 99 사이어야 한다");
					continue; // 나머지 문장 실행하지 않고, 다음 반복문 진행
				}
				System.out.println("** 두번째 숫자 입력해 (1 ~ 99) =>");
				n2 = Integer.parseInt(sc.nextLine());
				if(n2 < 1 || n2 > 99) {
					System.out.println("** 입력은 1 ~ 99 사이어야 한다");
					continue;
				}
				System.out.println("덧셈: " + (n1 + n2));
				System.out.println("뺄셈: " + (n1 - n2));
				System.out.println("곱셈: " + (n1 * n2));
				System.out.println("나눗셈: " + (n1 / (double)n2));
				System.out.println("종료 원하냐? (y, n : 종료)");
				// => 대, 소 문자 모두 가능하도록
				if (sc.nextLine().toUpperCase().equals("Y")) {
					System.out.println("** 프로그램 종료 **");
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("** NumberFormatException => "+e.toString());
				System.out.println("** 정확하게 숫자만 입력하세요 **");
			} catch (Exception e) {
				System.out.println("** Exception => "+e.toString()); 
			}
		} //while
		
	} //main

} //class
