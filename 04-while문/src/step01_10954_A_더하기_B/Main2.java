package step01_10954_A_더하기_B;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main2 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while(st.nextToken().equals("0") && st.nextToken().equals("0")) {
			System.out.println(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()));
			if(st.nextToken().equals("0") && st.nextToken().equals("0")) {
				break;
			}
		}
	}
}
