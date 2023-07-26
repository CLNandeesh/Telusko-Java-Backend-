
interface Demo {
	void disp();

	default void disp1() {
		System.out.println("Default Method");
	}

	public static void disp2() {
		System.out.println("Static method");
	}
}

class Imp implements Demo {

	@Override
	public void disp() {
		System.out.println("Public Abstract Method");

	}

	public void disp1() {
		System.out.println("Default Child Method");
	}

	public static void disp2() {
		System.out.println("Static Child method");
	}
}

public class InterfaceJava8Feature {

	public static void main(String[] args) {
		Demo.disp2();

		Demo imp = new Imp();
		imp.disp();
		// imp.disp2();
		imp.disp1();

	}

}
