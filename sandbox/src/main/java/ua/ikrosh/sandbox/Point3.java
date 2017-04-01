package ua.ikrosh.sandbox;

public class Point3 {

  public double x;
  public double y;

  public Point3(double x, double y) {
    this.x = x;
    this.y = y;

  }

  public double distance (Point3 p) {
    return Math.sqrt(Math.pow((p.x - x), 2) + Math.pow((p.y - y), 2));
  }

}
