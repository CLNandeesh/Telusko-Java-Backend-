abstract class Car {
	public abstract void drive();
}

//class SuperCar extends Car {
//
//	@Override
//	public void drive() {
//		System.out.println("NFS");
//
//	}
//
//}

public class AnInnerClsDemo2 {

	public static void main(String[] args) {

		Car c = new Car() {
			public void drive() {
				System.out.println("NFS");

			}
		};
		c.drive();
	}

}
