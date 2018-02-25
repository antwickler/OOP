import java.util.Scanner ;
public class Main{
	public static void main(String[] args){
		System.out.println("Square Area");
		Scanner in = new Scanner(System.in);
		System.out.print("Enter width: ");
		int w = in.nextInt();

		Square S = new Square();
		S.setWidth(w);
		S.calcArea();
		S.showArea();

	}
}