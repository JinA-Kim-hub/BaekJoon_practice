package step01_10954_A_더하기_B;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
//if문 안에 break문을 사용해보자
//입력값들을 각각 연산 후 break 전까지 계속 StringBuilder 에 넣고 막판에 한번에 출력

public class Main3 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		
		while(true) {
			
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if(a==0 && b==0) {
				break;
			}
			sb.append(String.valueOf(a+b)).append("\n");
		}//while
		
		br.close();
		System.out.println(sb);
		
	}//main
}//class

/*

	1 1
	2 2
	0 0
 
*/