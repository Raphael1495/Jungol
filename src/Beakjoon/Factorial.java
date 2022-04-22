package Beakjoon;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int multiple = 1;

		do {
			num = sc.nextInt();
		} while (num < 0 || num > 12);

		sc.close();

		if (num == 0) {
			System.out.print(1);
		} else {
			for (int i = 1; i < num + 1; i++) {
				multiple = multiple * i;
			}
			System.out.print(multiple);
		}
	}
}
