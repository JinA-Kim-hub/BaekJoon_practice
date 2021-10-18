package StarPrinter_05;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		
		for(int i=0 ; i < N ; i++) {
			
			//공백
			for(int j = N-1 ; j>i ; j-- ) {
				System.out.print(" ");
			}
			
			//왼쪽 별
			for(int j = 0 ; j < i; j++) {
				System.out.print("*");
			}
			
			//오른쪽 별
			for(int j=0 ; j<=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		s.close();
		
	}
}
