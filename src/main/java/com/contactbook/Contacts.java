package com.contactbook;

import javafx.beans.property.SimpleStringProperty;

public class Contacts
{
    private final SimpleStringProperty firstName = new SimpleStringProperty("");
    private final SimpleStringProperty lastName = new SimpleStringProperty("");
    private final SimpleStringProperty phoneCell = new SimpleStringProperty("");
    private final SimpleStringProperty address = new SimpleStringProperty("");
    private final SimpleStringProperty emailPrimary = new SimpleStringProperty("");
    private final SimpleStringProperty emailSecondary = new SimpleStringProperty("");

    public Contacts ()
    {
        this("", "", "", "","", "");
    }

    public Contacts (String firstName, String lastName, String phoneCell, String address, String emailPrimary, String emailSecondary)
    {
        setFirstName(firstName);
        setLastName(lastName);
        setphoneCell(phoneCell);
        setAddress(address);
        setEmailPrm(emailPrimary);
        setEmailScnd(emailSecondary);
    }

    public String getFirstName()
    {
        return firstName.get();
    }
    public void setFirstName(String fName)
    {
        firstName.set(fName);
    }

    public String getLastName()
    {
        return lastName.get();
    }
    public void setLastName(String lName)
    {
        lastName.set(lName);
    }

    public String getphoneCell()
    {
        return phoneCell.get();
    }
    public void setphoneCell(String phoneNum)
    {
        phoneCell.set(phoneNum);
    }

    public String getAddress()
    {
        return address.get();
    }
    public void setAddress(String add)
    {
        address.set(add);
    }

    public String getEmailPrm()
    {
        return emailPrimary.get();
    }
    public void setEmailPrm(String pEmail)
    {
        emailPrimary.set(pEmail);
    }

    public String getEmailScnd()
    {
        return emailSecondary.get();
    }
    public void setEmailScnd(String sEmail)
    {
        emailSecondary.set(sEmail);
    }
}

