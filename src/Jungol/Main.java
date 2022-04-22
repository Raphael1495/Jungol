package Jungol;
//
//import java.util.Scanner;

/* 515 : 입력 - 자가진단7
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println(num1 + " * " + num2 + " = " + num1*num2);
		System.out.println(num1 + " / " + num2 + " = " + num1/num2);
	}
}
/*516 : 입력 - 자가진단8*/

//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		double a = sc.nextDouble();
//		double b = sc.nextDouble();
//		char c = sc.next().charAt(0);
//		
//		System.out.println(String.format("%.2f", a));
//		System.out.println(String.format("%.2f", b));
//		System.out.println(c);
//		
//		sc.close();
//	}
//}

//  517 : 입력 - 자가진단9
//import java.util.Scanner;
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		double a = sc.nextDouble();
//		double b = sc.nextDouble();
//		double c = sc.nextDouble();
//		
//		System.out.printf("%.3f\n",a);
//		System.out.printf("%.3f\n",b);
//		System.out.printf("%.3f\n",c);
//		
//	}
//	
//}
// 106 : 입력 - 형성평가1
//public class Main {
//	public static void main(String[] args) {
//				
//		int a = 10;
//		int b = 20;
//		int c = 30;
//		
//		System.out.printf("%d + %d = %d", a,b,c);
//	}
//}

//107 : 입력 - 형성평가2
//public class Main {
//	public static void main(String[] args) {
//		double a = 80.5;
//		double b = 22.34;
//		
//		System.out.printf("%10.2f%10.2f%10.2f",a,b,a+b);
//	}
//}
//108 : 입력 - 형성평가3
//public class Main {
//	public static void main(String[] args) {
//		int a = 50;
//		double b = 100.12;
//		System.out.printf("%.2f * %d = %.0f", b, a, b*a);
//		
//	}
//}
//109 : 입력 - 형성평가4
//import java.util.Scanner;
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		
//		System.out.printf("sum = %d", a+b+c);
//		
//	}
//}
//110 : 입력 - 형성평가5
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("yard? ");
//		double a = sc.nextDouble();
//		System.out.printf("%.1fyard = %.1fcm",a,a*91.44);
//		System.out.println();
//	}
//}
//518 : 연산자 - 자가진단1
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		int sum = a+b+c;
//		int avg = sum/3;
//		
//		System.out.printf("sum = %d\n", sum);
//		System.out.printf("avg = %d", avg);
//	}
//}
//519 : 연산자 - 자가진단2
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int plus = a + 100;
//		int div = b % 10;
//		
//		System.out.printf("%d %d",plus, div);
//	}
//}

// 520 : 연산자 - 자가진단3
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		System.out.println(num);
//		System.out.println(num +2);
//	}
//}
//521 : 연산자 - 자가진단4
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		-- b;
//		int multi = a*b;
//		a ++;
//		System.out.printf("%d ",a);
//		System.out.printf("%d ", b );
//		System.out.printf("%d", multi);
//	}
//}
//522 : 연산자 - 자가진단5
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		System.out.println(a==b);
//	}
//}

//523 : 연산자 - 자가진단6
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		System.out.printf("%d > %d --- %b\n", a, b, a>b);
//		System.out.printf("%d < %d --- %b\n", a, b, a<b);
//		System.out.printf("%d >= %d --- %b\n", a, b, a>=b);
//		System.out.printf("%d <= %d --- %b", a, b, a<=b);
//	}
//}
//524 : 연산자 - 자가진단7
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//
//		boolean num1 = (a != 0);
//		boolean num2 = (b != 0);
//
//		System.out.printf("%b %b", num1 && num2, num1 || num2);
//
//	}
//}

// 525 : 연산자 - 자가진단8
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//
//		boolean a1 = (a > b); // true
//		boolean a2 = (a > c); // true
//		boolean z1 = (a == b); // true
//		boolean z2 = (b == c); // true
//
//		System.out.printf("%b %b", a1&&a2, z1&&z2);
//
//	}
//}

//111 : 연산자 - 형성평가1
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		int d = sc.nextInt();
//		int sum = a + b + c + d;
//		double avg = sum / 4;
//		System.out.printf("sum %d\navg %.0f", sum, avg);
//	}
//}

//112 : 연산자 - 형성평가2
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		System.out.printf("%d / %d = %d...%d", a, b, a / b, a % b);
//	}
//}

//113 : 연산자 - 형성평가3
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//
//		int x = a + 5;
//		int y = b * 2;
//		
//		System.out.printf("width = %d\n", x);
//		System.out.printf("length = %d\n", y);
//		System.out.printf("area = %d", x*y);
//	}
//}
//114 : 연산자 - 형성평가4
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		++a;
//		
//		System.out.printf("%d ", a);
//		System.out.printf("%d \n", b);
//		b--;
//		System.out.printf("%d ", a);
//		System.out.printf("%d ", b);
//	}
//}
//115 : 연산자 - 형성평가5
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a_h = sc.nextInt();
//		int a_w = sc.nextInt();
//		int b_h = sc.nextInt();
//		int b_w = sc.nextInt();
//		
//		boolean height = (a_h>b_h);
//		boolean weight = (a_w>b_w);
//		
//		
//		System.out.print(height&&weight);
//	}
//}

///528 : 선택제어문 - 자가진단1
//import java.util.Scanner;
//
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a_h = sc.nextInt();
//		System.out.println(a_h);
//		if (a_h < 0) {
//			System.out.println("minus");
//		}
//
//	}
//}
//529 : 선택제어문 - 자가진단2
//import java.util.Scanner;
//
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a_h = sc.nextInt();
//		int a_w = sc.nextInt();
//		int obesity = a_w + 100 - a_h;
//		System.out.println(obesity);
//		if (obesity > 0) {
//			System.out.println("Obesity");
//		}
//	}
//}

//530 : 선택제어문 - 자가진단3import java.util.Scanner;
//import java.util.Scanner;
//
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int age = sc.nextInt();
//		if (age >= 20) {
//			System.out.println("adult");
//		}
//		if (age < 20) {
//			System.out.printf("%d years later", 20-age);
//		}
//	}
//}

//531 : 선택제어문 - 자가진단4
//import java.util.Scanner;
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		double wei = sc.nextDouble();
//		
//		if (wei <= 50.80) {
//			System.out.println("Flyweight");
//		}
//		if (wei <= 61.23 && wei > 50.80) {
//			System.out.println("Lightweight");
//		}
//		if (wei <= 72.57 && wei > 61.23) {
//			System.out.println("Middleweight");
//		}
//		if (wei <= 88.45 && wei > 72.57) {
//			System.out.println("Cruiserweight");
//		}
//		if (wei > 88.45) {
//			System.out.println("Heavyweight");
//		}
//	}
//}
//532 : 선택제어문 - 자가진단5
//import java.util.Scanner;
//
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		double a = sc.nextDouble();
//		double b = sc.nextDouble();
//		if (a >= 4.0 && b >= 4.0) {
//			System.out.println("A");
//		}
//		else if (a >= 3.0 && b >= 3.0) {
//			System.out.println("B");
//		}
//		else {
//			System.out.println("C");
//		}
//	}
//}

//533 : 선택제어문 - 자가진단6

//import java.util.Scanner;
//
//public class Main {
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		char gen = sc.next().charAt(0);
//		double age = sc.nextDouble();
//
//		if ((gen == 'M') && (age >= 18)) {
//			System.out.println("MAN");
//		}
//		else if ((gen == 'M') && (age < 18)) {
//			System.out.println("BOY");
//		}
//		else if ((gen == 'F') && (age >= 18)) {
//			System.out.println("WOMAN");
//		}
//		else if ((gen == 'F') && (age < 18)) {
//			System.out.println("GIRL");
//		}
//
//	}
//}

//534 : 선택제어문 - 자가진단7
//import java.util.Scanner;
//
//public class Main {
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		char gen = sc.next().charAt(0);
//
//		if ((gen == 'A')) {
//			System.out.println("Excellent");
//		} else if ((gen == 'B')) {
//			System.out.println("Good");
//		} else if ((gen == 'C')) {
//			System.out.println("Usually");
//		} else if ((gen == 'D')) {
//			System.out.println("Effort");
//		} else if ((gen == 'F')) {
//			System.out.println("Failure");
//		} else {
//			System.out.println("error");
//		}
//	}
//}
//535 : 선택제어문 - 자가진단8

//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		double num = sc.nextDouble();
//		
//		switch ((int)num) {
//		case 4:
//			System.out.println("scholarship");
//			break;
//		case 3:
//			System.out.println("next semester");
//			break;
//		case 2:
//			System.out.println("seasonal semester");
//			break;
//		default:
//			System.out.println("retake");
//			break;
//		}
//	}
//}
// 632 : 선택제어문 - 자가진단9
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		int num3 = sc.nextInt();
//		int min;
//		
//		min = (num1 < num2) ? num1 : num2;
//		min = (min < num3) ? min : num3;
//		
//		System.out.println(min);
//	}
//}
// 120 : 선택제어문 - 형성평가1
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		int max, min;
//		max = (num1 > num2) ? num1 : num2;
//		min = (num1 < num2) ? num1 : num2;
//		System.out.println(max - min);
//		
//	}
//}
//121 : 선택제어문 - 형성평가2
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num1 = sc.nextInt();
//
//		if (num1 == 0) {
//			System.out.println("zero");
//		} else if (num1 < 0) {
//			System.out.println("minus");
//		} else if (num1 > 0) {
//			System.out.println("plus");
//		}
//	}
//}

//122 : 선택제어문 - 형성평가3
//import java.util.Scanner;
//
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num1 = sc.nextInt();
//
//		if ((num1 % 400 == 0) || ((num1 % 4 == 0) && (num1 % 100 != 0))) {
//			System.out.println("leap year");
//		} else {
//			System.out.println("common year");
//		}
//
//	}
//}
//123 : 선택제어문 - 형성평가4
//import java.util.Scanner;
//
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Number? ");
//		int num1 = sc.nextInt();
//		
//		switch (num1) {
//		case 1:
//			System.out.println("dog");
//			break;
//		case 2:
//			System.out.println("cat");
//			break;
//		case 3:
//			System.out.println("chick");
//			break;
//		default:
//			System.out.print("I don't know.");
//			break;
//		}
//	}
//}

//124 : 선택제어문 - 형성평가5
//import java.util.Scanner;
//
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int num1 = sc.nextInt();
//
//		switch (num1) {
//		case 1:
//			System.out.println("31");
//			break;
//		case 2:
//			System.out.println("28");
//			break;
//		case 3:
//			System.out.println("31");
//			break;
//		case 4:
//			System.out.println("30");
//			break;
//		case 5:
//			System.out.println("31");
//			break;
//		case 6:
//			System.out.println("30");
//			break;
//		case 7:
//			System.out.println("31");
//			break;
//		case 8:
//			System.out.println("31");
//			break;
//		case 9:
//			System.out.println("30");
//			break;
//		case 10:
//			System.out.println("31");
//			break;
//		case 11:
//			System.out.println("30");
//			break;
//		case 12:
//			System.out.println("31");
//		}
//	}
//}

//import java.util.Scanner;
//
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Number? ");
//		int num = sc.nextInt();
//		int sum = 0;
//		int i = 1;
//		boolean True;
//
//		while (True) {
//
//			if (num > 0) {
//				System.out.print(sum);
//			} else if (num < 0) {
//				System.out.print(sum);
//			} else if (num == 0) {
//				break;
//			}
//		}
//
//	}
//}