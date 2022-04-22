import java.util.Arrays;

public class Programmers {

	public static void main(String[] args) {
		String s = "try hello WORLD";
		String answer = solution(s);
		System.out.println(answer);

	}

	public static String solution(String s) {
		StringBuilder sb = new StringBuilder();
		String[] arr = s.split(" ");

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length(); j++) {
				if (j % 2 == 0) {
					if (arr[i].charAt(j) >= 'A' && arr[i].charAt(j) <= 'Z') {
						sb.append(arr[i].charAt(j));
					} else if (arr[i].charAt(j) >= 'a' && arr[i].charAt(j) <= 'z') {
						sb.append((char) (arr[i].charAt(j) - ('a' - 'A')));
					} else {
						sb.append(arr[i].charAt(j));
					}
				} else {
					if (arr[i].charAt(j) >= 'A' && arr[i].charAt(j) <= 'Z') {
						sb.append((char) (arr[i].charAt(j) + ('a' - 'A')));
					} else if (arr[i].charAt(j) >= 'a' && arr[i].charAt(j) <= 'z') {
						sb.append(arr[i].charAt(j));
					} else {
						sb.append(arr[i].charAt(j));
					}
				}
			}
			if (arr.length - 1 != i) {
				sb.append(" ");
			}
		}
		String answer = sb.toString();
		return answer;
	}
}
