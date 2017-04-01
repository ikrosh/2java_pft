package ua.ikrosh.ab.tests;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletion() {

    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().initGroupDeletion();
    app.getGroupHelper().submitGroupDeletion();
    app.getNavigationHelper().returnToGroupPage();
  }





}
