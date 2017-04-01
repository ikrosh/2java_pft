package ua.ikrosh.ab;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() {

    initContactCreation();
    fillContactForm(new ContactData("test1", "test2", "test3", "test@gmail.com", "3456"));
    submitContactCreation();
    returnToHomePage();

  }
}
