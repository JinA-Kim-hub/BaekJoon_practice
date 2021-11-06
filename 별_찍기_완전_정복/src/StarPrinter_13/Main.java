package StarPrinter_13;

import java.util.Scanner;
//hint) 오른쪽만 출력시 왼쪽 공백이 필요할까?
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		
		//위쪽
		for(int i=0; i < N ; i++) {
			//왼쪽
			for(int j=0 ; j<=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//아래쪽
		for(int i = N ; i > 1 ; i--) {
			//왼쪽
			for(int j = i ; j > 1 ; j--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		s.close();
	}

}
