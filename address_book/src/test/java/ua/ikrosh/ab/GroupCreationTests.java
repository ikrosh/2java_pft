package ua.ikrosh.ab;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {

    gotoGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("test1", "header", "test3"));
    submitGroupCreation();
    returnToGroupPage();
  }

}
