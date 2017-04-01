package ua.ikrosh.ab.tests;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {

  @Test
  public void testContactDeletion() {

    app.gotoHomePage();
    app.initContactDeletion();
    app.submitContactDeletion();
    app.conformContactDeletion();
    app.gotoHomePage();

  }
}
