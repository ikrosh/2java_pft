package ua.ikrosh.ab;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {

  @Test
  public void testContactDeletion() {

    gotoHomePage();
    initContactDeletion();
    submitContactDeletion();
    conformContactDeletion();
    gotoHomePage();

  }
}
