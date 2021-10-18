package StarPrinter_01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		
		for(int i=0; i<N ;i++) {
			for(int k=0; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		s.close();
		
	}
}
