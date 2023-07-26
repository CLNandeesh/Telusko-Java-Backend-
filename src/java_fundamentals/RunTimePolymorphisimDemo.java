package java_fundamentals;

class Animal 
{
	void m1()
	{
		System.out.println("M1 Animal");
	}
	
	void m2()
	{
		System.out.println("M2 Animal");
	}
}

class Tiger extends Animal
{
	void m1()
	{
		System.out.println("M1 Tiger");
	}
	
	void m3()
	{
		System.out.println("M3 Tiger");
	}
}

class Monkey extends Animal
{
	void m1()
	{
		System.out.println("M1 Monkey");
	}
	
	void m4()
	{
		System.out.println("M3 Monkey");
	}
}


public class RunTimePolymorphisimDemo {

	public static void main(String[] args) {
		
		Animal a1=new Tiger();
		a1.m1();
		a1.m2();
		((Tiger)a1).m3();
		
		

	}

}
