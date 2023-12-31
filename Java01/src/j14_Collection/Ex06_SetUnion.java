package j14_Collection;

import java.util.HashSet;

public class Ex06_SetUnion {

	public static void main(String[] args) {
		// 1. Set 을 2개 정의
		HashSet<String> set1 = new HashSet<String>();
		set1.add("Red");
		set1.add("Blue");
		set1.add("Green");
		set1.add("Pink");
		set1.add("Black");
		System.out.println("** set1 => "+set1);
	      
		HashSet<String> set2 = new HashSet<String>();
		set2.add("Seoul");
		set2.add("Busan");
		set2.add("Green");
		set2.add("Paris");
		set2.add("Korea");
		System.out.println("** set2 => "+set2);
	      
		// 2. 대량연산
		// => 합집합 union, 교집합 intersection, 부분집합, 차집합 (difference of sets)
		set1.addAll(set2); // set1 에 합집합_union
		System.out.println("** set1.addAll(set2) 합 => " + set1); // 중복허용하지않음_Green 확인
		set1.retainAll(set2); // 교집합_intersection
		System.out.println("** set1.retainAll(set2) 교 => " + set1);
		set1.containsAll(set2); // => 부분집합 : set2가 set1의 부분집합이면 true
		System.out.println("** set2가 set1의 부분집합 => " + set1.containsAll(set2));
		
		// => 차집합_difference of sets
		//    현재 set1 과 set2 는 동일한 자료만 남아있으므로 set1에 2개 추가
		set1.add("Silver");
		set1.add("Gold");
		set1.removeAll(set2);
		System.out.println("** 차집합 => " + set1);
		
	} //main

} //class
