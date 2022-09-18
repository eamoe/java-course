// Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что 1 человек может иметь несколько телефонов.

package com.gb;

import java.util.*;

public class PhoneBook {
    final private Map <String, ArrayList<String>> contacts;
    final private Integer MAX_SIZE;
    private Integer capacity;

    public PhoneBook (int size) {
        this.contacts = new HashMap<>(size);
        this.MAX_SIZE = size;
        this.capacity = 0;
    }

    public void addContact(String name, String number) {
         if (Objects.equals(this.capacity, this.MAX_SIZE)) {
             System.out.println("Невозможно добавить новый контакт!\n".toUpperCase());
         }
         else {
             if (!this.contacts.containsKey(name)) {
                 ArrayList<String> phoneNumbers = new ArrayList<>(Collections.singleton(number));
                 this.contacts.put(name, phoneNumbers);
                 this.capacity++;
                 System.out.println("Добавлен новый контакт!\n");
             }
             else {
                 System.out.println("Контакт с таким именем уже существует!\n");
             }
         }
    }

    public void showContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Список контактов пуст!\n");
        }
        else {
            System.out.println("Список контактов".toUpperCase() + "(" + capacity + " из " + MAX_SIZE + ")");
            for (String key: this.contacts.keySet()) {
                String phoneNumbers = this.contacts.get(key).toString();
                System.out.println( "Имя: " + key + "\n" +
                    "Список номеров: " + phoneNumbers + "\n");
            }
        }
    }

    public void removeContact(String name) {
        if (this.contacts.containsKey(name)) {
            this.contacts.remove(name);
            System.out.println("Контакт удален!\n");
            this.capacity--;
        }
        else {
            System.out.println("Контакт не найден!\n");
        }
    }

    public void removeContactPhoneNumber(String name, String phoneNumber) {
        if (this.contacts.containsKey(name)) {
            ArrayList<String> phoneNumbers = this.contacts.get(name);
            phoneNumbers.removeAll(Collections.singleton(phoneNumber));
            System.out.println("Номер удален!\n");
        }
        else {
            System.out.println("Контакт не найден!\n");
        }
    }

    private static <T, E> Set<T> getNamesByPhoneNumber(Map<T, E> map, String value) {
        Set<T> names = new HashSet<T>();
        ArrayList<T> numbers;
        for (Map.Entry<T, E> entry : map.entrySet()) {
            numbers = (ArrayList<T>) entry.getValue();
            if (numbers.contains(value)) {
                names.add(entry.getKey());
            }
        }
        return names;
    }

    public void searchByPhoneNumber(String number) {
        Set<String> names = getNamesByPhoneNumber(this.contacts, number);
        System.out.println( "Список контактов с номером ".toUpperCase() +
                            number + "\n" + names);
    }

    public void searchByName(String name) {
        if (!this.contacts.containsKey(name)) {
            System.out.println("Контакт не найден!\n");
        }
        else {
            System.out.println( "Найден контакт".toUpperCase() + "\n" +
                                "Имя: " + name + "\n" +
                                "Список номеров: " + this.contacts.get(name));
        }
    }

    public void addPhoneNumber(String name, String newNumber) {
        if (this.contacts.containsKey(name)) {
            if (this.contacts.get(name).contains(newNumber)) {
                System.out.println("Номер уже существует!\n");
            }
            else {
                ArrayList<String> phoneNumbers = contacts.get(name);
                phoneNumbers.add(newNumber);
                System.out.println("Контакт обновлен!\n");
            }
        }
        else {
            System.out.println("Контакт с именем !" + name + " отсутствует!\n");
        }
    }
}
