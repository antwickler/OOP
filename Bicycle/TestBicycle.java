public class TestBicycle {
	public static void main(String[] args) {
		Bicycle bicycle = new Bicycle();
		bicycle.changeGear(3);
		bicycle.speedUp(90);
		bicycle.applyBrakes(30);
		System.out.println(bicycle.toString());
	}
}
