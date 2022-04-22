
// overriding 과 overloading의 차이점;

public class OverloadingDemo2 extends OverloadingDemo{
	void A(String arg1, String arg2) {System.out.println("sub class : void A()");}
	void A() {System.out.println("sub class : void A ()");} // Method overriding에 해당;
	
	public static void main(String[] args) {
		OverloadingDemo2 od = new OverloadingDemo2();
		od.A(); // 
		od.A(1); // 매개변수 int
		od.A("coding everybody"); // 매개변수가 string
		od.A("coding everybody", "coding everybody"); // 매개변수가 string
	}
}
