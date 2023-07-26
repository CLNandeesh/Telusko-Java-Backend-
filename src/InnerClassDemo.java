class A
{
	public void dispA()
	{
		System.out.println("B Class Method");
	}
	
	class B
	{
		public void dispB()
		{
			System.out.println("B Class Method");
		}
	}
}
public class InnerClassDemo {

	public static void main(String[] args) {
		
		A  a=new A();
		A.B b=a.new B();
		b.dispB();
	}

}
