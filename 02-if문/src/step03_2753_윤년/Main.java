package step03_2753_윤년;

import java.util.Scanner;

//윤년

// 문제 출처))
// https://www.acmicpc.net/problem/2753

public class Main {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int year = s.nextInt();
		
		if(year>=1 && year<=4000 &&(year%4==0 && year%100 != 0) || (year%400 ==0))
			System.out.print(1);
		else
			System.out.print(0);
		
		
		
		s.close();
		
	}

}
