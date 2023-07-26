package java_fundamentals;

class Plane
{
	
}

class Fighter extends Plane
{
	
}

class Cargo extends Plane
{
	
}

class P
{
	Fighter dis()
	{
		System.out.println("DIs of P");
		return new Fighter();
		
	}
}

class Q extends P
{
	Plane dis()
	{
		System.out.println("DIs of P");
		return new Plane();
	}
}
public class MethodOverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
