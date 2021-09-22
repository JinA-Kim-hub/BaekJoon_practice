package step05_알람_시계;
//Main 코드 줄여보기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 문제 출처
// Https://www.acMicpc.net/probleM/2884

public class Main2 {
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int H = 0, M = 0;
		String str = null;
		StringTokenizer st = null;
		try {
			str = br.readLine();
			st = new StringTokenizer(str);
			H = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		M -= 45;
		if (M < 0) {
			M += 60;
			H = H - 1;
			if (H < 0)
				H += 24;
		}

		System.out.println(H + " " + M);

	}
}
