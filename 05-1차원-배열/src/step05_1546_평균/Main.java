package step05_1546_평균;

import java.util.Arrays;
import java.util.Scanner;
//시험 정수 최댓값 M
//모든 점수를 점수/M*100
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		int N = s.nextInt();//과목 수
		double jumsu[] = new double[N];//
		
		for(int i = 0; i < N; i++) {
			jumsu[i] = s.nextDouble();
		}
		
		double sum = 0;
		Arrays.sort(jumsu);
		
		for(int i = 0; i < jumsu.length; i++) {
			sum += ((jumsu[i] / jumsu[jumsu.length-1]) * 100);
		}
		System.out.print(sum / jumsu.length);
		
		
		
		
		s.close();
		
	}
}

/*
 9
10 20 30 40 50 60 70 80 90
 */
