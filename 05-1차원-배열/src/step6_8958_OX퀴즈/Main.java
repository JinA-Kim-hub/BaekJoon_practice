package step6_8958_OX퀴즈;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String jungdap[] = new String[s.nextInt()];// 총 입력갯수
		for (int i = 0; i < jungdap.length; i++) {
			jungdap[i] = s.next();// 공백 전까지의 문자열
		}

		for (int i = 0; i < jungdap.length; i++) {

			int count = 0; // 연속 카운트
			int sum = 0;

			for (int j = 0; j < jungdap[i].length(); j++) {

				if (jungdap[i].charAt(j) == 'O') {
					count++;
				} else {
					count = 0;//만약 x가 나온다면 o연속이 끊어지므로 카운트 초기화*******************
				}
				sum += count;
			}

			System.out.println(sum);

			s.close();

		}
	}
}
