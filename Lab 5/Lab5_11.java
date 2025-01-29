import java.util.Scanner;
class Circle{
  int radius;

  public double getAreaOfCricle(){
  return Math.PI * radius * radius;
}
}

public class Lab5_11 {
   
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("radius");
    Circle c =  new Circle();
    c.radius = 22;
    Circle c1 =  new Circle();
    c1.radius = 24;
    Circle c2 =  new Circle();
    c2.radius = 27;
    
    System.out.println("Area 1="+c.getAreaOfCricle());
    System.out.println("Area 2="+c1.getAreaOfCricle());
    System.out.println("Area 3="+c2.getAreaOfCricle());

    sc.close();
}
}