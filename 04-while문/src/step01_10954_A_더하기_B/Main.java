package step01_10954_A_더하기_B;

import java.util.Scanner;
//if문 안에 break문을 사용해보자
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a , b=0;
		while(true) {
			a = s.nextInt();
			b = s.nextInt();
			if(a==0 && b==0)
			break;
			System.out.println(a+b);
		}
		
		
		s.close();
	}
}
