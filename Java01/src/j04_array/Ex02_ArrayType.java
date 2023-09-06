package j04_array;

import java.util.Arrays;

public class Ex02_ArrayType {

	public static void main(String[] args) {
		// ** 타입별로 배열을 정의 하고 출력해본다
		// => 묵시적 정의, 출력은 eachFor 구문으로
		// => float, char, String
		// => data 갯수는 5개
		// 1) float
		System.out.println("** (float) 엔진 배기량 **");
		float[] engine = { 2.0f, 3.0f, 3.5f, 4.0f, 5.0f};
		for (float e : engine) {
			System.out.print( e + "cc ");
		}
		
		// 2) char
		System.out.println("\n** (char) Benz 세그먼트 **");
		char[] benz = {'A', 'B', 'C', 'E', 'S', 'G'}; 
		for (char b : benz) {
			System.out.print( b + "-class ");
		}
		
		// 3) String
		System.out.println("\n** (String) 오조 구성원 **");
		String[] ojo = {"오원희", "어성은", "이진기", "유희상"}; 
		for (String o : ojo) {
			System.out.print( o + " / ");
		}
		
		// 4) Long
		System.out.println("\n** (Long) 한국돈 **");
		long[] price = {1000000L, 20000000L, 300000000L, 4000000000L}; 
		for (long p : price) {
			System.out.print( p + "원 ");
		}
		
		// ** 배열지원하는 Wrapper Class : Arrays
		System.out.println("\n** Wrapper Class : Arrays **");
		System.out.println(Arrays.toString(engine));
		System.out.println(Arrays.toString(benz));
		System.out.println(Arrays.toString(ojo));
		System.out.println(Arrays.toString(price));
		

	} //main

} //class
