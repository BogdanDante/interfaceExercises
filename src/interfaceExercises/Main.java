package interfaceExercises;

public class Main {

  public static void main(String[] args) {
    //1
    Circle circle = new Circle(4);
    System.out.println("Radius of circle = 4 , Area = " + circle.getArea());
    Rectangle rectangle = new Rectangle(3,4);
    System.out.println("sideA = 3, sideB = 4 of rectangle, area = " + rectangle.getArea());
    Triangle triangle = new Triangle(3,4,5);
    System.out.println("sideA = 3, sideB = 4, sideC = 5 of triangle, area = " + triangle.getArea());
    //2
    Dog dog = new Dog();
    dog.bark();
    //3
    Spacecraft spacecraft = new Spacecraft();
    spacecraft.fly_obj();
    Airplane airplane = new Airplane();
    airplane.fly_obj();
    Helicopter helicopter = new Helicopter();
    helicopter.fly_obj();
    //4
    int[] array = {9,3,5,2,0,1,8,6};
    int[] arr = {2,5,4,6,3,8,4,3,9,1};
    QuickSort quick = new QuickSort();
    quick.sort(arr,0,arr.length -1);
    MergeSort merge = new MergeSort();
    merge.sort(array,0,1);

  }

}
