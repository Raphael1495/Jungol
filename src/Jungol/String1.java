package Jungol;

//593 : 문자열1 - 자가진단1

//import java.util.Scanner;
//
//public class String1 {
//	public static void main(java.lang.String[] args) {
//		int num = 0;
//		Scanner sc = new Scanner(System.in);
//
//		// 33 <= num < 127
//		while (true) {
//			System.out.print("ASCII code =? ");
//			num = sc.nextInt();
//
//			if (num >= 33 && num <= 127) {
//				System.out.println((char) num);
//			} else {
//				break;
//			}
//		}
//	}
//}

//594 : 문자열1 - 자가진단2
//import java.util.Scanner;
//
//public class String1 {
//	public static void main(java.lang.String[] args) {
//		int String1 = 0;
//		Scanner sc = new Scanner(System.in);
//		
//		String input = sc.nextLine();
//		String result = input + input;
//		
//		System.out.println(result);
//	}
//}

//595 : 문자열1 - 자가진단3
//import java.util.Scanner;
//
//public class String1 {
//	public static void main(java.lang.String[] args) {
//		int String1 = 0;
//		Scanner sc = new Scanner(System.in);
//
//		String input = "Hong Gil Dong";
//
//		String[] array = input.split("");
//
//		for (int i = 3; i < 7; i++) {
//			System.out.print(array[i]);
//		}
//	}
//}

//596 : 문자열1 - 자가진단4
//import java.util.Scanner;
//
//public class String1 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		while (true) {
//			String st1 = sc.next();
//			String st2 = sc.next();
//
//			if (st1.length() > 20 && st2.length() > 20) {	
//				break;
//			} else {
//				System.out.println(st1.length() + st2.length());
//				break;
//			}
//		}
//	}
//}

//598 : 문자열1 - 자가진단6
//import java.util.Scanner;
//
//public class String1 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		while (true) {
//			char ch = sc.next().charAt(0); // 알파뱃 ASCII CODE 65(A) ~ 90(Z) // 97(a) ~ 122(z);
//
//			if ((int) ch >= 65 && (int) ch <= 90) {
//				System.out.println(ch);
//			}
//
//			else if ((int) ch >= 97 && (int) ch <= 122) {
//				System.out.println(ch);
//			}
//
//			else if ((int) ch >= 48 && (int) ch <= 57) {
//				System.out.println((int) ch);
//			}
//
//			else {
//				break;
//			}
//		}
//	}
//}

//599 : 문자열1 - 자가진단7
//import java.util.Scanner;
//
//public class String1 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		// 문자열 입력하기.
//		String st = sc.nextLine();
//		char ch;
//		sc.close();
//
//		// 1988-Seoul-Olympic!!!
//		for (int i = 0; i < st.length(); i++) {
//			ch = st.charAt(i);
//			//대문자 그대로 출력.
//			if ((int) ch >= 65 && (int) ch <= 90) {
//				System.out.print(ch);
//			}
//			//소문자 -> 대문자 변환.
//			else if ((int) ch >= 97 && (int) ch <= 122) {
//				System.out.print((char) (ch - 32));
//			}
//		}
//	}
//}

//600 : 문자열1 - 자가진단8
//import java.util.Scanner;
//
//public class String1 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int count = 0;
//		// 문자열 입력하기.
//		String st = sc.nextLine();
//		String[] ch = st.split(" ");
//
//		for (int i = 0; i < ch.length; i++) {
//			count++; // 단어의 개수 count;
//		}
//		System.out.println(count);
//	}
//}

//601 : 문자열1 - 자가진단9  ## 못 풀었음;
//import java.util.Scanner;
//
//public class String1 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int count = 0;
//		
//		// 문자열 입력하기.
//		String st = sc.nextLine();
//		String[] ch = st.split("");
//
//		for (int i = 0; i < ch.length; i++) {
//			count++; // 단어의 개수 count;
//		}
////		System.out.println(count);
//
//		for (int i = 0; i < count; i++) {
//			for (int j = count - 1; j >= 0; j--) {
//				
//				if (j == count - 1) {
//					ch[0] = ch[j];
//				}
//				else if (j >= 0 && j < (count - 1)) {
//					ch[j + 1] = ch[j];
//				}
//			}
//			
//			for (int j = 0; j < count; j++) {
//				System.out.print(ch[j]);
//			}
//			System.out.println();
//		}
//	}
//}

//601 : 문자열1 - 자가진단9
//import java.util.Scanner;
//
//public class String1 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int count = 0;
//		// 문자열 입력하기.
//		String st = sc.nextLine();
//		char[] ch = new char[100];
//
//		for (int i = 0; i < st.length(); i++) {
//			ch[i] = st.charAt(i); // 문자열을 char배열에 모두 입력.
//		}
//
//		for (int i = 0; i < st.length(); i++) {
//			count = st.length() - 1 - i; // 7 - 1 - i;
//
//			for (int j = 0; j < st.length(); j++) {
//
//				if (count == st.length()) {
//					count = 0;
//				}
//				System.out.print(ch[count]);
//				count ++;
//			}
//			System.out.println();
//		}
//	}
//}

//182 : 문자열1 - 형성평가1
//import java.util.Scanner;
//
//public class String1 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		// 영문자 두 개 입력 받기;
//		char ch1 = sc.next().charAt(0);
//		char ch2 = sc.next().charAt(0);
//		
//		System.out.println((int)ch1+(int)ch2 + " " + Math.abs(((int)ch1-(int)ch2)));
//	}
//}

//183 : 문자열1 - 형성평가2
//import java.util.Scanner;
//
//public class String1 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		// 영문자 두 개 입력 받기;
//		String st = sc.nextLine();
//		char[] ch = new char[st.length()];
//
//		for (int i = 0; i < 5; i++) {
//			ch[i] = st.charAt(i);
//			System.out.print(ch[i]);
//		}
//	}
//}

//184 : 문자열1 - 형성평가3
//import java.util.Scanner;
//
//public class String1 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		// 영문자 두 개 입력 받기;
//		String st = sc.nextLine();
//		char[] ch = new char[st.length()];
//
//		for (int i = 0; i < st.length(); i++) {
//			ch[i] = st.charAt(i);
//
//			if (ch[i] >= 65 && ch[i] <= 90) {
//				//대문자 -> 소문자;
//				System.out.print((char)(ch[i]+32));
//			}
//			else if (ch[i] >= 97 && ch[i] <= 122) {
//				System.out.print(ch[i]);
//			}
//			else if (ch[i] >= 48 && ch[i] <= 57) {
//				System.out.print(ch[i]);
//			}
//		}
//	}
//}

//185 : 문자열1 - 형성평가4
//import java.util.Scanner;
//
//public class String1 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int count = 0;
//		// 영문자 두 개 입력 받기;
//		String st1 = sc.next();
//		char st2 = sc.next().charAt(0);
//
//		// 단어의 크기만금 배열 생
//		char[] ch = new char[st1.length()];
//
//		for (int i = 0; i < st1.length(); i++) {
//			ch[i] = st1.charAt(i);
//			if (ch[i] == st2) {
//				System.out.println(i);
//				count++;
//				break;
//			}
//		}
//		if (count == 0) {
//		 System.out.println("No");
//		}
//	}
//}

//186 : 문자열1 - 형성평가5
//import java.util.Scanner;
//
//public class String1 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int count1 = 0;
//		int count2 = 0;
//		// 영문자 두 개 입력 받기;
//		String st1 = sc.next();
//		String st2 = sc.next();
//
//		// 단어의 크기만금 배열 생
//		char[] ch1 = new char[st1.length()];
//		char[] ch2 = new char[st2.length()];
//
//		if (ch1.length > ch2.length) {
//			System.out.println(ch1.length);
//		} else {
//			System.out.println(ch2.length);
//		}
//	}
//}

//187 : 문자열1 - 형성평가6
//import java.util.Scanner;
//
//public class String1 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		StringBuffer sb = new StringBuffer(sc.nextLine());
//
//		// 문자열이 100자 이하.
//		while (sb.length() > 100) {
//			sb = new StringBuffer(sc.nextLine());
//		}
//
//		// 문자열이 남아있을때 까지만 실행.
//		while (sb.length() > 1) {
//			int num = sc.nextInt();
//
//			// 입력이 1보다 작으면 계속 실행.
//			if (num < 1) {
//				continue;
//			}
//			// 문자열의 길이보다 num이 크면 마지막 element 삭제.
//			else if (num > sb.length()) {
//				sb.deleteCharAt(sb.length()-1);
//			}
//			// 입력 받은 숫자의 index element 삭제.
//			else {
//				sb.deleteCharAt(num-1);
//			}
//			// 남은 문자열 출력.
//			System.out.println(sb);
//		}
//		sc.close();
//	}
//}

//188 : 문자열1 - 형성평가7
//import java.util.Scanner;
//
//public class String1 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		String st = sc.nextLine();
//		String[] ch1 = st.split(" ");
//
//		for (int i = 0; i < ch1.length; i++) {
//			System.out.println(i+1 + ". " + ch1[i]);
//		}
//
//	}
//}