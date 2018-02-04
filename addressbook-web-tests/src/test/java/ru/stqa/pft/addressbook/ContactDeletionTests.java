package ru.stqa.pft.addressbook;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBaseTwo {

    @Test
    public void ContactDeletionTests() {

        submitHome();
        selectContact();
        deleteSelectedContacts();
        alertAccept();

    }

}
