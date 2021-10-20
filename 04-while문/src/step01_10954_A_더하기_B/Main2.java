package step01_10954_A_더하기_B;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
//if문 안에 break문을 사용해보자
//BufferedWriter로 int형 출력시 String형으로 형변환 필요 -> String.valueof(int형)

public class Main2 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		
		while(true) {
			
			st = new StringTokenizer(br.readLine()," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if(a==0 && b==0) {
				break;
			}
			bw.write(String.valueOf(a+b)+"\n");
		}//while
		
		br.close();
		bw.close();
		
	}//main
}//class
