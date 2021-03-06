package ua.ikrosh.ab.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import ua.ikrosh.ab.model.ContactData;

public class ContactHelper extends HelperBase {

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  //general
  public void click(By locator) {
    wd.findElement(locator).click();
  }

  //creation

  public void submitContactCreation() {
    click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  public void fillContactForm(ContactData contactData) {
    type(By.name("lastname"), contactData.getLastname());
    type(By.name("firstname"), contactData.getFirstname());
    type(By.name("address"), contactData.getAddress());
    type(By.name("email"), contactData.getEmail());
    type(By.name("home"), contactData.getHomePhone());
    if (isElementPresent(By.name("new_grop"))) {
      new Select(wd.findElement(By.name("new_grop"))).selectByVisibleText(contactData.getGroup());
    }
  }

  public void type(By locator, String text) {
    click(locator);
    wd.findElement(locator).clear();
    wd.findElement(locator).sendKeys(text);
  }

  public void initContactCreation() {
    click(By.linkText("add new"));
  }

  //deletion

  public void conformContactDeletion() {
    wd.switchTo().alert().accept();
  }

  public void submitContactDeletion() {
    click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
  }

  public void initContactDeletion() {
    if (!wd.findElement(By.name("selected[]")).isSelected()) {
      click(By.name("selected[]"));
    }
  }

  //modification

  public void submitContactModification() {
    click(By.xpath("//div[@id='content']/form[1]/input[22]"));
  }

  public void initContactModification() {
    click(By.xpath("//table[@id='maintable']/tbody/tr[5]/td[8]/a/img"));
  }
}
