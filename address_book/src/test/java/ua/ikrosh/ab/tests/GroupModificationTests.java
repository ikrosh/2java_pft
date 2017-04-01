package ua.ikrosh.ab.tests;

import org.testng.annotations.Test;
import ua.ikrosh.ab.model.GroupData;

public class GroupModificationTests extends TestBase {

  @Test
  public void testGroupModification() {

    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupData("test1", "header", "test3"));
    app.getGroupHelper().submitGroupModification();
    app.getNavigationHelper().returnToGroupPage();
  }
}
