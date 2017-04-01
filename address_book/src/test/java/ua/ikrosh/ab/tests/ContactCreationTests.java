package ua.ikrosh.ab.tests;

import org.testng.annotations.Test;
import ua.ikrosh.ab.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() {

    app.initContactCreation();
    app.fillContactForm(new ContactData("test1", "test2", "test3", "test@gmail.com", "3456"));
    app.submitContactCreation();
    app.returnToHomePage();

  }
}
