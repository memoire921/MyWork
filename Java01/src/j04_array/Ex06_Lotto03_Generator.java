package j04_array;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

// ** Lotto 생성기
// => 최승호 님

public class Ex06_Lotto03_Generator {

	public static void main(String[] args) {
		System.out.println("** Lotto 6/45 생성기 **");

	    System.out.print("추첨일 : ");
	    LocalDateTime now2 = LocalDateTime.now();
	    String formatedNow = now2.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초"));
	    System.out.println(formatedNow + "\n");

	    int[][] lott645 = new int[5][6];

	    for (int row = 0; row < lott645.length; row++) {
	       for (int col = 0; col < lott645[0].length; col++) {
	          lott645[row][col] = (int) (Math.random() * 45) + 1;
	          for (int i = 0; i < col; i++) {
	               if (lott645[row][col] == lott645[row][i]) {
	                  col--;
	                  break;
	               } //if
	           } //i
	        } //col

	       Arrays.sort(lott645[row]);
	         
	    } //row

	    for (int row = 0; row < lott645.length; row++) {
	       System.out.printf("%c조 : ", row + 65);
	       for (int col = 0; col < lott645[0].length; col++) {
	          System.out.printf("%d ", lott645[row][col]);
	       }
	       System.out.println();
	    }

	    System.out.println("\n조별 최소값 및 최대값");
	    int[] min = new int[5];
	    int[] max = new int[5];

	    for (int row = 0; row < lott645.length; row++) {
	       min[row] = 45;
	       max[row] = 0;

	       for (int col = 0; col < lott645[0].length; col++) {
	          if (min[row] > lott645[row][col])
	             min[row] = lott645[row][col];
              if (max[row] < lott645[row][col])
	             max[row] = lott645[row][col];
	       } //col
	    } //row

	    for (int row = 0; row < lott645.length; row++) {
	       System.out.printf("%c조 : min = %d, max = %d\n", row + 65, min[row], max[row]);
	    } //row

	} //main

} //class
