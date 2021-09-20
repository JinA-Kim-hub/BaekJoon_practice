package step04_14681_사분면_고르기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 출처
// https://www.acmicpc.net/problem/14681

//BufferedReader, else if 구문


/*

양양 1
음양 2
음음 3
양음 4

*/
public class Main {
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
			if(x>0 && y>0)
				System.out.println(1);
			else if(x<0 && y >0)
				System.out.println(2);
			else if(x<0 && y<0)
				System.out.println(3);
			else
				System.out.println(4);
		}
		
	}
}
