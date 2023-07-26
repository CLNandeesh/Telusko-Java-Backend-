class Parent
{
	public void dip()
	{
		System.out.println("Parent Disp Method");
	}
	
	public void show()
	{
		System.out.println("Paent Show Method");
	}
}
public class AnonymonousInnerClass {

	public static void main(String[] args) {
		
		Parent p=new Parent()
		{
			public void dip()
			{
				super.dip();
				System.out.println("Child Disp Method");
			}
			
		};
		
		p.dip();
		
	

	}

}
