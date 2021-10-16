package step05_2741_N_찍기;

import java.util.Scanner;

// 문제 출처))
// https://www.acmicpc.net/problem/2741
/*

자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.

첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.

*/
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		
		for(int i=1; i<=N;i++) {
			System.out.println(i);
		}
		s.close();
	}
}
/*
5

1
2
3
4
5
*/
