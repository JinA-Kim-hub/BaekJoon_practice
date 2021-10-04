package step02_10950_A_plus_B__3번째;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//BufferedReader, StringBuilder, StringTokenizer
/*
 * StringBuilder에 정수를 담아두고 꺼내와서 더해주기 보다
 * 더하고 StringBuilder에 담아둔뒤 출력하는 방식을 사용한다.
 */

//문제 풀이 출처))
//https://st-lab.tistory.com/28

//StringBuilder & System.out.println 에 관하여....
//참고 자료 ))
//https://mygumi.tistory.com/83
public class Main3 {
	public static void main(String args[]) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T=0;
		
		try {
			T = Integer.parseInt(br.readLine());//두 정수를 입력받을 총 줄수
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i <T ;i++) {
			StringTokenizer st=null;
			try {
				st = new StringTokenizer(br.readLine()," ");
			} catch (IOException e) {
				e.printStackTrace();
			}
			sb.append(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()));
			sb.append("\n");//문자열에서 줄바꿈
		}
		
		System.out.println(sb);
		
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