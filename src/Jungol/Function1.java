package Jungol;

//571 : 함수1 - 자가진단1
//import java.util.Scanner;
//
//public class Function1 {
//	public static void print() {
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		num = sc.nextInt();
//		for (int i = 0; i < num; i++) {
//			System.out.println("~!@#$^&*()_+|");
//		}
//	}
//	public static void main(String[] args) {
//		print();
//	}
//}

//572 : 함수1 - 자가진단2
//import java.util.Scanner;
//
//public class Function1 {
//	public static void circle() {
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		num = sc.nextInt(); // 반지름;
//		double circle = num * num * 3.14; 
//		System.out.printf("%.2f", circle);
//	}
//	public static void main(String[] args) {
//		circle();
//	}
//}

//573 : 함수1 - 자가진단3
//import java.util.Scanner;
//
//public class Function1 {
//	public static void maxNum() {
//		Scanner sc = new Scanner(System.in);
//		int[] array = new int[3];
//		int num = 0;
//		int count = 0;
//		int max = 0;
//		for (int i = 0; i < 3; i++) {
//			num = sc.nextInt(); // 숫자 입력 받기
//			array[i] = num;
//		}
//		max = array[0] < array[1] ? array[1] : array[0];
//		max = max < array[2] ? array[2] : max;
//		System.out.print(max);
//
//	}
//
//// --------------------- Main ------------------------- //
//
//	public static void main(String[] args) {
//		maxNum();
//	}
//}

//575 : 함수1 - 자가진단5
//import java.util.Scanner;
//
//public class Function1 {
//	public static void Pow() {
//		Scanner sc = new Scanner(System.in);
//		int[] array = new int[2];
//		int num = 0;
//		for (int i = 0; i < 2; i++) {
//			num = sc.nextInt(); // 숫자 입력 받기;
//			array[i] = num;
//		}
//		System.out.print((int)(Math.pow(array[0], array[1])));
//
//	}
//
//// --------------------- Main ------------------------- //
//
//	public static void main(String[] args) {
//		Pow();
//	}
//}

//576 : 함수1 - 자가진단6
//import java.util.Scanner;
//
//public class Function1 {
//	public static void gugudan() {
//		Scanner sc = new Scanner(System.in);
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//
//		if (num1 < num2) {
//			for (int i = num1; i < num2 + 1; i++) {
//				System.out.println("== " + i + "dan" + " ==");
//				for (int j = 1; j < 10; j++) {
//					if (i * j < 10) {
//						System.out.println(i + " * " + j + " =  " + i * j);
//					} else {
//						System.out.println(i + " * " + j + " = " + i * j);
//					}
//				}
//				System.out.println();
//			}
//		} else if (num1 > num2) {
//			for (int i = num2; i < num1 + 1; i++) {
//				System.out.println("== " + i + "dan" + " ==");
//				for (int j = 1; j < 10; j++) {
//					if (i * j < 10) {
//						System.out.println(i + " * " + j + " =  " + i * j);
//					} else {
//						System.out.println(i + " * " + j + " = " + i * j);
//					}
//				}
//				System.out.println();
//			}
//		}
//
//	}
//
//// --------------------- Main ------------------------- //
//
//	public static void main(String[] args) {
//		gugudan();
//	}
//}

//170 : 함수1 - 형성평가1
//import java.util.Scanner;
//
//public class Function1 {
//	public static void print() {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int sum = 0;
//		for (int i = 1; i <= num; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
//	}
//
//	public static void main(String[] args) {
//		print();
//	}
//
//}

//172 : 함수1 - 형성평가3
//import java.util.Scanner;
//
//public class Function1 {
//	public static void print() {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int sum = 0;
//		for (int i = 1; i < num+1; i++) {
//			for (int j = 1; j < num+1; j++) {
//				System.out.print(i*j + " ");
//			}
//			System.out.println();
//		}
//	}
//
//	public static void main(String[] args) {
//		print();
//	}
//
//}

//173 : 함수1 - 형성평가4
import java.util.Scanner;

public class Function1 {
	public static void calculation() {
		Scanner sc = new Scanner(System.in);

		int[][] array = new int[3][3];
		int[] array1 = new int[3];
		int[] array2 = new int[4];
		int num = 0;
		int sum = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(array[i][j] + " ");
				sum += array[i][j];
			}
			System.out.println(sum);
			array1[i] = sum; // 가로 합들의 세로합;
			sum = 0;
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				sum += array[j][i]; // 세로의 합;
			}
			System.out.print(sum + " ");
			sum = 0;
		}
		for (int i = 0; i < 3; i++) {
			sum += array1[i];
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		calculation();
	}
}