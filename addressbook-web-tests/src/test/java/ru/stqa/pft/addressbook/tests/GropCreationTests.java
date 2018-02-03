package ru.stqa.pft.addressbook.tests;


import org.testng.annotations.Test;


import ru.stqa.pft.addressbook.model.GroupData;

public class GropCreationTests extends TestBase {


    @Test
    public void testGropCreation() {


        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnTuGroupPage();
    }

}
