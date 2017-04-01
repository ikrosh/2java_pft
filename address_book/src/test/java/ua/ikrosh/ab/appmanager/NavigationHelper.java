package ua.ikrosh.ab.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase{

  public NavigationHelper(WebDriver wd) {
    super(wd);
  }

  public void returnToGroupPage() {
    click(By.linkText("group page"));
  }

  public void gotoGroupPage() {
    click(By.linkText("groups"));
  }

  public void returnToHomePage() {
    click(By.linkText("home"));
  }

  public void gotoHomePage() {
    click(By.linkText("home"));
  }
}
