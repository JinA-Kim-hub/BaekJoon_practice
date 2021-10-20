package StarPrinter_09;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		
		//윗 부분 (N-1)행
		for(int i=1 ; i <N; i++) {
			
			//왼쪽 공백
			for(int j=1 ; j<i ; j++) {
				System.out.print(" ");
			}
			
			//왼쪽 별
			for(int j=N ; j>i ; j--) {
				System.out.print("*");
			}
			
			//가운데 별 (하나 씩 생성)
			for(int j=i ; j<=i ; j++) {
				System.out.print("*");
			}
			
			//오른쪽 별
			for(int j=N ; j>i ; j--) {
				System.out.print("*");
			}
			
			
			System.out.println();
		}
			
		
		
		
		//아랫 부분 N행
		for(int i=0 ; i<N ; i++) {
			//왼쪽 공백
			for(int j=N-1; j>i; j--) {
				System.out.print(" ");
			}
			//왼쪽 별
			for(int j=0 ; j<=i; j++) {
				System.out.print("*");
			}
			//오른쪽 별
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
			
		
		
		s.close();
		
	}
}
