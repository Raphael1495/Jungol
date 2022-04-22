package grammar;

public class DataType {
	public static void main(String[] args) {
		/*
		 * 1. Data Type (데이터종류)
		 * [1] 기본형 데이터 (8가지)
		 * 		- 수치형 (정수형, 실수형)
		 * 		(1) 정수형
		 * 			- byte (1byte)
		 * 			- short (2byte)
		 * 			- int (4byte) -> 기본형 int 0이 들어가 있음. 출력이 되진 않음.
		 * 			- long (8byte)
		 * 		(2) 실수형 2가지
		 * 			- float (4byte)
		 * 			- double (8byte) -> 기본형
		 * 			ex) 3.14 (double 처리)
		 * 				3.14F (float 처리)
		 * 
		 * 		(3)	문자형 1가지
		 * 			- char (character) (2byte)
		 * 			ex) 'A', 'a', '남'
		 * 			- escapse 문자 
		 * 				\n : enter
		 * 				\t : tab
		 * 
		 * 		(4) 논리형 1가지
		 * 			- boolean (1byte)
		 * 			true
		 * 			false -> 기본형
		 * 
		 * [2] 참조형 데이터
		 * 		- 기본형 8가지를 제외한 나머지 데이터 모두
		 * 		- class, 배열, 인터페이스, 문자열 
		 * 
		 */
		System.out.println(10);  // 이렇게 숫자를 쓰면 자동으로 int가 된다.
		
		float aa = 10.0F; // F를 꼭 써야
		double bb = 10.1;
		char cc = '\n';
		char dd = '\''; // '',""
		char ee = '남';
		System.out.println(aa);
		System.out.println(bb);
		System.out.println(ff);
		System.out.println(gg);
		System.out.println(cc);
		System.out.println(dd);
		System.out.println(ee);
		System.out.println("Hello");
	}
	static int ff;
	static char gg;
}
