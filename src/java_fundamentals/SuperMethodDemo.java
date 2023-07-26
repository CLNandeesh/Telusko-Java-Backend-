package java_fundamentals;

class A {
	A() {
		this(10);
		System.out.println("A class Cons");

	}
	
	A(int i)
	{
		System.out.println("A Class one arg cons");
	}

	void m1() {
		System.out.println("A class M1 method");
	}
}

class B extends A{
	B() {
		super();
		System.out.println("B class Cons");
	}

	void m2() {
		System.out.println("B class M2 method");
	}
}

public class SuperMethodDemo {

	public static void main(String[] args) {
		 B b=new B();
		 b.m1();

	}

}
