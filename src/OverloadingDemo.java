
//Overloading
// 같은 매소드에 다른 매개변수를 가진 것을 호출한다!
public class OverloadingDemo {
	void A() {System.out.println("void A");}
	// 중복이 된다면 같은 매소드를 구분할 수가 없기 때문에 에러가 남.
//	int A() {System.out.println("void A()");}
	
	void A(int arg1) {System.out.println("void A (int arg1)");}
	//매소드를 호출하는 단계에서는 매개변수가 달라도 에러 발생.
//	void A(int param1) {System.out.println("void A (int arg1)");}
	
	void A(String arg1) {System.out.println("void A (String arg1)");}
	

	
	public static void main(String[] args) {
		OverloadingDemo od = new OverloadingDemo();
		od.A(); // 
		od.A(1); // 매개변수 int
		od.A("coding everybody"); // 매개변수가 string
	}
}
