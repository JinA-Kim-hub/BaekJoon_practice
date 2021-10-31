package step04_3052_나머지;

import java.util.HashSet;
import java.util.Scanner;

//자연수 10개 입력 받아서 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력
//HashSet 이용. -> 중복을 허용하지 않는다.
public class Main {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		HashSet<Integer> sh = new HashSet<Integer>();
		
		
		int[] arr = {s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt(),
		                    s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt()};
		
		for(int i =0; i < arr.length; i++) {
			sh.add(arr[i]%42);
		}
		
		System.out.println(sh.size());
		
		
		s.close();
	}
}
/*

 1
2
3
4
5
6
7
8
9
10
 -----------------------
 10
 */
