package com.gb.Lesson016.homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
    private String firstName;
    private String lastName;
    private String middleName;
    private Date birthDate;
    private long phoneNumber;
    private char gender;

    public Person(String person) {
        this.setPerson(person);
    }

    public Person(String firstName,
                  String lastName,
                  String middleName,
                  Date birthDate,
                  long phoneNumber,
                  char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person {" +
            "firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", middleName='" + middleName + '\'' +
            ", birthDate=" + birthDate +
            ", phoneNumber=" + phoneNumber +
            ", gender=" + gender +
            '}';
    }

    public void setPerson(String person) {

        String[] parameters = person.split(" ");

        this.firstName = parameters[0];
        this.lastName = parameters[1];
        this.middleName = parameters[2];

        SimpleDateFormat parser = new SimpleDateFormat("dd.MM.yyyy");
        try {
            this.birthDate = parser.parse(parameters[3]);
        } catch (ParseException e) {
            throw new DataFormatException("Cannot parse \"" + parameters[3] + "\" to dd.mm.yyy format.", e);
        }

        try {
            this.phoneNumber = Long.parseUnsignedLong(parameters[4]);
        } catch (NumberFormatException e) {
            throw new DataFormatException("Cannot parse \"" + parameters[4] + "\" to phone number format.", e);
        }

        if (parameters[5].length() != 1
            || (parameters[5].charAt(0) != 'm'
            && parameters[5].charAt(0) != 'f'))
        {
            throw new DataFormatException("Cannot parse \"" + parameters[5] + "\" to gender format.");
        }
        this.gender = parameters[5].charAt(0);

    }

}
