class Hide 
{
	public static void disp()
	{
		System.out.println("Parent");
	}
}

class ChildHide extends Hide
{

	//@Override
	public static void disp()
	{
		System.out.println("Child");
	}
}
public class MethodHidingDemo {

	public static void main(String[] args) {
		
		Hide h=new ChildHide();
		h.disp();

	}

}
