package step07_11021_A_더하기_B_7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		for(int i = 1 ; i <= T ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			bw.write("Case #" + i +": " + (Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+"\n");
			//bw.newLine();
		}
		br.close();
		bw.close();
		
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
