public class RightTriangle{
	private int a;
	private int b;
	
	public void setLenght(int x, int y){
		a = x;
		b = y;
		
	}
	public void calculateHypotenuse(){
		System.out.printf("The length of the long side of this right triangle is: %.2f\n", (float)Math.sqrt((a*a)+(b*b)));
	}
}
