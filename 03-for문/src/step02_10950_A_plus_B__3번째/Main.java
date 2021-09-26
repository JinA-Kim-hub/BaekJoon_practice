package step02_10950_A_plus_B__3번째;
// 문제 출처
// https://www.acmicpc.net/problem/10950

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		String str2 = null;
		ArrayList<String> arr = new ArrayList<String>();
		
		try {
			str = br.readLine();
			str2 = br.readLine();
			arr.add(str2);
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
		
		int T = Integer.parseInt(str);
		for(int i = 0; i < T ; i++ ) {
		StringTokenizer st = new StringTokenizer(str2);
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		System.out.println(a+b);
		}
		
	}
}
