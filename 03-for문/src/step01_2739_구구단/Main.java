package step01_2739_구구단;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = null;

		try {
			str = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null)
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}

		int number = Integer.parseInt(str);

		if (number >= 1 && number <= 9) {
			for (int i = 1; i < 10; i++) {
				System.out.println(number + " * " + i + " = " + number * i);
			}
		}

	}
}
