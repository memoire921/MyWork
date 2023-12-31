package j01_basic;

//** bit 연산
//=> 쉬프트 연산 , 논리 연산

public class Ex09_Operator02_bit {

	public static void main(String[] args) {
		int x = 10, y = 3; // *2진수 8421* 10의 2진수 : 1010, 3의 2진수 : 0011
		// 1) 쉬프트연산 : >> , << 
		System.out.println("** x >> y => " + (x >> y));
		// => x 를 오른쪽으로 y 만큼 이동
		//   1010 -> 0101 -> 0010 -> 0001 => 1
		System.out.println("** x => " + x);
		System.out.println("** y => " + y);
		
		System.out.println("** x << y => " + (x << y));
		// => x 를 왼쪽으로 y 만큼 이동
		//   1010 -> 1 0100 -> 10 1000 -> 101 0000 => 64 + 16 = 80
		System.out.println("** x << 1 => " + (x << 1)); // 20
		
		// 2) 논리연산
	    // => AND & , OR | , XOR ^ (같으면 0)                 2진수 *8421*
		System.out.println("** x & y => " + (x & y)); // x = 10 = 1010
		//                            & : 둘다 참일때만 참   y =  3 = 0011
		                                              // &        0010 => 2
		
		System.out.println("** x | y => " + (x | y)); // x = 10 = 1010
        //                        | : 둘중 하나가 참일때 참   y =  3 = 0011
		                                              // |        1011 => 11
		
		System.out.println("** x ^ y => " + (x ^ y)); // x = 10 = 1010
		//                             ^ : 둘이 같으면 0    y =  3 = 0011
		                                              // ^        1001 => 9
		// => 2진수 로 출력하기
		System.out.println("** x ^ y => " + Integer.toBinaryString((x ^ y))); // 1001
		
		// 3) 활용
		int password = 1234567, d = 0;
		int s = 0x1A253B65; // 16진수
		System.out.println("** 암호화 전 password => " + password);
		
		// => 암호화 (Encryption)
		d = password ^ s;
		System.out.println("** 암호화 된 password => " + d);
		
		// => 복호화 (Decryption)
		d = d ^ s;
		System.out.println("** 복호화 된 password => " + d);
		
	} //main

} //class
