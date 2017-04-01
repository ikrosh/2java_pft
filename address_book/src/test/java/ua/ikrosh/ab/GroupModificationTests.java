package ua.ikrosh.ab;

import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase {

  @Test
  public void testGroupModification() {

    gotoGroupPage();
    initGroupModification();
    fillGroupForm(new GroupData("test1", "header", "test3"));
    submitGroupModification();
    returnToGroupPage();
  }
}
