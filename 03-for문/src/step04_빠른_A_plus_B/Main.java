package step04_빠른_A_plus_B;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

//문제 출처))
//https://www.acmicpc.net/problem/15552

/*
 * Java를 사용하고 있다면, Scanner와 System.out.println 대신 
 * BufferedReader와 BufferedWriter를 사용할 수 있다. 
 * BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.
 * 
 */



//int 타입을 String으로 변환 -> String.valueOf 

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());//입력할 총 줄 갯수
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		if( T <= 1000000) {
			for(int i = 0; i<T; i++) {
				st = new StringTokenizer(br.readLine()," ");
				sb.append(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()));
			}
		}
		bw.write(String.valueOf(sb));
	
		
		
		
/*
		
5
1 1
12 34
5 500
40 60
1000 1000
		
*/
	}
}
