package step7_4344_평균은_넘겠지;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int C = s.nextInt(); //테스트케이스					//5
						
		int[] students;		 //학생들 점수 배열					//50   50  70  80  100	
		
		
		
		for(int i = 0 ; i < C ; i++) {//행(케이스)
			int N = s.nextInt();	//학생 수		
			students = new int[N];
			double sum=0;//성적 합  -->> int로 하면 값이 전부 00.00%로 출력
			
			for(int j = 0 ; j < N ; j++) {//열(학생들 수와 학생들의 성적들)
				int grade = s.nextInt();
				students[j] = grade;
				sum += grade;	
			}
			double average = (sum / N) ;//평균
			double count=0;//평균 넘는 학생들 카운트
			for(int j = 0 ; j < N ; j++) {
				if(students[j] > sum / N) {
					count++;
				}
			}//inner for문
			
			System.out.printf("%.3f%%\n",(double)(count/N)*100);
	
		}//outer for
		
		
		s.close();
		
	}//main
}//class
/*

5
5 50 50 70 80 100
7 100 95 90 80 70 60 50
3 70 90 80
3 70 90 81
9 100 99 98 97 96 95 94 93 91


*/