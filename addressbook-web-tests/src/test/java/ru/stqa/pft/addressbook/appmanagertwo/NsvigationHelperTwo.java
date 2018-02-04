package ru.stqa.pft.addressbook.appmanagertwo;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NsvigationHelperTwo {
    private FirefoxDriver wd;

    public NsvigationHelperTwo(FirefoxDriver wd) {
        this.wd = wd;
    }

    public void submitHome() {
        wd.findElement(By.linkText("home")).click();
    }
}
