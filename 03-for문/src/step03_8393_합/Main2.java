package step03_8393_합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//문제 출처))
//https://www.acmicpc.net/problem/8393

public class Main2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int sum=0;
		for(int i=1 ; i<=a; i++) {
			sum += i;
		}
		System.out.println(sum);
		br.close();
	}
}
