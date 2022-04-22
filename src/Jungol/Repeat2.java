package Jungol;

//541 : 반복제어문2 - 자가진단1
//import java.util.Scanner;
//
//public class Repeat2 {
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		char ch = sc.next().charAt(0);
//
//		for (int i = 0; i <= 19; i++) {
//			System.out.print(ch);
//		}
//	}
//}

//542 : 반복제어문2 - 자가진단2
//import java.util.Scanner;
//
//public class Repeat2 {
//	public static void main(String[] args) {
//		
//
//		for (int i = 10; i <= 20; i++) {
//			System.out.printf("%d ",i);
//		}
//	}
//}

//543 : 반복제어문2 - 자가진단3
//import java.util.Scanner;
//
//public class Repeat2 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//
//		for (int i = 1; i <= num; i++) {
//			if (i % 2 == 0) {
//				System.out.printf("%d ",i);
//			}
//		}
//	}
//}

//544 : 반복제어문2 - 자가진단4 ############
//import java.util.Scanner;
//
//public class Repeat2 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int sum = 0;
//
//		for (int i = num; i <= 100; i++) {
//			sum = sum +i;
//		}
//		System.out.println(sum);
//	}
//}

//545 : 반복제어문2 - 자가진단5 #############
//import java.util.Scanner;
//
//public class Repeat2 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int num = 0;
//		int mul3 = 0, mul5 = 0;
//		
//		for (int i = 0; i < 10; i++) {
//			num = sc.nextInt();
//			if (num % 3 == 0) {
//				mul3++;
//			}
//			if (num % 5 == 0) {
//				mul5++;
//			}
//		}
//		System.out.printf("Multiples of 3 : %d\n", mul3);
//		System.out.printf("Multiples of 5 : %d", mul5);
//	}
//}

//546 : 반복제어문2 - 자가진단6
//import java.util.Scanner;
//
//public class Repeat2 {
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		double avg = 0;
//		int a = 0;
//
//		int sum = 0;
//		for (int i = 0; i < num; i++) {
//			a = sc.nextInt();
//			sum = sum + a;
//			avg = (double) sum / (double) num;
//		}
//		
//		System.out.printf("avg : %.1f\n", avg);
//		if (avg >= 80) {
//			System.out.print("pass");
//		} else {
//			System.out.print("fail");
//		}
//	}
//}

//547 : 반복제어문2 - 자가진단7
//import java.util.Scanner;

//public class Repeat2 {
//	public static void main(String[] args) {
//
//		for (int i = 2; i < 7; i++) {
//			System.out.printf("%d ", i);
//			for (int j = i+1; j < 6+i-1; j++) {
//				System.out.printf("%d ", j);
//				
//			}
//			System.out.println();
//		}
//
//	}
//}

// 548 : 반복제어문2 - 자가진단8
//import java.util.Scanner;
//
//public class Repeat2 {
//	public static void main(String[] args) {
//
//		for (int i = 2; i < 5; i++) {
//			for (int j = 1; j < 6; j++) {
//
//				if (i * j < 10) {
//					System.out.printf("%d * %d =  %d   ", i, j, i * j);
//				} else if (i * j >= 10) {
//					System.out.printf("%d * %d = %d   ", i, j, i * j);
//				}
//			}
//			System.out.println();
//		}
//
//	}
//}

//132 : 반복제어문2 - 형성평가1
//import java.util.Scanner;
//
//public class Repeat2 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		num = sc.nextInt();
//		for (int i = 0; i < num; i++) {
//			System.out.println("JUNGOL");
//		}
//
//	}
//}

//131 : 반복제어문2 - 형성평가2
//import java.util.Scanner;
//
//public class Repeat2 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num1 = 0;
//		int num2 = 0;
//		num1 = sc.nextInt();
//		num2 = sc.nextInt();
//
//		if (num1 < num2) {
//			for (int i = num1; i <= num2; i++) {
//				System.out.printf("%d ", i);
//			}
//		}
//		if (num1 > num2) {
//			for (int i = num2; i <= num1; i++) {
//				System.out.printf("%d ", i);
//			}
//		}
//		if (num1 == num2) {
//			System.out.println(num1);
//		}
//
//	}
//}

//132 : 반복제어문2 - 형성평가3
//import java.util.Scanner;
//
//public class Repeat2 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		int sum = 0;
//		num = sc.nextInt();
//
//		for (int i = 1; i <= num; i++) {
//			if (i % 5 == 0) {
//				sum += i;
//			}
//		}
//		System.out.printf("%d ", sum);
//	}
//}

//133 : 반복제어문2 - 형성평가4
//import java.util.Scanner;
//
//public class Repeat2 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num1 = 0;
//		int num2 = 0;
//		int sum = 0;
//		double avg = 0;
//		num1 = sc.nextInt();
//		
//
//		for (int i = 1; i <= num1; i++) {
//			num2 = sc.nextInt();
//			sum += num2;		
//		}
//		avg = (double)sum / (double)num1;
//		System.out.printf("%.2f ", avg);
//	}
//}

//134 : 반복제어문2 - 형성평가5
//import java.util.Scanner;
//
//public class Repeat2 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		int odd_n = 0;
//		int even_n = 0;
//		
//		for (int i = 1; i <= 10; i++) {
//			num = sc.nextInt();
//			if (num % 2 != 0) {
//				odd_n++;
//			}
//			if (num % 2 == 0) {
//				even_n++;
//			}
//		}
//		System.out.printf("even : %d\n", even_n);
//		System.out.printf("odd : %d", odd_n);
//	}
//}

//135 : 반복제어문2 - 형성평가6 ###########
//import java.util.Scanner;
//
//public class Repeat2 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num1 = 0;
//		int num2 = 0;
//		int count = 0;
//		int sum1 = 0;
//		int sum2 = 0;
//		double avg = 0;
//		int max = 0;
//		int min = 0;
//
//		num1 = sc.nextInt();
//		num2 = sc.nextInt();
//
//		max = (num1 < num2) ? num2 : num1;
//		min = (num1 < num2) ? num1 : num2;
//		for (int i = min; i <= max; i++) {
//
//			if ((i % 3 == 0) || (i % 5 == 0)) {
//				sum2 += i;
//				count++;
//			}
//		}
//		avg =  (double)sum2/ (double) count;
//		
//		System.out.printf("sum : %d\n", sum2);
//		System.out.printf("avg : %.1f", avg);
//	}
//
//}

//136 : 반복제어문2 - 형성평가7
//import java.util.Scanner;
//
//public class Repeat2 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num1 = 0;
//		int mul = 0;
//		num1 = sc.nextInt();
//		for (int i = 1; i <= 10; i++) {
//			mul = num1 * i;
//			System.out.printf("%d ", mul);
//		}
//
//	}
//
//}

//137 : 반복제어문2 - 형성평가8  #################
//import java.util.Scanner;
//
//public class Repeat2 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int row = 0;
//		int colum = 0;
//		row = sc.nextInt();
//		colum = sc.nextInt();
//
//		for (int i = 1; i <= row; i++) {
//			for (int j = 1; j <= colum; j++) {
//			
//				System.out.printf(i*j + " ");
//				
//			}
//			System.out.println();
//		}
//	}
//}

//138 : 반복제어문2 - 형성평가9
//import java.util.Scanner;
//
//public class Repeat2 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		num = sc.nextInt();
//
//		for (int i = 1; i <= num; i++) {
//			for (int j = 1; j <= num; j++) {
//				System.out.printf("(%d, %d) ", i, j);
//				
//			}
//			System.out.println();
//		}
//	}
//}

//139 : 반복제어문2 - 형성평가10
//import java.util.Scanner;
//
//public class Repeat2 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num1 = 0;
//		int num2 = 0;
//
//		num1 = sc.nextInt();
//		num2 = sc.nextInt();
//
//		if (num1 > num2) {
//
//			for (int i = 1; i <= 9; i++) {
//				for (int j = 1; j <= num1-num2+1; j++) {
//
//					if (((num1 - j + 1) * i) < 10) {
//						System.out.printf("%d * %d =  %d   ", num1 - j + 1, i, (num1 - j + 1) * i);
//					} else {
//						System.out.printf("%d * %d = %d   ", num1 - j + 1, i, (num1 - j + 1) * i);
//					}
//				}
//				System.out.println();
//			}
//		}
//
//		if (num1 <= num2) {
//			for (int i = 1; i <= 9; i++) {
//				for (int j = 1; j <= num2-num1+1; j++) {
//					if ((i * (num1 + j - 1)) < 10) {
//						System.out.printf("%d * %d =  %d   ", num1 + j - 1, i, (i * (num1 + j - 1)));
//					} else {
//						System.out.printf("%d * %d = %d   ", num1 + j - 1, i, (i * (num1 + j - 1)));
//					}
//				}
//				System.out.println();
//			}
//
//		}
//	}
//
//}
