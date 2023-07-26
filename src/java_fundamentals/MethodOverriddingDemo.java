package java_fundamentals;

class Phone
{
	void call() {
		System.out.println("Calling");
	}
	
}

class IPhone extends Phone
{
	@Override
	void call() {
		super.call();
		System.out.println("IPhone Calling");
	}
}
public class MethodOverriddingDemo {

	public static void main(String[] args) {
		
		//Phone p=new Phone();
		//p.call();

		Phone p=new IPhone();
		p.call();
		
		
	}

}
