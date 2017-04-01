package ua.ikrosh.ab.tests;

import org.testng.annotations.Test;
import ua.ikrosh.ab.model.GroupData;

public class GroupModificationTests extends TestBase {

  @Test
  public void testGroupModification() {

    app.gotoGroupPage();
    app.initGroupModification();
    app.fillGroupForm(new GroupData("test1", "header", "test3"));
    app.submitGroupModification();
    app.returnToGroupPage();
  }
}
