//class Calculator {
//	int left, right;
//	
//	// java가 기본으로 생성자를 만들어주지 않았기 때문에 에러가 발생함. 따라서 기본 생성자를 명시적으로 정의해야함.
//	// public Calculator() {}// 기본 생성자 명시;
//	// 하지만 기본 생성자를 만들지 않고도 정상 작동하도록 할 수 있음.
//	// 하위 class와 상위 class가 생성자에 똑같은 코드를 가지고 있기 때문에 중복임. (유지보수 중 문제 발생!)
//	// super를 사용 => 하위 클래스가 상위 클래스를 참조할 수 있는 방법!
//	
//	public Calculator(int left, int right) {
//		this.left = left;
//		this.right = right;
//	}
//	public void setOprands(int left, int right) {
//		this.left = left;
//		this.right = right;
//	}
//	public void sum() {
//		System.out.println(this.left + this.right);
//	}
//	public void avg() {
//		System.out.println((this.left + this.right) / 2);
//
//	}
//}
//class SubstractionableCalculator extends Calculator { // 상속을 받는다 (extends)
//	public SubstractionableCalculator(int left, int right) {
//		
//		// this = 자기자신 / super = 부모 / 부모의 생성자를 호출하게 됨으로 left right값이 사용됨/
//		super(left, right);
//		// 단, 하위 클래스의 초기화 코드는 super를 호출한 후에 작성해야함!!
//	}
//	public void substract() {
//		System.out.println(this.left - this.right);
//	}
//}
//public class CalculatorConstructorDemo5 {
//	public static void main(String[] args) {
//		SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20); // 생성자로 바꿈 ->this.left-right를 초기화;
//		c1.sum();
//		c1.avg();
//		c1.substract();
//	}
//
//}