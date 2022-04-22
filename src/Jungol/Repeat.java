package Jungol;

// 536 : 반복제어문1 - 자가진단1
//public class Repeat {
//	public static void main(String[] args) {
//		int i = 1;
//		while(i <= 15) {
//			
//			System.out.printf(i+" ");
//			i++;
//			
//		}
//	} 
//}

//537 : 반복제어문1 - 자가진단2
//import java.util.Scanner;
//public class Repeat {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int sum = 0;
//		int i = 1;
//
//		while (i <= num) {
//			sum += i;
//			i++;
//		}
//		System.out.print(sum);
//	}
//}

//538 : 반복제어문1 - 자가진단3
//import java.util.Scanner;
//
//public class Repeat {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Number? ");
//		int num = 0;
//		num = sc.nextInt();
//
//		while (true) {
//			if (num > 0) {
//				System.out.println("positive integer");
//				System.out.print(number? ");
//				num = sc.nextInt();
//			} else if (num < 0) {
//				System.out.println("negative number");
//				System.out.print("Number? ");
//				num = sc.nextInt();
//				
//			} else if (num == 0) {
//				break;
//			}
//			
//			
//		}
//	}
//}

//539 : 반복제어문1 - 자가진단4
//import java.util.Scanner;
//
//public class Repeat {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int num = 0;
//		double sum = 0;
//		double count = 0;
//		double avg = 0;
//		avg = sum / count;
//		
//		
//		while (true) {
//			num = sc.nextInt();
//			sum = sum + num;
//			count ++;
//			
//			if (num >= 100) {
//				avg = sum / count;
//				
//				System.out.println((int)sum);
//				System.out.printf("%.1f", avg);
//				break;
//			}
//		}
//	}
//}

//540 : 반복제어문1 - 자가진단5
//import java.util.Scanner;
//
//public class Repeat {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		
//		while (true) {
//			num = sc.nextInt();
//
//			if (num % 3 == 0) {
//				System.out.println(num / 3);
//
//			} else if (num == -1) {
//				break;
//
//			}
//		}
//	}
//}

//541 : 반복제어문1 - 자가진단6
//import java.util.Scanner;
//
//public class Repeat {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//
//		while (true) {
//			System.out.println("1. Korea\n" + "2. USA\n" + "3. Japan\n" + "4. China\n" + "number? ");
//			num = sc.nextInt();
//
//			if (num == 1) {
//				System.out.println("Seoul\n");
//			} else if (num == 2) {
//				System.out.println("Washington\n");
//			} else if (num == 3) {
//				System.out.println("Tokyo\n");
//			} else if (num == 4) {
//				System.out.println("Beijing\n");
//			} else {
//				System.out.println("none");
//				break;
//			}
//
//		}
//	}
//}

//125 : 반복제어문1 - 형성평가1
//import java.util.Scanner;
//
//public class Repeat {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//
//		num = sc.nextInt();
//
//		for (int i = 1; i <= num; i++) {
//
//			System.out.printf("%d ", num - (num - i));
//		}
//
//	}
//}

//126 : 반복제어문1 - 형성평가2
//import java.util.Scanner;
//
//public class Repeat {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num;
//		int odd_n = 0;
//		int even_n = 0;
//
//		while (true) {
//			num = sc.nextInt();
//
//			if (num == 0) {
//				System.out.printf("odd : %d\n", odd_n);
//				System.out.printf("even : %d", even_n);
//				break;
//			} else if (num % 2 == 0) {
//				even_n++;
//				
//			} else if (num % 2 != 0) {
//				odd_n++;
//
//			}
//		}
//	}
//}

//127 : 반복제어문1 - 형성평가3
//import java.util.Scanner;
//
//public class Repeat {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		int sum = 0;
//		int count = 0;
//		double avg = 0; 
//				
//		while (true) {
//			num = sc.nextInt();
//			sum = sum + num;
//			avg = (double)(sum-num) / (double)count;
//			if ((num > 100) || (num < 0)) {
//				System.out.printf("sum : %d\n", (sum - num));
//				System.out.printf("avg : %.1f", (double)avg);
//				break;
//			}
//			count++;
//		}
//	}
//}

////128 : 반복제어문1 - 형성평가4
//import java.util.Scanner;
//
//public class Repeat {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		int count = 0;
//
//		while (true) {
//			num = sc.nextInt();
//
//			if ((num % 3 != 0) && (num % 5 != 0)) {
//				count++;
//			} else if (num == 0) {
//				System.out.println(count);
//				break;
//			}
//		}
//	}
//}
//128 : 반복제어문1 - 형성평가4
//import java.util.Scanner;
//
//public class Repeat {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		double num1 = 0;
//		double num2 = 0;
//		double area = 0;
//		char selec = ' ';
//		int count = 0;
//
//		while (true) {
//			System.out.printf("Base = ");
//			num1 = sc.nextDouble();
//			System.out.printf("Height = ");
//			num2 = sc.nextDouble();
//			area = num1 * num2 / 2;
//
//			System.out.printf("Triangle width = %.1f\n", area);
//			System.out.printf("Continue? ");
//
//			selec = sc.next().charAt(0);
//			if ((selec == 'Y') || (selec == 'y')) {
//				
//			} else {
//				break;
//			}
//		}
//
//	}
//}
