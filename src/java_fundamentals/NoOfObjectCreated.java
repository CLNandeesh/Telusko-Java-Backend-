package java_fundamentals;

class NumberOfObj
{
	static int count;
	
	public NumberOfObj(Object...obj)
	{
		count++;
	}
	
	
}
public class NoOfObjectCreated {

	public static void main(String[] args) {
		
		System.out.println(NumberOfObj.count);
		
//		for(int i=0;i<10;i++)
//		{
//			NumberOfObj "a"+"+i+"=new NumberOfObj();
//		}
		NumberOfObj o1=new NumberOfObj();
		NumberOfObj o2=new NumberOfObj(5);
		NumberOfObj o3=new NumberOfObj(54,555.55,"appu");
		NumberOfObj o4=new NumberOfObj(5.5,4,5.55);
		
		
		System.out.println(NumberOfObj.count);
		//System.out.println(o2.count);
		

	}

}
