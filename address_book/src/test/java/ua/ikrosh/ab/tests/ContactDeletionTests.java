package ua.ikrosh.ab.tests;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {

  @Test
  public void testContactDeletion() {

    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper().initContactDeletion();
    app.getContactHelper().submitContactDeletion();
    app.getContactHelper().conformContactDeletion();
    app.getNavigationHelper().gotoHomePage();

  }
}
