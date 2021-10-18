package StarPrinter_02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		
		for(int i=1 ; i<=N ; i++) {
			
			//공백
			for(int k=N ; k>i ; k-- ) {
				System.out.print(" ");
			}
			
			//별
			for(int k=1; k<=i ; k++) {
				System.out.print("*");
			}
			
			System.out.println("");
			
		}
		
		
		s.close();
		
	}
}
