package step02_10950_A_plus_B__3번째;

import java.util.Scanner;

//문제 출처
//https://www.acmicpc.net/problem/10950

//Scanner
public class Main2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int T = s.nextInt();
		
		String[] userChoice = null;
		
		for(int i=0;i<T;i++) {
			s.nextLine();	//개행문자(엔터)를 제거하기 위해 추가****
			userChoice = s.nextLine().split(" ");//split(String regex) <- 안에 구분자를 넣어서 문자열을 나눈다.
		}
		for(int i=0;i<T;i++) {
			//System.out.println(Integer.parseInt(userChoice[i])+Integer.parseInt(userChoice[i+1]));
			System.out.println(userChoice[i]);
		}
		s.close();
	}
}
/*
5
1 1
2 3
3 4
9 8
5 2
*/