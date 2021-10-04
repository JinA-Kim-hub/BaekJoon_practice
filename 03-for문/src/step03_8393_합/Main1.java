package step03_8393_합;

import java.util.Scanner;

//문제 출처))
//https://www.acmicpc.net/problem/8393

public class Main1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int sum = 0;
		for(int i =1; i<= a; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		s.close();
	}
}
