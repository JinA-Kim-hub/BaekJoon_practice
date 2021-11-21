package step01_11720_숫자의_합;

import java.util.Scanner;
import java.util.StringTokenizer;
/*
문제 변형 :
숫자에 공백을 두고 입력 받을 때.
공백을 구분자로 숫자를 따로따로 인식하고 합을 구한다면....

 */
public class Main2 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int[] arr = new int[s.nextInt()];
		s.nextLine();//버퍼 비우기
		
		System.out.println(arr.length);
		int sum = 0;
		
		String str = s.nextLine();//공백을 두고 숫자 입력
		
		StringTokenizer st = new StringTokenizer(str);
		for(int i = 0 ; i < arr.length;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i =0; i < arr.length; i++) {
			
			sum += arr[i];
			
		}
		
		System.out.println(sum);
		s.close();
	}
}

