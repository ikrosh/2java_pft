package ua.ikrosh.ab.tests;

import org.testng.annotations.Test;
import ua.ikrosh.ab.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() {

    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("test1", "test2", "test3", "test@gmail.com", null, "test1"));
    app.getContactHelper().submitContactCreation();
    app.getNavigationHelper().returnToHomePage();

  }
}
