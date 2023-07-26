interface SuperCar {
	void drive();
}

public class AnInnerClsDemo3 {

	public static void main(String[] args) {
		SuperCar s = new SuperCar() {
			public void drive() {
				System.out.println("NFS Super car");
			}
		};
		s.drive();

	}

}
