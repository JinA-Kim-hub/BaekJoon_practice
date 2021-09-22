package step05_알람_시계;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 문제 출처
// https://www.acmicpc.net/problem/2884

/*

첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 
알람 시간 H시 M분을 의미한다.

입력 시간은 24시간 표현을 사용한다. 
24시간 표현에서 하루의 시작은 0:0(자정)이고, 
끝은 23:59(다음날 자정 1분 전)이다. 
시간을 나타낼 때, 불필요한 0은 사용하지 않는다. 

*/
/*

((고찰))
입력한 시간의 시와 분을 따로 처리를 해준다.

0. 우선 입력한 시간의 시를 h라 하고 분을 m이라 했을 때

1. minute(분)

45분을 앞당겨야 하므로 m에서 45를 빼준다. 
이때 시계는 60분을 기본단위로 계속 양의 수로 돌아가는 형태이므로 60을 더해준다.

2. hour(시) <- 수정 필요
45분 앞당겨지면서 h에서 1시간을 빼줘야 하는 경우가 있고 아닌 경우가 있는데
예를 들어 10시 50분이라고 입력했을 때 m에 해당하는 50 빼기 45를 해주면 5가 나오며.. 이때
5더하기 60분을 해주면 65분이 되어버린다.
그럼 이때 분에 대한 연산 결과가 60이상일때는 h에서 1을 빼주고
그게 아닐 때는 빼주지 않는다. 



*/
public class Main {
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
			
		
	}
}
