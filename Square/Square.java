public class Square{
	private int width;
	private int area;
	public void setWidth(int x){
		width = x ;
	}
	public void calcArea(){
		area = width*width ;
	}
	public void showArea(){
			System.out.println("Area : "+ area);
	}
}
