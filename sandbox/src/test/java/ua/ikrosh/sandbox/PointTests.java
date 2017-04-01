package ua.ikrosh.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test
  public void TestArea () {
    Point3 p1 = new Point3(2, 4);
    Point3 p2 = new Point3(5, 8);
    Assert.assertEquals(p1.distance(p2), 5.0);
  }
}
