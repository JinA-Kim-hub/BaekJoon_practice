package step03_2577_숫자의_개수;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int A = s.nextInt();// 150
		int B = s.nextInt();// 266
		int C = s.nextInt();// 427
		int result =  A*B*C;// 17,037,300
		
		String str = String.valueOf(result);
		for(int i=0;i<10;i++) {
			int count=0;
			for(int j=0; j < str.length();j++) {
				if((str.charAt(j)-48)==i) {
					count++;
				}
			}
			System.out.println(count);
		}
		
		
		s.close();
	}
}
