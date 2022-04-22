package Jungol;

//579 : 함수2 - 자가진단1
//import java.util.Scanner;
//
//public class function2 {
//	public static void print() {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int temp = 0;
//		int[] array = new int[num];
//
//		for (int i = 0; i < num; i++) {
//			array[i] = sc.nextInt();
//		}
//		for (int i = 0; i < num; i++) {
//			for (int j = 0; j < num - i - 1; j++) {
//				if (array[j] < array[j + 1]) {
//					temp = array[j];
//					array[j] = array[j + 1];
//					array[j + 1] = temp;
//				}
//			}
//		}
//		for (int i = 0; i < num; i++) {
//			System.out.print(array[i] + " ");
//		}
//	}
//	public static void main(String[] args) {
//		print();
//	}
//}

//580 : 함수2 - 자가진단2
//import java.util.Scanner;
//
//public class function2 {
//	public static void print(int num1, int num2) {
//
//		if (num1 == 1 || num1 == 3 || num1 == 5 || num1 == 7 || num1 == 8 || num1 == 10 || num1 == 12) {
//			if (num2 > 0 && num2 <= 31) {
//				System.out.println("OK!");
//			} else {
//				System.out.println("BAD!");
//			}
//		} else if (num1 == 4 || num1 == 6 || num1 == 9 || num1 == 11) {
//			if (num2 > 0 && num2 <= 30) {
//				System.out.println("OK!");
//			} else {
//				System.out.println("BAD!");
//			}
//		} else if (num1 == 2) {
//			if (num2 > 0 && num2 <= 29) {
//				System.out.println("OK!");
//			} else {
//				System.out.println("BAD!");
//			}
//		} else {
//			System.out.println("BAD!");
//		}
//	}
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		print(num1, num2);
//	}
//}

//581 : 함수2 - 자가진단3
//import java.util.Scanner;
//
//public class function2 {
//	public static void func1(int num1, int num2) {
//		if (Math.abs(num1) < Math.abs(num2)) {
//			System.out.println(num2);
//		} else {
//			System.out.println(num1);
//		}
//
//	}
//
//	public static void func2(double num3, double num4) {
//		if (Math.abs(num3) < Math.abs(num4)) {
//			System.out.printf("%.2f", num3);
//		} else {
//			System.out.printf("%.2f", num4);
//		}
//	}
//
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		double num3 = sc.nextDouble();
//		double num4 = sc.nextDouble();
//		func1(num1, num2);
//		func2(num3, num4);
//
//	}
//}

// 582 : 함수2 - 자가진단4
//import java.util.Scanner;
//
//public class function2 {
//	public static void func1(double square) {
//		double x = Math.sqrt(square/3.14);
//		System.out.printf("%.2f", x);
//
//	}
//
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		double square = sc.nextDouble();
//		func1(square);
//
//	}
//}

//583 : 함수2 - 자가진단5
//import java.util.Scanner;
//
//public class function2 {
//	public static void func1() {
//		Scanner sc = new Scanner(System.in);
//		double[] array = new double[3];
//		int size = array.length;
//
//		double num = 0;
//		double temp = 0;
//
//		for (int i = 0; i < size; i++) {
//			num = sc.nextDouble();
//			array[i] = num;
//		}
//		for (int i = 0; i < size; i++) {
//			for (int j = 0; j < size - i - 1; j++) {
//				if (array[j] < array[j + 1]) {
//					temp = array[j];
//					array[j] = array[j + 1];
//					array[j + 1] = temp;
//				}
//			}
//		}
//		System.out.print((int)Math.ceil(array[0]) + " " + (int)Math.floor(array[2]) + " " + (int)Math.round(array[1]));
//	}
//
//	public static void main(String[] args) {
//		func1();
//	}
//}

//584 : 함수2 - 자가진단6
//import java.util.Scanner;
//
//public class function2 {
//	public static void func1() {
//		Scanner sc = new Scanner(System.in);
//		double[] array = new double[3];
//		int size = array.length;
//
//		for (int i = 1; i < 4; i++) {
//			for (int j = 1; j < 4; j++) {
//				System.out.println(i + " + " + j + " = " + (i + j));
//			}
//		}
//
//	}
//
//	public static void main(String[] args) {
//		func1();
//	}
//}

//585 : 함수2 - 자가진단7   ###### 질문! ######
//import java.util.Scanner;
//
//public class function2 {
//	public static void func1() {
//		Scanner sc = new Scanner(System.in);
//		int[] array = new int[10];
//		int num = 0;
//		int temp = 0;
//
//		for (int i = 0; i < 10; i++) {
//			num = sc.nextInt();
//			array[i] = num;
//		}
//
//		for (int i = 0; i < 9; i++) {
//			for (int j = 0; j < 10 - i - 1; j++) {
//				if (array[j] < array[j + 1]) {
//					temp = array[j];
//					array[j] = array[j + 1];
//					array[j + 1] = temp;
//				}
//			}
//			for (int k = 0; k < 10; k++) {
//				System.out.print(array[k] + " ");
//			}
//			System.out.println();
//		}
//	}
//	public static void main(String[] args) {
//		func1();
//	}
//}

//586 : 함수2 - 자가진단8
//import java.util.Scanner;
//
//public class function2 {
//	public static void sub(double a, double b) {
//		double sum = a - b;
//		double cal1 = Math.pow(sum, 2);
//		System.out.print("(" + (int)a + " - " + (int)b + ")" + " ^ " + 2 + " = " + (int)cal1);
//		System.out.println();
//	}
//	public static void plus(int a, int b) {
//		double sum = a + b;
//		double cal1 = Math.pow(sum, 3);
//		System.out.print("(" + (int)a + " + " + (int)b + ")" + " ^ " + 3 + " = " + (int)cal1);
//		System.out.println();
//	}
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		sub (a, b);
//		plus (a, b);
//	}
//}

//175 : 함수2 - 형성평가1
//import java.util.Scanner;
//
//public class function2 {
//	public static void sorting() {
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		int temp = 0;
//		
//		// 입력받을 정수 개수 입력;
//		do {
//			num = sc.nextInt();
//		} while (num < 1 || num > 15);
//		
//		// 배열의 길이 선택;
//		int[] array = new int[num];
//		
//		
//		// 정수 num개 입력받기;
//		for (int i = 0; i < num; i++) {
//			array[i] = sc.nextInt();
//		}
//
//		for (int i = 0; i < num; i++) {
//			for (int j = 0; j < num - i - 1; j++) {
//				if (array[j] < array[j + 1]) {
//					temp = array[j];
//					array[j] = array[j + 1];
//					array[j + 1] = temp;
//				}
//			}
//		}
//		for (int i = 0; i < num; i++) {
//			System.out.print(array[i] + " ");
//		}
//	}
//	public static void main(String[] args) {
//		sorting();
//	}
//}

//176 : 함수2 - 형성평가2
//import java.util.Scanner;
//
//public class function2 {
//	public static void sorting() {
//		Scanner sc = new Scanner(System.in);
//		int count = 0;
//
//		double num1 = sc.nextDouble();
//		double num2 = sc.nextDouble();
//
//		double sqr1 = Math.ceil(Math.sqrt(num1));
//		double sqr2 = Math.ceil(Math.sqrt(num2));
//
//		if (sqr1 == num1 || sqr2 == num2) {
//			System.out.println((int) Math.abs(sqr1 - sqr2 + 1));
//		} else {
//			System.out.println((int) Math.abs(sqr1 - sqr2));
//		}
//
//	}
//
//	public static void main(String[] args) {
//		sorting();
//	}
//}
//
//176 : 함수2 - 형성평가2 ### 질문!
//import java.util.Scanner;
//
//public class function2 {
//
//   public static void func(double num1, double num2) {
//      Scanner sc = new Scanner(System.in);
//      
//      num1 = sc.nextDouble(); // 실수입력1
//      num2 = sc.nextDouble(); // 실수입력2
//
//      int sqr1 = (int) Math.ceil(Math.sqrt(num1)); // 제곱근1;
//      int sqr2 = (int) Math.ceil(Math.sqrt(num2)); // 제곱근2;
//      
//      System.out.println(sqr1);
//      System.out.println(sqr2);
//      
//      if (Math.sqrt(num1) == sqr1 && Math.sqrt(num2) == sqr2) { // ||가 아니라 && 이었음.
//         System.out.println((int) Math.abs(sqr1 - sqr2) + 1);
//      } else {
//         System.out.println((int) Math.abs(sqr1 - sqr2));
//      }
//   }
//
//   public static void main(String[] args) {
//      double num1 = 0;
//      double num2 = 0;
//      func(num1, num2);
//   }
//}
//
//177 : 함수2 - 형성평가3
//import java.util.Scanner;
//
//public class function2 {
//
//   public static void func() {
//      int num = 0;
//      Scanner sc = new Scanner(System.in);
//      int[] array = new int[5];
//      int sum = 0;
//      
//      for (int i = 0; i < 5; i++) {
//         num = sc.nextInt();
//         array[i] = Math.abs(num);
//         sum += array[i];
//      }
//      System.out.println(sum);
//   }
//
//   public static void main(String[] args) {
//      func();
//   }
//}
//
//178 : 함수2 - 형성평가4
//import java.util.Scanner;
//
//public class function2 {
//
//   public static void func() {
//
//      Scanner sc = new Scanner(System.in);
//      int num = 0;
//
//      do {
//         num = sc.nextInt();
//      } while (num < 1 || num > 20);
//
//      System.out.println((int)Math.pow(2, num));
//   }
//
//   public static void main(String[] args) {
//      func();
//   }
//}
//
//179 : 함수2 - 형성평가5
//import java.util.Scanner;
//
//public class function2 {
//
//   public static void func() {
//
//      Scanner sc = new Scanner(System.in);
//      double num = 0;
//      double sum1 = 0;
//      double sum2 = 0;
//      double avg1 = 0;
//      double avg2 = 0;
//      
//      for (int i = 0; i < 3; i++) {
//          num = sc.nextDouble();
//          sum1 += num;
//          sum2 += Math.round(num);
//      }
//      avg1 = sum1 /3;
//      avg1 = Math.round(avg1);
//      System.out.println((int)avg1);
//
//      avg2 = sum2 /3;
//      avg2 = Math.round(avg2);
//      System.out.print((int)avg2);
//
//   }
////153.74 34.59 109.5
//   public static void main(String[] args) {
//      func();
//   }
//}
//
//180 : 함수2 - 형성평가6
//import java.util.Scanner;
//
//public class function2 {
//
//   public static void func() {
//      Scanner sc = new Scanner(System.in);
//      int[] array = new int[7];
//      int temp = 0;
//
//      for (int i = 0; i < 7; i++) {
//         array[i] = sc.nextInt();
//      }
//      for (int i = 0; i < 3; i++) {
//         for (int j = 0; j < 7 - i - 1; j++) {
//            if (array[j] > array[j + 1]) {
//               temp = array[j+1];
//               array[j+1] = array[j];
//               array[j] = temp;
//            }
//            System.out.print(array[j] + " ");
//         }
//      }
//      for (int i = 0; i < 7; i++) {
//         System.out.print(array[i] + " ");
//      }
//   }
//   public static void main(String[] args) {
//      func();
//   }
//}

//181 : 함수2 - 형성평가7
import java.util.Scanner;

public class Function2 {

	public static void circleArea() {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		do {
			num = sc.nextInt();
		} while (num < 0 && num > 20);

		for (int i = 0; i < num; i++) {
			System.out.println("recursive");
		}
	}

	public static void main(String[] args) {
		circleArea();
	}
}
