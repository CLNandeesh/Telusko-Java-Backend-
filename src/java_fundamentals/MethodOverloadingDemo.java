package java_fundamentals;

class Test{
	
	public void add(int a,int b,int c)
	{
		System.out.println("Three number");
	}
	
	public void add(int a,int b)
	{
		System.out.println("Int Two number");
	}
	
	public void add(double a,double b)
	{
		System.out.println("Double Two number");
	}
	
	public void add(int a)
	{
		System.out.println("One number");
	}
	
	
}
public class MethodOverloadingDemo {

	public static void main(String[] args) {
		Test t=new Test();
		
		t.add(10.4,20.2);
		t.add(1, 2, 3);
		t.add(1);
		

	}

}
