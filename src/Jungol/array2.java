package Jungol;

//564 : 배열2 - 자가진단1
//import java.util.Scanner;
//public class array2 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int[] arr = new int[26];  //26칸 짜리 배열선언
//        for (int i = 0; i < 26; i++) {  // 배열 모두 0으로 초기화
//            arr[i] = 0;
//        }
//        while (true) {
//            char ch = sc.next().charAt(0); // 알파벳 입력 받기
//            if (ch < 'A' || ch > 'Z') // A - Z 사이의 알파벳이 아니면 break
//                break;
//            arr[(int) ch - 65]++; // 1. 알파벳을 숫자로 변환 2. arr[0]++로 배열 인덱스의 count++
//        }
//        for (int i = 0; i < 26; i++) { // 배열 인덱스가 0인 것 제외하고 모두 출력하기 
//            if (arr[i] != 0) {
//                System.out.print((char) (int) (i + 65) + " : "); // 1. int -> char을 수행하여 알파벳을 숫자로 표현 
//                System.out.println(arr[i]); // 배열의 element 출력
//            }
//        }
//		
//		
//	}
//}

//565 : 배열2 - 자가진단2 #############
//import java.util.Scanner;
//public class array2 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int[] array = new int[10];
//		int num = 0;
//		int size = array.length;
//		int tenth = 0;
//
//		for (int i = 0; i < size; i++) { // 배열 0으로 초기화
//			array[i] = 0;
//		}
//
//		while (true) {
//			num = sc.nextInt();
//			if (num == 0) {
//				break;
//			}
//			array[(int) (Math.floor(num / 10.0))]++;
//		}
//		for (int i = 0; i < size; i++) {
//			if (array[i] != 0) {
//				System.out.print(i + " : ");
//				System.out.println(array[i]);
//			}
//		}
//
//	}
//}

//566 : 배열2 - 자가진단3
//import java.util.Scanner;
//public class array2 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int[] array = new int[100];
//		int num = 0;
//		int size = array.length;
//
//		num = sc.nextInt();
//		array[1] = num;
//		array[0] = 100;
//		System.out.print(array[0] + " " + array[1] + " ");
//		
//		for (int i = 2; i < size; i++) {
//			array[i] = array[i - 2] - array[i - 1];
//			System.out.print(array[i] + " ");
//			
//			if (array[i] < 0) {
//			break;
//			}
//		}
//	}
//}

//567 : 배열2 - 자가진단4  ######### 질문!
//import java.util.Scanner;
//public class array2 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int[][] array = new int[3][5];
//		int size = array.length;
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 5; j++) {
//				array[i][j] = ((int) Math.random() * 50);
//				System.out.print(array[i][j] + "   ");
//				if (array[i][j] < 10) {
//					System.out.print(" " + array[i][j] + "   ");
//				}
//			}
//			System.out.println();
//		}
//
//	}
//}

//568 : 배열2 - 자가진단5 ##### 글쓸 때 내용 쓰
//import java.util.Scanner;
//public class array2 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int[][] array1 = new int[2][4];
//		int[][] array2 = new int[2][4];
//		int[][] array3 = new int[2][4];
//
//		System.out.println("first array");
//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 4; j++) {
//				array1[i][j] = sc.nextInt();
//			}
//		}
//		System.out.println("second array");
//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 4; j++) {
//				array2[i][j] = sc.nextInt();
//			}
//		}
//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 4; j++) {
//				array3[i][j] = array1[i][j] * array2[i][j];
//				System.out.print(array3[i][j] + " ");
//			}
//			System.out.println();
//		}
//	}
//}

//569 : 배열2 - 자가진단6
//import java.util.Scanner;
//
//public class array2 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int[][] array = new int[5][4]; // 이중 배열 
//		int[] score = new int[5]; // 점수 저장할 배열 
//		int passCount = 0;
//
//		for (int i = 0; i < 5; i++) { 
//			for (int j = 0; j < 4; j++) {
//				array[i][j] = sc.nextInt(); // 이중배열에 정수 입력받기
//				score[i] += array[i][j]; // 점수배열에 총합계산하여 입
//			}
//		}
//		for (int i = 0; i < 5; i++) {
//			score[i] = score[i]/4;
//			if (score[i] >= 80) { // 80점 이상 pass
//				System.out.print("pass\n");
//				passCount++;
//			} else if (score[i] < 80) { // 80점 미만 fail
//				System.out.print("fail\n");
//			}
//		}
//		System.out.print("Successful : " + passCount);
//	}
//}

//570 : 배열2 - 자가진단7
//import java.util.Scanner;
//
//public class array2 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int[][] array = new int[5][5]; // 5X5행렬 선언 
//
//		for (int i = 0; i < 1; i++) {
//			for (int j = 0; j < 5; j++) {
//				array[i][j] =1; // 첫 번째 행을 1로 초기
//				System.out.print(array[i][j] + " ");
//			}
//			System.out.println();
//		}
//
//		for (int i = 1; i < 5; i++) {
//			array[i][0] = 1;			// (1,0)부터 첫번째 열을 1로 초기화 
//			System.out.print(array[i][0] + " ");
//			for (int j = 1; j < 5; j++) {
//				array[i][j] = array[i-1][j] + array[i][j-1]; // 윗값 왼쪽값 더하기
//				System.out.print(array[i][j]+ " ");
//			}
//			System.out.println();
//		}
//	}
//}

//160 : 배열2 - 형성평가1
//import java.util.Scanner;
//
//public class array2 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		int[] array = new int[10];
//		int size = array.length;
//
//		for (int i = 0; i < size; i++) {
//			num = sc.nextInt();
//			array[num-1]++;
//		}
//		for (int i = 0; i < 6; i++) {
//			System.out.println((i+1) + " : " + array[i]);
//		}
//	}
//}

//161 : 배열2 - 형성평가2
//import java.util.Scanner;
//
//public class array2 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int score = 0;
//		int[] array1 = { 100, 90, 80, 70, 60, 50, 40, 30, 20, 10, 0 };
//		int[] array2 = new int[11];
//
////		for (int i = 0; i < 10; i++) {
////			System.out.print(array[i] + " ");
////		}
//
//		for (int i = 0; i < 100; i++) {
//			score = sc.nextInt();
//			if (score == 0) {
//				break;
//			} else if (score / 10 == 10) {
//				array2[0]++;
//			} else if (score / 10 == 9) {
//				array2[1]++;
//			} else if (score / 10 == 8) {
//				array2[2]++;
//			} else if (score / 10 == 7) {
//				array2[3]++;
//			} else if (score / 10 == 6) {
//				array2[4]++;
//			} else if (score / 10 == 5) {
//				array2[5]++;
//			} else if (score / 10 == 4) {
//				array2[6]++;
//			} else if (score / 10 == 3) {
//				array2[7]++;
//			} else if (score / 10 == 2) {
//				array2[8]++;
//			} else if (score / 10 == 1) {
//				array2[9]++;
//			} else if (score / 10 == 0) {
//				array2[10]++;
//			}
//		}
//		for (int i = 0; i < 11; i++) {
//			if (array2[i] > 0) {
//				System.out.println(array1[i] + " : " + array2[i] + " person");
//			}
//		}
//	}
//}

//162 : 배열2 - 형성평가3
//import java.util.Scanner;
//
//public class array2 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		int[] array = new int[100];
//		int size = array.length;
//
//		for (int i = 0; i < 2; i++) { // array[0], array[1] 입력값으로 초기화;
//			num = sc.nextInt();
//			array[i] = num;
//		}
//		for (int i = 2; i < size; i++) {
//			array[i] = (array[i - 2] + array[i - 1]) % 10;
//		}
//		for (int i = 0; i < 10; i++) {
//			System.out.print(array[i] + " ");
//		}
//
//	}
//}

//163 : 배열2 - 형성평가4
//import java.util.Scanner;
//
//public class array2 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		int sum = 0;
//		int[][] array = {{3, 5, 9}, {2, 11, 5}, {8, 30, 10}, {22, 5, 1}};
//		int size = array.length;
//
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j < 3; j++) {
//				System.out.print(array[i][j] + " ");
//				sum += array[i][j];
//			}
//			System.out.println();
//		}
//		System.out.println(sum);	
//	}
//}

//164 : 배열2 - 형성평가5
//import java.util.Scanner;
//
//public class array2 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		int sum = 0;
//		int[] array1 = new int[4];
//		int size = array.length;
//
//		for (int i = 0; i < 4; i++) {
//			System.out.print((i + 1) + "class? ");
//			for (int j = 0; j < 3; j++) {
//				num = sc.nextInt(); // 점수 입력
//				sum += num; // 한 행의 합 
//			}
//			array1[i] = sum; // 한 행 sum
//			sum=0; // sum 초기
//		}
//		for (int i = 0; i < 4; i++) { // 출
//			System.out.println((i + 1) + "class : " + array1[i]);
//		}
//	}
//}

//165 : 배열2 - 형성평가6
//import java.util.Scanner;
//
//public class array2 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		int sum = 0;
//		int[][] array = new int[5][5];
//		int size = array.length;
//
//		array[0][0] = 1;
//		array[0][1] = 0;
//		array[0][2] = 1;
//		array[0][3] = 0;
//		array[0][4] = 1;
//
//		for (int i = 1; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				if (j > 0 && j < 4) {
//					array[i][j] = array[i - 1][j - 1] + array[i - 1][j + 1];
//				} else if (j == 4) {
//					array[i][j] = array[i - 1][j - 1];
//				} else if (j == 0) {
//					array[i][j] = array[i - 1][j + 1];
//				}
//			}
//		}
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				System.out.print(array[i][j] + " ");
//			}
//			System.out.println();
//		}
//	}
//}

//166 : 배열2 - 형성평가7
//import java.util.Scanner;
//
//public class array2 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		int sum = 0;
//		int[][] array1 = new int[2][3];
//		int[][] array2 = new int[2][3];
//		int[][] array3 = new int[2][3];
//
//		System.out.println("first array");
//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 3; j++) {
//				array1[i][j] = sc.nextInt();
//			}
//		}
//		System.out.println("second array");
//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 3; j++) {
//				array2[i][j] = sc.nextInt();
//			}
//		}
//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 3; j++) {
//				array3[i][j] = array1[i][j] * array2[i][j];
//				System.out.print(array3[i][j] + " ");
//			}
//			System.out.println();
//		}
//	}
//}

//167 : 배열2 - 형성평가8
//import java.util.Scanner;
//
//public class array2 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		double sum1 = 0;
//		double sum2 = 0;
//		double sum3 = 0;
//		double total = 0;
////		double avg = 0;
//		int[][] array1 = new int[4][2];
//		double[] array2 = new double[4];
//		double[] array3 = new double[2];
//
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j < 2; j++) {
//				array1[i][j] = sc.nextInt();
//			}
//		}
//		// 행들의 가로 평균;
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j < 2; j++) {
//				sum1 += array1[i][j];
//			}
//			array2[i] = sum1 / 2;
//			sum1 = 0; // sum값 초기화;
//		}
//		for (int i = 0; i < 4; i++) {
//			System.out.print((int) array2[i] + " ");
//		}
//		System.out.println();
//		
//		// 행들의 세로 평균;
//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 4; j++) {
//				sum2 += array1[j][i];
//			}
//			array3[i] = sum2 / 4;
//			sum2 = 0;
//		}
//		for (int i = 0; i < 2; i++) {
//			System.out.print((int) array3[i] + " ");
//		}
//		System.out.println();
//		
//		// 모든 element의 평균;
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j < 2; j++) {
//				sum3 += array1[i][j];
//			}
//		}
//		total = sum3 / 8;
//		System.out.print((int) total);
//	}
//}

//168 : 배열2 - 형성평가9
//import java.util.Scanner;
//
//public class array2 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		int num = 0;
//		do {
//			num = sc.nextInt();
//		} while (num < 1 || num > 10);
//
//		int[][] array = new int[num][num];
//
//		for (int i = 0; i < num; i++) {
//			for (int j = 0; j < num; j++) {
//				array[i][j] = 0;
//			}
//		}
//		for (int i = 0; i < num; i++) {
//			for (int j = 0; j < num; j++) {
//				array[i][0] = 1;
//				if (i != 0) {
//					array[i][i] = 1;
//				}
//			}
//		}
//		for (int i = 2; i < num; i++) {
//			for (int j = 1; j < num; j++) {
//				array[i][j] = array[i-1][j-1] + array[i-1][j];
//			}
//		}
//
//		for (int i = num - 1; i >= 0; i--) {
//			for (int j = num - 1; j >= 0; j--) {
//				if (array[i][j] != 0)
//					System.out.print(array[i][j] + " ");
//			}
//			System.out.println();
//		}
//
//	}
//}

//169 : 배열2 - 형성평가10
import java.util.Scanner;

public class array2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int[][] array1 = new int[3][5];

		char ch = 'A';

		for (int i = 2; i >= 0; i--) {
			for (int j = 4; j >= 0; j--) {
				ch = sc.next().charAt(0);
				array1[i][j] = (char) (ch + 32);
			}
		}
		for (int i = 2; i >= 0; i--) {
			for (int j = 4; j >= 0; j--) {
				System.out.print((char)array1[i][j] + " ");
			}
			System.out.println();
		}
	}
}