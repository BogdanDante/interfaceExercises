package interfaceExercises;

public class Rectangle implements Shape{
  private double sideA;
  private double sideB;
  Rectangle(double sideA, double sideB){
    this.sideA = sideA;
    this.sideB = sideB;
  }
  
  @Override
  public double getArea() {
    return sideA * sideB;
  }

}
