package java_fundamentals;

class Demo {
	
	static
	{
		System.out.println("Demo Block ConstructorChainingDemo");
	}
	
	
	Demo() {
		this(12);
		System.out.println("0 Arg Cons");
	}

	Demo(int a) {
		this(2, "Appu");
		System.out.println("1 Arg Cons");
	}

	Demo(int a, String b) {
		System.out.println("2 Arg Cons");
	}

}

public class ConstructorChainingDemo {

	static
	{
		System.out.println("Static Block ConstructorChainingDemo");
	}
	public static void main(String[] args) {
		Demo d = new Demo();

	}

}
