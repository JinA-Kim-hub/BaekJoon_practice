package step01_10818_최소_최대;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//버블정렬 이용
public class Main3 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		if(N>=1 && N<=1000000) {
		int[] userNums = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i <N ; i++) {//N은 5
			userNums[i] = Integer.parseInt(st.nextToken()); 
		}

		for (int i = 1; i <= userNums.length; i++) {
			for (int j = 0; j < userNums.length - i; j++) {
				if (userNums[j] > userNums[j + 1]) {//큰수가 뒤로
					int temp = 0;
					temp = userNums[j + 1];
					userNums[j + 1] = userNums[j];
					userNums[j] = temp;
				}//if
			}//for j
		}//for i
		
			System.out.print(userNums[0]+ " " + userNums[userNums.length-1]);
		
		}
		br.close();
	}
}
