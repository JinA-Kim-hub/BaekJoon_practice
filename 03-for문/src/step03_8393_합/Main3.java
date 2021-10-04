package step03_8393_합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//문제 출처))
//https://www.acmicpc.net/problem/8393

//변수를 한번만 받으므로 코드를 한줄로 정리해준다.
//-> 훨씬 실행 속도가 적어짐!

//참고))
//https://st-lab.tistory.com/29
public class Main3 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int a = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());//BufferedReader 사용시 굳이 선언을 하지 않아도 바로 변수에 대입 가능하다!!! *********************
		int sum=0;
		for(int i=1 ; i<=a; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
