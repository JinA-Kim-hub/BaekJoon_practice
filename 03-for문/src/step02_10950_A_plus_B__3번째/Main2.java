package step02_10950_A_plus_B__3번째;
import java.util.Scanner;
 
public class Main2 {
	public static void main(String args[]) {
 
		Scanner s = new Scanner(System.in);
 
		int T = s.nextInt();
		int[] sum = new int[T];
		
		for(int i=0 ; i <T;i++) {
			int a = s.nextInt();// nextInt()는 [공백 전까지]의 정수를 입력 받는다. **************
			int b = s.nextInt();
			sum[i] = a+b;
		}
		for(int a : sum) {
			System.out.println(a);
		}
				s.close();
	}
}
/*
5
1 1
2 3
3 4
9 8
5 2
*/