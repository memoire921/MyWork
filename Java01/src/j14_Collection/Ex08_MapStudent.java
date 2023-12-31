package j14_Collection;

import java.util.HashMap;

//** Student Map Test
//=> Student 객체 5개 HashMap 에 넣고 출력하기

class Student {
 private String no;
 private String name;
 private int java;
 private int html;
 private int sum;
 
 Student(String no, String name, int java, int html) {
    this.no=no;
    this.name=name;
    this.java=java;
    this.html=html; 
    this.sum=java+html;
 }
 
 public String getName() {
    return name;
 }
 public void setName(String name) {
    this.name = name;
 }
 public int getJava() {
    return java;
 }
 public void setJava(int java) {
    this.java = java;
 }
 public int getHtml() {
    return html;
 }
 public void setHtml(int html) {
    this.html = html;
 }

 @Override
 public String toString() {
    return "Student [no=" + no + ", name=" + name + ", java=" + java + ", html=" + html + ", sum=" + sum + "] \n";
 }
} //class

public class Ex08_MapStudent {

	public static void main(String[] args) {
		// 1. Map 정의
		HashMap<String, Student> sm = new HashMap<String, Student>();
		
		// 2. 초기화
		sm.put("A001", new Student("A001", "홍길동", 90, 80));
		sm.put("A002", new Student("A002", "김길동", 80, 70));
		sm.put("A003", new Student("A003", "이길동", 70, 60));
		sm.put("B001", new Student("B001", "오길동", 50, 90));
		sm.put("B002", new Student("B002", "차길동", 90, 100));
		
		// 3. 수정, 삭제
		sm.get("A003").setName("김그린");
		sm.remove("A001");
		
		// 4. 출력
		System.out.println(sm);
		

	} //main

} //class
