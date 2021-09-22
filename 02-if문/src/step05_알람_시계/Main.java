package step05_알람_시계;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 문제 출처
// Https://www.acMicpc.net/probleM/2884


/*

((고찰))
입력한 시간의 시와 분을 따로 처리를 해준다.

0. 우선 입력한 시간의 시를 H라 하고 분을 M이라 했을 때

1. Minute(분)

45분을 앞당겨야 하므로 M에서 45를 빼준다. 
이때 시계는 60분을 기본단위로 계속 양의 수로 돌아가는 형태이므로 60을 더해준다.

2. Hour(시) <- 수정 필요
45분 앞당겨지면서 H에서 1시간을 빼줘야 하는 경우가 있고 아닌 경우 구분.
1) M-45 결과가 0 미만이라면 60 더하고 H에서 1을 빼준다.
2) M-45 결과가 0 이상이라면 그대로 H, M-45 출력을 해준다.


*/
/*

 * StringTokenizer 생성자 :
  
  //띄어쓰기 기준으로 문자열 분리
  StringTokenizer s = new StringTokenizer(문자열);
  
  //구분자 기준으로 문자열 분리
  StringTokenizer s = new StringTokenizer(문자열, 구분자);
  
  //구분자를 기준으로 문자열 분리하되 구분자도 토큰으로 넣을거면 true. 디폴트 값은 false
  StrignTokenizer s = new StringTokenizer(문자열, 구분자, false);

	
*/
public class Main {
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int H=0 , M =0;
		int alarm_H=0 , alarm_M =0;
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
		
		alarm_M = M - 45;
		if(alarm_M < 0) {
			alarm_M = alarm_M + 60;
			alarm_H = H - 1;
			if(alarm_H < 0)
				alarm_H = alarm_H + 24;
		}else {
			alarm_H = H;
		}
		
		System.out.println(alarm_H + " " + alarm_M);
		
		
	}
}
