package ua.ikrosh.ab.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper {

  private  FirefoxDriver wd;

  public NavigationHelper(FirefoxDriver wd) {
    this.wd = wd;
  }

  public void returnToGroupPage() {
    wd.findElement(By.linkText("group page")).click();
  }

  public void gotoGroupPage() {
    wd.findElement(By.linkText("groups")).click();
  }

  public void returnToHomePage() {
    wd.findElement(By.linkText("home")).click();
  }

  public void gotoHomePage() {
    wd.findElement(By.linkText("home")).click();
  }
}
