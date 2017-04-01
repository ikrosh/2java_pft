package ua.ikrosh.sandbox;

public class MyFirstProgram2 {

  public static void main(String[] args) {

    Point2 p1 = new Point2 (2,4);
    Point2 p2 = new Point2(5,8);
      System.out.println("Расстояние между точками " + distance(p1, p2));

  }

  public static double distance (Point2 p1, Point2 p2) {
    return Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));
  }
}
