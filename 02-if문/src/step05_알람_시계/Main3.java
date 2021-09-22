package step05_알람_시계;
//Main2 에 데이터 검증 추가

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 문제 출처
// Https://www.acMicpc.net/probleM/2884
/*

((풀이과정))
입력한 시간의 시와 분을 따로 처리를 해준다.

0. 우선 입력한 시간의 시를 H라 하고 분을 M이라 했을 때

1. Minute(분)

45분을 앞당겨야 하므로 M에서 45를 빼준다. 
(이때 뺀값이 음수라면 시계는 60분을 기본단위로 계속 양의 수로 돌아가는 형태이므로 60을 더해준다.)

2. Hour(시) <- 수정 필요
45분 앞당겨지면서 H에서 1시간을 빼줘야 하는 경우가 있고 아닌 경우 구분.
1) M-45 결과가 0 미만이라면 60 더하고 H에서 1을 빼준다.
2) M-45 결과가 0 이상이라면 그대로 H, M-45 출력을 해준다.


*/

public class Main3 {
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int H = 0, M = 0;
		String str = null;
		StringTokenizer st = null;
		try {
			str = br.readLine();
			st = new StringTokenizer(str);
			if(H >= 0 && H <= 23 && M >= 0 && M >= 59) {//데이터검증 추가
			H = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			}
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
