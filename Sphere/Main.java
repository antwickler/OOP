import java.util.Scanner ;
public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Please input the radius of a sphere (e.g. 2.1): ");
		float r = in.nextFloat();

		Sphere S = new Sphere();
		S.setRadius(r);
		S.calculateSurfaceArea();
		S.calculateVolume();
		S.getArea();
		S.getVolume();
	

	}
}