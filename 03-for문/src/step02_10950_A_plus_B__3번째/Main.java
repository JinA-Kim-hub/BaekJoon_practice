package step02_10950_A_plus_B__3번째;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		String str2 = null;
		
		try {
			str = br.readLine();
			str2 = br.readLine();
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
		StringTokenizer st = new StringTokenizer(str2);
		
		
		
	}
}
