package step01_11720_숫자의_합;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		int sum = 0;
		s.nextLine();
		
		String str = s.nextLine();
		
		
		for(int i =0; i < N; i++) {
			
			sum += str.charAt(i)-'0';
			
		}
		
		System.out.println(sum);
		s.close();
	}
}

