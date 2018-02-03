package ru.stqa.pft.addressbook;


import org.testng.annotations.Test;


import org.openqa.selenium.*;

public class GropCreationTests extends TestBase {


    @Test
    public void testGropCreation() {

        wd.findElement(By.cssSelector("html")).click();
        gotoGroupPage();
        wd.findElement(By.cssSelector("html")).click();
        initGroupCreation();
        fillGroupForm(new GroupData("test1", "test2", "test3"));
        submitGroupCreation();
        returnTuGroupPage();
    }

}
