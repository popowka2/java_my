package ru.stqa.pft.addressbook.testtwo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.pft.addressbook.appmanagertwo.ApplicationMangerTwo;

public class TestBaseTwo {

    protected final ApplicationMangerTwo app = new ApplicationMangerTwo();

    @BeforeMethod
    public void setUp() throws Exception {
        app.init();
    }


    @AfterMethod
    public void tearDown() {
        app.stop();
    }

}
