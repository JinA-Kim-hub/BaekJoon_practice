package step11_2588_곱셈;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			int A = 0;
			int B = 0;
			int C = 0;
			
			A=scanner.nextInt();
			B=scanner.nextInt();
			
			C=B%10;
			System.out.println(A*C);
			C=(B/10)%10;
			System.out.println(A*C);
			C=(B/100)%10;
			System.out.println(A*C);
			System.out.println(A*B);
			
			
			scanner.close();
		
		
	}
}
