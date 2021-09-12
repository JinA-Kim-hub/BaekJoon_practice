package step01_1330_두수_비교하기;
//BufferedReader, StringTokenizer 사용

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//BufferedReader 사용해서 풀어보기

/*
첫째 줄에 A와 B가 주어진다. A와 B는 [공백 한 칸]으로 구분되어져 있다.
첫째 줄에 다음 세 가지 중 하나를 출력한다.
A가 B보다 큰 경우에는 '>'를 출력한다.
A가 B보다 작은 경우에는 '<'를 출력한다.
A와 B가 같은 경우에는 '=='를 출력한다.

*/


public class Main5 {
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String arr =null;
		
		
		try {
			StringTokenizer st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens())
				arr = st.nextToken();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(arr[0]);
			
		
		
		
		
	}

}
