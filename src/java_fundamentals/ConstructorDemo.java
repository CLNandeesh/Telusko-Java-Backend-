package java_fundamentals;

class Dog {
	private String name;
	private int age;

	public Dog(String name, int age) {

		//super();
		
		this.name = name;

		if (age >= 18) {
			this.age = age;
		}
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}

public class ConstructorDemo {

	public static void main(String[] args) {

		Dog d1 = new Dog("Labroadar", 22);
		System.out.println(d1.getName());
		System.out.println(d1.getAge());

		Dog d2 = new Dog("Husky", 12);
		System.out.println(d2.getName());
		System.out.println(d2.getAge());
	}

}
