package ua.ikrosh.ab.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ua.ikrosh.ab.model.GroupData;

public class GroupHelper {
  private FirefoxDriver wd;

  public GroupHelper(FirefoxDriver wd) {
    this.wd = wd;
  }


  //creation

  public void submitGroupCreation() {
    wd.findElement(By.name("submit")).click();
  }

  public void fillGroupForm(GroupData groupData) {
    wd.findElement(By.name("group_name")).click();
    wd.findElement(By.name("group_name")).clear();
    wd.findElement(By.name("group_name")).sendKeys(groupData.getName());
    wd.findElement(By.name("group_header")).click();
    wd.findElement(By.name("group_header")).clear();
    wd.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
    wd.findElement(By.name("group_footer")).click();
    wd.findElement(By.name("group_footer")).clear();
    wd.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
  }

  public void initGroupCreation() {
    wd.findElement(By.name("new")).click();
  }

  //deletion

  public void initGroupDeletion() {
    if (!wd.findElement(By.name("selected[]")).isSelected()) {
      wd.findElement(By.name("selected[]")).click();
    }
  }

  public void submitGroupDeletion() {
    wd.findElement(By.name("delete")).click();
  }

  //modification

  public void submitGroupModification() {
    wd.findElement(By.name("update")).click();
  }

  public void initGroupModification() {
    if (!wd.findElement(By.name("selected[]")).isSelected()) {
      wd.findElement(By.name("selected[]")).click();
    }
    wd.findElement(By.name("edit")).click();
  }
}
