//Polygon.java
public abstract class Polygon {
	protected int n; 				// number of sides
	protected double[] sides; 		// length of each side
	protected double area;
	abstract public void calArea();	// abstract
	public double getArea() { 		// complete method
		return area;
	}
	public Polygon(int nb) {
		n = nb;
		sides = new double[n];		// create array for n side
  	}
}
