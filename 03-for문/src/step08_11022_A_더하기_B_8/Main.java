package step08_11022_A_더하기_B_8;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int T = s.nextInt();
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i<=T; i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			int sum = a+b;
			sb.append("Case #" + i + ": " + a +" + " + b + " = " + sum +"\n");
		}
		
		System.out.println(sb);
		
		s.close();
	}
}
