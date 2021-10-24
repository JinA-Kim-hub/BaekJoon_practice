package step02_2562_최댓값;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		int[] userNums = {s.nextInt(), s.nextInt(), s.nextInt(), 
						  s.nextInt(), s.nextInt(), s.nextInt(), 
						  s.nextInt(), s.nextInt(), s.nextInt()};
		int count=0;
		int max = 0;
		for(int i=0 ; i < userNums.length ; i++) {
			
			if(userNums[i]>max) {
				max=userNums[i];
				count=i;
			}
		}

		System.out.println(max + "\n" + (count+1));
		s.close();					
		
	}

}
