package j05_classMethod;

// ** 복습
// => 207p 연습문제 6-1, 6-2, 6-3 구현
// => 6-1
//	-> 맴버변수는 private 으로 정의
//	-> setter/getter, toString 추가
// => 6-2 : info() 는 만들지 않아도 됨.
// => 6-3
//	-> Student 의 인스턴스를 5개 만들어서 배열에 담기
//	-> 배열을 이용해서 위 5개 인스턴스의 정보와 
//     Total, Average 출력하기

// 6-1)
class Student {
	private String name;
	private int ban;
	private int no;
	private int kor;
	private int eng;
	private int math;

public void setName(String name) { this.name = name; }
public String getName() { return name; }

public void setBan(int ban) { this.ban = ban; }
public int getBan() { return ban; }

public void setNo(int no) { this.no = no; }
public int getNo() { return no; }

public void setKor(int kor) { this.kor = kor; }
public int getKor() { return kor; }

public void setEng(int eng) { this.eng = eng; }
public int getEng() { return eng; }

public void setMath(int math) { this.math = math; }
public int getMath() { return math; }

	public String toString() {
		return "[ 학생이름= " + name + ", 반="
				+ ban + ", 번호=" + no + ", 국어점수="
				+ kor + ", 영어점수=" + eng + ", 수학점수="
				+ math + " ]";
		}
	
	}


public class Ex09_StudentTest {

	public static void main(String[] args) {
		Student s = new Student("홍길동", 1, 1, 100, 60, 76);
		
		String str = s.info();
		System.out.println(str);
		
// 6-2)생성자
		Student s = new Student();
		s1.setName("홍길동");
		
	} //main
} //class


