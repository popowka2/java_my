package ru.stqa.pft.addressbook.testtwo;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBaseTwo {

    @Test
    public void ContactDeletionTests() {

        app.submitHome();
        app.selectContact();
        app.deleteSelectedContacts();
        app.alertAccept();

    }

}
