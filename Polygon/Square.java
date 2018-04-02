 //Square.java
public class Square extends Polygon{
  protected double length ;
  public Square(double length){
    super(4);
    sides[0] = length;
  }
  
  public void calArea(){
    area = sides[0]*sides[0];
    System.out.println("Square area is: " + area);
  }
}