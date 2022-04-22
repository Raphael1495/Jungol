
//class Print {
//	public String delimiter;
//
//	public void a() { // instance t1을 쓰기 때문에 static 삭제;
//		System.out.println(this.delimiter); // this를 써줌으로써 instance t1과 매
//		System.out.println("a");
//		System.out.println("a");
//	}
//
//	public void b() { // instance t1을 쓰기 때문에 static 삭제;
//		System.out.println(this.delimiter); // this를 써줌으로써 instance t1과 매
//		System.out.println("b");
//		System.out.println("b");
//	}
//
//	public static void c(String delimiter) { // static이 있으므로 class Print 소속으로 본다;
//		System.out.println(delimiter); 
//		System.out.println("c");
//		System.out.println("c");
//	
//	}
//}
//
//public class staticMethod {
//
//	public static void main(String[] args) {
//
////		Print.a("-"); class print 의 소속이기 때문에 static이 있어야 함;
////		Print.b("-");
//
//		// instance
//		Print t1 = new Print();
//		t1.delimiter = "-";
//		t1.a();
//		t1.b();
//		Print.c("$");
//
//		Print t2 = new Print();
//		t2.delimiter = "-";
//		t2.a();
//		t2.b();
//	}
//}
