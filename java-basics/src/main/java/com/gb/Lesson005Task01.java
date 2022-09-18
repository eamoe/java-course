// Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что 1 человек может иметь несколько телефонов.

package com.gb;

public class Lesson005Task01 {
    public static void main(String[] args) {

        PhoneBook myPhoneBook = new PhoneBook(10);
        myPhoneBook.showContacts();

        String firstContactName = "Иван Иванов";
        myPhoneBook.addContact(firstContactName, "82345641298");
        myPhoneBook.addPhoneNumber("Иван Иванов", "12345678911");
        myPhoneBook.showContacts();

        String secondContactName = "Петр Петров";
        myPhoneBook.addContact(secondContactName, "87653453478");
        myPhoneBook.showContacts();

        String thirdContactName = "Максим Максимов";
        myPhoneBook.addContact(thirdContactName, "83457564825");
        myPhoneBook.showContacts();

        String forthContactName = "Григорий Григорьев";
        myPhoneBook.addContact(forthContactName, "83457564825");
        myPhoneBook.showContacts();

        String fifthContactName = "Сергей Сергеев";
        myPhoneBook.addContact(fifthContactName, "83457564825");
        myPhoneBook.showContacts();

        myPhoneBook.searchByName("Иван Иванов");

        myPhoneBook.searchByPhoneNumber("83457564825");

        myPhoneBook.addPhoneNumber("Иван Иванов", "12345678911");
        myPhoneBook.showContacts();

        myPhoneBook.removeContact("Иван Иванов");

        myPhoneBook.removeContactPhoneNumber("Иван Иванов", "82345641298");
        myPhoneBook.showContacts();
    }
}
