package Test;
	

abstract class X {
	static void o() {
		 System.out.println("112233");
	 }
	static void o(int a) {
		System.out.println("23");
	}
 }
public class Y extends X{
		static void o() {
			X.o();
			X.o(23);
			System.out.println("123");
		}
	 public static void main(String[] args) {
		 X x=new Y();
		 Y.o();
	 }
}
