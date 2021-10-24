package step02_2562_최댓값;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


//java.util.NoSuchElementException -> 에러 해결 필요
/*
 61Exception in thread "main" java.util.NoSuchElementException
	at java.util.StringTokenizer.nextToken(Unknown Source)
	at step02_2562_최댓값.Main.main(Main.java:18)
 */
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] userNums = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()),
				Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),
				Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};
		int count=0;
		int max=0;
		for(int i=0 ; i < userNums.length ; i++) {
			
			if(userNums[i]>max) {
				max=userNums[i];
				count++;
			}
		}

		bw.write(userNums[count] + "\n" + count);
		br.close();
		bw.close();
	}

}
