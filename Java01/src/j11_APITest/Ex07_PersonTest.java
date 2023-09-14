package j11_APITest;

import java.util.Scanner;

//** Person
//=> 주민등록번호, 이름을 전달받으면
//=> 주민등록번호를 이용해서, age, 성별을 set 하고
//=> info 출력하기 

//=> 맴버필드(private) : idNo(String), name(String), age(int), gender(char)
//=> 생성자 2개
//    * default
//    * 주민등록번호,이름을 매개변수로 전달받아 초기화 
//    -> 나이 계산, 성별도 찾아서 set
//=> setter/getter
//     이름만 수정 가능, 
//    모든필드를 사용가능 (그러나 주민번호는 뒷자리는 * 로표시)
//=> infoPrint()
//=> toString 은 오버라이딩 (선택)

//** info
//이름 : 000
//번호 : 090909-*******
//나이 : 20세
//성별 : "남" 또는 "여"

class Person {
	private String idNo;
	private String name;
	private int age;
	private char gender;
	
	public Person() {  }
	
	public Person(String idNo, String name) {
		System.out.println("** Person Default 생성자 **");
		this.idNo = idNo;
		this.name = name;
		
		// ** idNo
		// => 6자리-7자리 총14 자리 -> 900909-1022333 , 010101-3011222
		
		// ** 성별
		// => idNo 의 "-" 다음자리의 길이 1,3:'M' 또는 2,4:'F'
		
		
		
		// ** age : 올해 - 태어난해
	} //초기화 생성자
	
	
	
	// 3) setter
	public void setName(String name) {this.name = name;}
	// 4) getter
	public String getIdNo() {
		return idNo.substring(0, 7) + "-*******";
	}
	public String getName() { return name; }
	public int getAge() { return age; }
	public char getGender() { 
		if (gender == 'M') return '남';
		else return '여';
	}
	
	public void infoPrint() {
        System.out.println("이름: " + name);
        System.out.println("번호: " + getIdNo());
        System.out.println("나이: " + age + "세");
        System.out.println("성별: " + gender);
    }
} //Person

// ** PersonTest
// => Person 5명 생성후 배열에 넣고,
//    나이순으로 출력하기
// => 나이순 정렬은 정렬메서드(static ageSort()) 만들어서 하세요 ~
// => 출력은 infoPrint() 로

public class Ex07_PersonTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("이름 입력");
		String name = sc.nextLine();
		
		System.out.println("주민번호 입력");
		String idNo = sc.nextLine();
		
	} //main

} //class
