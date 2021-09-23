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
/*

if문 데이터 검증 없이 데이터 거르기..))

1. H(시간)
M이 45보다 작을 때는 H에서 1을 빼줘야 한다. 이때,
H에서 1을 빼고 24를 더했을 때 연산 결과가 24를 초과하면
24를 나눈 나머지 값을 H에 재할당해준다.

2. M(분)
M에서 45를 빼고 60을 더했을 때 연산 결과가 60을 초과하면
60을 나눈 나머지 값을 M에 재할당해준다. 


풀이과정 출처))
https://www.youtube.com/watch?v=xzJmw_SOP_0

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
			H = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (M < 45) {
			H = ((H - 1) + 24) % 24;
		}
		M -= 45;
		M = (M + 60) % 60;

		System.out.println(H + " " + M);

	}
}
