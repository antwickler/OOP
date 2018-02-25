import java.util.Scanner ;
public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Please Enter the length of side a: ");
		int a = in.nextInt();
		System.out.print("Please Enter the length of side b: ");
		int b = in.nextInt();

		RightTriangle r = new RightTriangle();
		r.setLenght(a,b);
		r.calculateHypotenuse();
	}
}