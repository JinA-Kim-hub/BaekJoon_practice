package step03_1110_더하기_사이클;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//입력 받을 정수는 한자리 수에서 최대 두자리 수이다.
//즉 "가장 오른쪽 자릿수"는 1의 자릿수를 의미하게 된다.
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());//26
		int N2 = N;//사이클 돌려서 만든 숫자 담는 변수
		int temp = 0;
		int count = 0;
		/*
		while(N2 != N) {//26 -> 2+6=8 => 68
			
			temp = N2/10 + N2%10;//8
			//		2		6
			N2 = N2%10*10 + temp%10;//68
			//		60		  8
			
			count++;
		}
		*/
		do {
			temp = N2/10 + N2%10;//8
			//		2		6
			N2 = N2%10*10 + temp%10;//68
			//		60		  8
			count++;
		}while(N2 != N);
		System.out.println(count);
	}
}
/*

26 4
0 1
00 -> 0/10 + 0%10 = 0 => 00 
*/
