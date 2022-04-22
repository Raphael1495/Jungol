//class Calculator {
//	int left, right;
//
//	public void setOprands(int left, int right) {
//		this.left = left;
//		this.right = right;
//	}
//
//	public void sum() {
//		System.out.println(this.left + this.right);
//	}
//
//	public int avg() {
//		return ((this.left + this.right) / 2); // overriding된 하위 클래스와 같은 type으로 맞춰줘야함;
//
//	}
//}
//
//class SubstractionableCalculator extends Calculator { // 상속을 받는다 (extends)
//
//	public void substract() {
//		System.out.println(this.left - this.right);
//	}
//	// Overriding 수행
//	public void sum() { // 상위 클래스와 같은 이름, 같은 type
//		System.out.println("실행 결과 " + (this.left + this.right) + "입니다.");
//	}
//
////	public int avg() { // 상위 클래스와 type을 맞춰야함;
////		return ((this.left + this.right) / 2);
////	}
//
//	// super로 바꿀 수 있음.
//	public int avg() {
//		return super.avg(); // 상위 클래스를 그래도 쓰지 않아도 되서 좋음;
//	}
//
//}
//
//public class CalculatorOverriding {
//
//	public static void main(String[] args) {
//
//		SubstractionableCalculator c1 = new SubstractionableCalculator();
//		c1.setOprands(10, 20);
//		c1.sum();
//		c1.avg();
//		c1.substract();
//
//	}
//
//}
