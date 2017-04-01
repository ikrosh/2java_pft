package ua.ikrosh.ab.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ua.ikrosh.ab.model.ContactData;

public class ContactHelper {
  FirefoxDriver wd;

  public ContactHelper(FirefoxDriver wd) {
    this.wd = wd;
  }

  //creation

  public void submitContactCreation() {
    wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
  }

  public void fillContactForm(ContactData contactData) {
    wd.findElement(By.name("lastname")).click();
    wd.findElement(By.name("lastname")).clear();
    wd.findElement(By.name("lastname")).sendKeys(contactData.getLastname());
    wd.findElement(By.name("firstname")).click();
    wd.findElement(By.name("firstname")).clear();
    wd.findElement(By.name("firstname")).sendKeys(contactData.getFirstname());
    wd.findElement(By.name("address")).click();
    wd.findElement(By.name("address")).clear();
    wd.findElement(By.name("address")).sendKeys(contactData.getAddress());
    wd.findElement(By.name("email")).click();
    wd.findElement(By.name("email")).clear();
    wd.findElement(By.name("email")).sendKeys(contactData.getEmail());
    wd.findElement(By.name("home")).click();
    wd.findElement(By.name("home")).clear();
    wd.findElement(By.name("home")).sendKeys(contactData.getHomePhone());
  }

  public void initContactCreation() {
    wd.findElement(By.linkText("add new")).click();
  }

  //deletion

  public void conformContactDeletion() {
    wd.switchTo().alert().accept();
  }

  public void submitContactDeletion() {
    wd.findElement(By.xpath("//div[@id='content']/form[2]/div[2]/input")).click();
  }

  public void initContactDeletion() {
    if (!wd.findElement(By.name("selected[]")).isSelected()) {
            wd.findElement(By.name("selected[]")).click();
        }
  }

  //modification

  public void submitContactModification() {
    wd.findElement(By.xpath("//div[@id='content']/form[1]/input[22]")).click();
  }

  public void initContactModification() {
    wd.findElement(By.xpath("//table[@id='maintable']/tbody/tr[5]/td[8]/a/img")).click();
  }
}
