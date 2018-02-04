package ru.stqa.pft.addressbook.testtwo;


import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.modeltwo.ContactData;

public class ContactCreationTests extends TestBaseTwo {

    @Test
    public void testContactCreation() {


        app.fillContactForm(new ContactData("Павел", "Страхов", "Тестовая организация", "+79108328979"));
        app.submitContactCreation();
    }

}
