package step01_1330_두수_비교하기;
//BufferedReader, StringTokenizer 사용

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//BufferedReader 사용해서 풀어보기



public class Main5 {
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		StringTokenizer st = null;
		
		try {
			str = br.readLine();
			st = new StringTokenizer(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		System.out.println((A>B) ? ">" :((A==B) ? "==" : "<"));	
		
		
		
		
	}

}
