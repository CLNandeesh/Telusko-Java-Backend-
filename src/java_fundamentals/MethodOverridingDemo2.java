package java_fundamentals;

class Parent {
	void m1() {
		System.out.println("Parent M1 method");
	}

}

class Child extends Parent {
	void m1() {
		System.out.println("Child M1 method");
	}

	void m2() {
		System.out.println("Child M2 method");
	}
}

public class MethodOverridingDemo2 {

	public static void main(String[] args) {
		
		Parent p=new Child();
		p.m1();
		((Child)p).m2();

	}

}
