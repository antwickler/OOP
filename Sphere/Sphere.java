public class Sphere{
	private float radius;
	private float area;
	private float volume;
	public void setRadius(float x){
		radius = x ;
	}
	public void getArea(){
		System.out.printf("The surface area of this sphere is : %.2f\n",area);
	}
	public void getVolume(){
		System.out.printf("The volume of this sphere is : %.2f\n ",volume);
	}
	public void calculateSurfaceArea(){
		area = (float)(4.*3.14*radius*radius);
	}
	public void calculateVolume(){
		volume = (float)((4*3.14*radius*radius*radius)/3);
	}
}
