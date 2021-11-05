package StarPrinter_12;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		
		//윗쪽
		for(int i = 0 ; i < N ; i++) {
			//왼쪽
			for(int j = N-1 ; j>i ; j--)
				System.out.print(" ");
			//오른쪽	
			for(int j = 0 ; j <= i ; j++)
				System.out.print("*");
			
			System.out.println();
		}
		
		//아랫쪽
		for(int i = 1 ; i < N ; i++) {
			//왼쪽
			for(int j = 1; j <= i ; j++) {
				System.out.print(" ");
			}
			//오른쪽
			for(int j = N-1 ; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		s.close();
	}

}
