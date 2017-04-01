package ua.ikrosh.ab;

import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification() {

    gotoHomePage();
    initContactModification();
    fillContactForm(new ContactData("test1", "test2", "test3", "test@gmail.com", "3456"));
    submitContactModification();
    gotoHomePage();

  }
}
