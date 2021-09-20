package step04_14681_사분면_고르기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 출처
// https://www.acmicpc.net/problem/14681

//BufferedReader, ternary operator
//else if 구문으로 했을 때보다 실행 시간이 조금 길게 나왔다.


/*

양양 1
음양 2
음음 3
양음 4

*/
public class Main2 {
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x=0 , y=0;// Multiple markers at this line. 복수 표시기. 
		try {
			x=Integer.parseInt(br.readLine());
			y=Integer.parseInt(br.readLine());
			br.close();
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		
		if(x>=-1000 && x<=1000 && y>= -1000 && y <= 1000) {
			System.out.println((x>0 && y>0)?1:
							   (x<0 && y>0)?2:
							   (x<0 && y<0)?3:4);
		}
	}
}
