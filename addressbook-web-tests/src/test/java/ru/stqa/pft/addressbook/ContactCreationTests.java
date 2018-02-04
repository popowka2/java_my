package ru.stqa.pft.addressbook;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBaseTwo {

    @Test
    public void testContactCreation() {


        fillContactForm(new ContactData("Павел", "Страхов", "Тестовая организация", "+79108328979"));
        submitContactCreation();
    }

}
