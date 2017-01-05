package practice01;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		while (true) {
			int sum = 0;

			System.out.print("숫자를 입력하세요: ");
			int input = s.nextInt();
			for (int i = 0; i <= input; i++ ) {
				if (input % 2 == 0) { // 짝수일때
					sum += i;
					i++;
				} else {
					i++;
					sum += i;

				}
			}
			System.out.println("결과 값 : " + sum);

		}
	}

}
