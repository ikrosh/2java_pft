package ua.ikrosh.ab.tests;

import org.testng.annotations.Test;
import ua.ikrosh.ab.model.ContactData;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification() {

    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("test1", "test2", "test3", "test@gmail.com", "3456"));
    app.getContactHelper().submitContactModification();
    app.getNavigationHelper().gotoHomePage();

  }
}
