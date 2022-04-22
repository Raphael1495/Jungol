class Calculator {
	int left, right;
	int third = 0;

	public void setOprands(int left, int right) {
		System.out.println("setOprands(int left, int right)");
		this.left = left;
		this.right = right;
	}

	public void setOprands(int left, int right, int third) { // overloading! 3개를 호출하면 매개변수가 3개인 것이 호출 된다.
		System.out.println("setOprands(int left, int right, int third)");
		// 중복된 항목을 쓰지 않고 직접 호출하기;
		this.setOprands(left, right);
		// 중복 제거.
//		this.left = left;
//		this.right = right;
		this.third = third;
	}

	public void sum() {
		System.out.println(this.left + this.right + this.third);
	}

	public int avg() {
		return ((this.left + this.right + this.third) / 3);
	}
}

public class Overloading1 {

	public static void main(String[] args) {

		Calculator c1 = new Calculator();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();

	}

}
