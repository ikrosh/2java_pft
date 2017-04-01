package ua.ikrosh.ab.tests;

import org.testng.annotations.Test;
import ua.ikrosh.ab.model.ContactData;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification() {

    app.gotoHomePage();
    app.initContactModification();
    app.fillContactForm(new ContactData("test1", "test2", "test3", "test@gmail.com", "3456"));
    app.submitContactModification();
    app.gotoHomePage();

  }
}
