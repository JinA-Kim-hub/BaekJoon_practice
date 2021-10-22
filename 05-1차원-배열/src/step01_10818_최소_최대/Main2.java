package step01_10818_최소_최대;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

//Arrays.sort(배열명) -> 오름차순 정렬
public class Main2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[] userNums = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());

		int index = 0;

		while (st.hasMoreTokens()) {
			userNums[index] = Integer.parseInt(st.nextToken());
			index++;
		}

		Arrays.sort(userNums);
		bw.write(userNums[0] + " " + userNums[N - 1]);
		br.close();
		bw.close();
	}
}
