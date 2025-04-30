package interfaceExercises;

public class Triangle implements Shape{
  private double sideA;
  private double sideB;
  private double sideC;
  Triangle(double sideA, double sideB, double sideC){
    this.sideA = sideA;
    this.sideB = sideB;
    this.sideC = sideC;
  }
  
  @Override
  public double getArea() {
    double p = (sideA + sideB + sideC)/2;
    return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
  }
}
