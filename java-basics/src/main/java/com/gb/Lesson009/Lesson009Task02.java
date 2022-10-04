package com.gb.Lesson009;

import java.util.ArrayList;
import java.util.Collections;

public class Lesson009Task02 {
    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();
        people.add(new PersonByAll("Кирилл", 24, 70, 186));
        people.add(new PersonByAll("Кирилл", 32, 76, 170));
        people.add(new PersonByAll("Кирилл", 25, 84, 192));
        people.add(new PersonByAll("Алексей", 32, 70, 174));
        people.add(new PersonByAll("Дмитрий", 17, 65, 165));
        people.add(new PersonByAll("Василий", 18, 81, 195));
        people.add(new PersonByAll("Максим", 44, 94, 174));
        people.add(new PersonByAll("Кирилл", 32, 70, 170));
        Collections.sort(people);
        for (Person person : people) {
            System.out.println(person);
        }


    }
}
