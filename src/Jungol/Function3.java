package Jungol;

//592 : 함수3 - 자가진단4
//import java.util.Scanner;
//
//public class Function3 {
//
//	public static int multiplication(int num) {
//
//		if (num == 0) {
//			return 0;
//		}
//		int x = 1;
//		x = num % 10; // 1의 자리 숫자부터 추출;
//
//		if (x == 0) { // 0일 경우 1로 초기화;
//			x = 1;
//		}
//
//		num = num / 10; // 자릿수 한자리씩 당기
//
//		return ((x * x) + multiplication(num)); // 자릿수 하나씩 곱하기;
//	}
//
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//
//		int num = sc.nextInt();
//		sc.close();
//
//		System.out.println(multiplication(num));
//	}
//}

//591 : 함수3 - 자가진단6
//import java.util.Scanner;
//
//public class Function3 {
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		System.out.print(fibo(num));
//	}
//
//	public static int fibo(int num) { // 피보나치 1 1 2 3 5 8 13
//		if (num == 1) {
//			return 1;
//		}
//		return fibo(num / 2) + fibo(num - 1); // num = 1, 1 / num=2,2 / num=3,3 / num=4,5 / num=5,7/
//	}
//
//}
//231 : 함수3 - 형성평가1 ## 보고품;
//import java.util.Scanner;
//
//public class Function3 {
//	public static void main(String[] args) {
//		int num = 0;
//		Scanner sc = new Scanner(System.in);
//		num = sc.nextInt();
//		call(num);
//	}
//
//	public static void call(int num) {
//		if (num > 0) {
//			call(num / 2);
//			System.out.print(num + " ");
//		}
//	}
//}

//232 : 함수3 - 형성평가2 ## 보고품;
//import java.util.Scanner;
//
//public class Main {
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		
//		fibo(num);
//	}
//
//	public static void fibo(int num) {
//		if (num > 0) { 
//			fibo(num-2);
//			System.out.print(num + " ");
//		}
//	}
//}

//233 : 함수3 - 형성평가3  ## 못풀었음;
//import java.util.Scanner;
//
//public class Function3 {
//	public static void main(String[] args) {
//
//
//	}
//
//	public static int fibo(int num) {
//		
//	}
//}

//234 : 함수3 - 형성평가4  ## 질문 : 타임 리밋 엑시트; ##
//import java.util.Scanner;
//import java.io.*;
//
//public class Function3 {
//	public static int fibo(int num) {
//		
//		if (num == 2) {
//			return 2;
//		} else if (num == 1) {
//			return 1;
//		}
//		
//		return (fibo(num - 2) * fibo(num - 1)) % 100;
//	}
//
//	public static void main(String[] args) throws IOException {
//
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		while (num < 1 || num > 100) {
//			num = sc.nextInt();
//		}
//		sc.close();
//
//		System.out.println(fibo(num));
//	}
//}

//235 : 함수3 - 형성평가5   #### 질문 ####
//import java.util.Scanner;
//
//public class Function3 {
//
//	static int count = 0;
//	
//	public static int fibo(int num) { // 100
//
//		if (num == 1) {
//			return count;
//		}
//		// 짝수 2로 나누기;
//		if (num % 2 == 1) {
//			count++;
//			return fibo(num / 3);
//		}
//		// 홀수 3으로 나누기;
//		else {
//			count++;
//			return fibo(num / 2);
//		}
//	}
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		sc.close();
//		
//		System.out.println(fibo(num));
//	}
//}

//235 : 함수3 - 형성평가6
//import java.util.Scanner;
//
//public class Function3 {
//
//	public static int multiplication(int result) {
//		
//		if (result == 0) {
//			return 1;
//		}
//		int x = 1;
//		x = result % 10; // 1의 자리 숫자부터 추출;
//
//		if (x == 0) { // 0일 경우 1로 초기화;
//			x = 1;
//		}
//
//		result = result / 10; // 자릿수 한자리씩 당기
//
//		return (x * multiplication(result)); // 자릿수 하나씩 곱하기;
//	}
//
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		int num3 = sc.nextInt();
//		sc.close();
//
//		int result = num1 * num2 * num3;
//
//		System.out.println(multiplication(result));
//	}
//}
