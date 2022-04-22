package Beakjoon;

import java.util.Scanner;

public class Fibonacci {

	public static int fibo(int num) {

		if (num == 0) {
			return 0;
		} else if (num == 1) {
			return 1;
		}
		
		return fibo(num-2) + fibo(num - 1);
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		System.out.println(fibo(num));
	}
}
