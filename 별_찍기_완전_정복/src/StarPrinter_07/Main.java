package StarPrinter_07;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		//윗 부분
		for(int i = 1; i<N; i++) {
			
			//공백
			for(int j= N ; j>i ; j--) {
				System.out.print(" ");
			}
			//왼쪽 별
			for(int j = 1 ; j <i ;j++) {
				
				System.out.print("*");
			}
			//오른쪽 별
			for(int j=0; j<i ; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
		//아랫 부분
		for(int i = 0 ; i<N; i++) {
			//공백
			for(int j=0 ; j<i ;j++) {
				System.out.print(" ");
			}
			//왼쪽 별
			for(int j=N-1 ; j>i ; j--) {
				System.out.print("*");
			}
			//오른쪽 별
			for(int j=N; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		s.close();
		
	}
}
