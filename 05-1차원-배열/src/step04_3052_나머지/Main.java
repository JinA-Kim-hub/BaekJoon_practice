package step04_3052_나머지;

import java.util.Scanner;

//자연수 10개 입력 받아서 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력
public class Main {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int[] arr = new int[10];
		int[] arr2 = new int[10];
		int a =0;
		
		for(int i =0; i < arr.length; i++) {
			arr[i] = s.nextInt();
			arr2[i] = arr[i]%42;
		}
		
		//---------------------------------
		
		/*
		  
		  
		  
		Scanner in = new Scanner(System.in);
		HashSet<Integer> h = new HashSet<Integer>();
 
		for (int i = 0; i < 10; i++) {
			h.add(in.nextInt() % 42);
		//입력받은 값의 나머지 값을 add메소드를 통해 HashSet에 저장
		}
        
		in.close();
		System.out.print(h.size());
		 * 
		 */
		
		
		s.close();
	}
}
