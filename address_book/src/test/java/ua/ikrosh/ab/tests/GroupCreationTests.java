package ua.ikrosh.ab.tests;

import org.testng.annotations.Test;
import ua.ikrosh.ab.model.GroupData;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {

    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("test1", "header", "test3"));
    app.getGroupHelper().submitGroupCreation();
    app.getNavigationHelper().returnToGroupPage();
  }

}
