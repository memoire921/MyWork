package HomeWork;

public class homework_20230831 {

	public static void main(String[] args) {
		// 4-6) 두개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을
		// 작성하시오.
//				for (int i = 1; i <= 6; i++) 
//					for (int j = 1; j <= 6; j++) 
//						if (i + j == 6)
//						System.out.println(i + "+" + j + "=" + (i + j));

		// 4-7) 숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라.
		// 만약 문자열이 "12345"라면, '1+2+3+4+5'의 결과인 15를 출력이 출력되어야 한다. (1)에
		// 알맞은 코드를 넣으시오. @String클래스의 charAt(int i)을 사용.
//				String str = "12345";
//				int sum = 0;
//				for (int i = 0; i < str.length(); i++) {
//					sum += str.charAt(i) - '0';
//				}
//				System.out.println("sum=" + sum);
		// 결과 sum=15

		// 4-9) int타입의 변수 num이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라.
		// 만일 변수 num의 값이 12345라면, '1+2+3+4+5'의 결과인 15를 출력하라.
		// (1)에 알맞은 코드를 넣으시오 @문자열로 변환하지 말고 숫자로만 처리해야한다
//				int num = 12345;
//				int sum = 0;
//				while(num > 0) {
//					sum += num % 10;
//					num /= 10;
//				}
//				System.out.println("sum="+sum);

		// 4-10)
		// 1~100사이의 임의의 값을 얻어서 answer에 저장한다.
//				int answer = (int)(Math.random() * 100) + 1;
//				int input = 0;    // 사용자입력을 저장할 공간
//				int count = 0;    // 시도횟수를 세기위한 변수
		// 화면으로 부터 사용자입력을 받기 위해서 Scanner클래스 사용
//				java.util.Scanner s = new java.util.Scanner(System.in);
//				do {
//					count++;
//					System.out.println("1과 100사이의 값을 입력하세요 :");
//					input = s.nextInt(); // 입력받을 값을 변수 input에 저장한다.
//					if (answer > input) {
//						System.out.println("더 큰수 입력해");
//					} else if (answer < input) {
//						System.out.println("더 작은수 입력해");
//					} else {
//						System.out.println("맞췄어");
//						System.out.println("시도한 횟수 "+ count +"번 이야"); break;
//					}
//				} while (true); // 무한반복문
	} // main

} // class
