package ua.ikrosh.ab.tests;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletion() {

    app.gotoGroupPage();
    app.initGroupDeletion();
    app.submitGroupDeletion();
    app.returnToGroupPage();
  }





}
