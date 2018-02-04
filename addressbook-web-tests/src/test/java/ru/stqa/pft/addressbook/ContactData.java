package ru.stqa.pft.addressbook;

public class ContactData {
    private final String firstname;
    private final String lastname;
    private final String company;
    private final String mobile;

    public ContactData(String firstname, String lastname, String company, String mobile) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.company = company;
        this.mobile = mobile;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getCompany() {
        return company;
    }

    public String getMobile() {
        return mobile;
    }
}
