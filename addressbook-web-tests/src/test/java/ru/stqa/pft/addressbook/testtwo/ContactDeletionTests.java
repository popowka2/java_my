package ru.stqa.pft.addressbook.testtwo;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBaseTwo {

    @Test
    public void ContactDeletionTests() {

        app.getNsvigationHelperTwo().submitHome();
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteSelectedContacts();
        app.getContactHelper().alertAccept();

    }

}
