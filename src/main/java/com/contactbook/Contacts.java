package com.contactbook;

import javafx.beans.property.SimpleStringProperty;

public class Contacts {
    private final SimpleStringProperty firstName = new SimpleStringProperty("");
    private final SimpleStringProperty lastName = new SimpleStringProperty("");

    private final SimpleStringProperty phoneCell = new SimpleStringProperty("");
    private final SimpleStringProperty address = new SimpleStringProperty("");
    private final SimpleStringProperty emailPrimary = new SimpleStringProperty("");
    private final SimpleStringProperty emailSecondary = new SimpleStringProperty("");

    public Contacts () {
        this("", "", "", "","", "");
    }

    public Contacts (String firstName, String lastName, String phoneCell, String address, String emailPrimary, String emailSecondary) {
        setFirstName(firstName);
        setLastName(lastName);
        setphoneCell(phoneCell);
        setAddress(address);
        setEmailPrm(emailPrimary);
        setEmailScnd(emailSecondary);
    }

    public String getFirstName() {
        return firstName.get();
    }
    public void setFirstName(String fName) {
        firstName.set(fName);
    }

    public String getLastName() {
        return lastName.get();
    }
    public void setLastName(String fName) {
        lastName.set(fName);
    }

    public String getphoneCell() {
        return phoneCell.get();
    }
    public void setphoneCell(String fName) {
        phoneCell.set(fName);
    }

    public String getAddress() {
        return address.get();
    }
    public void setAddress(String fName) {
        address.set(fName);
    }

    public void getEmailPrm(String fName) {
        emailPrimary.set(fName);
    }
    public void setEmailPrm(String fName) {
        emailPrimary.set(fName);
    }

    public String getEmailScnd() {
        return emailSecondary.get();
    }
    public void setEmailScnd(String fName) {
        emailSecondary.set(fName);
    }
}

