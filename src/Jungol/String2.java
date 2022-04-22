package Jungol;

//602 : 문자열2 - 자가진단1
//import java.util.Scanner;
//
//public class String2 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		String[] st = new String[5]; // 배열 선언.
//
//		for (int i = 0; i < st.length; i++) {
//			st[i] = sc.next();
//		}
//		for (int i = st.length-1; i >= 0; i--) {
//			System.out.println(st[i]);
//		}
//	}
//}

//603 : 문자열2 - 자가진단2
//import java.util.Scanner;
//
//public class String2 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		String st = sc.nextLine();
//		String[] ch = st.split(" ");
//
//		for (int i = 0; i < ch.length; i++) {
//			if (i % 2 == 0) {
//				System.out.println(ch[i]);
//			}
//		}
//	}
//}

//604 : 문자열2 - 자가진단3
//import java.util.Scanner;
//
//public class String2 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		// 배열 10칸 선언.
//		String[] array = new String[10];
//
//		for (int i = 0; i < 10; i++) {
//			array[i] = sc.next(); // 10개 단어.
//		}
//		char alpha = sc.next().charAt(0); // 두번째 알파벳.
//
//		String temp; // 단어 저장할 임시 변수.
//		char lastAlphabat; // 단어의 마지막 알파벳 위치 저장.
//
//		for (int i = 0; i < 10; i++) {
//			temp = array[i];
//			
//			// 단어의 마지막 알파벳의 위치 저장.
//			lastAlphabat = temp.charAt(temp.length()-1);
//
//			if (alpha == lastAlphabat) {
//				// 두번째 입력 받은 알파벳과 일치하는 단어 출력.
//				System.out.println(array[i]);
//			}
//		}
//	}
//}

//605 : 문자열2 - 자가진단4
//import java.util.Scanner;
//
//public class String2 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		String st = "Hong Gil Dong";
//		
//		System.out.println(st);
//	}
//}

//606 : 문자열2 - 자가진단5
//import java.util.Scanner;
//
//public class String2 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		String st1 = sc.next();
//		String[] array1 = st1.split("");
//		String st2 = sc.next();
//		String[] array2 = st2.split("");
//
//		String sum = array1[0] + array1[1];
//		
//		for (int i = 2; i < array2.length; i++) {
//			sum += array2[i];
//		}
//		
//		sum += array1[0] + array1[1];
//		System.out.println(sum);
//	}
//}

//608 : 문자열2 - 자가진단7
//import java.util.Scanner;
//
//public class String2 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		String st1 = sc.next(); // 문자열 입력.
//
//		if (st1.contains("c")) {
//			System.out.print("Yes" + " ");
//		} else {
//			System.out.print("No" + " ");
//		}
//
//		if (st1.contains("ab")) {
//			System.out.print("Yes" + " ");
//		} else {
//			System.out.print("No" + " ");
//		}
//		
//		
//	}
//}

//609 : 문자열2 - 자가진단8
//import java.util.Scanner;
//
//public class String2 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		String[] array = new String[3];
//
//		for (int i = 0; i < 3; i++) {
//			array[i] = sc.next();
//		}
//
//		String temp;
//
//		for (int i = 0; i < 3; i++) {
//			for (int j = i + 1; j < 3; j++) {
//
//				if (array[i].compareTo(array[j]) > 0) {
//					temp = array[i];
//					array[i] = array[j];
//					array[j] = temp;
//				}
//			}
//		}
//		System.out.println(array[0]);
//	}
//}

//610 : 문자열2 - 자가진단9
//import java.util.Scanner;
//
//public class String2 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		String[] array = new String[5];
//
//		for (int i = 0; i < 5; i++) {
//			array[i] = sc.next();
//		}
//
//		String temp;
//
//		for (int i = 0; i < 5; i++) {
//			for (int j = i + 1; j < 5; j++) {
//
//				if (array[i].compareTo(array[j]) < 0) {
//					temp = array[j];
//					array[j] = array[i];
//					array[i] = temp;
//				}
//			}
//		}
//		for (int i = 0; i < 5; i++) {
//			System.out.println(array[i]);
//		}
//	}
//}

//611 : 문자열2 - 자가진단10 ## 질문 예정;
//import java.util.Scanner;
//
//public class String2 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		String st = sc.next();
//		char ch = st.charAt(3);
//		
//		
//		System.out.println((int)ch*2);
//		
//		
//
//	}
//}

//612 : 문자열2 - 자가진단11
//import java.util.Scanner;
//
//public class String2 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		String st = sc.nextLine();
//		String[] ch = st.split(" ");
//
//		String sum = "";
//
//		int count = 0;
//
//		for (int i = 0; i < ch.length; i++) {
//			sum += ch[i]; // 띄어쓰기 없이 한줄로 만들기.
//		}
//
//		
//
//		for (int i = 0; i < sum.length(); i++) {
//			System.out.print(sum.charAt(i));
//			count++;
//
//			if (count % 3 == 0) {
//				System.out.println();
//			}
//		}
//		sc.close();
//
//	}
//}

//189 : 문자열2 - 형성평가1

//import java.util.Scanner;
//
//public class String2 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		//배열 초기화;
//		String[] ch = {"flower", "rose", "lily", "daffodil", "azalea"};
//		//배열값 저장 임시변수;
//		String temp;
//		//배열 element의 두번째 세번째 값 저장;
//		char result1;
//		char result2;
//		//출력되는 단어 갯수 카운트;
//		int count = 0;
//
//		//찾을 알파벳 입력;
//		char Alpha = sc.next().charAt(0);
//		sc.close();
//
//		// 배열의 element의 2,3번째 값 나눠서 저장;
//		for (int i = 0; i < 5; i++) {
//			temp = ch[i];
//			result1 = temp.charAt(1);
//			result2 = temp.charAt(2);
//			//if문으로 분류;
//			if ((result1 == Alpha) || (result2 == Alpha)) {
//				System.out.println(temp);
//				count++;
//			}
//		}
//		// 카운트 값에 따라 출력되는 값 변경 조건문으로 변경;
//		if (count == 0) {
//			System.out.println(0);
//		} else {
//			System.out.print(count);
//		}
//	}
//}

//191 : 문자열2 - 형성평가3
//import java.util.Scanner;
//
//public class String2 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int count = 0;
//
//		StringBuilder sb = new StringBuilder();
//
//		while (true) {
//			String ch = sc.next();
//
//			if (ch.equals("0")) {
//				break;
//			}
//			count++;
//
//			if (count % 2 != 0) {
//				sb.append(ch + "\n");
//			}
//		}
//		sc.close();
//		System.out.println(count);
//		System.out.println(sb);
//	}
//}

//192 : 문자열2 - 형성평가4
//import java.util.Scanner;
//
//public class String2 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String temp;
//		int num = sc.nextInt();
//		String[] st = new String[num];
//
//		for (int i = 0; i < num; i++) {
//			st[i] = sc.next();
//		}
//
//		for (int i = 0; i < num; i++) {
//			for (int j = i + 1; j < num; j++) {
//				if (st[i].compareTo(st[j]) > 0) {
//					temp = st[i];
//					st[i] = st[j];
//					st[j] = temp;
//				}
//			}
//			System.out.println(st[i]);
//		}
//	}
//}

//193 : 문자열2 - 형성평가5 ## 다시 풀어보기;
//import java.util.Scanner;
//
//public class String2 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		String[] st = new String[5];
//		for (int i = 0; i < 5; i++) {
//			st[i] = sc.next();
//			if (st[i].length() > 100) {
//				i--;
//			}
//		}
//		String st1 = sc.next().substring(0, 1);
//		String st2 = sc.next();
//		sc.close();
//
//		String result = "";
//		//word를 선언하고 st배열 element들로 for문 실행 및 word를 st element로 초기화.
//		for (String word : st) {
//			//word에서 st1이 있거나 st2가 있으면 	result에 word입력;
//			if (word.indexOf(st1) > -1 || word.indexOf(st2) > -1) {
//				result += word + "\n";
//			}
//		}
//		// Null값과 result 비교하여 if문 실행.
//		if ("".equals(result)) {
//			System.out.println("none");
//		} else {
//			//앞쪽 뒤쪽 공백 삭제;
//			System.out.println(result.trim());
//		}
//	}
//}

//194 : 문자열2 - 형성평가6 ## 다시 풀어보기;
//import java.util.Scanner;
//
//public class String2 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		String[] str = new String[2];
//		for (int i = 0; i < 2; i++) {
//			str[i] = sc.next();
//		}
//		// 두 문자열을 연결하여 str[0]에 대입.
//		str[0] = str[0] + str[1];
//
//		// 정수 입력 받기.
//		int num = sc.nextInt();
//		System.out.println(str[0]);
//
//		String result = "";
//		// str[0]의 길이에 한정해서 for문 실행.
//		for (int i = 0; i < str[0].length(); i++) {
//			// if num 값이 str[1]보다 크다면 전부 str[0]으로 초기화;
//			if (num > str[1].length()) {
//				// num과 result의 길이가 같다면 break;
//				if (num == result.length()) {
//					break;
//				}
//				// result에 str[0]값으로 초기화;
//				result += str[0].charAt(i);
//				
//				// str[0]의 앞부분만 추출하기;
//			} else if (i < num) {
//				result += str[0].charAt(i); 
//			} else {
//				if (result.length() == str[1].length()) {
//					break;
//				}
//				result += str[1].charAt(i);
//			}
//		}
//		sc.close();
//		System.out.println(result);
//	}
//}

//215 : 문자열2 - 형성평가7 ### 다시 풀어보기.
//import java.util.Scanner;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class String2 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		int mul = 1;
//		String[] str = new String[2];
//		for (int i = 0; i < 2; i++) {
//			str[i] = sc.next();
//		}
//		// 숫자만;
//		Pattern p = Pattern.compile("^[0-9]{1,}");
//
//		for (int i = 0; i < str.length; i++) {
//			Matcher m = p.matcher(str[i]);
//			if (m.find()) {
//				mul *= Integer.valueOf(m.group());
//			}
//		}
//		System.out.println(mul);
//		sc.close();
//	}
//}

//216 : 문자열2 - 형성평가8
//import java.util.Scanner;
//
//public class String2 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		String st = "";
//		String[] str1 = new String[st.length()];
//
//		while (true) {
//			st = sc.next();
//			if (st.equals("END")) {
//				break;
//			}
//			for (int i = st.length() - 1; i >= 0; i--) {
//				System.out.print(st.charAt(i));
//			}
//			System.out.println();
//		}
//		sc.close();
//	}
//}

//237 : 문자열2 - 형성평가9
import java.util.Scanner;

public class String2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String st = "";
		String[] str1 = new String[st.length()];

	}
}