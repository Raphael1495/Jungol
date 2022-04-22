package grammar;

public class Print {
	/*
	 * 1. Main Method
	 * 		- public static void main(String[] args){}
	 * 2. 자동완성 : 컨트롤 +  space bar
	 * 		- main method: main
	 * 3. standard 입출력 / 출
	 * 
	 */
	public static void main(String[] args) {
		System.out.println("Hello World");
		// ln = enter
		System.out.println("Hi");
		/*
		 * 4. 문자열 맵핑을 통한 출력
		 * 		- %s : 문자열 ""
		 * 		- %d : 정수형
		 *  	- %f : 실수형
		 *   	- %c : 문자형 ''
		 *   	- %b : 논리형
		 */
		System.out.printf("이름 : %s", "Hyukjoon");
		System.out.println();
		System.out.printf("나이 : %d\n", 20);
		System.out.printf("결혼 여부 : %b", false);
		System.out.println();
		System.out.printf("키: %f 성별: %c 주소: %s", 178.4, 'F', "서울");
	}
}
