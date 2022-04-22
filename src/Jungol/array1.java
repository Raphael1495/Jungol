package Jungol;

// 555 : 배열1 - 자가진단1
//import java.util.Scanner;
//public class array1 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		String[] alp = new String[10];
//		int size = alp.length;
//
//		for (int i = 0; i < size; i++) {
//			alp[i] = sc.next();
//		}
//		for (int j = 0; j < size; j++) {
//			System.out.print(alp[j]);
//		}
//
//	}
//}

//556 : 배열1 - 자가진단2
//import java.util.Scanner;
//public class array1 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		int[] alp = new int[11];
//		int size = alp.length;
//
//		for (int i = 1; i < size; i++) {
//			alp[i] = i;
//			System.out.print(alp[i] + " ");
//		}
//	}
//}

//557 : 배열1 - 자가진단3
//import java.util.Scanner;
//public class array1 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		String[] alp = new String[10];
//		int size = alp.length;
//
//		for (int i = 0; i < size; i++) {
//			alp[i] = sc.next();
//		}
//		
//		System.out.print(alp[0] + " " + alp[3] + " " + alp[6]);
//		
//	}
//}

//558 : 배열1 - 자가진단4
//import java.util.Scanner;
//
//public class array1 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		int[] alp = new int[100];
//		int size = alp.length;
//		int count = 0;
//
//		for (int i = 0; i < size; i++) {
//			alp[i] = sc.nextInt();
//			if (alp[i] == 0) {
//				count = i - 1;
//				break;
//			}
//		}
//		for (int i = count; i >= 0; i--) {
//			System.out.print(alp[i] + " ");
//		}
//
//	}
//}

//559 : 배열1 - 자가진단5
//import java.util.Scanner;
//
//public class array1 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		double[] alp = { 85.6, 79.5, 83.1, 80.0, 78.2, 75.0 };
//		int num1 = sc.nextInt() - 1;
//		int num2 = sc.nextInt() - 1;
//
//		System.out.printf("%.1f", (alp[num1] + alp[num2]));
//
//	}
//}

//560 : 배열1 - 자가진단6
//import java.util.Scanner;
//
//public class array1 {
//	
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		int[] alp = new int[10];
//		int size = alp.length;
//		int min = 0;
//
//		for (int i = 0; i < size; i++) {
//			alp[i] = sc.nextInt();
//		}
//
//		min = alp[0];
//
//		for (int i = 1; i < size; i++) {
//			if (min > alp[i]) {
//				min = alp[i];
//			}
//		}
//		System.out.println(min);
//	}
//}

//561 : 배열1 - 자가진단7 ############

//import java.util.Scanner;
//public class array1 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		int[] alp = new int[10];
//		int size = alp.length;
//		int max = 0;
//		int min = 0;
//
//		for (int i = 0; i < size; i++) {
//			alp[i] = sc.nextInt();
//
//			if (i > 0) {
//				if (alp[i] < 100) {
//					max = max < alp[i] ? alp[i] : max;
//				} else if (alp[i] >= 100) {
//					min = min > alp[i] ? alp[i] : min;
//				}
//			}
//
//			else if (i == 0) {
//				if (alp[i] < 100) {
//					max = alp[i];
//				} else {
//					min = alp[i];
//				}
//			}
//		}
//		
//		if (max == 0) {
//			max = 100;
//		} else if (min == 0) {
//			min = 100;
//		}
//		System.out.printf("%d %d", max, min);
//	}
//}

//562 : 배열1 - 자가진단8
//import java.util.Scanner;
//public class array1 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		int[] alp = new int[10];
//		int size = alp.length;
//		int sum_even = 0;
//		int sum_odd = 0;
//		int count = 0;
//		int count_odd = 0;
//		double avg = 0;
//
//		for (int i = 0; i < size; i++) {
//			alp[i] = sc.nextInt();
//			count++;
//			
//			if (count % 2 == 0) {
//				sum_even = sum_even + alp[i];
//				
//			} else if (count % 2 != 0) {
//				count_odd++;
//				sum_odd = sum_odd + alp[i];
//			}
//		}
//		avg = (double)sum_odd / (double)count_odd;
//		System.out.println("sum : " + sum_even);
//		System.out.printf("avg : %.1f", avg);
//	}
//}

//563 : 배열1 - 자가진단9 ##############
//import java.util.Scanner;
//public class array1 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		int[] alp = new int[10];
//		int size = alp.length;
//		int temp = 0;
//
//		for (int i = 0; i < size; i++) {
//			alp[i] = sc.nextInt();
//		}
//		for (int i = 0; i < size; i++) {
//			for (int j = i; j < size; j++) {
//				if (alp[i] < alp[j]) {
//					temp = alp[j];
//					alp[j] = alp[i];
//					alp[i] = temp;
//				}
//			}
//		}
//		for (int i = 0; i < size; i++) {
//			System.out.print(alp[i] + " ");
//		}
//	}
//}

//150 : 배열1 - 형성평가1
//import java.util.Scanner;
//
//public class array1 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		String[] alp = new String[10];
//		int size = alp.length;
//
//		for (int i = 0; i < size; i++) {
//			alp[i] = sc.next();
//		}
//		for (int i = size - 1; i >= 0; i--) {
//			System.out.print(alp[i] + " ");
//		}
//
//	}
//}

//151 : 배열1 - 형성평가2
//import java.util.Scanner;
//
//public class array1 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		int[] alp = new int[5];
//		int size = alp.length;
//		int sum = 0;
//
//		for (int i = 0; i < size; i++) {
//			alp[i] = sc.nextInt();
//		}
//		sum = alp[0] + alp[2] + alp[4];
//		System.out.println(sum);
//	}
//}

//152 : 배열1 - 형성평가3
//import java.util.Scanner;
//public class array1 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		int[] alp = new int[10];
//		int size = alp.length;
//		int sum_odd = 0;
//		int sum_even = 0;
//		int count = 0;
//		int count_odd = 0;
//		int count_even = 0;
//
//		for (int i = 0; i < size; i++) {
//			alp[i] = sc.nextInt();
//			count ++;
//			if (count % 2 != 0) {
//				count_odd++;
//				sum_odd += alp[i];
//			} else if (count % 2 == 0) {
//				count_even++;
//				sum_even += alp[i];
//			}
//		}
//		System.out.println("odd : " + sum_odd);
//		System.out.println("even : " + sum_even);
//	}
//}

//153 : 배열1 - 형성평가4 ##############
//import java.util.Scanner;
//public class array1 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		int[] num = new int[100];
//		int size = num.length;
//		int count = 0;
//
//		for (int i = 0; i < size; i++) {
//			num[i] = sc.nextInt();
//			count++;
//			if (num[i] == -1) {
//				if (count <= 3) {
//					for (int j = 0; j < count-1; j++) {
//						System.out.print(num[j]+" ");
//					}
//					break;
//				} else {
//					System.out.println(num[i - 3] + " " + num[i - 2] + " " + num[i - 1]);
//					break;
//				}
//			}
//		}
//	}
//}

//154 : 배열1 - 형성평가5
//import java.util.Scanner;
//public class array1 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		double[] num = new double[6];
//		int size = num.length;
//		double count = 0;
//		double sum = 0;
//		double avg = 0;
//
//		for (int i = 0; i < size; i++) {
//			num[i] = sc.nextDouble();
//			count++;
//			sum += num[i];
//		}
//		avg = sum/count;
//		System.out.printf("%.1f", avg);
//	}
//}

//155 : 배열1 - 형성평가6
//import java.util.Scanner;
//
//public class array1 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		char[] jungOl = { 'J', 'U', 'N', 'G', 'O', 'L' };
//		char ch = sc.nextLine().charAt(0);
//
//		switch (ch) {
//
//		case 'J':
//			System.out.print("0");
//			break;
//		case 'U':
//			System.out.print("1");
//			break;
//		case 'N':
//			System.out.print("2");
//			break;
//		case 'G':
//			System.out.print("3");
//			break;
//		case 'O':
//			System.out.print("4");
//			break;
//		case 'L':
//			System.out.print("5");
//			break;
//		default:
//			System.out.print("none");
//			break;
//		}
//	}
//}

//156 : 배열1 - 형성평가7
//import java.util.Scanner;
//public class array1 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		int[] num = new int[100];
//		int size = num.length;
//		int max = 0;
//		int min = 0;
//
//		for (int i = 0; i < size; i++) {
//			num[i] = sc.nextInt();
//			if (num[i] == 999) {
//				break;
//			} else if (i == 0) {
//				max = num[i];
//				min = num[i];
//			}
//			max = max < num[i] ? num[i] : max;
//			min = min > num[i] ? num[i] : min;
//		}
//		System.out.println("max : " + max);
//		System.out.print("min : " + min);
//
//	}
//}

//157 : 배열1 - 형성평가8
//import java.util.Scanner;
//public class array1 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		int[] num = new int[100];
//		int size = num.length;
//		double sum_F = 0;
//		double count = 0;
//		double avg = 0;
//
//		for (int i = 0; i < size; i++) {
//			num[i] = sc.nextInt();
//			if (num[i] == 0) {
//				break;
//			}
//			else if (num[i] % 5 == 0) {
//				count++;
//				sum_F += num[i];
//		}
//		avg = sum_F/count;
//		System.out.println("Multiples of 5 : " + (int)count);
//		System.out.println("sum : " + (int)sum_F);
//		System.out.printf("avg : %.1f", avg);
//		}
//	}
//}

//158 : 배열1 - 형성평가9
//import java.util.Scanner;
//public class array1 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		int[] num = new int[100];
//		int size = num.length;
//		int count = 0;
//
//		for (int i = 0; i < size; i++) {
//			num[i] = sc.nextInt();
//			if (num[i] == 0) {
//				System.out.println(count);
//				break;
//			} else if (num[i] % 2 != 0) {
//				num[i] = 2 * num[i];
//			} else if (num[i] % 2 == 0) {
//				num[i] = num[i] / 2;
//			}
//			count++;
//		}
//		for (int i = 0; i < count; i++) {
//			System.out.print(num[i] + " ");
//		}
//
//	}
//}

//159 : 배열1 - 형성평가10
//import java.util.Scanner;
//
//public class array1 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		int count_total = sc.nextInt();
//		int[] num = new int[count_total];
//		int size = num.length;
//		int max = 0;
//		int temp = 0;
//		int count = 0;
//
//		for (int i = 0; i < size; i++) {
//			num[i] = sc.nextInt();
//			for (int j = 0; j < size; j++) {
//				if (num[i] < num[j]) {
//					temp = num[j];
//					num[j] = num[i];
//					num[i] = temp;
//				}
//			}
//			
//		}
//		for (int i = size-1; i >= 0; i--) {
//			System.out.println(num[i]);
//		}
//
//	}
//}
