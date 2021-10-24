package step02_2562_최댓값;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//java.util.NoSuchElementException
public class Main2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] userNums = new int[9];
		while(st.hasMoreTokens()) { 
			for (int i = 0; i < userNums.length; i++) {
				userNums[i] = Integer.parseInt(st.nextToken()); // 데이터 입력 및 배열에 저장
			}
		}	
		
		int count=0;
		int max=0;
		for(int i=0 ; i < userNums.length ; i++) {
			
			if(userNums[i]>max) {
				max=userNums[i];
				count=i;
			}
		}

		bw.write(max + "\n" + (count+1));
		
		br.close();
		bw.close();
	}

}
