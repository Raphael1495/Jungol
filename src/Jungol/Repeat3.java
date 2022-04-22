package Jungol;

//549 : 반복제어문3 - 자가진단1
//import java.util.Scanner;
//
//public class Repeat3 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		int i =0;
//		int count = 0;
//		int sum = 0;
//
//		num = sc.nextInt();
//
//		for (i = 1; sum < num; i+=2) {
//				count++;
//				sum += i;
//		}
//		System.out.printf("%d %d", count, sum);
//	}
//}

//634 : 반복제어문3 - 자가진단2
//import java.util.Scanner;
//
//public class Repeat3 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		int i = 0;
//
//		num = sc.nextInt();
//		for (i = 1; i <= num; i++) {
//
//			for (int j = 1; j <= i; j++) {
//				System.out.print('*');
//			}
//			System.out.println();
//		}
//	}
//}

// 550 : 반복제어문3 - 자가진단3
//import java.util.Scanner;
//
//public class Repeat3 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		int i = 0;
//
//		num = sc.nextInt();
//		for (i = num; i >= 1; i--) {
//			for (int j = i; j >= 1; j--) {
//				System.out.print('*');
//			}
//			System.out.println();
//		}
//		for (i = 1; i <= num; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print('*');
//			}
//			System.out.println();
//		}
//	}
//}

//551 : 반복제어문3 - 자가진단4
//import java.util.Scanner;
//
//public class Repeat3 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		int i = 0;
//
//		num = sc.nextInt();
//		for (i = num; i >= 1; i--) {
//			for (int j = i; j >= 1; j--) {
//				System.out.print('*');
//			}
//			System.out.println();
//			for (int x = 0; x < num-i+1; x++) {
//				System.out.printf(" ");
//			}
//		}
//
//	}
//}

//552 : 반복제어문3 - 자가진단5
//import java.util.Scanner;
//
//public class Repeat3 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		int i = 0;
//		int j = 0;
//
//		num = sc.nextInt();
//
//		for (i = num; i >= 1; i--) {
//			for (j = (2 * i - 1); j >= 1; j--) {
//				System.out.print('*');
//			}

//			System.out.println();

//			for (int x = 0; x < num-i+1; x++) {
//				System.out.printf(" ");
//			}
//		}
//	}
//}

//553 : 반복제어문3 - 자가진단6
//import java.util.Scanner;
//
//public class Repeat3 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		int i = 0;
//		int j = 0;
//		int k = 0;
//		int x = 1;
//		char ch = 'A';
//		num = sc.nextInt();
//
//		for (i = num; i >= 1; i--) {
//			for (j = i; j >= 1; j--) {
//				System.out.print(ch + "");
//				ch += 1;
//			}
//
//			System.out.println();
//		}
//	}
//}

//554 : 반복제어문3 - 자가진단7
//import java.util.Scanner;
//
//public class Repeat3 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		int i = 0;
//		int j = 0;
//		int k = 0;
//		int x = 1;
//		char ch = 'A';
//		num = sc.nextInt();
//
//		for (i = num; i >= 1; i--) {
//			for (j = i; j >= 1; j--) {
//				System.out.printf("%d ", x);
//				x++;
//			}
//			for (k = 1; k <= num - i + 1; k++) {
//				System.out.print(ch + " ");
//				ch += 1;
//			}
//
//			System.out.println();
//		}
//	}
//}

//140 : 반복제어문3 - 형성평가1 ################
//import java.util.Scanner;
//
//public class Repeat3 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		int sum = 0;
//		int avg = 0;
//		int count = 0;
//		int i = 0;
//
//		for (i = 1; i <= 20; i++) {
//			num = sc.nextInt();
//			if (num == 0) {
//				break;
//			}
//			sum += num;
//			count++;
//
//		}
//		System.out.printf("%d %d", sum, (int) sum / count);
//	}
//}

//141 : 반복제어문3 - 형성평가2
//import java.util.Scanner;
//
//public class Repeat3 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		int sum = 0;
//		int i = 0;
//		num = sc.nextInt();
//		
//		for (i = 1; i*num <= 100; i++) {
//			if ((i * num) % 10 == 0) {
//				System.out.printf("%d ", i*(num));
//				break;
//			} else {
//				System.out.printf("%d ", i*(num));
//			}
//		}
//	}
//}

//142 : 반복제어문3 - 형성평가3
//import java.util.Scanner;
//
//public class Repeat3 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		int sum = 0;
//		int i, j = 0;
//		num = sc.nextInt();
//
//		for (i = 1; i <= num; i++) {
//			for (j = 1; j <= i; j++) {
//				System.out.print('*');
//			}
//			System.out.println();
//		}
//		for (i = 1; i <= num; i++) {
//			for (j = 1; j <= num-i; j++) {
//				System.out.print('*');
//			}
//			System.out.println();
//		}
//	}
//}

//143 : 반복제어문3 - 형성평가4 ##############
//import java.util.Scanner;
//
//public class Repeat3 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//
//		num = sc.nextInt();
////
//		for (int i = num; i >= 1; i--) {
//			for (int j = i; j < num; j++) {
//				System.out.print(" ");
//			}
//
//			for (int j = 1; j <= (2 * i - 1); j++) {
//				System.out.print('*');
//			}
//			System.out.println();
//		}
//
//		1. num이 어떤 값이 들어와도 한 줄 적게 그림.
//		int blank = num - 1;
//		for (int i = 2; i <= num; i++) {// 바깥 for문은 행 -> i가 1칸 더 나
//			// 2. 띄어쓰기
//			for (int j = i; j <= blank; j++) { // 2 - 3 //2 -5
//				System.out.print(" ");
//			}
//			// 3. * 그리기
//			for (int j = 0; j < (2 * i - 1); j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//
//	}
//}

// 144 : 반복제어문3 - 형성평가5 ################
//import java.util.Scanner;
//
//public class Repeat3 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		int y = 1;
//		num = sc.nextInt();
//
//		for (int i = num; i >= 1; i--) {
//			for (int j = 2 * i - 1; j > 1; j--) {
//				System.out.print(" ");
//			}
//			
//			for (int x = 1; x <= 2*y-1; x++) {
//				System.out.print("*");
//				
//			}
//			y++;
//			System.out.println();
//		}
//	}
//}

//145 : 반복제어문3 - 형성평가6
//import java.util.Scanner;
//
//public class Repeat3 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		int i = 0;
//		int j = 0;
//		int k = 0;
//		int x = 1;
//		char ch = 'A';
//		num = sc.nextInt();
//
//		for (i = num; i >= 1; i--) {
//			for (j = 2*i-2; j >= 1; j--) {
//				System.out.printf(" ");
//
//			}
//			for (k = 1; k <= num - i + 1; k++) {
//				System.out.print(k + " ");
//			}
//
//			System.out.println();
//		}
//	}
//}

//146 : 반복제어문3 - 형성평가7
//import java.util.Scanner;
//
//public class Repeat3 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		int count = 0;
//		int i = 0;
//		int j = 0;
//		int k = 0;
//		int x = 0;
//		char ch = 'A';
//		num = sc.nextInt();
//
//		for (i = 0; i < num; i++) {
//			for (j = 0; j < num - i; j++) {
//				System.out.printf(ch + " ");
//				ch += 1;
//			}
////			System.out.println();
//			for (x = 0; x < i; x++) {
//				System.out.print((count++) + " ");
//			}
//			System.out.println();
//		}
//	}
//}

//147 : 반복제어문3 - 형성평가8
//import java.util.Scanner;
//
//public class Repeat3 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		int count = 0;
//		int i, j, x = 0;
//		int k = 1;
//		char ch = 'A';
//		num = sc.nextInt();
//		for (i = 1; i <= num; i++) {
//
//			for (j = 1; j <= num - i + 1; j++) {
//				System.out.print((k++) + " ");
//
//			}
//			System.out.println();
//
//			for (x = (j - 2 * i); x < j; j--) {
//				System.out.print(" ");
//			}
//
//		}
//
//	}
//}

//148 : 반복제어문3 - 형성평가9  ######## 질문!
//import java.util.Scanner;
//
//public class Repeat3 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		int count = 0;
//		int i, j, k, x, y, z = 0;
//		num = sc.nextInt();
//		// 많아지는 # 개수 
//		for (i = 1; i <= num; i++) {
//			for (j = 1; j <= i; j++) {
//				System.out.print("# ");
//
//			}
//			System.out.println();
//
//		}
//		// 적어지는 # 개수
//		for (y = 0; y < num; y++) {
//			//공백 
//			for (z = 1; z <= 2 * y + 2;z++) {
//				System.out.print(" ");
//			}
//			//#출력 
//			for (k = 1; k < num - y; k++) {
//				System.out.print("# ");
//			}
//			System.out.println();
////			System.out.println(3*k-1);
//
//		}
//
//	}
//}

//149 : 반복제어문3 - 형성평가10
//import java.util.Scanner;
//
//public class Repeat3 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		int count = 0;
//		int i, j, k, y, z = 0;
//		int x = 1;
//		num = sc.nextInt();
//		for (i = 0; i < num; i++) {
//			for (j = 0; j < num; j++) {
//				System.out.print(x+" ");
//				x = (x + 2) % 10;
//
//			}
//			System.out.println();
//		}
//	}
//}
// 적어지는 # 개수
