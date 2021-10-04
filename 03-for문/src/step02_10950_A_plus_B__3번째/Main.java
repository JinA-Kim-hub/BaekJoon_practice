package step02_10950_A_plus_B__3번째;
// 문제 출처
// https://www.acmicpc.net/problem/10950

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
/*
나의 풀이))
맨 처음 입력 받은 숫자 만큼 
띄어쓰기를 구분자로 서로 더해줄 숫자 두개를 
String으로 한줄 씩 입력 받는다.

StringTokenizer로 띄어쓰기를 제외한 숫자 2개를 뽑아낸다.
그 두개의 숫자를 더해서 출력
*/
public class Main {
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;//총 줄 개수
		String str2 = null;//띄어쓰기로 구분하여 숫자 2개 입력
		ArrayList<String> arr = new ArrayList<String>();
		int T = 0;
		try {
			str = br.readLine();
			T = Integer.parseInt(str);//2개의 숫자를 입력 받을 줄 수를 입력
			for(int i=0 ; i <T; i++) {//T만큼 숫자 2개를 한줄 씩 입력
			str2 = br.readLine();
			arr.add(str2);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(br!=null)
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
		
		for(int i = 0; i < T ; i++ ) {
		StringTokenizer st = new StringTokenizer(arr.get(i));
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		System.out.println(a+b);
		}
		
		
/*
5
1 1
2 3
3 4
9 8
5 2
*/
		
	}
}
