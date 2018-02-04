package ru.stqa.pft.addressbook.appmanagertwo;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationMangerTwo {

    FirefoxDriver wd;

    private  SessionHelperTwo sessionHelper;
    private  NsvigationHelperTwo nsvigationHelperTwo;
    private  ContactHelper contactHelper;

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public void init() {
        System.setProperty("webdriver.firefox.marionette", "./geckodriver.exe");
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/edit.php");
        contactHelper = new ContactHelper(wd);
        nsvigationHelperTwo = new NsvigationHelperTwo(wd);
        sessionHelper = new SessionHelperTwo(wd);
        sessionHelper.login("admin", "secret");
    }

    public void login(String username, String passwword) {
       wd.findElement(By.name("user")).click();
        wd.findElement(By.name("user")).clear();
        wd.findElement(By.name("user")).sendKeys(username);
        wd.findElement(By.name("pass")).click();
       wd.findElement(By.name("pass")).clear();
       wd.findElement(By.name("pass")).sendKeys(passwword);
       wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
    }

    public void stop() {
        wd.quit();
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }

    public NsvigationHelperTwo getNsvigationHelperTwo() {
        return nsvigationHelperTwo;
    }
}
