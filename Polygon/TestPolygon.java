import java.util.*;

public class TestPolygon {
	public static void main(String[] args) { 
		Scanner num = new Scanner(System.in);
		double width;
		System.out.print("Enter side width: ");
		width = num.nextDouble();
		Square square = new Square(width);
		System.out.println("Side width: " + width );
		square.calArea();
    }
}